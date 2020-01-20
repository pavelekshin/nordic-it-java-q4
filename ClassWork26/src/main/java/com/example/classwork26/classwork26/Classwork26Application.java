package com.example.classwork26.classwork26;

import java.util.ArrayList;
import java.util.Scanner;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Classwork26Application implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(Classwork26Application.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub

		System.out.println("Enter the string");
		Scanner scanner = new Scanner(System.in);
		String text = scanner.nextLine();
		
		ArrayList<String> str = new ArrayList<String>();

	//	System.out.println(checkSimple(Integer.parseInt(text)));
	//	System.out.println(Palindrome.IsPalindrome(text));
	

	}
/*
	public static boolean isPalindrome(String s) {
		return s.equals(new StringBuilder(s).reverse().toString());
	}
	
	public static boolean checkSimple(int i){
	    if (i<=1)
	        return false;
	    else if (i <=3)
	        return true;
	    else if (i%2==0 || i %3 ==0)
	        return false;
	    int n = 5;
	    while (n*n <=i){
	        if (i % n ==0 || i % (n+2) == 0)
	            return false;
	        n=n+6;
	    }
	    return true;
	}
	*/
}
