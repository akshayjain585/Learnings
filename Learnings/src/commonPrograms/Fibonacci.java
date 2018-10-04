package commonPrograms;

import java.util.Scanner;

public class Fibonacci {
	 static int n1=0,n2=1,n3=0;   //This is declared for Recursion method
	
	public static void fibonacci(int num){
		int n1 = 0;
		int n2 = 1;
		int n3 = 0;
		System.out.print(n1+","+n2);
		for(int i=2; i<num; i++){
			n3 = n1+n2;
			System.out.print(","+n3);
			n1 = n2;
			n2 = n3;
		}
		
	}
	
	public static void fibRecursion(int num){
		if(num>0){
			n3 = n1+n2;
			System.out.print(","+n3);
			n1 = n2;
			n2 = n3;
			fibRecursion(num-1);
		}
	}
	
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the number: ");
		int num = scan.nextInt();
		fibonacci(num);
		System.out.println();
		System.out.print(n1+","+n2); //printing 0 and 1    
		fibRecursion(num-2); //n-2 because 2 numbers are already printed   
	}
}
