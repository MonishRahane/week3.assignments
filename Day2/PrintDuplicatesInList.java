package week3.day2.assignments;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class PrintDuplicatesInList {
	public static void main(String[] args) {
		//Declaring list of integers
		List<Integer> inputNum = new ArrayList<Integer>();
		//Adding Values to the list
		Collections.addAll(inputNum, 14,12,13,11,15,14,18,16,17,19,18,17,20);
		//Getting the size of the list
		int listsize = inputNum.size();
		//Initializing variable count 
		int count;
		//Iterating the list
		for (int i = 0; i < listsize; i++) {
			//Assigning value to the count variable
			count = 0;
			//Iterating the list again
			for(int j = i+1; j<listsize;j++) {
				//Conditional check to check duplicates
				if(inputNum.get(i) == inputNum.get(j)) {
					//Incrementing the variable count
					count++;
				}
			}
			//Conditional check to print duplicate
			if(count != 0) {
				//Printing the duplicate number in the list
				System.out.println(inputNum.get(i));
			}
		}
	}
}
