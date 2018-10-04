package collectionsPrograms;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Vector;

public class ArrayListExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<Integer> list = new ArrayList<Integer>();
		//List<Integer> list = new LinkedList<Integer>();
		//List<Integer> list = new Vector<Integer>();
		
		list.add(23);
		list.add(12);
		list.add(9);
		list.add(23);
		list.add(45);
		list.add(32);
		
		for(int i=0; i<list.size(); i++){
			System.out.print(list.get(i)+ " ");
			
		}
		
		System.out.println();
		
		for(Integer i: list){
			System.out.print(i+ " ");
		}
		
		System.out.println();
		
		Iterator it = list.iterator();
		while(it.hasNext()){
			System.out.print(it.next()+ " ");
		}
		
		System.out.println();
		
		
		try{
			System.out.println("Delete element at index 2: "+list.remove(2));
			System.out.println("At 6th position: "+list.get(6));
			
		}
		
		catch(Exception e){
			System.out.println("Exception occured: "+e);
		}
		
		finally{
			System.out.println("Size of ArrayList: "+list.size());
		}
		
		
		
		
		
		
		
		
		
		
		

	}

}
