package main;

public class RunnableThread implements Runnable {
	public void run() {
		for(int i=0; i<10; i++) {
			System.out.println(i + "looping runnable");
			
			try {
				Thread.sleep(200);
			} catch (InterruptedException e) {
				break;
			}
		}
	}
}
