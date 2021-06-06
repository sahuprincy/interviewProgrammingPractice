package interviewPracticeQuestions;

import java.util.Arrays;

public class SortArray012 {

	public static void main(String[] args) {
		int[] a = { 0, 1, 2, 2, 1, 0, 0, 2, 0, 1, 1, 0 };
		sort(a);
		System.out.println(Arrays.toString(a));
	}

	public static void swap(int a[], int i, int j) {

		int temp = a[i];
		a[i] = a[j];
		a[j] = temp;

	}

	/**
	 * 1. Swap logic 2. Iterate mid<=end 3. if mid <pivot then swap,++start, ++mid
	 * 4. else if mid>pivot then swap , --end 5. else ++mid
	 */
	public static void sort(int a[]) {

		int start = 0;
		int end = a.length - 1;
		int pivot = 1;
		int mid = 0;

		while (mid <= end) {
			if (a[mid] < pivot) {
				swap(a, start, mid);
				++start;
				++mid;

			} else if (a[mid] > pivot) {
				swap(a, mid, end);
				--end;
			} else {

				++mid;
			}

		}

	}

}
