package collectionsPrograms;

/*
 * Good Reference :
 * 1. https://www.youtube.com/watch?v=8-bvtKy6Dy4 : Comparators in Java | Custom comparator | Easy Quick Explanation | Hindi
 * 2. https://www.youtube.com/watch?v=0xrhqxTOphI : 14.6 Comparator Interface in Java Part 3 (Navin Reddy)
 * 3. https://www.javatpoint.com/difference-between-comparable-and-comparator
 * 
 * Comparable : Interface (Method : compareTo())
 * Comparator : Interface (Method : compare())
 * 
 * In below example, we have implemented and sorted using comparator as it doesn't modify the actual class where Student class is defined. In case of comparable, actual class which is Student will be modified.
 * 
 * To implement Comparable : Need to implement Comparable interface using Student class only and implement compareTo() method. Reason we need to use only student class as compareTo() method takes only one object so to implement the sorting, we need to pass one dataType using object of Student class and one which is given as argument.
 * To implement Comparable : You can use any class and implement Comparator interface. Reason we can use any class as its method compareTo() takes 2 objects itself so we can easily implement the sorting without affecting the actual class where data members are defined.
 * 
 * Note : 
 * 1. Comparator is preferred over Comparable as in comparator you can do sorting for multiple data members by implementing the sorting logic in different classes or write the logic of any dataMembers in main class either by using Lambda expression or anonymous class.
 * But in case of comparable, you can do sorting on only one data member as the sorting logic is defined only in the class where data members are defined.
 * 
 * 2. One more reason comparator is preferred as most of the times, we won't have the access of custom data type class due to third party and the sorting logic is required to be written there in case of comparable.
 *
 * Below example is for List thats why we have used Collections.sort() method. If we have an array with custom data type then we can use Array.sort() like below
 * 
 * int[] list = new int[size];	// Array of integers
 * Student[] st = new Student[size]; 	// Array of Student which is of custom data type.
 * st[0] = new Student("Akshay",25,7);
 * 				
 */

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;


class Student {
	String name;
	int age;
	int rollNo;

	public Student(String name, int age, int rollNo) {
		this.name = name;
		this.age = age;
		this.rollNo = rollNo;
	}
}

class CustomComparator implements Comparator<Student> {
	
	public int compare(Student s1, Student s2) {
		return s1.age - s2.age;		//This will sort in ascending order, opposite of this will sort in descending order
	}
}

public class ExampleComparator {

	public static void main(String[] args) {

		List<Student> list = new ArrayList<>();

		list.add(new Student("Akshay", 28, 5));
		list.add(new Student("Arnika", 22, 3));
		list.add(new Student("Sandeep", 30, 10));
		list.add(new Student("Ashima", 24, 7));
		list.add(new Student("Mansi", 23, 11));
		list.add(new Student("Aniket", 35, 6));

		System.out.println("Before Sorting ==> ");
		for(Student st : list) {
			System.out.println(st.name+" , "+st.age+" , "+st.rollNo);
		}
		
		// Below are couple of ways of implementing comparator for sorting.
		
		// 1. By passing the object of class which implemented the COMPARATOR interface and wrote the sorting logic.
		Collections.sort(list, new CustomComparator());	
		
		
		// 2. By using the concept of anonymous class and writing the sorting logic here itself rather defining in the new class. The sorting logic is copied from above only. Only difference is, now its called from here itself.
		Collections.sort(list, new Comparator<Student>() {
			public int compare(Student s1, Student s2) {
				return s1.age - s2.age;
			}
		});
				
		
		System.out.println("After Sorting using age ==> ");
		for(Student st : list) {
			System.out.println(st.name+" , "+st.age+" , "+st.rollNo);
		}

	}
}


