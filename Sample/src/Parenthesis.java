import java.util.Stack;


public class Parenthesis {
	
	
	public static void main(String s[]){
		System.out.println(isValid("((hhh))"));
	}
	
	public static int isValid(String str){
		final String test ;
		test = "one";
				
		if(str == null || str.isEmpty()){
			return -1;
		}
		Stack check = new Stack();
		int depth = 0;
		for(int i=0; i < str.length(); i++){
			char s = str.charAt(i); 
			if(s == '('){
				depth++;
				check.push('(');
			}
			if(s == ')'){
				if(check.isEmpty())
					return -1;
				else
					check.pop();
			}
		}
		return depth;
	}

}
