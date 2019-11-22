package ru.inordic;

import java.util.ArrayList;
import java.util.Scanner;

public class Application {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> word = new ArrayList<String>();
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the string");
		String text = scanner.nextLine();

		while (!"".equals(text)) {
			word.add(text);
			text = scanner.nextLine();
		}

		word.sort(new ApplicationComparator());
		for (var i : word) {
			System.out.println(i);

		}
		System.out.println(word);
	}

}
