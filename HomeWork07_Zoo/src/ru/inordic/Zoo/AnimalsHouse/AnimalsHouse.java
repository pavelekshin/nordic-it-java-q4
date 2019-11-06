package ru.inordic.Zoo.AnimalsHouse;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

import ru.inordic.Zoo.Animals.Animals;

public class AnimalsHouse {
	private ArrayList<AnimalsHouse> animalsHouse;

 AnimalsHouse(int size) {
		animalsHouse = new ArrayList<AnimalsHouse>(size);
	}

	public void addToHouse(Animals anotherAnimals) {
		animalsHouse.addAll(anotherAnimals);
	}

	public void removeFromHouse(Animals anotherAnimals) {
		animalsHouse.remove(anotherAnimals);
	}

	public void printHouse() {
		for (var i : animals) {
			System.out.println(i.getName());
		}
	}
}