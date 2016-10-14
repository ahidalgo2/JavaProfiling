import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.zip.ZipEntry;
import java.util.zip.ZipOutputStream;

public class Main {
	

	public static void main(String[] args) throws IOException {
		Main m = new Main();
		System.out.print("Main thread started");
		try {
			Thread.sleep(20000L);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.print("Main thread continues");
		m.log();

	}

	
	public synchronized void log (){
		LoggingThread loggingThread1  = new LoggingThread();
		LoggingThread loggingThread2  = new LoggingThread();
		LoggingThread loggingThread3  = new LoggingThread();
		
		
		loggingThread1.start();

		loggingThread2.start();

		loggingThread3.start();
		
		
	}

}
