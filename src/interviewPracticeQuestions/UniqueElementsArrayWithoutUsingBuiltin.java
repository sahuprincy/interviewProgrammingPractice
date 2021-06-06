package interviewPracticeQuestions;

public class UniqueElementsArrayWithoutUsingBuiltin {

	public static void main(String[] args) {
		int a[] = new int[] { 16, 8, 9, 5, 9, 3, 44, 5, 2 };
		
		System.out.println(a + " ");
		uniqueArray(a, a.length);
	}
/**
 * 1. Iterate the Outer Loop till the size
 * 2. Iterate inner Loop till the j is less than i
 * 3. 	if array of i ==array of j then , break 
 * 4. if i==j, then print array of i
 * 
 * 
 * */
	static void uniqueArray(int a[], int size) {
		for (int i = 0; i < size; i++) {
			int j;
			for (j = 0; j < i; j++) {
				if (a[i] == a[j])
					break;
			}
			if (i == j)
				System.out.print(a[i] + " ");
		}
	}
}
