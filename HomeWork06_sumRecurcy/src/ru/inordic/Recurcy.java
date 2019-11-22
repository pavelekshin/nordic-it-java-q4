package ru.inordic;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Recurcy {

	public static void main(String[] args) {

		System.out.println("Введите с новой строки число n>0 для расчета n!");
		Scanner scanner = new Scanner(System.in);

		int n = scanner.nextInt();
		scanner.close();

		System.out.println(n + "!: " + Recurcy(n));

	}

	public static int Recurcy (int n) {
		if (n == 0 || n == 1)
			return 1;
		return n * Recurcy(n - 1);
	}

}
