
public class PrintFibonacci {
	
	public static void main(String s[]){
		for(int i=0; i < 5; i++){
			System.out.println(printFibonacci(i));
		}
	}
	
	public static int printFibonacci(int i){
//		System.out.println(i);
		if(i == 0){
			return 0;
		}
		if(i == 1){
			return 1;
		}
		return printFibonacci(i - 1) + printFibonacci(i - 2); 
	}

}
