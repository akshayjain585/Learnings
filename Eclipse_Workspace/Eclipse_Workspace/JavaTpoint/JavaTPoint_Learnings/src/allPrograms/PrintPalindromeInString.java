package allPrograms;

import java.util.Scanner;

public class PrintPalindromeInString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the String: ");
		String input = scan.nextLine();
		
		String original= "";
		String reverse= "";
		int count = 0;
		
		String[] inputString= input.split(" ");
		
		for(int i=0; i<inputString.length; i++){
			original = inputString[i];
			StringBuffer sb = new StringBuffer(original);
			reverse = sb.reverse().toString();
			if(original.equalsIgnoreCase(reverse)){
				count++;
				System.out.println(original);
			}
			
		}
		System.out.println("The total palindrome in String is "+count);
		

	}

}
