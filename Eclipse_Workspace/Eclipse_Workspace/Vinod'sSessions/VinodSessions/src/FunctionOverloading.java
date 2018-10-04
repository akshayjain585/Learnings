
public class FunctionOverloading {
	
	int number1,number2;
	
	public void displaySum()
	{
		System.out.println(number1+number2);
	}
	
	public String method1(int num, String name)
	{
	
		System.out.println(num);
		String xyz=null;
		return xyz;
	}
	
	public void method1(String name, int num)
	{
		System.out.println(num);
	}
	

	public static void main(String[] args) {

		FunctionOverloading [] obj1 = new FunctionOverloading[100];
		
/*		obj1.number1=10;
		obj1.number2=20;
*/		
		
		/*obj2.number1=50;
		obj2.number2=20;
		
		obj1.displaySum();
		obj2.displaySum();
	*/	
	}

}
