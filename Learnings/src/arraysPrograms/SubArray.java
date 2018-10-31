package arraysPrograms;

import java.util.HashSet;
import java.util.Set;

public class SubArray {
	
	static boolean isSubArray(int[] list1, int[] list2) {
		for(int i=0; i<list2.length; i++) {
			for(int j=0; j<list1.length; j++) {
				if(list2[i]==list1[j]) {
					break;
				}
			}
		}
		return false;
	}
	
	public static boolean isSub(int[] list1, int[] list2){
		boolean status = false;
		Set<Integer> set = new HashSet<>();
		for(int key : list2){
			set.add(key);
		}
		
		for(int key : list1){
			if(set.contains(key)){
				status = true;
			}
		}
		
		return status;
	}

}
