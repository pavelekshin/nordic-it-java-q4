package ru.inordic.hashset;

import java.util.HashMap;
import java.util.HashSet;

public class ClinicApplication {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Animal animal1 = new Animal(1);
		Animal animal2 = new Animal(2);
		Animal animal3 = new Animal(3);


		animal1.setName("Vasya");
		animal2.setName("Petya");
		animal3.setName("Yura");
	
		HashSet<Animal> set = new HashSet<Animal>();
		set.add(animal1);
		set.add(animal2);
		set.add(animal3);

		System.out.println(set);
		
		HashMap<Integer , Animal> maps = new HashMap<Integer, Animal>();
		maps.put(animal1.getId(),animal1);
		maps.put(animal2.getId(),animal2);
		maps.put(animal3.getId(),animal3);
		
		System.out.println("--------------------------------");
		System.out.println(maps);
		System.out.println(maps.containsKey(animal3.getId()));
		System.out.println(maps.get(1));



	}

}
