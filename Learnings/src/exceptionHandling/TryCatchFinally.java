/*Exceptions : 
1. Checked : IO, SQL, ClassNotFound 
2. Unchecked : RunTimeException : NullPointer, Arithmetic, OutofBounds
3. Error : StackOverflow,VirtualMachineError,OutofMemory
4. Throw: To throw an exception with in a method followed  and can't throw multiple exceptions.
5. Throws : To declare an exception mainly for checked exception in a method signature followed by a class and can throw multiple exceptions
6. Method Overriding : If parent class doesn't declare an exception then subclass can't declare a checked exception but can do Runtime(unchecked) exceptions.
7. If superclass declares an exception, then subclass can not declared a parent means top level exception but can declare same exception
*/

package exceptionHandling;

import java.io.IOException;

public class TryCatchFinally {
	
	static void getROI() throws Exception {
		throw new IOException("Learning throws and throw Exception");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		try{
			//int data = 25/0;
			//System.out.println(data);
			getROI();
		}
		
		catch(Exception e){
			e.printStackTrace();
			System.out.println(e);
			
		}
		finally{
			System.out.println("Will always be executed either exception is handled or not");
		}
		
		System.out.println("Outside try catch and finally block");

	}

}
