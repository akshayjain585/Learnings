package allPrograms;

import java.util.Scanner;

public class CountCharacterOccurences {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the String: ");
		String input = scan.nextLine();
		char toCount = 'i' ;
		int count = 0;
		
		char[] charArray = input.toCharArray();
		
		for(int i=0; i<charArray.length; i++){
			if(charArray[i]==toCount){
				count ++;
							
			}		
			
		}
		System.out.println("The count of character i is "+count);
		
		

	}

}
