package caveOfProgramming;

public class Example {


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		StringBuffer sb1 = new StringBuffer("Amit");
		StringBuffer sb2 = new StringBuffer("Amit");
		String ss1 = "Amit";
		System.out.println(sb1==sb2);
		System.out.println(sb1.equals(sb2));
		System.out.println(sb1.equals(ss1));
		System.out.println("Poddar".substring(3));
		
}
}