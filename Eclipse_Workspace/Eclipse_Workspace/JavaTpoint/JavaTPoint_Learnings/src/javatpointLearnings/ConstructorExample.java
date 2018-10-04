package javatpointLearnings;

/*1. Constructor name is same as Class name.
2. Constructor does not have any return type.
3. Constructor gets called when an object is created/instantiated and provides memory to the object using new keyword.
4. Default constructor can be used for initial assignment like assigning some value,opening any file etc*/

class ConstructorExample {

	ConstructorExample(){
		System.out.println("Default Constructor");
	}

	ConstructorExample(int i){
		System.out.println("Parameterized Constructor");
	}

}

class Test{
	public static void main(String args[]){

		//		ConstructorExample obj = new ConstructorExample();  //Default Constructor will be called
		ConstructorExample obj = new ConstructorExample(5);	 //Parameterized constructor will get called
	}
}
