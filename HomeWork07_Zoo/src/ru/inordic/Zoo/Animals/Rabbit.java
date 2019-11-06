package ru.inordic.Zoo.Animals;

public class Rabbit extends Animals {

	public Rabbit(String name, int age) {
		super(name, age);
	}

	public void say() {
		System.out.println(getName() + " is said: " + "Hrum-hrum");
	};

	public void color() {
		System.out.println("White");
	};

}
