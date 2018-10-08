package arraysPrograms;

import java.util.HashSet;
import java.util.Set;

public class CommonElements {
	
	public static void commonElements(int[] list1, int[] list2){		
		for(int i=0; i<list1.length; i++){
			for(int j=0; j<list2.length; j++){
				if(list1[i]==list2[j]){
					System.out.println("Duplicate elements are "+list1[i]);						
				}
				
			}
		}
		
	}
	
	public static void cEUsingSet(int[] list1, int[] list2){
		Set<Integer> set = new HashSet<Integer>();
		for(Integer s1 : list1){
			set.add(s1);
		}

		for(Integer s : list2){
			if(set.contains(s)){
				System.out.println("Duplicate elements are "+s);
			}
			set.add(s);
		}		
	}
	
	//Another way by using boolean
	
	public static void cE(int[] list1, int[] list2){

		for(int i=0; i<list1.length; i++){
			boolean common = false;
			for(int j=0; j<list2.length; j++){
				if(list1[i]==list2[j]){
					common = true;
					break;
				}
			}
			if(common){
				System.out.print(list1[i]+",");
			}
		}
	}
	
	public static void main(String[] args){
			
		int[] list1 = {10,20,30,35,44,12,2};
		int[] list2 = {10,1,8,3,7,2};
		//cE(list1,list2);
		//System.out.println();
		//commonElements(list1,list2);
		cEUsingSet(list1,list2);
	}

}