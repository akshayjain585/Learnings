package testScripts;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class ListCompare {
	
public static void commonTrace(List<String> list1, List<String> list2){

		Set<String> set = new HashSet<String>();
		
		for(String key : list1){
			set.add(key);
		}
		
		for(String key1 : list2){
			if(!set.contains(key1)){
				System.out.println("Additional traces are "+key1);
			}
		}
	}


public static void missingTrace(List<String> list1, List<String> list2){

	Set<String> set = new HashSet<String>();
	
	for(String key : list2){
		set.add(key);
	}
	
	for(String key1 : list1){
		if(!set.contains(key1)){
			System.out.println("Missing traces are "+key1);
		}
	}
}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		List<String> list1 = new ArrayList<String>();
		list1.add("Movies");
		list1.add("Sports");
		list1.add("News");
		list1.add("Kids");
		list1.add("Discovery");
		
		List<String> list2 = new ArrayList<String>();
		list2.add("Movies");
		list2.add("Sports");
		list2.add("Test1");
		list2.add("Test2");
		list2.add("Test3");

		
		commonTrace(list1, list2);
		missingTrace(list1, list2);
		
		//Missing : news, kids, discovery
		//Additional : Test1, test2, test3
		
	}

}
