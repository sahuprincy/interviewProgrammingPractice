package interviewPracticeQuestions;

public class SortingWithoutUsingBuiltIn {

	public static void main(String[] args) {

		int a[] = { 1, 9, 7, 5, 8, 6 };
		sort(a);

	}
/**
 * 1. Intialize the temp var
 * 2. Iterate the Outer loop and inner loop til the length of array
 * 3. If a[i]<a[j], then swap temp=a[i], a[i]=a[j], a[j]=temp
 * 4. Iterate the array and print
 * 
 * */
	static void sort(int a[]) {

		a = new int[] { 1, 9, 7, 5, 8, 6 };
		int temp = 0;

		System.out.println("Before Sort Array:: ");

		for (int i : a) {

			System.out.print(i + " ");
		}

		for (int i = 0; i < a.length; i++) {
			for (int j = i + 1; j < a.length; j++) {
				if (a[i] < a[j]) {
					temp = a[i];
					a[i] = a[j];
					a[j] = temp;
				}
			}

		}
		System.out.println();
		System.out.println("Sorted array:: ");

		for (int i : a) {

			System.out.print(i + " ");
		}

	}

}
