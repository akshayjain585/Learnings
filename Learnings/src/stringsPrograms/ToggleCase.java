package stringsPrograms;

import java.util.Scanner;

public class ToggleCase {

	public static void toggleCase(String input) {
		// We will convert the string input to StringBuilder because of performance issues with String as everytime it toggles the case, will create a new string in String constant pool.
		StringBuilder sb = new StringBuilder(input);
		for(int i=0; i<sb.length(); i++) {
			// To check if the first character is lower case or upper case
			char ch = sb.charAt(i);
			// This means character is a lower case. Upper case from 65 (A) to 90 (Z). Lower case : 97 (a) to 122 (z)
			if(ch >= 'a' && ch <= 'z') {
				//Formula to convert lower to upper and viceversa. Distance between (b - a = B - A). So, b = B+a-A and B = b+A-a
				ch = (char) (ch + 'A' - 'a');	// Will convert it to upper case and have to typecast to char as it will result in integer giving ASCII value.
			}else {
				ch = (char) (ch + 'a' - 'A');
			}
			sb.setCharAt(i, ch);	// Setting the converted character at each ith position.
		}
		System.out.println(sb.toString());
	}
	
	// Modify character's ASCII value in a string
	public static void incrementDecrementASCII(String input) {
		StringBuilder sb = new StringBuilder(input);
		
		for(int i=0; i<sb.length(); i++) {
			char ch = sb.charAt(i);
			if(i%2 == 0) {
				ch = (char) (ch - 1);	// For even subtract  1 to ASCII and any change to char always returns an ASCII so have to typecast always.
			}else {
				ch = (char) (ch + 1);	// For odd, add 1
			}
			sb.setCharAt(i,ch);
		}
		System.out.println(sb.toString());
	}
	
	public static void printASCIIDiff(String input) {
		StringBuilder sb = new StringBuilder(input);
		
		for(int i=0; i<input.length()-1; i++) {
			char ch1 = input.charAt(i);
			char ch2 = input.charAt(i+1);	// Thats the reason we ran the loop till second last char <sb.length()-1 else it will go out of bound.
			
			int diff = ch2-ch1;
			
			sb.append(ch1);
			sb.append(diff);
		}
		sb.append(input.charAt(input.length()-1));
		System.out.println(sb.toString());
	}

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the string: ");
		String input = scan.nextLine();
		
		toggleCase(input);
		incrementDecrementASCII(input);
		printASCIIDiff(input);

	}

}
