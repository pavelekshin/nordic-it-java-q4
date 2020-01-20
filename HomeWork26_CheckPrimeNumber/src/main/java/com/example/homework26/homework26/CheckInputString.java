package com.example.homework26.homework26;

public class CheckInputString {
	public static boolean checkDigitInput(String inputstr) {
		try {
			Integer.valueOf(inputstr);
			return true;
		} catch (NumberFormatException e) {
			System.out.println("This is not a int type!");
			return false;
		}
	}
}
