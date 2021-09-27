package threadsample2;

public class SampleThread implements Runnable{
	public void run() {
		for(int i=0;i<10;i++) {
			System.out.println("threadcount"+i);
		}
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	

}
