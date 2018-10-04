package practicePrograms;

public class HorseTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		class Horse
		{
			public String name ; /*Line 7*/
			public Horse(String s)
			{
				name =s ;
			}
			
		}
		
		object obj= new Horse("Zippo");
		Horse h = (Horse) obj ;
		System.out.println(h.name);
	}

}
