/*
 * In Call by value : Pass-by-value means that when you call a method, a copy of each actual parameter (argument) is passed. You can change that copy inside the method, but this will have no effect on the actual parameter. ..
 * Call by reference can be done by using String/Array or Class obj.
 */
package javaConcepts;

public class CallByValueCallByRef {
	
	static int a;
	static int b;
	
	public void sum(int a, int b){
		System.out.println("Inside Method :"+(a+b));
	}
	
	public void show(int a){
		a = a + 100;
		System.out.println("Inside Method :"+a);
	}
	
	public void display(StringBuffer sb){
		sb.append("Jain");
		System.out.println(sb);
	}
	
	public static void main(String[] args) {

		CallByValueCallByRef obj = new CallByValueCallByRef();
		StringBuffer s1 = new StringBuffer("Akshay");
		
		obj.a = 10;
		obj.b = 20;
		obj.sum(20, 40); //Call by value : This will print the changed value of "a" and "b" and do the sum inside the method. But outside the method, the actual value remains same as the copy of a&b is passed, not the reference.
		System.out.println("Outside method :"+(a+b));

		obj.show(a); //Call by value : This will print the changed value of "a"  and add 100 inside the method. But outside the method, the actual value remains same.
		System.out.println("Outside Method :"+a);
		
		System.out.println("*************Call by Reference****************");
		obj.display(s1); //Call by reference since StringBuffer object is passed and not the value so the value is changed inside the method and outside the method as well as shown below.
		System.out.println(s1);
	}

}
