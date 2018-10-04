package practicePrograms;

import java.util.Scanner;

public class ExampleFactorial {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the number :- ");
		int x = scan.nextInt() ;
		int fact = 1 ;
		
		if(x==0 || x==1){
			System.out.println("1");
		}
		else{
			while(x>1){
				fact = fact * x;
				x-- ;
			}
		}
		System.out.println("The factorial is " +fact);
	}

}
