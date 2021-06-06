package interviewPracticeQuestions;

import java.util.Arrays;
import java.util.List;

public class Sum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int numbers[] = new int[] {  9, 3, 44, 5, 2 };
		int sum = 0;
		for (int x : numbers) {
		   sum += x;
		}
		System.out.println(sum);
		
		
		List<Integer> integers = Arrays.asList(9, 3, 44, 5, 2);
		Integer sum1 = integers.stream()
		  .reduce(0, Integer::sum);
		System.out.println(sum1);
	}
	
	
	
}
