package interviewPracticeQuestions;

public class HighestNumerWithSameDigit {

	public static void main(String[] args) {
		highestNum(75656908);
	}
/**
 * 1. count the number of occurrences of each digit
 * 2. Iterate in Reverse order
 * 3. Based on the times print the num
 * 
 * 
 * */
	public static void highestNum(int num) {
		int[] times = new int[10];
		while (true) {
			if (num == 0) {
				break;
			}
			int val = num % 10;
			times[val]++;
			num /= 10;
		}
		for (int i = 9; i >= 0; i--) {
			for (int j = 0; j < times[i]; j++) {
				System.out.print(i);
			}
		}
	}

}
