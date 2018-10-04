
public class FinalKeyword {
	
	final int num = 10;
	int num2 = 20;
	
	final void display(){
		System.out.println("Num is " +num);
	}
	
	void toDisplayNum2(){
		System.out.println("Num2 is "+num2);
	}

}
  

//Won't be able to extend the class if the class is defined as final
class ChildClasss extends FinalKeyword{
	
	/*void display(){
		System.out.println("Won't be able to create the method with same signature since its defined as final");
	}*/
	
	
	//You can not override but overload if you have defined the method with final keyword
	void display(int num){
		System.out.println("This is overloading");
	}

	public static void main(String args[]){
		
		ChildClasss obj1 = new ChildClasss();
		
		
	//	obj1.num = 20;  Won't be able to access since the variable is defined as final
		obj1.display(10);
		obj1.num2= 30;
		obj1.toDisplayNum2();	
		
	}
	
}



	




