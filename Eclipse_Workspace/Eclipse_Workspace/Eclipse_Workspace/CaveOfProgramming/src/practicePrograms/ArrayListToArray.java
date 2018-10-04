package practicePrograms;

import java.util.ArrayList;

public class ArrayListToArray {

	public static void main(String[] args) {

		ArrayList<String> al = new ArrayList<String>();
		
		al.add("Akshay");
		al.add("Sandeep");
		al.add("Aniket");
		
		for(int i=0 ; i<al.size(); i++){
			
			String myValue = al.get(i);
			//System.out.println(al.get(i));
			System.out.println(myValue);
		}
		
		
	}

}
