package javaConcepts;

public class Opeartors {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i=0;
		System.out.println(i++); //Prints i and then perform the addition in next step : 0
		System.out.println(++i); //Prints incremented value of i : 2
		System.out.println(++i); //Increment first and then print : 3
		
		int a = 67;
		double b = 60.8;
		double c = 62.4;
		double d = 62.5;
		System.out.println(Math.ceil(a));    //Ceil gives the up value as double value
		System.out.println(Math.ceil(b));
		System.out.println(Math.ceil(c));
		
		System.out.println(Math.floor(a));	//Floor gives the less value as double value
		System.out.println(Math.floor(b));
		System.out.println(Math.floor(c));
		
		System.out.println(Math.round(a));	//Round gives the round value as int
		System.out.println(Math.round(b));
		System.out.println(Math.round(c));	
		System.out.println(Math.round(d));
		
		


	}

}
