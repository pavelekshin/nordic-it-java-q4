package ru.inordic;

import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicInteger;

public class Application {

	public static void main(String[] args) throws InterruptedException {

		AtomicInteger catsCount = new AtomicInteger();
		AtomicInteger cowCount = new AtomicInteger();
		AtomicInteger dogCount = new AtomicInteger();
		AtomicInteger processCount = new AtomicInteger();

		ArrayList<Thread> catsTasks = new ArrayList<Thread>();
		ArrayList<Thread> cowTasks = new ArrayList<Thread>();

		for (int j = 0; j < 20; j++) {
			for (int i = 0; i < 2; i++) {
				Thread thread = new Thread(new Runnable() {
					public void run() {
						catsCount.getAndIncrement();
						processCount.getAndIncrement();
						System.out.println("Cats eating!");
					}
				});
				thread.start();
				catsTasks.add(thread);
			}

			for (var task : catsTasks) {
				task.join();
			}

			Thread threadDog = new Thread(new Runnable() {
				public void run() {
					processCount.getAndIncrement();
					dogCount.getAndIncrement();
					System.out.println("Dogs eating!");
				}
			});

			threadDog.start();
			threadDog.join();

			for (int i = 0; i < 2; i++) {
				Thread threadCow = new Thread(new Runnable() {
					public void run() {
						processCount.getAndIncrement();
						cowCount.getAndIncrement();
						System.out.println("Cow eating!");
					}
				});

				threadCow.start();
				cowTasks.add(threadCow);
			}

			for (var task : cowTasks) {
				task.join();
			}

			Thread cleaningWork = new Thread(new Runnable() {
				public void run() {
					processCount.getAndIncrement();
					System.out.println("=========================");
					System.out.println("Time clean up pets!");
					System.out.println("=========================");
					System.out.println("Number of eating cats: " + catsCount.get());
					System.out.println("Number of eating dogs: " + dogCount.get());
					System.out.println("Number of eating cows: " + cowCount.get());
					System.out.println("Total number of tasks: " + processCount.get());
				}
			});

			cleaningWork.start();
			cleaningWork.join();
			
		}
	}
}
