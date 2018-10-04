package practicePrograms;

import java.util.Scanner;

public class ExampleFibonacci {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the numbers to print :- ");
		int numtoPrint = scan.nextInt();
		
		
		int first = 0;
		int current = 1;
		int temp;
		
		System.out.println(first);
		System.out.println(current);
		
		for(int i=2 ; i<numtoPrint ; i++){
			temp = first ;
			first = current ;
			current = temp + first ;
			System.out.println(current);
		}
	}

}
