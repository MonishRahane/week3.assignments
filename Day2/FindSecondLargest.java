package week3.day2.assignments;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class FindSecondLargest {
	public static void main(String[] args) {
		//Declaring the list
		List<Integer> list1 = new ArrayList<Integer>();
		//Adding values to the list
		Collections.addAll(list1, 3,2,11,4,6,7);
		//Sorting the list
		Collections.sort(list1);
		//Storing the list size
		int listSize = list1.size();
		//Printing the second largest number
		System.out.println("Second Largest Number: " + list1.get(listSize-2));
	}
}
