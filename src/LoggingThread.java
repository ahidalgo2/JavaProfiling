
public class LoggingThread extends Thread{
	
  public void run(){
	System.out.println("Thread " + this.getId() +  " running");
	Logger logger = Logger.getLogger();
	logger.log("Thread " + this.getId() + " logging information");
	
  }

}
