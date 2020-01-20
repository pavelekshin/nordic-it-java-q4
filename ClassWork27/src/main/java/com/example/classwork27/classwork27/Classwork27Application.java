package com.example.classwork27.classwork27;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.classwork27.classwork27.CampareString;

@SpringBootApplication
public class Classwork27Application implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(Classwork27Application.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub

		System.out.println("Enter the string");
		Scanner scanner = new Scanner(System.in);
		String text = scanner.nextLine();
		
		ArrayList<String> str = new ArrayList<String>();

		while (!text.isEmpty())
		{
			str.add(text);
			text = scanner.nextLine();
		}

		List<String> result =  CampareString.sortByLength(str);

		System.out.println(result);
	

	}

	public static boolean isPalindrome(String s) {
		return s.equals(new StringBuilder(s).reverse().toString());
	}

	public static boolean Palindrome(String s) {
		for (int i = 0, j = s.length() - 1; i < j; i++, j--) {
			if (s.charAt(i) != s.charAt(j)) {
				return false;
			}
		}
		return true;
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
}
