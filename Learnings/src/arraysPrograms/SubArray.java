package arraysPrograms;

public class SubArray {
	
	boolean isSubArray(int[] list1, int[] list2) {
		for(int i=0; i<list2.length; i++) {
			for(int j=0; j<list1.length; j++) {
				if(list2[i]==list1[j]) {
					break;
				}
			}
		}
		return false;
	}

}
