package week3.day2.assignments;

import java.util.HashMap;
import java.util.Map;

public class MostDuplicate {
	public static void main(String[] args) {
		//Declaring input String
		String input = "abbaba";
		//Declaring a variable and storing a character in the declared string
		char maxOccurance = input.charAt(0);
		//Declaring a variable max value 
		int maxValue = 0;
		//Declaring a map to hold character and occurance
		Map<Character,Integer> inputMap = new HashMap<Character,Integer>();
		//Converting the string into the array
		char[] inputArray = input.toCharArray();
		//Looping through the array
		for(int i= 0;i<inputArray.length;i++) {
			//inserting values in the map
			inputMap.put(inputArray[i], inputMap.getOrDefault(inputArray[i], 0) +1);
			//Conditional check to find the most duplicate
			if(inputMap.get(inputArray[i])>maxValue) {
				//Storing the max occured character 
				maxOccurance = inputArray[i];
				maxValue = inputMap.get(inputArray[i]); 
			}
		}
		//Printing the most duplicate character
		System.out.println(maxOccurance);
	}
}
