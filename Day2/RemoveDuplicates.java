package week3.day2.assignments;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

public class RemoveDuplicates {
public static void main(String[] args) {
	//Declaring the string text
	String text = "We learn java basics as part of java sessions in java week1";
	//Splitting the text and storing it in array
	String[] textArray = text.split(" ");
	//Declaring new list and storing the splitted string 
	List<String> textList = new ArrayList<String>(Arrays.asList(textArray));
	//Declaring a hash set and removing duplicates in the list
	Set<String> textSet = new LinkedHashSet(textList);
	//Printing the set of unduplicated value
	System.out.println(textSet);
	}
}
