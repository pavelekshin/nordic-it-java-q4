package ru.inordic.Calc;

import java.util.Scanner;

public class Calc {

	public static boolean checkDigitInput(String inputstr) {
		try {
			Integer.valueOf(inputstr);
			return true;
		} catch (NumberFormatException e) {
			System.out.println("This is not a int type!");
			return false;
		}
	}
	
	public static boolean checkDigitInputStr(String inputstr) {
		if (inputstr.matches("[0-9]+"))
			return true;
		else {
			System.out.println("This is not a int type!");
			return false;
		}
	}


	public static boolean checkOperator(String operator) {
		if (operator.matches("[-+*^/]|mod|div"))
			return true;
		else
			return false;
	}

	public static int sum(int arg1, int arg2) {
		return arg1 + arg2;
	}

	public static int sub(int arg1, int arg2) {
		return arg1 - arg2;
	}

	public static int pow(int arg1, int arg2) {
		int pow = 1;
		if (arg2 > 0) {
			for (int i = 1; i <= arg2; i++) {
				pow *= arg1;
			}
			return pow;
		} else if (arg2 == 0) {
			return pow;
		} else
			return pow = 0;
	}

	public static int div(int arg1, int arg2) {
		return arg1 / arg2;
	}

	public static int mod(int arg1, int arg2) {
		return arg1 % arg2;
	}

	public static int multipli(int arg1, int arg2) {
		return arg1 * arg2;
	}

	public static double divide(int arg1, int arg2) {
		return (double) arg1/arg2;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int arg1 = 0;
		int arg2 = 0;
		String argOper = "";

		Scanner scanner = new Scanner(System.in);
		System.out.println("The code make math operations on INTEGER type value.");

		boolean running = true;

		while (running) {
			System.out.println("Please enter first digit in new line:");
			String digit1 = scanner.nextLine();
			if (checkDigitInputStr(digit1)) {
				running = false;
				arg1 = Integer.parseInt(digit1);
			}
		}

		running = true;

		while (running) {
			System.out.println("Please enter second digit in new line:");
			String digit2 = scanner.nextLine();
			if (checkDigitInputStr(digit2)) {
				running = false;
				arg2 = Integer.parseInt(digit2);
			}
		}

		running = true;

		while (running) {
			System.out.println("Enter math operator (+,-,/,*,^,div,mod) in new line:");
			String operator = scanner.nextLine().toLowerCase();
			if (checkOperator(operator)) {
				if ((operator.equals("/") && arg2 == 0) || (operator.equals("div") && arg2 == 0)) {
					System.out.println("You cannot divide by zero!!! Please enter another operator");
				} else {
					running = false;
					argOper = operator;
				}
			}
		}

		switch (argOper) {
		case "+":
			System.out.println("Sum of entered digits: " + sum(arg1, arg2));
			break;
		case "-":
			System.out.println("Sub of entered digits: " + sub(arg1, arg2));
			break;
		case "*":
			System.out.println("Multipli of entered digits: " + multipli(arg1, arg2));
			break;
		case "/":
			System.out.println("Divide of entered digits: " + divide(arg1, arg2));
			break;
		case "div":
			System.out.println("Div of entered digits: " + div(arg1, arg2));
			break;
		case "mod":
			System.out.println("Mod of entered digits: " + mod(arg1, arg2));
			break;
		case "^":
			System.out.println("Pow of entered digits: " + pow(arg1, arg2));
			break;
		}
	}
}
