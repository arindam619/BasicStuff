
public class SharedResource {
	
	private static int count = 0;
	
	private static final Object syncObj = new Object();
	
	
	public void counter0(String threadName) {
		
		count++;
		System.out.println("Counter incremented by " + threadName + " : " + count);
		
	}
	
	public synchronized void counter1(String threadName) {
			
		counter0(threadName);
			
	}

	public void counter2(String threadName) {
		
		synchronized (syncObj) {
			counter0(threadName);
		}
		
	}
	
	
}
