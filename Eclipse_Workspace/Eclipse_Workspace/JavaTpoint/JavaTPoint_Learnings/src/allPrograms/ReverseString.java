package allPrograms;

import java.util.Scanner;

public class ReverseString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scan = new Scanner(System.in);

		System.out.println("Enter the String: ");

		String input = scan.nextLine();
		/*String reverse = "" ;

		for(int i=input.length()-1; i>=0; i--){
			reverse = reverse + input.charAt(i);
		}
		System.out.println(reverse);*/
		
		char[] charString = input.toCharArray();
		
		for(int i=charString.length-1; i>=0; i--){
			System.out.print(charString[i]);
		}

	}

}
