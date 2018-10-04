package stringsPrograms;

import java.util.Scanner;

public class CountWordsInString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Scanner scan = new Scanner(System.in);
//		System.out.println("Enter the string: ");
//		String s = scan.nextLine();
//		
//		String[] words = s.split(" ");
//		System.out.println("The no of words in String is: "+words.length);
		
		String s = "Java is java again java again";
		 
//        char c = 'a';
// 
//        int count = s.length() - s.replace("a", "").length();
// 
//        System.out.println("Number of occurrences of 'a' in "+s+" = "+count);
		
		int count =0;
		char[] c = s.toCharArray();
		for(int i=0; i<c.length; i++){
			if(c[i]=='i'){
				count++;
			}
		}
		
		System.out.println(count);
		

	}

}
