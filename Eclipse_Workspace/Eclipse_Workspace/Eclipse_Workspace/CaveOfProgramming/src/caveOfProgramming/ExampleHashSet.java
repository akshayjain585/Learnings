package caveOfProgramming;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.TreeSet;

public class ExampleHashSet {

	public static void main(String[] args) {

		HashSet<Integer> set = new HashSet<Integer>();
		//TreeSet<Integer> set = new TreeSet<Integer>();
		//LinkedHashSet<Integer> set = new LinkedHashSet<Integer>();
		
		set.add(6);
		set.add(4);
		set.add(2);
		set.add(30);
		set.add(25);
		
		System.out.println("The HashSet values are :- " +set);
		
		for(Integer value: set){
			System.out.println(value);
		}
		
	}

}
