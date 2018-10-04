package javaConcepts;

public class TypeCasting {
	
	public static void main(String[] args){
		
		short s = 1;
		long l = 1234567899;
		
//		Syntax for TypeCasting
//		targetDataType = (targetDataType)SourcedataType;
		
		short s1 = (short)l;  //Explicit TypeCasting : Narrowing(To store big data type in small so explicit typecasting as small datatype doesn't have that much space to store the value of larger datatype)
		System.out.println(s1);
		long l1 = s1;         //Implicit TypeCasting : Broadening(Going to store small datatype in bigger one so no need of explicit typecasting as space is already available)
		System.out.println(l1);
		
		
		
		
	}

}