
/*
//Because static uses the same memory once created so it can be incremented but variable a every time creates a different memory with value as 0 and gets initialized to  1 thatswhy value remains 1.
*/
package javaConcepts;

public class StaticExample {

	int a =0;
	static int c = 0;
	
	StaticExample(){
		a++;
		c++;
		System.out.println("Static value is "+c+" and non static value is "+a);
	}
	
	public static void main(String[] args) {
		StaticExample se = new StaticExample();    
		StaticExample se1 = new StaticExample();
		StaticExample se2 = new StaticExample();

	}
}
