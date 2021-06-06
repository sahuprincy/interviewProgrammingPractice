package interviewPracticeQuestions;

public class ReverseString {
/**
 * 1. Intialize rev string
 * 2. Iterate backward from the len-1 till i>=0
 * 3. Rev+charAt(i)
 * 4. disp the rev string.
 * */
	public static void main(String[] args) {

		String originalString = "Java is a programming language";
		String revStr = "";
		for (int i = originalString.length() - 1; i >= 0; i--) {
			revStr = revStr + originalString.charAt(i);
		}
		System.out.println(revStr);
	}

}
