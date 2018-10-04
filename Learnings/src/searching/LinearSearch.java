//The time complexity of Linear Search is 0(n)

package searching;

public class LinearSearch {

	public static int linearSearch(int[] list, int key){
		for(int i=0; i<list.length; i++){
			if(list[i]==key){
				return i;

			}
		}
		return -1;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int array[] = {10,4,7,0,65,23,-1};
		int result = linearSearch(array,10);
		if(result==-1){
			System.out.println("Element not found");
		}else{
			System.out.println("Element present at index: "+result);
		}


	}

}
