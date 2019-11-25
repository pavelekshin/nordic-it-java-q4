package ru.inordic;

import java.util.concurrent.atomic.AtomicInteger;

public class Application {

	static AtomicInteger processCount = new AtomicInteger();

	public static void main(String[] args) throws InterruptedException {

		for (int j = 0; j < 20; j++) {

			System.out.println('\n' + "Iteration : " + j + '\n');

			for (int i = 0; i < 2; i++) {
				Thread thread = new Thread(new Cats(Cats.catsCount.getAndIncrement()));
				thread.start();
				Cats.catsTasks.add(thread);
			}

			Cats.endThread();

			Thread threadDog = new Thread(new Dog(Dog.dogCount.getAndIncrement()));
			threadDog.start();
			threadDog.join();

			for (int i = 0; i < 2; i++) {
				Thread threadCow = new Thread(new Cow(Cow.cowCount.getAndIncrement()));
				threadCow.start();
				Cow.cowTasks.add(threadCow);
			}

			Cow.endThread();

			Thread cleaningWork = new Thread(new cleaningWork());
			cleaningWork.start();
			cleaningWork.join();

		}
	}
}
