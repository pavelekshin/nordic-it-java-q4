package ru.inordic;

import java.util.concurrent.ConcurrentLinkedQueue;

public class ElementsActionQueue implements Runnable {

	private ConcurrentLinkedQueue<Integer> queue = new ConcurrentLinkedQueue<Integer>();
	private ConcurrentLinkedQueue<Integer> transaction = new ConcurrentLinkedQueue<Integer>();

	public ElementsActionQueue(ConcurrentLinkedQueue<Integer> queue, ConcurrentLinkedQueue<Integer> transaction) {
		super();
		this.queue = queue;
		this.transaction = transaction;
	}

	public boolean moveElements() {
		Integer elem;
		elem = queue.poll();
		if (elem != null) {
			transaction.add(elem);
			return true;
		} else
			return false;
	}

	@Override
	public void run() {
		while (moveElements()) {
			//
		}
	}
}
