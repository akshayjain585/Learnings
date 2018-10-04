package stringsPrograms;

import java.util.Scanner;

public class StringsPalindrome {
	
	public static void checkPalindrome(String input){
		
		String rev="";
		
		for(int i=input.length()-1;i>=0;i--){
			rev+=input.charAt(i);
		}
		
		if(input.equalsIgnoreCase(rev)){
			System.out.println("String is Palindrome");
		}else{
			System.out.println("Not Palindrome");
		}
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the string to check: ");
		String input = scan.nextLine();
		checkPalindrome(input);
		

	}

}
