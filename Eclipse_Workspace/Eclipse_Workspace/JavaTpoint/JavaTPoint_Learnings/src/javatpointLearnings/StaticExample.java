package javatpointLearnings;

/*1. Static method/variable doesn't need any object to be called. They can be called using the class name
 * 2. Static block is always executed before main function when class is loaded
 */

public class StaticExample {

	static{
		System.out.println("This is a static block");  //Executing Static Block 
	}

	public static void show(){
		System.out.println("This is a static method");
		System.out.println("The value of i is "+i);
	}

	static int i;

}

class StaticTest{


	public static void main(String args[]){

		StaticExample.i=5;		//Calling the variable using class name since its static variable
		StaticExample.show();   //Calling the method using Class name since its static method


	}

}
