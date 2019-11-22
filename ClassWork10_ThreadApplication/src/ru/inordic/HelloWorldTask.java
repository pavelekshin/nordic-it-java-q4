package ru.inordic;

public class HelloWorldTask implements Runnable {
	
	
	private int number;

	public HelloWorldTask(int number) {
		super();
		this.number = number;
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub

	/*	try {
			Thread.sleep(10);
		} catch (InterruptedException e) {
			e.getStackTrace();
		}
		*/
		System.out.println("HelloWork! " + number);

	}
}
