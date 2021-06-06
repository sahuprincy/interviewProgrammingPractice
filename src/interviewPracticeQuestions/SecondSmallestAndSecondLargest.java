package interviewPracticeQuestions;

public class SecondSmallestAndSecondLargest {

	public static void main(String[] args) {
		int a[] = new int[] { 16, 8, 9, 5, 9, 3, 44, 5, 2 };
		secondSmallestAndLargest(a, a.length);
	}
	/**
	 * 1. Sort the array - bubble sort in as
	 * 2. print the array[1] and arr[size -2]
	 * 
	 * */
	public static void secondSmallestAndLargest(int []a,int size) {
		int temp=0;
		for (int i = 0; i < size; i++) {
			int j;
			for (j = i+1; j <size; j++) {
				
				if(a[i]>a[j]) {
					
					temp=a[i];
					a[i]=a[j];
					a[j]=temp;
				}
				
				}
				
			}
		
		System.out.println(" second Largest:: "+a[size-2]);
		System.out.println(" second Smallest:: "+a[1]);
	
	}

}
