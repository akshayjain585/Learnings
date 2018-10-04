package impPrograms;

import java.util.Scanner;

public class Fibonacci {

	public static void main(String[] args) {

		int numtoPrint ;
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the numbers to print ");
		numtoPrint = sc.nextInt();
		sc.close();
		
		
		//to print the very first and second number
		
		int last = 0;
		int current = 1;
		System.out.println(last);
		System.out.println(current);
		
		int lastlast ;
		for(int i=2 ; i<numtoPrint ; i++){
			lastlast = last;
			last = current;
			current = lastlast + last ;
			System.out.println(current);
		}
		
	}

}
