package multiThreading;

import java.util.LinkedList;
import java.util.Queue;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;

public class ProducerConsumer {
	private int max;
	private Queue<Integer> queue = new LinkedList<>();
	private ReentrantLock lock = new ReentrantLock();
	private Condition notFull = lock.newCondition();
	private Condition notEmpty = lock.newCondition();

	public static void main(String[] args) throws InterruptedException {
		ProducerConsumer producerConsumer = new ProducerConsumer(5);
		producerConsumer.put(10);
		producerConsumer.put(20);
		producerConsumer.put(30);
		producerConsumer.put(40);

		producerConsumer.take();
		producerConsumer.take();
		producerConsumer.take();
		System.out.println("producerConsumer ::" + producerConsumer.toString());
	}

	public ProducerConsumer(int size) {
		queue = new LinkedList<>();
		this.max = size;
	}

	public void put(Integer element) throws InterruptedException {
		lock.lock();
		try {
			while (queue.size() == max) {
				notFull.await();
			}
			queue.add(element);
			notEmpty.signalAll();
		} finally {
			lock.unlock();
		}

	}

	public void take() {

		lock.lock();
		try {
			while (queue.size() == 0) {
				notEmpty.await();
			}
			queue.remove();
			notFull.signalAll();
		} catch (InterruptedException e) {
			e.printStackTrace();
		} finally {
			lock.unlock();
		}
	}

}
