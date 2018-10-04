/*
 * Singleton Class : When you restrict the user to have only one object of a class by doing below things :
 * 1. Making a constructor private.
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
	
}
