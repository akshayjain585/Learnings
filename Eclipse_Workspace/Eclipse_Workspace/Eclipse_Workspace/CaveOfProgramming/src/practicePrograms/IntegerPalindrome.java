package practicePrograms;

import java.util.Scanner;

public class IntegerPalindrome {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the number to check for Palindrome :- ");
		int num = scan.nextInt();
		
		int rev=0, r=0, n;
		n = num ;
		
		while(num!=0){
			
			r = num%10 ;
			rev = rev*10 + r ;
			num = num/10 ;
		}
		if(n==rev){
			System.out.println("The given number is Palindrome");
		}
		else {
			System.out.println("The given number is not a Palindrome number");
		}
	}

}
