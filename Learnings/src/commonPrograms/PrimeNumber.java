package commonPrograms;

import java.util.Scanner;

public class PrimeNumber {
	
	public static void isPrimeNumber(int num){
		
		if(num<=1){
			System.out.println("Not a prime Number");
			return;
		}
		boolean isPrime = true;
		
		for(int i=2; i<num/2; i++){
			if(num%i == 0){
				isPrime = false;
				break;
			}
		}
		if(isPrime){
			System.out.println("Prime Number"+num);
		}else{
			System.out.println("Not a prime number"+num);
		}
	}
	
	public static void rangePrimeNumber(int range){
		
		for(int i=1; i<=range; i++){
			isPrimeNumber(i);
		}
	}
	
	public static void rPN(int range){
		int i;
		boolean isP = false;
		for( i=1; i<=range; i++){
			for(int j=2; j<i; j++){
				 isP = true;
				if(i%j==0){
					isP = false;
					break;
				}
			}
			if(isP){
				System.out.println("Prime Number"+i);
			}else{
				System.out.println("Not a prime number"+i);
			}
		}

	}
	
	public static void main(String[] args){
		//Scanner scan = new Scanner(System.in);
		//System.out.println("Enter the number: ");
		//int num = scan.nextInt();
		//isPrimeNumber(num);
		//rangePrimeNumber(100);
		rPN(100);
}
}
