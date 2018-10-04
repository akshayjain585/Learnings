package stringsPrograms;

import java.util.Scanner;

public class SwapTwoString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the first String: ");
		String s1= scan.nextLine();
		System.out.println("Enter the second String: ");
		String s2= scan.nextLine();
		
		System.out.println("Strings before swapping: "+s1+ " and "+s2);
		
		s1= s1+s2;
		s2= s1.substring(0, s1.length()-s2.length());
		s1 = s1.substring(s2.length());
		
		System.out.println("Strings after swapping: "+s1+ " and "+s2);

		
		

	}

}

