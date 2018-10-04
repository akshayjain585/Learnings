package stringsPrograms;

public class ReverseStringUsingRecursive {
	
	public static String recursiveString(String input){
		if(input==null || input.length()<=1){
			return input;
		}else{
			return recursiveString(input.substring(1))+input.charAt(0);
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String input = "Akshay Jain";
		System.out.println(recursiveString("AKshay Jain"));
		

	}



}
