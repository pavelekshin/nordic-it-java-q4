package ru.inordic;

import java.util.ArrayList;

public class cleaningWork extends Application implements Runnable {
	
	static ArrayList<Thread> cleaningWorkPool = new ArrayList<Thread>();

	@Override
	public void run() {
		processCount.getAndIncrement();
		System.out.println("=========================");
		System.out.println("Time clean up pets!");
		System.out.println("=========================");
		System.out.println("Number of eating cats: " + Cats.catsCount.get());
		System.out.println("Number of eating dogs: " + Dog.dogCount.get());
		System.out.println("Number of eating cows: " + Cow.cowCount.get());
		System.out.println("Total number of tasks: " + processCount.get());		
	}
	
	public static void endThread() throws InterruptedException {
		for (var task : cleaningWorkPool) {
			task.join();
		}
	}

}
