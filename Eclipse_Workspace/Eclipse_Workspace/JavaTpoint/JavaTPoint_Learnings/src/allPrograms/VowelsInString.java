package allPrograms;

public class VowelsInString {
	
	static void findVowelsInString(String inputString){
		
		//char[] charString = inputString.toCharArray();
		int vowels = 0;
		
		/*for(int i=0; i<charString.length; i++){
			
			if(charString[i] == 'a' || charString[i] == 'e' || charString[i] == 'i' || charString[i] == 'o' || charString[i] == 'u'){
				vowels ++;
			}		
			
		}
		System.out.println("No of Vowels: "+vowels);*/
		
		for(int i=0; i<inputString.length(); i++){
			
			char n = inputString.charAt(i);
			if(n=='a'|| n=='e' || n=='i' || n=='o' || n=='u'){
				vowels++;
			}
		}
		System.out.println("No of Vowels: "+vowels);
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		findVowelsInString("Harsh Kotecha");

	}

}
