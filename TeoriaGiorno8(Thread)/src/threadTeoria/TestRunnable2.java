package threadTeoria;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class TestRunnable2 implements Runnable {
	private Logger log = LoggerFactory.getLogger(TestThread2.class);
	
	
	@Override
	public void run() {
		String[] arr = {"aRunnable2", "bRunnable2", "cRunnable2", "dRunnable2", "eRunnable2"};
		for(int i = 0 ; i<5; i++) {
			log.info(arr[i] );
		}
		
	} 
	
}
