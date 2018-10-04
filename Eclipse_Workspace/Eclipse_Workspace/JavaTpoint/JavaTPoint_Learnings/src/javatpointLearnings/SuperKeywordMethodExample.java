package javatpointLearnings;

/*1. Every class by default extends object class
2. Super method by default always calls the default constructor of parent class.
3. Using Super keyword you can access the variables of parent class*/

public class SuperKeywordMethodExample {

	public static void main(String[] args) {

		SuperB obj = new SuperB(); //Super method by default will call the parent class constructor first
		obj.show();
	}

}

class SuperA{

	int i=5;

	public SuperA(){
		System.out.println("Parent Class Constructor");
	}

}

class SuperB extends SuperA{

	int i=6;
	public SuperB(){
		System.out.println("Child class Constructor");
	}

	public void show(){
		System.out.println(super.i); //Using Super keyword you can access the variables of parent class
	}

}
