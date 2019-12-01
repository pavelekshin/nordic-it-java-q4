package ru.inordic;

import java.util.Vector;

public class ElementsAction extends ThreadApplication implements Runnable {

	private Vector<Integer> queue = new Vector<Integer>();
	private Vector<Integer> transaction = new Vector<Integer>();

//	public static List<Integer> buyers = Collections.synchronizedList(new ArrayList<Integer>());

	public ElementsAction(Vector<Integer> queue, Vector<Integer> transaction) {
		super();
		this.queue = queue;
		this.transaction = transaction;
	}

	public boolean moveElements() {
		Integer elem;
		synchronized (ElementsAction.class) {
			if (queue.isEmpty()) {
				return false;
			} else {
				elem = queue.remove(0);
			}
		}
		transaction.add(elem);
		return true;
	}

	@Override
	public void run() {
		while (moveElements()) {
			//
		}
	}
}
