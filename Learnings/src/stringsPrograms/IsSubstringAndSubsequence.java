package stringsPrograms;

public class IsSubstringAndSubsequence {

	public static void isSub(String input1, String input2){

		if(input1.length()==input2.length()){
			if(input1.equalsIgnoreCase(input2)){
				System.out.println("Both strings are equal");
			}
		}

		int count =0;
		for(int i=0; i<input1.length() && count<input2.length(); i++){
			if(input1.charAt(i)==input2.charAt(count)){
				count++;			
			}else{
				count =0;
			}
		}
		if(count == input2.length()){
			System.out.println(input2+" is a substring of "+input1);
		}else{
			System.out.println(input2+" is not a substring of "+input1);
		}
	}

	public static void isSubsequence(String input1, String input2){
		int count = 0;
		for(int i=0; i<input1.length() && count<input2.length(); i++){
			if(input1.charAt(i)==input2.charAt(count)){
				count++;
			}
		}
		if(count == input2.length()){
			System.out.println(input2+" is a subsequence of "+input1);
		}else{
			System.out.println(input2+" is not a subsequence of "+input1);
		}
	}



	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String input1 = "geeksforgeeks";
		String input2 = "gksrees";
		isSub(input1,input2);
		isSubsequence(input1,input2);

	}

}
