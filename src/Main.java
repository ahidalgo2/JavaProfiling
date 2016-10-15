import java.io.IOException;

import com.sun.org.apache.bcel.internal.generic.CPInstruction;

public class Main {

	public static void main(String[] args) throws IOException {
		Main m = new Main();
		Allocator allocator = new Allocator();
		System.out.print("Main thread started");
		try {
			Thread.sleep(30000L);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.print("Main thread continues");
		//m.log();
		// allocator.go();
		m.CPUProfiling();

		try {
			Thread.sleep(60000L);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	public synchronized void log() {
		LoggingThread loggingThread1 = new LoggingThread();
		LoggingThread loggingThread2 = new LoggingThread();
		LoggingThread loggingThread3 = new LoggingThread();

		loggingThread1.start();
		loggingThread2.start();
		loggingThread3.start();
	}
	
	private void CPUProfiling(){
		Initiator initiator = new Initiator();
		initiator.initiate(2);
		
		Initiator otherInitiator = new Initiator();
		otherInitiator.initiate(4);
		
		initiator.countIntersection(otherInitiator);
	}

}
