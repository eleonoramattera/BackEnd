package threadTeoria;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class TestRunnable implements Runnable {

	private Logger log = LoggerFactory.getLogger(TestThread2.class);
	private String message;

	
//COSTUTTORE
	public TestRunnable(String message) {

		this.message =message;
	}
	
	
	@Override
	public void run() {
		String arr[] = {"Elena", "Antonio", "Mario", "Giuseppe", "Federico"};
		for(int i =0; i<arr.length; i++) {
			log.info(arr[i] + " " + message);
		}
		
	}

}
