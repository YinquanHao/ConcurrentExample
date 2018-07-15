package main;

public class Main {
	public static void main(String[] args) {
		ThreadWorker worker1 = new ThreadWorker();
		worker1.start();
		
		ThreadWorker worker2 = new ThreadWorker();
		worker2.start();
		
		RunnableThread runnableThread1 = new RunnableThread();
		RunnableThread runnableThread2 = new RunnableThread();
		
		Thread thread1 = new Thread(runnableThread1);
		Thread thread2 = new Thread(runnableThread2);
		
		thread1.start();
		thread2.start();
		
	}
}
