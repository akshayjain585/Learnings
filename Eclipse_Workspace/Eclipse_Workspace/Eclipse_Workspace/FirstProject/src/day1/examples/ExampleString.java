package day1.examples;

public class ExampleString {

	public static void main(String[] args) {
		
		String a = "Akshay Jain" ;
		
		System.out.println(a);
		
		System.out.println(a.toUpperCase());
		
		System.out.println(a.concat("Java"));
		
		System.out.println(a.substring(3));
		
		System.out.println(a.substring(3,6));
		
		System.out.println(a.substring(3,8));
		
		System.out.println(a.contentEquals("AkshayJain"));
		
		System.out.println(a.contentEquals("Akshay Jain"));
		
		
		String age = "55" ;
		
		String salary = "55555.55" ;
		
		//Wrapper Classes
		
		int x = Integer.parseInt(age) + 5 ;
		
		double y = Double.parseDouble(salary) * 5 ;
		
		System.out.println(x);
		System.out.println(y);
		
	}

}

