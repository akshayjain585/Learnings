package commonPrograms;

import java.util.Scanner;

public class Factorial {
	
	public static int factorial(int num){
		if(num==0 || num==1){
			return 1;
		}
		int fact = 1;
		for(int i=2; i<=num; i++){
			fact = fact * i;
		}
		return fact;
	}
	
	public static int factorialRecursion(int num){
		if(num==0 || num==1){
			return 1;
		}
		return num * factorialRecursion(num-1);
	}
	
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the number: ");
		int num = scan.nextInt();
		int fact = factorial(num);
		int factR = factorialRecursion(num);
		System.out.println("The factorial of "+num+" is: "+fact);
		System.out.println("The factorial of "+num+" using recursion is: "+factR);

	}

}
