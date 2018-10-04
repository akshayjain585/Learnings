package caveOfProgramming;

import java.util.Scanner;

public class ExampleNumberPalindrome {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter the number to check:- ");
		
		int myNum = scan.nextInt();
		
		int r,s=0,t ;
		
		while(myNum==0){
			r = myNum%10 ;
			myNum = myNum/10 ;
			s = s * r + myNum ;				
		}
		t = myNum ;
		if(t==s){
			System.out.println("The given number is palindrome");
		}
		else{
			System.out.println("Number is not a palindrome");
		}
		
	}

}
