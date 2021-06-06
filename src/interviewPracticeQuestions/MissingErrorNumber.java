package interviewPracticeQuestions;

import java.util.HashMap;
import java.util.Map;

public class MissingErrorNumber {
	public static void main(String a[]) {
		int arr[] = { 1, 2, 2, 4 };
		int[] findErrorNums = findErrorNums(arr);
		for (int i : findErrorNums) {

			System.out.println(i);
		}

	}
/**
 * 1. Map 
 * 2. Iterate the integer array
 * 3. Map.put(n,map.getOrDefault(n,0)+1)
 * 4. Iterate till the length
 * 5. Map.contains(i) then map.get(i)==2 then, dup =i else missing =i
 * 6. return Int arr dup, missing
 * 
 * **/
	public static int[] findErrorNums(int[] nums) {
		Map<Integer, Integer> map = new HashMap<>();
		int dup = 0, missing =0;
		for (int n : nums) {
			map.put(n, map.getOrDefault(n, 0) + 1);
		}
		for (int i = 1; i <= nums.length; i++) {
			if (map.containsKey(i)) {
				if (map.get(i) == 2)
					dup = i;
			} else
				missing = i;
		}
		return new int[] { dup, missing };
	}
}
