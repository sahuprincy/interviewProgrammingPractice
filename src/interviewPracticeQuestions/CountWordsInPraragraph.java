package interviewPracticeQuestions;

public class CountWordsInPraragraph {

	public static void main(String[] args) {
		int countWords = countWords("Java  is  a 		programming   language");
		System.out.println("countWords ::" + countWords);
	}
/**
 * 1. Check if the String is empty or null if True, return 0.
 * 2. Split the String and take the array length
 * 
 * */
	static int countWords(String s) {
		if (s.isEmpty() || s == null) {
			return 0;

		}
		String[] words = s.split("\\s+");
		return words.length;

	}

}
