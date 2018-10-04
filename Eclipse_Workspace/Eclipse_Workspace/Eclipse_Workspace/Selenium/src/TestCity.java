/*
 * This program explains the concept of Objects, like how can we access the variables and methods of other classes after creating/instantiating the objects of that(City) class
 */


public class TestCity {

	public static void main(String[] args) {
		
		
		// new City();    // Creating the object of City, but to access it, we need to create the Object reference.
		
		// City c1 = new City();   // c1 is the object reference to access the object "City" created here in the above step
		
		City c1 = new City();
		
		c1.name = "Akshay" ;
		
		City c2 = new City();  //Creating the second object "City" and the second object reference as "c2" to access this object
		
		c2.name = "Jain" ;
				
		System.out.println(c1.name  +c2.name);
		

	}

}
