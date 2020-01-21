package com.example.homework26.homework26;

//

public class PrimeNumber {
	public static boolean checkPrime(Integer i) {
		if (i == null)
			return false;
		if (i <= 1)
			return false;
		if (i <= 3)
			return true;
		else if (i % 2 == 0 || i % 3 == 0)
			return false;
		for (int n = 3; n * n <= i; n += 2) {
			if (i % n == 0)
				return false;
		}
		return true;
	}
}
