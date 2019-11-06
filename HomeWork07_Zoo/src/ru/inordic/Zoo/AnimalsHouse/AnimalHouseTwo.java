package ru.inordic.Zoo.AnimalsHouse;
import java.util.ArrayList;
import ru.inordic.Zoo.Animals.Animals;
import ru.inordic.Zoo.Exceptions.HouseSizeException;

public class AnimalHouseTwo {

		private ArrayList<Animals> animals = new ArrayList<Animals>();
		private int size = 3;

		public void addToHouse(Animals anotherAnimals) {
		try {
		    if (animals.size() >= size) {
		    throw new HouseSizeException();
		}}
		    catch (HouseSizeException e) {
		    	System.out.println("You reach house size! Please add new house!");}
			animals.add(anotherAnimals);
		}

		public void removeFromHouse(Animals anotherAnimals) {
			animals.remove(anotherAnimals);
		}

		public void printHouse() {
			for (var i : animals) {
				System.out.println(i.getName());
			}
			System.out.println("The current size of house: "+ animals.size());
			System.out.println("The max size of house " + size);
		}
	}

