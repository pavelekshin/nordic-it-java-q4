package ru.inordic;

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
		
		sum = arr[n-1]+arr[n-2];
		
		System.out.println("Сумма чисел Фибоначчи: " + sum);
		System.out.println("Сумма чисел Фибоначчи: " + F(n));

		for (int i = 0; i < n; i++) {
			System.out.print(arr[i] + " ");
		}

	}

	public static int F(int n) {
		if (n <= 0)
			return 0;
		else if (n == 1) {
			return 1;
		}
		return F(n - 1) + F(n - 2);
	}
}
