package ru.inordic.Zoo.Clinic;

import java.util.ArrayList;
import ru.inordic.Zoo.Animals.Animals;

public class ZooClinic implements Clinic {

	private ArrayList<Animals> animals = new ArrayList<Animals>();

	public void addAnimal(Animals anotherAnimals) {
		animals.add(anotherAnimals);
	}

	public void healthAnimal() {
		
		for (var i : animals) {
			i.setHealth(100);
		}
	}

	public void printHealth() {
		for (var i : animals) {
			System.out.println(i.getName() + " " + i.getHealth());
		}
	}
}
