package caveOfProgramming;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class ExampleHashMap {

	public static void main(String[] args) {

		HashMap<Integer, String> map = new HashMap<Integer, String>();
		//TreeMap<Integer,String> map = new TreeMap<Integer,String>();
		//LinkedHashMap<Integer,String> map = new LinkedHashMap<Integer,String>();
		
		map.put(5,"Five");
		map.put(3,"Three");
		map.put(9,"Nine");
		map.put(7,"Seven");
		map.put(8,"Eight");
		
		//For retrieving the value using Key
		System.out.println(map.get(4));
		System.out.println(map.get(9));

		for(Map.Entry<Integer, String> entry: map.entrySet()){
			
			int key = entry.getKey();
			String values = entry.getValue();
			
			System.out.println("The HashMap entries are :- " +key+ ":" +values);
		}
	}

}
