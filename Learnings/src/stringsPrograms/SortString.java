package stringsPrograms;

public class SortString {
	
	public static void stringSort(String input){
		String toLowerCase = input.toLowerCase();
		char[] ch = toLowerCase.toCharArray();
		char temp;
		String sorted = "";
		for(int i=0; i<ch.length-1; i++){
			for(int j=0; j<ch.length-1-i; j++){
				if(ch[j]>ch[j+1]){
					temp = ch[j];
					ch[j] = ch[j+1];
					ch[j+1]=temp;
				}
			}
		}
		for(int k=0; k<ch.length; k++){
			//sorted = sorted + ch[k];		
			System.out.print(ch[k]);
		}	
		//System.out.print(sorted);
	}
	
	
	public static void main(String[] args){
		stringSort("My name is Arnika Jain");
	}

}
