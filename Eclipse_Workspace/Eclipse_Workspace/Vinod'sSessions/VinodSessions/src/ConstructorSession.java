/*1. Constructor has the same name as the class name
2. Constructor doesn't have any return type
3. Every class has by default constructor and its called automatically when you create the instance of the class
4. You can create parameterized constructor by passing the argument inside it and known as Constructor overloading that is same method name with different arguements
*/

public class ConstructorSession {
	
	ConstructorSession(){
		System.out.println("This ia a default constructor called when an object is instantiated");
	}
	
	ConstructorSession(int num, String address){
		System.out.println("This is a parameterized constructor");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ConstructorSession obj1 = new ConstructorSession(10, "Akshay");
		

	}

}
