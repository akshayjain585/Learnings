package pepCoding.FunctionsArrays;

/*
 * Problem : Find out the frequency of a digit in a number
 * Approach :
 * 1. Break each digit using modulus operator and form the remaining number using divide (Palindrome approach)
 */

public class DigitsFrequencyInNumber {
	
	public static int digitFreq(int num, int digit) {
		int count = 0;
		
		while(num > 0) {
			int temp = num%10;
			num = num/10;
			if(temp == digit) {
				count++;
			}
		}
		return count;
	}
	
	public static void main(String[] args) {
		int num = 6789233;
		int digit = 3;
		
		// Check the frequency of a digit in a number
		System.out.println(digitFreq(num,digit));
	}

}
