package Chapter15;

public class RunThreads implements Runnable{

	public static void main(String[] args) {
		RunThreads runnerJob = new RunThreads();
		Thread alpha = new Thread(runnerJob);
		Thread beta = new Thread(runnerJob);
		alpha.setName("Alpha");
		beta.setName("Beta");
		try{
			alpha.sleep(50);
		}catch (Exception ex) {ex.printStackTrace();}
		alpha.start();
		beta.start();
		
	}
	
	public synchronized void run() {
		for (int i=0; i<120; i++){
			System.out.println(Thread.currentThread().getName() + " is running");
		}
	}

}
