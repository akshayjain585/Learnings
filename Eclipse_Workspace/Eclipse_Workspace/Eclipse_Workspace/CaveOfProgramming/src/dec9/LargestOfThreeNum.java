package dec9;

import java.util.Scanner;

public class LargestOfThreeNum {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter the numbers ");
		
		int a = scan.nextInt();
		int b = scan.nextInt();
		int c = scan.nextInt();
		
		if(a>b && a>c){
			System.out.println("A is greater");
		}else if(b>a && b>c){
			System.out.println("B is greater");
		}else{
			System.out.println("C is greater");
		}
	}

}
