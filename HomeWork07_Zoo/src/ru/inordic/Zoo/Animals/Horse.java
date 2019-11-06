package ru.inordic.Zoo.Animals;

public class Horse extends Animals {

	public Horse(String name, int age) {
		super(name, age);
	}

	public void say() {
		System.out.println(getName() + " is said: " + "Frrr-Frrr");
	};

	public void color() {
		System.out.println("Brown in apples");
	};

	public boolean run(Animals anotherAnimals) {
		int ageAdvantage = this.getAge() > anotherAnimals.getAge() ? 1 : 0;
		int powerAdvantage = this.getPower() > anotherAnimals.getPower() ? 1 : 0;
		int speedAdvantage = this.getSpeed() > anotherAnimals.getSpeed() ? 1 : 0;

		int score = speedAdvantage + ageAdvantage + powerAdvantage;
		return score >= 2 ? true : false;
	}
}
