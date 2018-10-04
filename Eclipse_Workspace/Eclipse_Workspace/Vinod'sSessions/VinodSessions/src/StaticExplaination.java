
public class StaticExplaination {
	
	int num = 10;
	String name = "Akshay";
	static String address;
	
	public void display(){
		
		System.out.println("Num is " +num);
		System.out.println("Name is " +name);
	}
	
	static{
		System.out.println("To be executed first");
	}
	
	static void staticMethod(){
		System.out.println("This is Static Method");
		System.out.println("Using static variable " +address);
		
	}
	
	/*1. Static block will always be executed first
	2. variable/methods defined with Static keyword will be accessible using class name. No need to create the object*/
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		StaticExplaination SE = new StaticExplaination();
		SE.display();	
		StaticExplaination.address= "BTM";
		StaticExplaination.staticMethod();
			
	}

}
