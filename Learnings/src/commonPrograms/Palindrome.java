package commonPrograms;

import java.util.Scanner;

public class Palindrome {
	
	public static void isPalindrome(int num){
		
		int temp = num;
		int rev = 0;
		int r;
		while(num>0){
			r = num%10;
			rev = (rev*10) + r;
			num = num/10;
		}
		
		if(temp == rev){
			System.out.println("Palindrome");
		}else{
			System.out.println("Not a Palindrome");
		}

	}
	
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the number: ");
		int num = scan.nextInt();
		isPalindrome(num);

}
	
}
