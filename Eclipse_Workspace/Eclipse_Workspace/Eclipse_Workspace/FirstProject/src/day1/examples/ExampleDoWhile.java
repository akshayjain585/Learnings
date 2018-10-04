package day1.examples;

public class ExampleDoWhile {

	public static void main(String[] args) {
		
		int i = -10;  //Initialize the value of i = -10
		
		do{
			System.out.println("The value of i = " +i);
			
			i += 2;  //Increment the value of i by 2 so that it would be (-10 + 2 = -8)
		}
		while(i<0);  //Loop it until i is less than 0
		
	}

}


