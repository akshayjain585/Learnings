/*
 * 1. Parent class default constructor will be always called first without using Super keyword.
 * 2. Super keyword is required when there is parameterized constructor to be called. Example : super(String name);
 */


package javaConcepts;

class Parent{
	
	
	  Parent(){
		System.out.println("Parent class constructor");
	}
	
	Parent(String name){
		System.out.println("Parent class parameterized constructor");
	}
	
	public void parentMethod1(){
		System.out.println("Parent Method1");
	}
	
	public void parentMethod2(){
		System.out.println("Parent Method2");
	}
	
	public void parentDifferent(){
		System.out.println("Parent Different");
	}
}

class Child extends Parent{
	Child(){
		System.out.println("Child class constructor");
	}
	
	Child(String name){
		super("abc");
		System.out.println("Child class Parameterized constructor");
	}
	
	public void parentMethod1(){
		System.out.println("Child Method1");
	}
	
	public void parentMethod2(){
		System.out.println("Child Method2");
	}
	
	public void childDifferent(){
		System.out.println("Child Different");
	}
}

public class ConstructorInheritanceTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Parent p = new Parent("Arnika");  //Output : Parent class parameterized constructor
		p.parentMethod1();   // Parent Method1
		p.parentMethod2();	// Parent Method2
		
		System.out.println("**");
		
		Child c = new Child("AKshay"); //Parent class parameterized constructor - Child class Parameterized constructor
		c.parentMethod1();	// Child Method1
		c.parentMethod2();	// Child Method2
		c.childDifferent();	// Child Different
		c.parentDifferent();	//Parent Different
		
		System.out.println("**");
		
		Parent p1 = new Child();   //Will call the overridden methods of Child class only and different method of Parent class
		p1.parentMethod1();	//Child Method1
		p1.parentMethod2();	//Child Method2
		p1.parentDifferent();	//Parent Different
	
		
		
	//	Child c1 = new Parent(); //Will give compile time error else will have to cast to child object
		System.out.println("**");
		//Child c1 = (Child) new Parent(); //Have casted Child object to child class but gives runtime error
	}

}
