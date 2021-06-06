package interviewPracticeQuestions;

public class MissingNumber {

	public static void main(String[] args) {
		int a[] = { 1, 2, 3, 4, 5, 7 };
		int missingNo = missingNo(a, 5);
		System.out.println("missingNo:: " + missingNo);
	}
/**
 * 1. int t= (n+1)*(n+2)/2
 * 2. Iterate till the len
 * 3. t-= a[i]
 * 
 * 
 * 
 * */
	public static int missingNo(int[] a, int num) {

		int total = (num + 1) * (num + 2) / 2;
		for (int i = 0; i < num; i++) {
			total -= a[i];
		}
		return total;
	}

}
