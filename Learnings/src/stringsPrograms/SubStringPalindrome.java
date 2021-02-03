package stringsPrograms;

/*
 * ref : Good to read to know the difference between SubArray-SubString/SubSequence/SubSet
 * SubArray-SubString: As name says, slice of an array/string which is contiguous.
 * SubSequence : Need not be contiguous but maintains the order.
 * SubSet : Could be in any order.
 * 
 * Example : {1,2,3,4}
 * SubArray : {1,2}
 * SubSequence : {1,4}
 * SubSet : {3,1}
 * 
 * Note : All subArray are subsequence and subset as subArray is contiguous which satisfies both the subsequence and subset
 * 
 */

import java.util.Scanner;

public class SubStringPalindrome {

	public static void subString(String input) {
		for(int i=0; i<input.length(); i++) {
			// Reason j loop starts from i+1 is because we use substring method where enIndex is exclusive and thats the reason j<=input.length() which is 1 index more than the length of the string to print the last character in the string
			for(int j=i+1; j<=input.length(); j++) {	 
				System.out.println(input.substring(i,j));
			}
		}
	}
	
	public static boolean isPalindrome(String input) {
		int startIndex = 0;
		int endIndex = input.length()-1;
		
		while(startIndex <= endIndex) {
			if(input.charAt(startIndex) == input.charAt(endIndex)) {
				startIndex ++;
				endIndex --;
			}else {
				return false;
			}
		}
		return true;
	}
	
	public static void printPalindromeSubString(String input) {
		for(int i=0; i<input.length(); i++) {
			for(int j=i+1; j<=input.length(); j++) {
				String res = input.substring(i,j);
				boolean isP = isPalindrome(res);
				if(isP) {
					System.out.println(input.substring(i,j));
				}
 			}
		}
	}
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the string: ");
		String input = scan.nextLine();
		
		subString(input);
		System.out.println(isPalindrome(input));
		printPalindromeSubString(input);
	}

}
