package com.example.homework26.homework26;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit.jupiter.SpringExtension;

@ExtendWith(SpringExtension.class)
public class PrimeNumberTests {
	
	@Test
	@DisplayName("Проверка на простое число 5")
	public void isTruePrimeNumberTest1() {
		new PrimeNumber();
		boolean result = PrimeNumber.checkPrime(5);
		assertThat(result).isTrue();
	}
	
	@Test
	@DisplayName("Проверка на простое числа 3")
	public void isTruePrimeNumberTest2() {
		new PrimeNumber();
		boolean result = PrimeNumber.checkPrime(3);
		assertThat(result).isTrue();
	}
	
	@Test
	@DisplayName("Проверка на простое числа 191")
	public void isTruePrimeNumberTest5() {
		new PrimeNumber();
		boolean result = PrimeNumber.checkPrime(191);
		assertThat(result).isTrue();
	}
	
	@Test
	@DisplayName("Проверка на простое числа 3571")
	public void isTruePrimeNumberTest6() {
		new PrimeNumber();
		boolean result = PrimeNumber.checkPrime(3571);
		assertThat(result).isTrue();
	}

	@Test
	@DisplayName("Проверка на простое числа 0")
	public void isFalsePrimeNumberTest3() {
		new PrimeNumber();
		boolean result = PrimeNumber.checkPrime(0);
		assertThat(result).isFalse();
	}
	
	@Test
	@DisplayName("Проверка на простое числа -5")
	public void isFalsePrimeNumberTest4() {
		new PrimeNumber();
		boolean result = PrimeNumber.checkPrime(-5);
		assertThat(result).isFalse();
	}
	
	
}
