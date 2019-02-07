/*
 * Private and Final :
 * Private Methods: Can not be accessible outside the class. Its about the scope like public, protected. Can not be accessible so there is no point of being overridden. However, it can be accessed outside the class using java reflection API (Have never used this though)
 * Final : Final is about the modification. If a method is declared as final, it can not be overridden.
 * Private variables : Can't use outside the class. But can use getters and setters to access or change the value of private variables. 
 */

package javaConcepts;

public class PrivateExample {

	private int i=10;
	void privateMethod(){
		System.out.println("Private method");
	}
	
	public void publicMethod(){
		System.out.println("Public Method");
	}
	
	protected void protectedMethod(){
		System.out.println("Protected Method");
	}

	public int getI() {
		return i;
	}

	public void setI(int i) {
		this.i = i;
	}
	
	
}

class Test{
	
	public static void main(String[] args){
		PrivateExample p = new PrivateExample();
		p.setI(20);
		p.privateMethod();
		p.publicMethod();
		p.protectedMethod();
	}
}
