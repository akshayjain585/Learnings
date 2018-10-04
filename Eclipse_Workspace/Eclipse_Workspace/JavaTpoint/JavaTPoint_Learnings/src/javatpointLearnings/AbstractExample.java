package javatpointLearnings;

/*1. The method which is just declared and not defined is Abstract method.
2. Any class which has atleast one abstract method is called Abstract Class
3. The object can not be created from abstract class.
4. To create the object and use, we should extend the abstract class and define the method in base class then its known as Concrete class.*/

public abstract class AbstractExample {
	
	public abstract void show();

}

class Iphone extends AbstractExample{

	public void show() {
		System.out.println("This shows Iphone Configuration");
	}
	
}

class AbtractTest{
	
	public static void main(String[] args){
		
		Iphone obj = new Iphone();
		obj.show();
	}
	
}