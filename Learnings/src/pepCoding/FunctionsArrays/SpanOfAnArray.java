package pepCoding.FunctionsArrays;

/*
 * Problem : Span of an array means where we are required to find the difference between maximum and minimum element in an array.
 */

public class SpanOfAnArray {
	
	public static void spanArray(int[] list) {
		int max = list[0];
		int min = list[0];
		
		for(int i=1; i<list.length; i++) {
			if(list[i] > max) {
				max = list[i];
			}
			
			if(list[i] < min) {
				min = list[i];
			}
		}
		int span = max-min;
		System.out.println("Span of an array is => "+span);
	}
	
	public static void main(String[] args) {
		int[] list = {100,5,9,6,1,70,1};
		spanArray(list);
	}
}
