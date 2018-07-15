package main;
// A ThreadWorker Class which contains the program a thread should execuate
public class ThreadWorker extends Thread {
	// Usually we put the code Thead shou
	public void run() {
		for(int i=0; i<10; i++) {
			System.out.println(i + "looping ...");
			try {
				Thread.sleep(200);
			} catch (InterruptedException e) {
				break;
			}
		}
	}
}
