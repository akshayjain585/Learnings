package javatpointLearnings;

/*1. MethodOverriding is same method name with same arguments but in different class with inheritance
2. Other names as Late Binding, Dynamic Binding, RunTime Polymorphism*/

public class MethodOverridingExample {

	public void sum(int a, int b){
		System.out.println("ParentClass function is called");

	}

}

class Overriding extends MethodOverridingExample{

	public void sum(int a, int b){
		System.out.println("ChildClass function is called");
	}
}

class OverridingTest{
	public static void main(String[] args){
		Overriding obj = new Overriding();
		obj.sum(6, 7);
	}
}

