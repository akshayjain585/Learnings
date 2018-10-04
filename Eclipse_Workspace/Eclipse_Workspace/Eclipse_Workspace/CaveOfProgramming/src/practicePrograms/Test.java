package practicePrograms;

public class Test {
	
	public int aMethod()
	{
		static int i = 0 ;
		i++ ;
		return i ;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Test test = new Test();
		test.aMethod();
		int j = test.aMethod();
		System.out.println(j);
		
	}

}
