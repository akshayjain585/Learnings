package practicePrograms;

import java.util.Scanner;

public class ExampleCheckPrimeNumber {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the number to check :- ");
		int num = scan.nextInt();
		
		boolean prime = true ;
		
		for(int i=2; i<num; i++){
			if(num%i == 0){
				prime = false ;
			}			
		}
		
		if(prime==false){
			System.out.println("Number is not prime");
		}
		else{
			System.out.println("Numer is a prime Number");
		}
		
	}

}
