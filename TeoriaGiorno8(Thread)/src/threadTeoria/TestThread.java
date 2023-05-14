package threadTeoria;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class TestThread extends Thread {

	private Logger log = LoggerFactory.getLogger(TestThread.class);
	private String message;
	
	//COSTRUTTORE
	public TestThread(String message) {
		
		this.message = message;
	}

	@Override
	public void run() {
		super.run();
		for(int i = 0; i <5; i++) {
			try {
			log.info("n " + i +  message);
			}catch(Exception e) {
				log.error(e.getMessage());
				e.printStackTrace();
			}
		}
	}

	
	
	
}
