package nov23;

import java.util.Scanner;

public class FindFactorial {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter the number:- ");
		
		int num = input.nextInt();
		
		int fact = 1 ;
		
		if(num == 0 || num == 1){
			System.out.println("The factorial is 1");
		}else {
			while(num>1){
				fact = fact * num ;
				num -- ;
			}
		}
		
		System.out.println("The factorial of given number is :- " +fact);
	}

}
