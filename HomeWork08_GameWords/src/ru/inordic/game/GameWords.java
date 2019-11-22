package ru.inordic.game;

import java.util.ArrayList;
import java.util.Scanner;
//import ru.inordic.game.List;

public abstract class GameWords {

	public static List createArray(String text) {
		List gt = new List();
		String str = "";
		for (int i = 0; i < text.length(); i++) {
			str = Character.toString(text.charAt(i));
			gt.addToArray(i, str);
		}
		return gt;
	}

	public static List playGame(String symbol, List arr) {
		int index;
		for (int i = 0; i < symbol.length(); i++) {
			int c = symbol.charAt(i);
			index = arr.indexOfStr(Character.toString(c));
			arr.removeFromArray(index);
		}
		return arr;
	}

	public static boolean checkContains(String text, String symbol) {
		for (int i = 0; i < text.length(); i++) {
			int c = text.charAt(i);
			int index = symbol.indexOf(c);
			if (index < 0) {
				return false;
			}
		}
		return true;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the word");

		String symbol = scanner.nextLine();
		String text = scanner.nextLine();

		List gametext = new List();
		gametext = createArray(symbol);

		int result = 0;
		ArrayList<String> history = new ArrayList<String>();

		while (!"".equals(text)) {
			if (checkContains(text, symbol)) {
				// game
				
				playGame(text,gametext);
				
				ru.inordic.game.List.printArray();
				
				if (!history.contains(text)) {
					history.add(text);
					result += text.length();
				} else {
					System.out.println("You enter same word again");
				}
			} else {
				System.out.println("Inconsist input");
			}
			text = scanner.nextLine();
		}
		System.out.println(result);
		System.out.println(history);
		System.out.println(gametext);
	}
}