package ru.inordic.Calc;

import java.util.Scanner;

public class Calc {


public static boolean checkDigitInput(String str) {
	    try {
	        Double.valueOf(str);
	        return true;
	    } catch (NumberFormatException e) {
	    	System.out.println("This is not a double type!");
	        return false;
	    }
}	

public static boolean checkOperator (String operator) {
if (operator.matches("[-+*^/]|mod|div"))
	return true;
else
	return false;
}

public static double sum (double arg1, double arg2) {
	return arg1+arg2;
}

public static double sub (double arg1, double arg2) {
	return arg1-arg2;
}

public static double pow (double arg1, double arg2) {
	double pow = 0;
	if (arg2 > 0) {
		for (int i=1; i<arg2; i++) {
			pow = arg1 *= arg1;		
			}
		return pow;
	}
	else if (arg2 == 0) {
		return pow = 1;
			}
	else return pow;
}

public static int divideInt (double arg1, double arg2) {
	return (int)arg1/(int)arg2;
}

public static double mod (double arg1, double arg2) {
	return arg1 % arg2;
}

public static double multipli (double arg1, double arg2) {
	return arg1 * arg2;
}

public static double divide (double arg1, double arg2) {
	return arg1 / arg2;
}

public static void main(String[] args) {
		// TODO Auto-generated method stub

		double arg1 = 0;
		double arg2 = 0;
		String argOper = "";
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("The code make math operations on DOUBLE type value.");
		
		boolean running = true;
		
		while (running) {	
		System.out.println("Please enter first digit in new line:");
		String digit1 = scanner.nextLine();
		if (checkDigitInput(digit1)) {
			running = false;
			arg1 = Double.parseDouble(digit1);
			}
		}
		
		running = true;
		
		while (running) {	
			System.out.println("Please enter second digit in new line:");
			String  digit2 = scanner.nextLine();
			if (checkDigitInput(digit2)) {
				running = false;
				arg2 = Double.parseDouble(digit2);
			}
		}
		
		running = true;

		while (running) {	
			System.out.println("Enter math operator (+,-,/,*,^,div,mod) in new line:");
			String operator = scanner.nextLine().toLowerCase();
			if (checkOperator(operator)) {
				if ((operator.equals("/") && arg2 == 0) || (operator.equals("div") && arg2 == 0) ){
					System.out.println("You cannot divide by zero!!!. Please enter another operator.");
				}
				else {
					running = false;
					argOper = operator;}
				}
		}
	
		
			switch (argOper) {
			case "+": 
				System.out.println("Sum of entered digits: " +sum(arg1,arg2));
				break;
			case "-": 
				System.out.println("Sub of entered digits: " +sub(arg1,arg2));
				break;
			case "*": 
				System.out.println("Multipli of entered digits: " +multipli(arg1,arg2));
				break;
			case "/": 
				System.out.println("Divide of entered digits: " +divide(arg1,arg2));
				break;
			case "div": 
				System.out.println("Div of entered digits: " +divideInt(arg1,arg2));
				break;
			case "mod": 
				System.out.println("Mod of entered digits: " +mod(arg1,arg2));
				break;
			case "^": 
				System.out.println("Pow of entered digits: " +pow(arg1,arg2));
				break;	
			}	
			}
}
