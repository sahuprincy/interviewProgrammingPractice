package interviewPracticeQuestions;

import java.util.Arrays;

public class UniqueWordCount {

	public static void main(String[] args) {
		long uniqueWordCount = uniqueWordCount("apple banana mango grape lichi mango apple grape");
		
		System.out.println("uniqueWordCount:: "+uniqueWordCount);
	}
	/**
	 * 1. Check the null or empty condition 
	 * 2. split the String with space
	 * 3. distinct and count the array
	 * 
	 * */
	static long uniqueWordCount(String str){
		
		String[] wordsList = str.split("\\s+");
		
	return Arrays.asList(wordsList).stream().distinct().count();
	
	}

}
