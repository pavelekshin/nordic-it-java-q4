package ru.inordic;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.concurrent.atomic.AtomicInteger;

public class ThreadApplication {

	public static void main(String[] args) throws InterruptedException {
		
		
		AtomicInteger count = new AtomicInteger();
		ArrayList<Thread> tasks = new ArrayList<Thread>();

		/*
		 * Thread thread1 = new Thread(new HelloWorldTask(1)); Thread thread2 = new
		 * Thread(new HelloWorldTask(2)); Thread thread3 = new Thread(new
		 * HelloWorldTask(3)); Thread thread4 = new Thread(new HelloWorldTask(4));
		 */
		/*
		 * thread1.start(); tasks.add(thread1); thread2.start(); tasks.add(thread2);
		 * thread3.start(); tasks.add(thread3); thread4.start(); tasks.add(thread4);
		 */

		for (int i = 0; i < 100; i++) {
			Thread thread = new Thread(new Runnable() {
				public void run() {
					count.getAndIncrement();
				}
			});
			
			thread.start();
			tasks.add(thread);

		}

		/*
		 * try { for (var pool : tasks) { pool.join(1_000); } } catch
		 * (InterruptedException e) { // TODO Auto-generated catch block
		 * e.printStackTrace(); } }
		 */
		for (var task : tasks) {
			task.join();
		}

		System.out.print(count.get());

	}
}
