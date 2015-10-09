import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class DscAnalyzer {
	
	public static void main(String s[]){
		DscAnalyzer.analyzeFiles(s[0]);
	}
	
	public static void analyzeFiles(String fLoc){
		try {
			Scanner scanner = new Scanner(new File(fLoc));
			while(scanner.hasNext()){
				String compId = scanner.next();
				System.out.println(compId);
				String location = scanner.next();
				System.out.println(location);
				getAssociatedFiles(new File(location));
				break;
			}
			scanner.close();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public static List<String> getFileData(File givenFile) throws IOException{
		BufferedReader dscReader = new BufferedReader(new FileReader(givenFile));
		String currentLine = null;
		List<String> lines = new ArrayList<String>();
		
		while ((currentLine = dscReader.readLine()) != null){
			lines.add(currentLine);
		}
		dscReader.close();
		return lines;
	}
	
	public static void getAssociatedFiles(File givenDscFile){
		try {
			if(givenDscFile.exists()){
				List<String> givenLines = getFileData(givenDscFile);
				for(int i = 0; i < givenLines.size(); ++i){
					if(givenLines.get(i).toLowerCase().startsWith("files:")){
						int j = 1;
						while((!givenLines.get(i+j).contains(": ")) && 
								(givenLines.get(i+j).contains(" ")) && 
								(givenLines.get(i+j).length() != 0) && 
								(givenLines.get(i+j).charAt(0) == ' ')){
							System.out.println(givenLines.get(i+j).substring(givenLines.get(i+j).lastIndexOf(' ') + 1));
							++j;
						}
					}
				}
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
