package day1.examples;

public class ExampleAndOr {

	public static void main(String[] args) {
		/*
		 * To check if both are numbers are +ve
		 */

		 int x = 10;
		 int y = -10;
		 
		 if(x > 0 && y > 0){
			 System.out.println("Both the nums are +ve");
		 }else if (x > 0 || y > 0){
			 System.out.println("Atleast one num is +ve");
		 }else {
			System.out.println("None of the numbers are positive"); 
		 }
	}

}
