
public class MyThread3 extends Thread {
	
	private SharedResource sharedResource;
	private int counterNum;
	
	public MyThread3(SharedResource sharedResource, int counterNum) {
		this.sharedResource = sharedResource;
		this.counterNum = counterNum;
	}
	
	
	@Override
	public void run() {
		
		try {
			for(int i=0; i<3; i++) {

				if (counterNum == 0)
					sharedResource.counter0("MyThread3");
				
				else if (counterNum == 1)
					sharedResource.counter1("MyThread3");
				
				else if (counterNum == 2)
					sharedResource.counter2("MyThread3");
				
				Thread.sleep(2500);
			}
			
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
	}
	
}
