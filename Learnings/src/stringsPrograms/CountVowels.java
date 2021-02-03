package stringsPrograms;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class CountVowels{
	
	public static void countWords(String input){
		String[] words = input.split(" ");
		int count = 0;
		for(int i=0; i<words.length; i++){
			count ++;
		}
		System.out.println("The words are "+count);
	}
	
	public static void countVowels(String input){
		char[] ch = input.toCharArray();
		int count =0;
		for(int i=0; i<ch.length; i++){
			if(ch[i]=='a' || ch[i]=='e' || ch[i]=='i' || ch[i]=='o' || ch[i]=='u'){
				count++;
			}
		}
		System.out.println("Total vowels are "+count);
	}
		
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the String");
		String input = scan.nextLine();
		countWords(input);
		countVowels(input);
	}

}