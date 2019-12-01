package ru.inordic;

import java.util.ArrayList;
import java.util.Vector;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.atomic.AtomicInteger;

import ru.inordic.ElementsAction;

public class ThreadApplication {

	private static final int COUNT_BUYER = 10_000;
	private static final int QUEUE_NUMBER = 4;

	public static void main(String[] args) throws InterruptedException {
		ArrayList<Thread> tasksThreads = new ArrayList<Thread>();

		ConcurrentLinkedQueue<Integer> cuncurrentQueue = new ConcurrentLinkedQueue<Integer>();
		ConcurrentLinkedQueue<Integer> cuncurrentTransaction = new ConcurrentLinkedQueue<Integer>();

		Vector<Integer> queue = new Vector<Integer>();
		Vector<Integer> transaction = new Vector<Integer>();

		for (int i = 0; i < COUNT_BUYER; i++) {
			queue.add(i);
			cuncurrentQueue.add(i);
		}

		for (int i = 0; i < QUEUE_NUMBER; i++) {
			Thread threads = new Thread(new ElementsAction(queue, transaction) {
			});
			threads.start();
			tasksThreads.add(threads);
		}

		ExecutorService executor = Executors.newFixedThreadPool(QUEUE_NUMBER);

		for (int i = 0; i < QUEUE_NUMBER; i++) {
			executor.execute(new ElementsActionQueue(cuncurrentQueue, cuncurrentTransaction));
		}

		executor.shutdown();

		for (var task : tasksThreads) {
			task.join();
		}

		System.out.println("===============================================");
		System.out.println("===============Vector Syncronized===========");
		System.out.println("===============================================");
		System.out.println("Queue size: " + queue.toString());
		System.out.println("Queue size: " + queue.size());
		System.out.println("Complete transaction: " + transaction.toString());
		System.out.println("Complete transaction: " + transaction.size());
		System.out.println("===============================================");
		System.out.println("===============ConcurrentLinkedQueue===========");
		System.out.println("===============================================");
		System.out.println("Queue size: " + cuncurrentQueue.toString());
		System.out.println("Queue size: " + cuncurrentQueue.size());
		System.out.println("Complete transaction: " + cuncurrentTransaction.size());
		System.out.println("Complete transaction: " + cuncurrentTransaction.toString());

	}
}
