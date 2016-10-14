public class Logger {

	private static Logger myInstance = new Logger();

	public static Logger getLogger() {
		return myInstance;
	}

	public synchronized void log(String text) {
		// .......

		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {

		}
		System.out.println(text);
		// .....
	}

}
