
public class MyThread4 implements Runnable {
	
	private SharedResource sharedResource;
	private int counterNum;
	
	
	public MyThread4(SharedResource sharedResource, int counterNum) {
		this.sharedResource = sharedResource;
		this.counterNum = counterNum;
	}
	
	@Override
	public void run() {

		
		try {
			for(int i=0; i<3; i++) {

				if (counterNum == 0)
					sharedResource.counter0("MyThread4");
				
				else if (counterNum == 1)
					sharedResource.counter1("MyThread4");
				
				else if (counterNum == 2)
					sharedResource.counter2("MyThread4");
				
				Thread.sleep(3000);
			}
			
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		
	}

}
