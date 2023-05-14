package threadTeoria;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Main {

	public static void main(String[] args) {
	
    Logger log = LoggerFactory.getLogger(Main.class);

    TestThread t1 = new TestThread("prima istanza TestThread");
    TestThread t2 = new TestThread("seconda istanza TestThread");
    
    TestThread2 t3 = new TestThread2();
    
   // TestRunnable t4 =new TestRunnable("Runnable"); 
   //.start() è un metodo della superclasse Thread. 
   //quindi per far partire un thread creado con implements Runnable devo fare così:
    Thread t4 = new Thread(new TestRunnable("Runnable1"));
   //creo un'istanza della superclasse Thread e poi passo la mia classe(oggetto) come parametro
    Thread t5 = new Thread(new TestRunnable("Runnable2"));
    
    
    Thread t6 =new Thread(new TestRunnable2());
    
    t1.start();
    t2.start();
    t3.start();
    t4.start();
    t5.start();
    t6.start();
	}

}
