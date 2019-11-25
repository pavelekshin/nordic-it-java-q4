package ru.inordic;

public class cleaningWork extends Application implements Runnable {

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

}
