package interviewPracticeQuestions;

public class ReverseIntegerBit {

	public static void main(String a[]) {
		int reverse = reverse(1243);
		int reverseApproach = reverseApproach(123);
		System.out.println(reverse);
		System.out.println(reverseApproach);
	}
/**
 * 1. while(x!=0)
 * 2. res=res*10+x%10;
 * 3. x=x/10;
 * 4. (int)res 
 * 
 * or StringBuilder.reverse 
 * 
 * */
	public static int reverse(int x) {
		String ans = x < 0 ? new StringBuilder(String.valueOf(-x)).append("-").reverse().toString()
				: new StringBuilder(String.valueOf(x)).reverse().toString();
		try {
			return Integer.parseInt(ans);
		} catch (Exception e) {
			return 0;
		}
	}
	
	 public static int reverseApproach(int x) {
	        long res = 0;
	        while (x != 0) {
	            res = res * 10 + x % 10;
	            x = x / 10;
	        }
	        
	        if (res < Integer.MIN_VALUE || res > Integer.MAX_VALUE) {
	            return 0;
	        } else {
	            return (int)res;
	        }
	    }
}
