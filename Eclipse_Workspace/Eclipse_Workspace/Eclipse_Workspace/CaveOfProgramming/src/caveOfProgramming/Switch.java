package caveOfProgramming;

import java.util.Scanner;

public class Switch {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		System.out.println("Enter a command :- ");

		int myNumber = scanner.nextInt();

		switch (myNumber) {

		case 1:
			System.out.println("Command 1 matches");
			break;

		case 2:
			System.out.println("Command 2 matches");
			break;

		default:
			System.out.println("None of the command matches");
		}

	}

}
