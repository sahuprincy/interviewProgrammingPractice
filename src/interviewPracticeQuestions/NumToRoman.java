package interviewPracticeQuestions;

public class NumToRoman {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		integerToRoman(25);
	}
/**
 * 1. Declare the values -1 to 1000
 * 2. Declare the Roman literals
 * 3. Iterate till the length 
 * 4. while num >= values[i]
 * 5. num=-values[i]
 * 6. add the roman literal in the string builder
 * 7. print the string builder
 * 
 * */

	public static void integerToRoman(int num) {

		System.out.println("Integer: " + num);
		// L=50,C=100, 500=D,1000=M
		int[] values = { 1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1 };
		String[] romanLiterals = { "M", "CM", "D", "CD", "C", "XC", "L", "XL", "X", "IX", "V", "IV", "I" };

		StringBuilder roman = new StringBuilder();

		for (int i = 0; i < values.length; i++) {
			while (num >= values[i]) {
				num -= values[i];
				roman.append(romanLiterals[i]);
			}
		}
		System.out.println("Roman: " + roman.toString());
		System.out.println("---------------------------------------------------");
	}
}
