package stringsPrograms;

public class StringRotation {
	
	public static boolean isRotation(String input1, String input2){
		
		//Idea is to concatenate main String with itself and then do a check for substring from concatenated string
		
		if(input1.length()==input2.length() && (input1+input1).indexOf(input2)!=-1){
			System.out.println(input2+" is a rotation of "+input1);
			return true;
		}
		System.out.println(input2+" is not a rotation of "+input1);
		return false;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s1 = "IndiaVsAustralia";
		String s2 = "AustraliaVsIndia";
		String s3 = "IndiaVsEngland";
		String s4 = "EnglandIndiaVs";
		String s5 = "ABCD";
		String s6 = "CDAB";
		isRotation(s1,s2);
		isRotation(s3,s4);
		isRotation(s5,s6);

	}

}