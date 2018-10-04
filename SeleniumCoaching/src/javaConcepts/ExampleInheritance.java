package javaConcepts;

 class ParentClass {
	
	String testVariable = "This is Parent class variable";
	String testVariable1 = "This is another Parent class variable";

	public void add(int a , int b){
		System.out.println("Calling method of Parent class");
	}

	
	public void sub(int a, int b){
		System.out.println("Calling method of Parent class");
	}
}

class ChildClass extends ParentClass{
	
	String testVariable = "This is Child variable";
	String testVariable2 = "This is another child variable";

	
	public void add(int a, int b){
		System.out.println("Calling method of Base class");
	}

	
	public void multiply(int a , int b){
		System.out.println("Calling method of Base class");
	}
	
}

public class ExampleInheritance{
	public static void main(String[] args){
		ParentClass pc = new ParentClass(); //eI can access all methods of ExampleInheritance class but not child class
		//System.out.println("This will call parent class variable: "+pc.testVariable);
		
		
		ChildClass cc = new ChildClass(); //a can access all methods of Child class and Parent class.
//		cc.add(10,5); //Add method with 2 arguements was available in child class so it used that.
//		cc.add(10, 5, 5); //It looked for add method with 3 arguements first in child class and then used the parent class method.
//		cc.sub(10, 5);
//		System.out.println("This will call child class variable: "+cc.testVariable);
//		System.out.println("This will call child class variable: "+cc.testVariable2);
//		System.out.println("This will call parent class variable: "+cc.testVariable1);
		
		//https://www.sitepoint.com/interface-and-inheritance-in-java-inheritance/
				
		ParentClass pcc = new ChildClass(); 
		pcc.add(10, 20);
		pcc.sub(10, 20);
		System.out.println("This will call the child class variable: "+pcc.testVariable);
		System.out.println("This will call the parent class variable: "+pcc.testVariable1);
	}
}


