package practicePrograms;

import java.util.Scanner;

public class VowelsInString {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the string to check :- ");
		String myString = scan.nextLine();
		System.out.println("Vowels in the string:- ");
		
		int vowelsCount = 0 ;
		
		for(int i=0 ; i<myString.length(); i++){
			
			char vowel = myString.charAt(i);
			if(vowel =='a' || vowel == 'e' || vowel == 'i' || vowel == 'o' || vowel == 'u' ){
				vowelsCount ++ ;
				System.out.print(vowel);
				
			}
		}
		
		System.out.println(" ");
		System.out.println("No of vowels :- " +vowelsCount);
	}

}
