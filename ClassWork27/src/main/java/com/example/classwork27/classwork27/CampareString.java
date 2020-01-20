package com.example.classwork27.classwork27;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class CampareString {
	public static List<String> sortByLength(List<String> text) {
		text.sort(new Comparator<String>() {
			@Override
			public int compare(String a, String b) {
				return a.length() - b.length();
			}
		});
		return text;
	}

	public static List<String> sortByLengthLambda(List<String> text) {
		text.sort((a, b) -> {
			return a.length() - b.length();
		});
		return text;
	}

	public static List<String> sortByLengthLambdaShort(List<String> text) {
		text.sort((a, b) -> a.length() - b.length());
		return text;
	}
}
