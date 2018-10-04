package allPrograms;

import java.util.Scanner;

public class PrintWordsInString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the String: ");
		String input = scan.nextLine();
		System.out.println("Entered the String");
		
		String[] split = input.split(" ");
		int count =0;
		
		for(int i=0; i<split.length; i++){
			System.out.println(split[i]);
			count++;		
			
		}
		System.out.println(count);
		

	}

}
