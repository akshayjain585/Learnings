package nov23;

import java.util.Scanner;

public class CheckCheckPrimeNo {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter the number:- ");
		
		int num = input.nextInt();
		
		boolean prime = true ;
		
		for(int i=2 ; i<num ; i++){
			
			if(num%2 == 0){
				prime = false ;
			}
		}
		
		if(prime == false){
			System.out.println("The no is not prime");
		}else{
			System.out.println("The no is prime");
		}
	}

}
