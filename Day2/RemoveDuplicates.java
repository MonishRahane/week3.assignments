package week3.day2.assignments;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

public class RemoveDuplicates {
public static void main(String[] args) {
	String text = "We learn java basics as part of java sessions in java week1";
	String[] textArray = text.split(" ");
	List<String> textList = new ArrayList<String>(Arrays.asList(textArray));
	Set<String> textSet = new LinkedHashSet(textList);
	System.out.println(textSet);
	}
}
