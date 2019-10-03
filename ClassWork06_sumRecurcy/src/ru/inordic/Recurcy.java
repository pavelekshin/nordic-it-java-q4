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

		System.out.println("Массив: " +Recurcy(n));
		System.out.println(n+"!: " +Recurcy(n).get(n));
		System.out.println(n+"!: " +Recurcy2(n));
		System.out.println(n+"!: " +Recurcy3(n));

	}

	public static ArrayList<Integer> Recurcy (int n) {

		ArrayList<Integer> list = new ArrayList<Integer>(n);

		for (int i = 0; i <= n; i++) {
			if (i == 0 || i == 1)
				list.add(i,1);
		else
			list.add(i,i*list.get(i-1));
		}
		return list;
	}
	
	public static int Recurcy2 (int n) {

		ArrayList<Integer> list = new ArrayList<Integer>(n);

		for (int i = 0; i <= n; i++) {
			if (i == 0 || i == 1)
				list.add(i,1);
		else
			list.add(i,i*list.get(i-1));
		
		}
		return list.get(n);
	}
	
	public static int Recurcy3 (int n) {
		  if (n == 0 || n == 1) 
			  return 1;
		    return n * Recurcy3(n - 1);
	}

}
