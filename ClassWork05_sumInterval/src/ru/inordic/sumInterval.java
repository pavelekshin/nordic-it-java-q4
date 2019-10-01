package ru.inordic;

import java.util.Scanner;

public class FibonacciSum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("Введите границу цикла [0,n)");
		Scanner scanner = new Scanner(System.in);
		
		int n = scanner.nextInt();
		scanner.close();
		
		int sum = 0;
		
		for (int i=0; i <= n; i++)
		{
			if (i % 2 == 0) {
				sum +=i;
			}
			else {
		}
			
		}
		
		System.out.println("Сумма четных чисел: " +sum);

	}

}
