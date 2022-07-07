package week3.day2.assignments;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class FindSecondLargest {
	public static void main(String[] args) {
		List<Integer> list1 = new ArrayList<Integer>();
		Collections.addAll(list1, 3,2,11,4,6,7);
		Collections.sort(list1);
		int listSize = list1.size();
		System.out.println("Second Largest Number: " + list1.get(listSize-2));
	}
}
