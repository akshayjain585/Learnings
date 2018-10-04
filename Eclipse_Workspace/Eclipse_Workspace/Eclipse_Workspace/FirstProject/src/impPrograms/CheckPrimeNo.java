package impPrograms;

import java.util.Scanner;

public class CheckPrimeNo {

	public static void main(String[] args) {
		
		boolean prime = true ;
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the number to check ");
		int number = scan.nextInt();
		scan.close();
		
		for(int i=2 ; i<number ; i++){
			
			if(number%i == 0){
			prime = false ;
			}
		}
		
		if(prime==false){
			System.out.println("Number is not prime");
		} 
		else if(prime==true){
			System.out.println("Number is prime");
		}

	}

}
