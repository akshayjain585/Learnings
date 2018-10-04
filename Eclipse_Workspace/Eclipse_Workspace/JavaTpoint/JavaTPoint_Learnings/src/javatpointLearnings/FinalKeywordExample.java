package javatpointLearnings;

/*1. If the variable is declared as final, its value can't be changed once assigned.
2. Final class can't be extended.
3. Final method can't be overridden.
 */
public class FinalKeywordExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		final int i;
		i=6;
		System.out.println(i);

	}

}

final class FinalA{

	final public void show(){
		System.out.println("Parent Class");
	}
}

/*class FinalB extends FinalA{

	public void show(){
		System.out.println("Child Class");
	}
}*/