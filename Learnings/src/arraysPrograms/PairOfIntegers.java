package arraysPrograms;

import java.util.HashSet;
import java.util.Set;

public class PairOfIntegers {
	
	public static void pair(int[] list, int key){
		
//		for(int i=0; i<list.length; i++){
//			int first = list[i];
//			for(int j=i+1; j<list.length; j++){
//				int second = list[j];
//				if(first + second == key){
//					System.out.println(list[i] + ","+ list[j]);
//				}
//			}
//		}
		boolean pair = false;
		for(int i=0; i<list.length; i++){
			for(int j=i+1; j<list.length; j++){
				if(list[i] + list[j] == key){
					System.out.println(list[i]+","+list[j]);
					pair = true;
				}
			}
		}
		if(!pair){
			System.out.println("Pair not found");
		}
	}
	
	public static void pairLessComplexity(int[] list, int key){
		if(list.length<2){
			return;
		}
		Set<Integer> s = new HashSet<>(list.length);
		for(int value : list){
			int target = key - value;
			if(s.contains(target)){
				System.out.println(value+","+target);
			}else{
				s.add(value);
			}
		}
		
		
	}
	
	public static void main(String[] args){
		
		int[] list = {2,4,3,5,7,8,9};
		//pair(list,7);
		pairLessComplexity(list,7);
	}

}
