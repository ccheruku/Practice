public class ConsumerProducerThread extends Thread {
	private int count;

	// method where the thread execution will start
	public void run() {
		consume();
		produce();
	}

	public synchronized void consume() {
		while (count == 0) {
			try {
				System.out.println("Before Waiting state");
				wait();
				System.out.println("After Waiting state");
			} catch (InterruptedException ie) {
				// keep trying
				ie.printStackTrace();
			}
		}
		count--; // consume
	}

	private synchronized void produce() {
		count++;
		System.out.println("Before Notify state");
		notify(); // notify the consumer that count has been incremented.
		System.out.println("After Notify state");
	}

	public static void main(String[] args) {
		Thread t1 = new ConsumerProducerThread();
		t1.start();
	}
}