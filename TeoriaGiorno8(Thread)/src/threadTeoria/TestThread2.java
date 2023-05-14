package threadTeoria;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class TestThread2 extends Thread {
	private Logger log = LoggerFactory.getLogger(TestThread2.class);

	
//COSTRUTTORE
	public TestThread2() {};
	
	@Override
	public void run() {
		super.run();
		char[] arr = {'a', 'b', 'c', 'd', 'e'};
		for(int i =0; i<arr.length; i++) {
			log.info(arr[i] + " TestThread2");
		} 
	}
	
	

}
