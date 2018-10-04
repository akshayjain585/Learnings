package javaConcepts;

/*
 * 1. In interface, all methods are public and data members are public,static and final by default.
 */
interface AA{  
	static final int a = 10; 
	void a();  
	void b();  
	void c();  
	void d();  
}  

abstract class BB implements AA{  	//Since class BB did not provide implementation of all abstract method. Its an abstract class
	public void c(){System.out.println("I am c");}  
}  

class M extends BB{  			//M class has to provide implementation of all abstract methods.
	public void a(){System.out.println("I am a");}  
	public void b(){System.out.println("I am b");}  
	public void d(){System.out.println("I am d");}  
}  

public class ExampleAbstractInterface{  
	public static void main(String args[]){  
		AA a=new M();  
		a.a();  
		a.b();  
		a.c();  
		a.d();  
	}}  

