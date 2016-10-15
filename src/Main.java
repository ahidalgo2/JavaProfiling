import java.io.IOException;


public class Main {

	public static void main(String[] args) throws IOException {
		Main main = new Main();

		System.out.print("Main thread started");
		try {
			Thread.sleep(30000L);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.print("Main thread continues");

		main.CPUProfiling();
		main.threadProfiling();
		main.memoryProfiling();

		try {
			Thread.sleep(60000L);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	private synchronized void threadProfiling() {
		LoggingThread loggingThread1 = new LoggingThread();
		LoggingThread loggingThread2 = new LoggingThread();
		LoggingThread loggingThread3 = new LoggingThread();

		loggingThread1.start();
		loggingThread2.start();
		loggingThread3.start();
	}

	private void memoryProfiling() {
		Allocator allocator = new Allocator();
		allocator.go();
	}

	private void CPUProfiling() {
		Initiator initiator = new Initiator();
		initiator.initiate(2);

		Initiator otherInitiator = new Initiator();
		otherInitiator.initiate(4);

		initiator.countIntersection(otherInitiator);
	}

}
