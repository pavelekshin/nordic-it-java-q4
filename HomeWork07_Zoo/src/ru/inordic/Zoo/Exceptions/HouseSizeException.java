package ru.inordic.Zoo.Exceptions;

public class HouseSizeException extends Exception {
	public HouseSizeException() {
		super("You reach maximum house size!");
	}
}
