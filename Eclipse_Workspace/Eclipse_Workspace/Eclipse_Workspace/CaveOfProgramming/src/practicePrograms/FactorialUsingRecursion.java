package practicePrograms;

import java.util.Scanner;

public class FactorialUsingRecursion {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter the number :- " );
		
		int num = scan.nextInt();
		
		int result = fact(num);
		
		System.out.println("The factorial of the number is :- " + result);
		
		
	}
	
	static int fact(int b){
		if(b<=1)
		return 1;
		else
			return b * fact(b-1);	
	}

}
