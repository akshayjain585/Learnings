package javatpointLearnings;

import java.util.Set;
import java.util.TreeSet;

public class ExampleSet {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Set<String> setObj = new HashSet<String>();
		//Set<String> setObj = new LinkedHashSet<String>();
		Set<String> setObj = new TreeSet<String>();
		
		setObj.add("Harsh");
		setObj.add("Nidhi");
		setObj.add("Patel");
		setObj.add("Akshay");
		setObj.add("Gaurav");
		
		for(String values: setObj){
			System.out.println(values);
		}
		
		//System.out.println(setObj);
		

	}

}
