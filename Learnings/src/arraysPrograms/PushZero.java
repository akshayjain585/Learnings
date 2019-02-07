package arraysPrograms;

public class PushZero {

	public static void pushZerosToEnd(int[] list){

		int count = 0;
		for(int i=0; i<list.length; i++){
			if(list[i]!=0){
				list[count]=list[i];
				count++;
			}
		}

		while(count<list.length){
			list[count++]=0; //This will store the value in count and then increment it or we can use below statement as well if we don't use count++ inside the array;
			//count++;
		}

		for(int i=0; i<list.length; i++){
			System.out.print(list[i]+" ");
		}
	}

	public static void pushZerosToStart(int[] list){
		
		int lastIndex = list.length-1;
		for(int i=list.length-1; i>=0; i--){
			if(list[i]!=0){
				list[lastIndex]=list[i];
				lastIndex--;
			}
		}
		while(lastIndex>=0){
			list[lastIndex]=0;
			lastIndex--;
		}
		
		for(int i=0; i<list.length; i++){
			System.out.print(list[i]+" ");
		}
		
	}


	public static void main(String[] args) {
		int[] list = new int[] {1,5,-2,0,0,4,4,-4,0,2,0,33,4};
		pushZerosToEnd(list);
		System.out.println();
		pushZerosToStart(list);
	}

}
