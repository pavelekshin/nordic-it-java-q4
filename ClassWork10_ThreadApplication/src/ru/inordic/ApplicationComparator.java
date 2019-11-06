package ru.inordic;

import java.util.Comparator;

public class ApplicationComparator implements Comparator<String> {

	@Override
	/*
	 * public int compare(String a, String b) {
	 * return a.length() - b.length(); }
	 */

	public int compare(String a, String b) {
		return Integer.parseInt(a) - Integer.parseInt(b);
	}
}
