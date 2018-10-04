package caveOfProgramming;

public class MyPractice {

	public static void main(String[] args) {
		
		String str = new String("mama");

		int length = str.length();
		
		System.out.println(length/2);
		
		for(int i=0; i<length/2 ; i++){
			
			if(str.charAt(i)!= str.charAt(length-i-1)) {
				System.out.println("Not a palindrome");
			}
			else 
			{
				System.out.println("A palindrome");
			}
		}
	}

}
