package ru.inordic;

import java.util.concurrent.atomic.AtomicInteger;

public class Dog extends Application implements Runnable {

	private int number;
	static AtomicInteger dogCount = new AtomicInteger();

	public Dog(int number) {
		super();
		this.number = number;
	}

	@Override
	public void run() {
		System.out.println("Dogs eating! " + number);
		processCount.getAndIncrement();
	}
	
}
