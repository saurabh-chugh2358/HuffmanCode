package Chapter15;

public class ThreadTester {

	public static void main(String[] args) {
		
		Runnable threadJob = new MyRunnable();
		Thread th = new Thread(threadJob);
		th.start();
		

		
		System.out.println("Back in the main");
	}

}


class MyRunnable implements Runnable {
	public void run() {
		go();
	}
	
	public void go() {
		try{
			Thread.sleep(10);
		}catch (Exception ex) {ex.printStackTrace();}
		doMore();
	}
	
	public void doMore() {
		System.out.println("At the top of the Stack");
		
	}
	
}