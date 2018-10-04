package stringsPrograms;

public class StringMethodsPractice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		StringBuffer sb1 = new StringBuffer("Amit");
		StringBuffer sb2 = new StringBuffer("Amit");
		StringBuilder sb11 = new StringBuilder("Amit");
		StringBuilder sb22 = new StringBuilder("Amit");
		String sb = "Amit";
		
		/*There is no equal method in StringBuffer and StringBuilder class so it uses equals method of Object class
		 * which compares the references of both the objects instead of the objects value. Thats why sb1.equals(sb2) is "false"
		 */
		
		System.out.println(sb1==sb2);   				//false
		System.out.println(sb1.equals(sb2)); 			//false
		System.out.println(sb11==sb22);					//false
		System.out.println(sb11.equals(sb22)); 			//false
		System.out.println(sb1.equals(sb));				//false
		System.out.println("Poddar".substring(3));		//dar
		StringBuilder s1=new StringBuilder("hello");	
		StringBuilder s2=new StringBuilder("hello");
		String a1 = "hello";
		String a3 = new String("hello");
		System.out.println(a1==a3);
		String a2 = "hello";
		System.out.println(s1==s2);						//false
		System.out.println(s1.equals(s2));				//false
		System.out.println(a1==a2);						//true

		String a11 = new String("Amit");
		String a22 = "Amit";
		System.out.println(a11==a22);					//false
		System.out.println(a1.equals(a2));    			//true

		
	}

}
