package arraysPrograms;

public class NumberAdditionInArray {
	
	public static void numAdd(int[] list1, int[] list2){
		String sum1 = "";
		String sum2 = "";
		
		for(int i=0; i<list1.length; i++){
			sum1 = sum1 + list1[i];
		}
		int s1 = Integer.parseInt(sum1);
		
		for(int i=0; i<list1.length; i++){
			sum2 = sum2 + list2[i];
		}
		int s2 = Integer.parseInt(sum2);
		System.out.println(s1+s2);
	
	}
	
	public static void main(String[] args) {
		int[] list1 = new int[] {1,2,3,4};
		int[] list2 = {5,6,7,8};
		
		numAdd(list1,list2);
	}

}
