package caveOfProgramming;

import java.util.Scanner;

public class GettingUserInput {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter the string :- ");
		
		String myNumber = input.nextLine();
		
		System.out.println("You entered " + myNumber);
		
	}

}




