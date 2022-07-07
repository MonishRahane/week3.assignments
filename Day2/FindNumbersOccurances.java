package week3.day2.assignments;

import java.util.HashMap;
import java.util.Map;

public class FindNumbersOccurances {
	public static void main(String[] args) {
		//Declaring input array
		int[] inputNumArray = {2,3,5,6,3,2,1,4,2,1,6,-1};
		//Creating Map
		Map<Integer,Integer> inputNumMap = new HashMap<Integer,Integer>();
		//Iterating through array
		for(int i= 0;i < inputNumArray.length;i++) {
			//Conditional Check to find ocurrance
			if(inputNumMap.containsKey(inputNumArray[i])) {
				//Adding the key and value incremented if present in map 
				inputNumMap.put(inputNumArray[i], inputNumMap.get(inputNumArray[i])+1);
			}
			//Adding key and value default as 1
			else {
				inputNumMap.put(inputNumArray[i], 1);
			}
		}
		//Printing the map
		System.out.println(inputNumMap);
	}
}
