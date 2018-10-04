/*
 * 1. byte --> short --> int --> long --> float --> double : Widening/Upgrading : Possible without typecasting
 * 2. Narrowing down any datatype from one to other : Narrowing : Have to typecast
 */
package javaConcepts;

public class WrapperClassAndTypeCasting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a = Integer.parseInt("123"); //Converting from String to int primitive data type
		System.out.println(a);
		
		float f = (float) Double.parseDouble("123"); //Narrowing is not possible from double to float so have to typecast
		System.out.println(f);
		
		int i = 10;
		short s = (short)i; //Narrowing is not possible from int to short so have to typecast
		System.out.println(s);
		
		int i1 = 54;
		double d = i1; //Widening is possible
		System.out.println(d);
		
		System.out.println("******");
		
		int i2 =10;
		i2++;
		System.out.println(i2++); //11
		++i2;
		System.out.println(++i2); //14
			
	}

}
