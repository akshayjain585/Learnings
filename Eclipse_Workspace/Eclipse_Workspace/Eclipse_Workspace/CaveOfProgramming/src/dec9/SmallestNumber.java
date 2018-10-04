package dec9;

import java.util.Scanner;

public class SmallestNumber {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter the numbers to be printed ");
		
		int n = scan.nextInt();
		
		int[] inputArray = new int[n];
		System.out.println("Enter the " +n+ " numbers");
		
		for(int i = 0 ; i<n ; i++){
			
			inputArray[i] = scan.nextInt();			
		}
		
		//Method 1 to find the largest element in an array :
		
		int smallest = inputArray[0];
		
		for(int j=1 ; j<inputArray.length ; j++){
			
			if(inputArray[j] < smallest){
				
				smallest = inputArray[j];
			}
		}
		
		System.out.println("The largest element inside an array is " +smallest);
	}

}
