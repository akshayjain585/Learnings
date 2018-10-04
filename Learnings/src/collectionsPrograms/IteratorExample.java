package collectionsPrograms;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class IteratorExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<Integer> list = new ArrayList<Integer>();
		
		list.add(23);
		list.add(12);
		list.add(9);
		list.add(23);
		list.add(45);
		list.add(32);
		
		System.out.println(list);
		
		System.out.println("Using Iterator interface to travese forward: ");
		Iterator<Integer> it = list.iterator();
		while(it.hasNext()){
			int a = it.next();
			System.out.print(a+ " ");
			
		}
		System.out.println();
		
		System.out.println("Using ListIterator interface to traverse backward: ");
		ListIterator<Integer> li = list.listIterator();
		while(li.hasPrevious()){
			System.out.println(li.previous());
				
		}

	}

}
