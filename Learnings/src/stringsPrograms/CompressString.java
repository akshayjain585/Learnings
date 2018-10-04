/*
 * Example : Input : aaaabbbbbcccffg
    Output : a4b5c3f2g1
 */

package stringsPrograms;

import java.util.Scanner;

public class CompressString {
	
	public static void compressString(String input){
		int count =0;
		char temp = input.charAt(0);
		for(int i=0; i<input.length(); i++){
			if(input.charAt(i)==temp){
				count++;
			}else{
				System.out.print(temp+""+count);
				count =1;  //As already the control will be on second character so count would have got 1 in if condition and exited.
				temp = input.charAt(i);
			}
		}
		System.out.print(temp+""+count);
	}
	
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the string: ");
		String input = scan.nextLine();
		compressString(input);
		
	}

}
