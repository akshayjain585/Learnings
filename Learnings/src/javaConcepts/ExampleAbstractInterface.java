package javaConcepts;

/*
 * 1. In interface, all methods are public and data members are public,static and final by default.
 * 2. Any class if it has any methods as abstract will be known as abstract class.
 * 3. Class which defines the implementation of all the abstract methods is known as Concrete class. Below, M is a concrete class. 
 */
interface AA{  
	static final int a = 10; 
	//AA(){} : Interfaces can't have constructors.
	void a();  
	void b();  
	void c();  
	void d();  
}  

abstract class BB implements AA{  	//Since class BB did not provide implementation of all abstract method. Its an abstract class
	public void c(){System.out.println("I am c");}  
	
	BB(){		//Abstract class can have constructors.
		System.out.println("Abstract class constructor");
	};	
}  

class M extends BB{  			//M class has to provide implementation of all abstract methods, else this would be again abstract class. Sice, it defined the implementation of all methods, its a concrete class.
	public void a(){System.out.println("I am a");}  
	public void b(){System.out.println("I am b");}  
	public void d(){System.out.println("I am d");}  
}  

public class ExampleAbstractInterface{  
	public static void main(String args[]){  
		AA a=new M(); 
	//	AA a1 = new AA(); //Can't create the object of an interface.
	//	BB b = new BB();  //Can't create the object of an abstract class.
		a.a();  
		a.b();  
		a.c();  
		a.d();  
	}}  

