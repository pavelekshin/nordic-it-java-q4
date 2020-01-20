package com.example.homework26.homework26;

import java.util.ArrayList;
import java.util.Scanner;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Homework26Application implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(Homework26Application.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub

		System.out.println("Enter the string");
		Scanner scanner = new Scanner(System.in);
		Integer text = scanner.nextInt();
		
		System.out.println(PrimeNumber.checkPrime(text));
	}
}
