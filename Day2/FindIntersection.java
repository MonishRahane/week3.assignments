package week3.day2.assignments;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class FindIntersection {
	public static void main(String[] args) {
		//Declaring the list1
		List<Integer> list1 = new ArrayList<Integer>();
		//Adding values to the list1
		Collections.addAll(list1, 3,2,11,4,6,7);
		//Declaring list2
		List<Integer> list2 = new ArrayList<Integer>();
		//Adding values to the list2
		Collections.addAll(list2, 1,2,8,4,9,7);
		//Looping list1
		for (Integer list1Value : list1) {
			//Looping List2
			for (Integer list2Value : list2) {
				//Conditional check if both list contains same number
				if(list1Value == list2Value) {
					//Printing the intersected value
					System.out.println(list1Value);
				}
			}
		}

		
		
	}
}
