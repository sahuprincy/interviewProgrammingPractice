package interviewPracticeQuestions;

public class Factorialrecursion {

	public static void main(String[] args) {
		int factorial = factorial(3);
		System.out.println("factorial ::" + factorial);
	}
/**
 * 1. if(n==0) return 1
 * 2. return n*factorial(n-1)
 * 
 * 
 * */
	static int factorial(int n) {

		if (n == 0) {
			return 1;
		} else {
			return n * factorial(n - 1);
		}
	}

}
