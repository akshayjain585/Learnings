package practicePrograms;

import java.util.Scanner;

public class StringPalindrome {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the String to check for Palindrome :- ");
		String original = scan.nextLine();
		String reverse = "";
		
		int len = original.length();
		
		for(int i=len-1 ; i>-1 ; i--){
			reverse = reverse + original.charAt(i);
		}
		
		if(original.equals(reverse)){
			System.out.println("The original string is a Palindrome string");
		}
		else {
			System.out.println("The original string is not a palindrome string");
		}
	}

}
