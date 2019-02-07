/*
 * Singleton Class : When you restrict the user to have only one object of a class by doing below things :
 * 1. Making a constructor private : You can create the object of the class whose constructor is private within the same class.
 * 2. Creating a static object of singleton class in class itself
 * 3. Making a public method which returns an object of singleton class with return type as singleton class
 */

package javaConcepts;

public class SingletonClass{
	
	public static void main(String[] args){
		ABC a = ABC.getInstance();
		ABC b = ABC.getInstance();	
	}

}

class ABC{
	
	static ABC obj = new ABC();
	private ABC(){
		System.out.println("Constructor should be private of Singleton Class");
	}
	public static ABC getInstance(){
		return obj;
	}
	/*
	 * Below main method is written just to confirm we can create the object of the class whose constructor is private within the class
	 */
	public static void main(String[] args) {
		ABC c = new ABC(); //This will print twice "Constructor should be private of Singleton Class" since firstly static method getInstance will be called which returns obj of the class which inturn call the constructor of the class implicitly and print.
	}
}
