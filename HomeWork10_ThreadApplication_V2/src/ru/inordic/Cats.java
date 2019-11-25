package ru.inordic;

import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicInteger;

public class Cats extends Application implements Runnable {

	private int number;
	static AtomicInteger catsCount = new AtomicInteger();
	static ArrayList<Thread> catsTasks = new ArrayList<Thread>();

	
	public Cats(int number) {
		super();
		this.number = number;
	}

	@Override
	public void run() {
		System.out.println("Cats eating! " + number);
		processCount.getAndIncrement();
	}

	public static void endThread() throws InterruptedException {
		for (var task : catsTasks) {
			task.join();
		}
	}
}
