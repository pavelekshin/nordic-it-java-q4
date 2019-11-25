package ru.inordic;

import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicInteger;

public class Cow extends Application implements Runnable {

	private int number;
	static ArrayList<Thread> cowTasks = new ArrayList<Thread>();
	static AtomicInteger cowCount = new AtomicInteger();

	public Cow(int number) {
		super();
		this.number = number;
	}

	@Override
	public void run() {
		System.out.println("Cats eating! " + number);
		processCount.getAndIncrement();
	}

	public static void endThread() throws InterruptedException {
		for (var task : cowTasks) {
			task.join();
		}
	}
}
