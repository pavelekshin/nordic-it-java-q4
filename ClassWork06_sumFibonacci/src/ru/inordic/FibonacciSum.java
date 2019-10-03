package ru.inordic;

import java.util.Arrays;
import java.util.Scanner;

public class FibonacciSum {

	public static void main(String[] args) {

		System.out.println("Введите с новой строки число n>1 для расчета суммы числе Фибоначчи Fn = F(n-1) + F(n-2)");
		Scanner scanner = new Scanner(System.in);

		int n = scanner.nextInt();
		scanner.close();

		int[] arr = new int[n];

		int sum = 0;

		for (int i = 0; i < n; i++) {
			arr[i] += F(i);
		}

		sum = arr[n - 1] + arr[n - 2];

		System.out.println("Сумма чисел Фибоначчи: " + sum);
		System.out.println("Сумма чисел Фибоначчи: " + F(n));

		for (int i = 0; i < n; i++) {
			System.out.print(arr[i] + " ");
		}

		System.out.print("\n");

		// TODO
		int Farrsum = 0;
		Farrsum = getArrayElement(Farr(n), n - 1) + getArrayElement(Farr(n), n - 2);

		System.out.println("Функция Farr: " + Arrays.toString(Farr(n)));
		System.out.println("Функция Farrsum: " + Farrsum);
	
		// TODO ArrayList

	}

	public static int F(int n) {
		if (n <= 0)
			return 0;
		else if (n == 1) {
			return 1;
		}
		return F(n - 1) + F(n - 2);
	}

	public static int[] Farr(int n) {
		int[] arr = new int[n];

		for (int i = 0; i < n; i++) {
			if (i <= 0)
				arr[i] = i;
			else if (i == 1)
				arr[i] = i;
			else
				arr[i] += arr[i - 1] + arr[i - 2];
		}
		return arr;
	}

	public static int getArrayElement(int[] arr, int index) {
		return arr[index];
	}

}
