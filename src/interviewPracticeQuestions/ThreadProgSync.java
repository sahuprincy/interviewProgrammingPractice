package interviewPracticeQuestions;

public class ThreadProgSync {
	private final Object lockA = new Object();
	private final Object lockB = new Object();

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ThreadProgSync obj = new ThreadProgSync();
		MyThread objmyThread = new MyThread(obj);// only one object
		Thread t1 = new Thread(objmyThread);
		Thread t2 = new Thread(objmyThread);

		t1.start();
		t2.start();
	}

	public synchronized String m1() {

		synchronized (lockA) {
			return "M1 Method";
		}
	}

	public synchronized String m2() {

		synchronized (lockB) {
			return "M2 Method";
		}
	}

}
