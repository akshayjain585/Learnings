package caveOfProgramming;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class ReadingTextFiles {

	public static void main(String[] args) {

		File file = new File("C:\\LearnJava\\CaveOfProgramming\\src\\caveOfProgramming\\text.txt");
		
		BufferedReader bf = null ;
		
		try {
			FileReader fr = new FileReader(file);
			
			new BufferedReader(fr);
			
			while((bf.readLine()!= null)) {
				
				String line = bf.readLine();
				
				System.out.println(line);
			}
			
		} catch (FileNotFoundException e) {
			System.out.println("File not found : " + file.toString());
		} catch (IOException e) {
			System.out.println("Unable to open File :- " + file.toString());
			e.printStackTrace();
		}
		
		try {
			bf.close();
		} catch (IOException e) {
			System.out.println("Not able to close the file :- " + file.toString());
		}
	}

}
