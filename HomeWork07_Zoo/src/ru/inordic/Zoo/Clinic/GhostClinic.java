package ru.inordic.Zoo.Clinic;

import java.util.ArrayList;
import java.util.Random;

import ru.inordic.Zoo.Animals.Animals;

public class GhostClinic implements Clinic {
	private ArrayList<Animals> animals = new ArrayList<Animals>();

	public void addAnimal(Animals anotherAnimals) {
		boolean solution = new Random().nextBoolean();
		if (solution) {
			animals.add(anotherAnimals);
		}
	}

	public void healthAnimal() {
		int  health = new Random().nextInt(100);
		for (var i : animals) {
			i.setHealth(health);
		}
	}

	public void printHealth() {
		for (var i : animals) {
			System.out.println(i.getName() + " " + i.getHealth());
		}
	}
}