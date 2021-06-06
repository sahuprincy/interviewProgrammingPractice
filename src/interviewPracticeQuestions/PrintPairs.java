package interviewPracticeQuestions;

import java.util.HashSet;

public class PrintPairs {

	public static void main(String[] args) {
		int a[] = { 6, 4, 8, 5, 7, 9 };
		printpairs(a, 12);
	}
/**
 * 1. Iterate till the size of an array
 * 2. calculate the temp = sum -a[i]
 * 3. set  contains temp then print the pair
 * 4. add the elements in the set
 * 
 * */
	static void printpairs(int arr[], int sum) {
		HashSet<Integer> s = new HashSet<Integer>();
		for (int i = 0; i < arr.length; ++i) {
			int temp = sum - arr[i];

			// checking for condition
			if (s.contains(temp)) {
				System.out.println("Pair with given sum " + sum + " is (" + arr[i] + ", " + temp + ")");
			}
			s.add(arr[i]);
		}
	}

}
