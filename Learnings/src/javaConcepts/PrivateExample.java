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
