package ru.inordic.game;

import java.util.ArrayList;
import java.util.Scanner;

import ru.inordic.game.Exceptions.ContainExceptions;
import ru.inordic.game.Exceptions.InconsistInputExceptions;

public class Game {

	private static String turn = "first";

	public static String getTurn() {
		return Game.turn;
	}

	public static void setTurn(String turn) {
		Game.turn = turn;
	}

	public static void checkContains(String text, String gametext) throws InconsistInputExceptions {
		for (int i = 0; i < text.length(); i++) {
			int c = text.charAt(i);
			int index = gametext.indexOf(c);

			if (index < 0) {
				throw new InconsistInputExceptions();
			}
		}
	}

	public static int arrayLength(ArrayList<String> arr) {
		int index = 0;
		for (String str : arr) {
			for (char c : str.toCharArray()) {
				index++;
			}
		}
		return index;
	}

	public static void checkHistory(ArrayList<String> historyp1, ArrayList<String> historyp2, String text)
			throws ContainExceptions {
		if (historyp1.contains(text) || historyp2.contains(text)) {
			throw new ContainExceptions();
		}
		if ("first".equals(getTurn())) {
			historyp1.add(text);
		} else
			historyp2.add(text);
	}

	public static void checkWinner(ArrayList<String> historyp1, ArrayList<String> historyp2) {
		int p1 = 0;
		int p2 = 0;

		for (String str : historyp1) {
			for (char c : str.toCharArray()) {
				p1++;
			}
		}

		for (String str : historyp2) {
			for (char c : str.toCharArray()) {
				p2++;
			}
		}

		int numberOfWords = historyp1.size() > historyp2.size() ? 1 : 0;
		int numberOfSymbols = p1 > p2 ? 1 : 0;
		int score = numberOfWords + numberOfSymbols;

		if (score >= 2)
			System.out.println("Player 1 win!");
		else if (historyp1.size() == historyp2.size() && p1 == p2)
			System.out.println("Tie!");
		else
			System.out.println("Player 2 win!");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the gameword");
		String gametext = scanner.nextLine();
		System.out.println("Player 1 turn: ");
		String text = scanner.nextLine();

		ArrayList<String> historyp1 = new ArrayList<String>();
		ArrayList<String> historyp2 = new ArrayList<String>();

		int input_turn = 1;

		while (!"".equals(text)) {
			if (input_turn % 2 != 0) {
				System.out.println("Player 1 turn: ");
				setTurn("first");
			} else {
				System.out.println("Player 2 turn: ");
				setTurn("second");
			}
			try {
				checkContains(text, gametext);
				// game
				try {
					checkHistory(historyp1, historyp2, text);
				} catch (ContainExceptions e) {
					System.out.println("You enter same word again!");
				}
			} catch (InconsistInputExceptions e) {
				System.out.println("Inconsist input!");
			}

			input_turn++;
			text = scanner.nextLine();

		}
		System.out.println("Player 1 words: " + historyp1 + ", count words: " + historyp1.size() + ", length total: "
				+ arrayLength(historyp1));
		System.out.println("Player 2 words: " + historyp2 + ", count words: " + historyp2.size() + ", length total: "
				+ arrayLength(historyp2));

		checkWinner(historyp1, historyp2);

	}
}
