package stringsPrograms;

public class RemoveSpecialCharacters {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s = "##$$@@#FFDCXC937383";
		s = s.replaceAll("[^a-zA-Z0-9]", ""); //RegularExpression to allow only a-zA-Z0-9
		System.out.println(s);

	}

}
