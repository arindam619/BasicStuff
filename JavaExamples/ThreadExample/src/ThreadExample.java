
public class ThreadExample {

	public static void main(String[] args) {
		
		//SharedResource sharedResource = new SharedResource();
		
		
		//new SharedResource()
		
		
		MyThread1 t1 = new MyThread1( new SharedResource(), 2 );
		MyThread2 t2 = new MyThread2( new SharedResource(), 2 );
		MyThread3 t3 = new MyThread3( new SharedResource(), 2 );
		MyThread4 t4 = new MyThread4( new SharedResource(), 2 );
		
		t1.start();
		t2.start();
		t3.start();

		new Thread(t4).start();
		
		new SharedResource().counter2("Main process");
		
	}

}
