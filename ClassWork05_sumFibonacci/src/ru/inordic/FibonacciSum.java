package ru.inordic;

import java.util.Scanner;

public class FibonacciSum {

	public static void main(String[] args) {

		System.out.println("Введите с новой строки число n>1 для расчета суммы числе Фибоначчи Fn = F(n-1) + F(n-2)");
		Scanner scanner = new Scanner(System.in);
				
		int n = scanner.nextInt();
		scanner.close();
		
		System.out.print("Сумма чисел Фибоначчи: " +F(n));
	
	}
	
	public static int F(int n) {
		
		if (n <= 0)
			return 0;
		else if (n == 1) {
			return 1;
		}
		
		return F(n-1) + F(n-2);
	}

}
