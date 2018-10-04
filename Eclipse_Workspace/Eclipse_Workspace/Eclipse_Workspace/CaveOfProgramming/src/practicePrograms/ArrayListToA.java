package practicePrograms;

import java.util.ArrayList;

public class ArrayListToA {

	public static void main(String[] args) {

		ArrayList<Integer> al = new ArrayList<Integer>();
		
		al.add(5);
		al.add(7);
		al.add(8);
		
		for(int i=0 ; i< al.size(); i++)
			
		int[] newvalue = al.get(i) ;
		System.out.println("Array List" + al.get(i));
		
		System.out.println(al);
		
		
	}

}
