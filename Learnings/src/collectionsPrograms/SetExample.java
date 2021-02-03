package collectionsPrograms;

import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;

public class SetExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		Set<Integer> set = new HashSet<Integer>();
		Set<Integer> set = new LinkedHashSet<Integer>();
//		Set<Integer> set = new TreeSet<Integer>();
		
		set.add(4);
		set.add(2);
		set.add(5);
		set.add(8);
		set.add(6);
		set.add(1);
		set.add(1);
		set.add(1);
		set.add(4);
		set.add(4);
		set.add(4);
		set.add(4);
		set.add(4);


		
		//Iterating using enhanced for loop

		
		for(Integer a: set){
			System.out.print(a+ " ");
		}
		
		System.out.println();
		
		//Using Iterator
		Iterator<Integer> it = set.iterator();
		while(it.hasNext()){
			System.out.print(it.next()+ " ");
		}		

	}

}
