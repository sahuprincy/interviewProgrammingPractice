package interviewPracticeQuestions;

public class MyThread implements Runnable {
	ThreadProgSync object1;

	public MyThread(ThreadProgSync h1) {
		this.object1 = h1;

	}

	@Override
	public void run() {
		System.out.println("Running Thread.....");
	}

}
