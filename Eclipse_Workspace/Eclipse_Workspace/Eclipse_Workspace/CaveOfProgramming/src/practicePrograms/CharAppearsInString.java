package practicePrograms;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class CharAppearsInString {

	public static void main(String[] args) throws IOException {

		//Scanner scan = new Scanner(System.in);
		
		//System.out.println("Enter the string:- ");
		
		//String value = scan.nextLine();
		
		//System.out.println("Enter the character to find out:- ");
		
		//int v = scan.nextInt();
		
		//char c = (char) (v);
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter the string :- ");
		String value = br.readLine();
		System.out.println("Enter the charcater:- ");
		char c = (char)System.in.read();
		
		int noOfTimesChWsFound = 0;
		
		for(int i=0 ; i<value.length(); i++){
			
			char d = value.charAt(i);
			
			if(d==c){
				noOfTimesChWsFound ++ ;
			}
		}
		
		System.out.println("The no of times char comes is :- " +noOfTimesChWsFound+ " times");
		
	}

}
