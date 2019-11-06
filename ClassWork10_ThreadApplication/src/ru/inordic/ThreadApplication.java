package ru.inordic;

import java.util.ArrayList;
import java.util.Scanner;

public class ThreadApplication {

	public static void main(String[] args) {
		
	
		Thread thread = new Thread(new HelloWorldTask());
		thread.start();
	}
}
