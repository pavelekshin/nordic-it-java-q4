package ru.inordic.Zoo.Animals;

public class Elephant extends Animals {

	public Elephant(String name, int age) {
		super(name, age);
	}

	public void say() {
		System.out.println(getName() + " is said: " + "Uuuuuw-Uuuuuw");
	};

	public void color() {
		System.out.println("Gray");
	};

	public boolean weigh(Animals anotherAnimals) {
		int weightAdvantage = this.getWeight() > anotherAnimals.getWeight() ? 1 : 0;

		int score = weightAdvantage;
		return score >= 1 ? true : false;
	}
}
