
public class InheritanceSession {

	InheritanceSession(){
		System.out.println("Parent class constructor");
	}

	private int num1 = 10;
	int num2 = 20;

	private void methodNum1(){
		System.out.println("Printing from methodNum1: " +num1);
	}

	void methodNum2(){
		System.out.println("Printing from methodNum2: " +num2);
	}
	
	void display(){
		System.out.println("Display method from Parent Class");
	}
	
	void display(int num1, String name){
		System.out.println("2nd Display method from Parent Class");
	}

}

class ChildClass extends InheritanceSession
{

	ChildClass(){
		System.out.println("Child Class constructor");
	}

	void display(){
		System.out.println("Display method from Child Class");
	}
	
	void display(String name, int num1){
		System.out.println("2nd Display method from Child Class");
	}

	public static void main(String args[]){

		//ChildClass objectChildClass = new ChildClass();
		/*Can't access the variables and methods since its declared as private in Parent class
		objectChildClass.num1 = 20;
		objectChildClass.methodNum1();*/
		
		InheritanceSession PCObject = new ChildClass();  //Creating the object of child class with reference to Parent's class
		PCObject.display(); //Child's method is called since child class object was created
		PCObject.display(20,"Akshay"); //Parent's method is called since parameters are same as of parent's method
	//	PCObject.display("Akshay",20); Will get compile time error here because reference is given for Parent's class so only their methods will be visible
		
		
		
	}

}



