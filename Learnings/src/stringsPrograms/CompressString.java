package stringsPrograms;

/*
 * Example : Input : aaaabbbbbcccffg
    Output : a4b5c3f2g
 */

public class CompressString {
	
	public static void compressPrintDistinct(String input) {
		
		for(int i=0; i<input.length()-1; i++) {
			char ch1 = input.charAt(i);
			char ch2 = input.charAt(i+1);	//Thats the reason we have run the loop till second last character else this line of code will throw string out of bound exception. Also, due to this, we will have to print last character outside the loop.
			
			if(ch1 != ch2) {
				System.out.print(ch1);
			}
		}
		System.out.print(input.charAt(input.length()-1));		
	}
	
	public static void compress2(String input) {
		int count = 1;
		for(int i=0; i<input.length()-1; i++) {
			char ch1 = input.charAt(i);
			char ch2 = input.charAt(i+1);	//Thats the reason we have run the loop till second last character else this line of code will throw string out of bound exception. Also, due to this, we will have to print last character outside the loop.
			
			if(ch1 != ch2) {
				System.out.print(ch1);
				if(count > 1) {
					System.out.print(count);
					count = 1;
				}
			}else {
				count++;
			}
		}
		System.out.print(input.charAt(input.length()-1));	
		if(count > 1) {
			System.out.print(count);
		}
	}		
	
	public static void main(String[] args) {
	
		String input = "aaaaabbaabbcgggwwwhhee";
		
		compressPrintDistinct(input);
		System.out.println();
		compress2(input);
	}
}
