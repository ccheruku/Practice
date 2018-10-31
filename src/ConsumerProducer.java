public class ConsumerProducer {
	private int count;

	public synchronized void consume() {
		while (count == 0) {
			try {
				System.out.println("Before consume...1");
				wait();
				System.out.println("Before consume...2");
			} catch (InterruptedException ie) {
				// keep trying
			}
		}
		count--; // consum ed
	}

	private synchronized void produce() {
		count++;
		System.out.println("Before increment...1");
		notify(); // notify the consum er that count has been increm ented.
		System.out.println("Before increment...2");
	}
	
	public static void main(String[] args) {
		ConsumerProducer cp = new ConsumerProducer();
		cp.produce();
		cp.consume();
		
	}
}