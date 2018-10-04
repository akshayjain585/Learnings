
public class SuperKeyword {

	int num= 10;

	SuperKeyword(int num){
		System.out.println("This is a parent class parameterized constructor");
	}

}

class Child extends SuperKeyword
	{

		int num1 = 20;

		Child(){
			super(10);
			System.out.println("This is a base class constructor");
		}

		public static void main(String[] args) {
			// TODO Auto-generated method stub

			Child obj1 = new Child();


		}

	}
