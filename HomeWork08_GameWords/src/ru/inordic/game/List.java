package ru.inordic.game;

import java.util.ArrayList;

public class List extends GameWords {

	public static ArrayList<String> list;

	public static void printArray() {
		System.out.println(list);
	}

	public List() {
		list = new ArrayList<String>();
	}

	public void addToArray(int index, String str) {
		list.add(index, str);
	}

	public void removeFromArray(int index) {
		list.remove(index);
	}

	public ArrayList<String> getArray() {
		return list;
	}

	public boolean contains(Object o) {
		return list.contains(o);
	}

	public int indexOfStr(String str) {
		return list.indexOf(str);
	}
}
