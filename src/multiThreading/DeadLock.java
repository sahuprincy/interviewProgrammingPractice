package multiThreading;

public class DeadLock {

	public static void main(String[] args) {
		final String res1 = "Resource 1";
		final String res2 = "Resource 2";

		Thread t1 = new Thread() {
			public void run() {

				synchronized (res1) {
					System.out.println("Resource 1 Locked by Thread1");

					try {
						Thread.sleep(100);
					} catch (Exception e) {

					}
					synchronized (res2) {
						System.out.println("Resource 2 Locked by Thread1");
					}
				}
			}
		};

		Thread t2 = new Thread() {
			public void run() {

				synchronized (res2) {
					System.out.println("Resource 2 Locked by Thread2");

					try {
						Thread.sleep(100);
					} catch (Exception e) {

					}
					synchronized (res1) {
						System.out.println("Resource 1 Locked by Thread2");
					}
				}
			}
		};
		t1.start();
		t2.start();
	}

}
