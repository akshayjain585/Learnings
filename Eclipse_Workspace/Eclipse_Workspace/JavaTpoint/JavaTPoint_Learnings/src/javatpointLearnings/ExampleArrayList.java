package javatpointLearnings;


import java.util.LinkedList;
import java.util.List;

public class ExampleArrayList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//List<Integer> listObj = new ArrayList<Integer>();
		List<Integer> listObj = new LinkedList<Integer>();

		
		listObj.add(3);
		listObj.add(2);
		listObj.add(5);
		listObj.add(9);
		listObj.add(2);
		
		System.out.println(listObj);
		
	}

}
