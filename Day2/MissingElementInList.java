package week3.day2.assignments;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class MissingElementInList {
	public static void main(String[] args) {
		//Declaring List
		List<Integer> numInput = new ArrayList<Integer>();
		//Adding numbers to the list
		Collections.addAll(numInput, 1,2,3,4,7,6,8);
		//Sorting the list
		Collections.sort(numInput);
		//Iterating the list
		for (int i = 0; i < numInput.size(); i++) {
			//Conditional check to find the missing number
			if(i+1 != numInput.get(i)){
				//Printing the missing number
				System.out.println("Missing Number: "+(++i));
				break;
			}
		}
	}
}
