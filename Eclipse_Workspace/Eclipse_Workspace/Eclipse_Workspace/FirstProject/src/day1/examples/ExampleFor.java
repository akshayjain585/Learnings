/*
 * This is an example of "for" statement and shows the syntax of the condition
 */

package day1.examples;

public class ExampleFor {

	public static void main(String[] args) {
		
		/*
		 * i++ = i + 1
		 * i += 1 (Means "i" incremented by 1)
		 * i-- = i - 1
		 * Syntax = for(initialize; condition; increment/decrement
		 */
		
		for(int i=0; i<=10; i++){
			
			System.out.println("The value of i =" +i);

	}

		
		for(int i=10 ; i>3; i--){
			
			System.out.println("The value of i = " + i);
		}
}
	
}
