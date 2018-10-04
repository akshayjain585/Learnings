package javaConcepts;

import java.util.Scanner;

public class ArrayExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		int[] arr = new int[5]; //Array of int of size 5;
		int[] arr1 = {1,2,3};
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the input as integer: ");
		int a = scan.nextInt();
//		System.out.println("Enter the input as String: ");
//		String ab = scan.nextLine();
		System.out.println("Enter the input as array of integers: ");
		for(int i=0; i<5; i++){		
			arr[i]= scan.nextInt();
			System.out.print(arr[i]+", ");
		}

		

	}

}
