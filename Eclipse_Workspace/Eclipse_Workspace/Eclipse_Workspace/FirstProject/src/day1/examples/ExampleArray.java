package day1.examples;

public class ExampleArray {

	public static void main(String[] args) {
	
		int [] i = {10,20,30,40,50} ;   //Syntax of defining arrays along with the values
		
		//enhanced for to print the array
		
		for(int temp : i){                  //Syntax :- for(datatype variable(where the value will be printed) : variable name) { Print command }
			
			System.out.println(temp);
		}
		
		
		System.out.println("**************************");   //Just to segregate the above and below results
		
		String [] str = new String[6] ;
		
		str[5] = "Akshay" ;
		str[3] = "Jain" ;
		str[0] = "25" ;
		
		for(String temp1 : str){
			
			System.out.println(temp1);
		}
	}

}

/*
 * Note :- For integer array, the undefined values are by default 0
 * Note :- For string array, the undefined values are by default null
 */



