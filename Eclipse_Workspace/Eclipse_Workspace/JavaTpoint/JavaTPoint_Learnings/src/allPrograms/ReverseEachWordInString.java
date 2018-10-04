package allPrograms;


public class ReverseEachWordInString {

	static void reverseEachWord(String inputString){
		String[] words = inputString.split(" ");
		String reverseString= "";

		for(int i=0; i<words.length; i++){

			String word = words[i];
			String reverse = "";

			for(int j=word.length()-1; j>=0; j--){
				reverse = reverse + word.charAt(j);
			}
			reverseString = reverseString + reverse + " ";
		}

		System.out.println(inputString);
		System.out.println(reverseString);
		System.out.println("****************");

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		reverseEachWord("Java Concept Of The Day");

		reverseEachWord("Java J2EE JSP Servlets Hibernate Struts");

		reverseEachWord("I am string not reversed");

		reverseEachWord("Reverse Me");

	}
}
