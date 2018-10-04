package nov23;

import java.util.Scanner;

public class IntegerPalindromeC {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter the number:- ");
		
		int num = input.nextInt();
		
		int rev = 0, r, n;
		
		n = num ;
		
		while(num!= 0){
			
			r = num%10 ;
			rev = rev*10 + r ;
			num = num/10 ;
			}
		
		if(n == rev){
			System.out.println("The number is a Palindrome");
		}else{
			System.out.println("The given number is not a Palindrome");
		}
	}

}
