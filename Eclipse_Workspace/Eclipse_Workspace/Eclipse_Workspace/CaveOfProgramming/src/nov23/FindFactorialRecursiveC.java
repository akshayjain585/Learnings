package nov23;

import java.util.Scanner;

public class FindFactorialRecursiveC {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter the number:- ");
		
		int num = input.nextInt();
		
		int result = fact(num);
		
		System.out.println("The factorial using recursion is:- " +result);
	}
	
	static int fact(int a){
		if(a<=1)
			return 1 ;
		else
			return a * fact(a-1);
	}

}
