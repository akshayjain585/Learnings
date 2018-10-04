/*1. The child class can access all the variables and methods of parent class
2. RunTime polymorphism is achieved in inheritance due to same function name with same arguments in both parent and child class.
3. Multiple Inheritance is not supported b/c the base class will get confused to take method from which parent class if same method is available in both of the parent class.*/

package javatpointLearnings;

class InheritanceExample{
	
	public void show(){
		System.out.println("Parent class method");
	}		
}

class ChildClass extends InheritanceExample{
	
	public void show(){
		System.out.println("Child class method");
	}
	
	public void sum(int a, int b){
		System.out.println(a+b);
	}	
	
}

public class InheritanceTest {
	public static void main(String[] args){
		ChildClass c = new ChildClass();
		c.show();
		c.sum(5, 10);
		InheritanceExample ie= new InheritanceExample();
		ie.show();
		InheritanceExample i = new ChildClass();
		i.show();
	}
	
}
