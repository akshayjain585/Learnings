/*
 * 1. Static method can use only static variables, not the instance variables.
 * 2. Instance method can use both static and instance variables.
 * 3. Treat Instance as Child and Static as Parent. So parent can't access the child property. But child can access parent's property.
 * 4. We can overload static method but can not override static method bcz overriding happens at run time with the help of objects whereas overloading happens at compile time using JVM.  Below is example in code.
 * 5. Static keyword can be used for variable, method, block and nested classes.
 * 6. Super and this keyword can not be used inside a static method.
 * 7. Static variable can't be defined inside a method because it belongs to a class not to a specific method.
 * 8. Abstract method can't be static because its called by class and eventually class will end up calling abstract method which doesn't have any body so its of no use. Same, so interface can't have static methods.
 * For ref : http://www.javainterviewpoint.com/top-10-java-interview-questions-on-static-keyword/
 */

package javaConcepts;

public class ExampleStatic {
		
	static int a;
	public void checkStatic(){   //Static variable can be used inside non static method
		a=5;
		c=10;
	}
	
	static int b;
	int c;
	public static void checkS(){  // Non static variable can't be used inside static method
		b = 10;
	}
	
	public static void checkS(String name){ //We can overload static method
		System.out.println("Overloading static method");
		System.out.println("Parent class Method");
	}
		
	

	 public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Child1 c = new Child1(); //This would call static method of Child class only bcz its not overriding, its as normal as calling the method of same class by creating the object of it.
		ExampleStatic p = new Child1();
		c.checkS("Akshay");
		System.out.println("**********");
		p.checkS("Akshay1");   //This would still call Parent class method opposite to inheritance concept because its static method and being overridden. So, parent class method is called.
	}

}

class Child1 extends ExampleStatic{
	
	public static void checkS(String name){
		System.out.println("Child class method");
	}
}
