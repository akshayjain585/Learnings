package impPrograms;

import java.util.Scanner;

public class Palindrome {

	public static void main(String[] args) {
		
		//Scanner scan = new Scanner(System.in);
		//System.out.println("Enter the number to be verified ");
		//int num = scan.nextInt();
		
		int n = 1211 ;
		int r=0 ;
		int s = 0 ;
		int t;
		t= n ;
		while(n!=0){
		r = n%10 ;
		n = n/10 ;
		s = s*10 + r ;
		}
		if (t==s){
			System.out.println("No is palindrome");
		}else {
			System.out.println("No. is not palindrome");
		}
			
	}

}
