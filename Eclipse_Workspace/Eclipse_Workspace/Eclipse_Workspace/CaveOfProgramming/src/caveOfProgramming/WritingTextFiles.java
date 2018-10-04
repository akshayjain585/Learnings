package caveOfProgramming;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class WritingTextFiles {

	public static void main(String[] args) {

		File file = new File("C:\\LearnJava\\CaveOfProgramming\\src\\caveOfProgramming\\text.txt");
		
		try {
			FileWriter fw = new FileWriter(file);
			
			BufferedWriter bw = new BufferedWriter(fw);
			
			bw.write("This is first line");
			bw.newLine();
			bw.write("This is second line");
			bw.newLine();
			bw.write("This is third line");
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
	}

}
