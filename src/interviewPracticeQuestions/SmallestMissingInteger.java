package interviewPracticeQuestions;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class SmallestMissingInteger {

	public static void main(String[] args) {
		//int arr[] = {3,4,-1,1};
		
		int arr[] = {7,8,9,11,12};
		int solution = solution(arr);
		int secondSol = secondSol(arr);
		System.out.println("solution:: "+solution);
		System.out.println("secondSol:: "+secondSol);
	}
	
	public static int solution(int[] arr) {
		int smallestInt = 1;

		if (arr.length == 0)
			return smallestInt;

		Arrays.sort(arr);

		if (arr[0] > 1)
			return smallestInt;
		if (arr[arr.length - 1] <= 0)
			return smallestInt;

		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == smallestInt) {
				smallestInt++;
			}
		}

		return smallestInt;
	}
	/**
	 * 1. Create the HashSet
	 * 2. if value is greater than 0 then, Add the elements in the set
	 * 3. Iterate the array till the length 
	 * 4. If set doesnot contain then return i else return 0
	 * 
	 * 
	 * */
	public static int secondSol(int[] num) {

		int N = num.length;
		Set<Integer> set = new HashSet<>();
		for (int a : num) {
			if (a > 0) {
				set.add(a);
			}
		}
		for (int i = 1; i <= N + 1; i++) {
			if (!set.contains(i)) {
				return i;
			}
		}
		return 0;
		
	}
	
	
}
