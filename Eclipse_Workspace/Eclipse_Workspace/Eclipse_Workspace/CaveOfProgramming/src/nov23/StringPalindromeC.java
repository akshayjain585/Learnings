package nov23;

import java.util.Scanner;

public class StringPalindromeC {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter the string to check:- ");
		
		String original = scan.nextLine();
		
		String reverse = "" ;
		
		int len = original.length();
		
		for(int i= len-1 ; i>-1 ; i--){
			
			reverse = reverse + original.charAt(i);			
		}
		
		if(original.equals(reverse)){
			System.out.println("The string is a Palindrome");
		}else {
			System.out.println("The string is not a Palindrome");
		}
			
	}

}
