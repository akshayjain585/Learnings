package caveOfProgramming;

public class ExampleStrings {

	public static void main(String[] args) {

		String str = new String("Akshay Jain");
		
		str = str.toLowerCase();
		String str1 = str.toUpperCase();
		str1.substring(4);
		
		StringBuffer sb = new StringBuffer("Jain");
		sb.reverse();
		
		System.out.println(sb);
		
		System.out.println(str+ " " +str1);
	}

}
