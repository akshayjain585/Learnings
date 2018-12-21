/*
 * Order of execution :
 * 1. Static Block gets executed once only at the time of class gets loaded in JVM.
 * 2. Instance variables gets assigned with default values
 * 3. Instance block 
 * 4. Constructors
 * Flow :
 * Static Block --> Instance variables gets assigned with default values --> Instance/Non static Blocks --> Constructors
 */

package javaConcepts;

public class ExampleOrderOfExecution {
	
	ExampleOrderOfExecution(){
		System.out.println("No arguement constructor");
		this.x=10;
		this.y="Assigning value to a String";
		System.out.println(x);
		System.out.println(y);
		
	}
	
	ExampleOrderOfExecution(int x){
		System.out.println("1 arguemnent constructor");
		this.y=null;
		System.out.println(y);
		System.out.println(x);
		x=20;
		System.out.println(x);
	}
	
	int x;
	String y;
	static int a;
	static String b;

//First static block
	static{
		System.out.println("Inside 1st static block");
	}

//Second Static block
	static{
		System.out.println("Inside 2nd static block");
	}

//First Instance/Non static block
	{
		System.out.println(y);
	}

//Second Instance/Non static Block
	{
		System.out.println(x);
	}
	
	public static void staticMethod(){
		System.out.println("Inside Static Method : "+a+" "+b);
	}
	
	public static void main(String[] args) {

		ExampleOrderOfExecution e = new ExampleOrderOfExecution();
		staticMethod();
		System.out.println("Printing Static variable "+a+" , "+b);
		System.out.println("**************************************");
		ExampleOrderOfExecution e1 = new ExampleOrderOfExecution(8);
	}
		
}

/*
 * Output :
 * Inside 1st static block
 * Inside 2nd static block
 * null
 * 0
 * No arguement constructor
 * 10
 * Assigning value to a String
 * Inside Static Method : 0 null
 * Printing Static variable 0 , null
 * 
 * ***************************************
 * null
 * 0
 * 1 arguemnent constructor
 * null
 * 8
 * 20
 * 
 */

