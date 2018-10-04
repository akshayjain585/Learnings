package day1.examples;

public class ExampleSwitch {

	public static void main(String[] args) {
		
		int i = 2;
		
		switch (i) { 
			
			case 0:
				System.out.println("The value is 0");
				break;
			
			case 1:
				System.out.println("The value is 1");
				break;
				
			case 2:
				System.out.println("The value is 2");    //It matches the value of case that is 2 here with switch(i) where i's value is 2
				break;
			
			case 3:
				System.out.println("The value is 3");
				break;
					
			default:
				System.out.println("No Value");
		}
	}

}
