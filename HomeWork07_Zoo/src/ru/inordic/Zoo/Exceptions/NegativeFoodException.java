package ru.inordic.Zoo.Exceptions;

public class NegativeFoodException extends Exception {
	public NegativeFoodException() {
		super("Negative count of foods!");
	}
}
