package caveOfProgramming;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ExampleReadingTextFiles {

	public static void main(String[] args) throws FileNotFoundException {
		
		String fileName = "C:/LearnJava/CaveOfProgramming/src/caveOfProgramming/text.txt" ;
		
		File file = new File(fileName);
		
		Scanner sc = new Scanner(file);
		
		int myInt = sc.nextInt();
		
		System.out.println("Integer Value is :- " + myInt);
		
		sc.nextLine();
		
		while(sc.hasNextLine()){
			
			String lines = sc.nextLine();
			
			//System.out.println("The lines from text files are :-  \n" + lines);
			System.out.println(lines);
		}
		
		sc.close();
		
		
	}

}
