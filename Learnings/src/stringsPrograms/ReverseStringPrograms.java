package stringsPrograms;

import java.util.Scanner;

public class ReverseStringPrograms {
	
	public static void reverseString(String input){
		for(int i=input.length()-1; i>=0; i--){
			System.out.print(input.charAt(i));
		}
	}
	
	public static void reverseWords(String input){
		String[] words = input.split(" ");
		for(int i=words.length-1; i>=0; i--){
			System.out.print(words[i] + " ");
		}
	}
	
	public static void reverseWordsInString(String input){
		String[] words = input.split(" ");
		for(int i=0; i<words.length; i++){
			String word = words[i];
			for(int j=word.length()-1; j>=0; j--){
				System.out.print(word.charAt(j));
			}
			System.out.print(" ");
		}
	}
	
	//Input : This is a String
	//Output : THIS si A gnirts
	
	public static void sP(String input) {
		String[] words = input.split(" ");
		for(int i=0; i<words.length; i++) {
			if(i%2 == 0) {
				System.out.print(words[i].toUpperCase()+" ");
			}else {
				String word = words[i];
				for(int j=word.length()-1; j>=0; j--) {
					System.out.print(word.charAt(j));
				}
				System.out.print(" ");
			}
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the string to be reversed");
		String input = scan.nextLine();
		reverseString(input);
		System.out.println();
		reverseWords(input);
		System.out.println();
		reverseWordsInString(input);
		System.out.println();
		String in = "This is a String" ;
		sP(input);
			
	}

}
