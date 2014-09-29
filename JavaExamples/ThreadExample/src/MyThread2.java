
public class MyThread2 extends Thread {
	
	private SharedResource sharedResource;
	private int counterNum;
	
	public MyThread2(SharedResource sharedResource, int counterNum) {
		this.sharedResource = sharedResource;
		this.counterNum = counterNum;
	}
	
	
	@Override
	public void run() {
		
		try {
			for(int i=0; i<3; i++) {

				if (counterNum == 2)
					sharedResource.counter0("MyThread1");
				
				else if (counterNum == 2)
					sharedResource.counter1("MyThread1");
				
				else if (counterNum == 2)
					sharedResource.counter2("MyThread1");
				
				Thread.sleep(2500);
			}
			
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
	}
	
	
}
