package ru.inordic.Zoo.Exceptions;

public class ManyFoodException extends Exception {
	public ManyFoodException() {
		super("Too many foods!");
	}
}
