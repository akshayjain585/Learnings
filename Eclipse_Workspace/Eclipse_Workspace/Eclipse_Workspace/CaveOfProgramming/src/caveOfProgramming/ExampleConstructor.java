package caveOfProgramming;

public class ExampleConstructor {
	
	String name;
	int age ;
	
	public ExampleConstructor(){
		this("Calling third consturctor",1);
		System.out.println("First constructor running");
	}
	
	public ExampleConstructor(String name){
		
		System.out.println("Second Constructor running");
		this.name = name ;
	}
	
	public ExampleConstructor(String name, int age){
		
		System.out.println("Third Constructor running");
		this.name = name ;
		this.age = age ;
	}

}
