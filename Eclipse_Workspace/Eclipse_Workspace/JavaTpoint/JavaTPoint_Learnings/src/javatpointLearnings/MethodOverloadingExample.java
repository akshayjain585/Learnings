package javatpointLearnings;

/*1. Method overloading is same method name with different arguments.
2. Other names as Early Binding,Static Binding, CompileTime Polymorphism*/

public class MethodOverloadingExample {
	
	
	void sum(int a, int b){
		System.out.println(a+b);
	}
	
	void sum(int a, int b, int c){
		System.out.println((a+b+c));
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		MethodOverloadingExample obj = new MethodOverloadingExample();
		
		obj.sum(5, 6);
		obj.sum(5, 7, 10);

	}

}
