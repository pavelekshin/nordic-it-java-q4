package ru.inordic.Zoo.Animals;

import ru.inordic.Zoo.AnimalsHouse.AnimalsHouse;
import ru.inordic.Zoo.AnimalsHouse.AnimalHouseTwo;

import ru.inordic.Zoo.Clinic.GhostClinic;
import ru.inordic.Zoo.Clinic.ZooClinic;
import ru.inordic.Zoo.Exceptions.*;

public abstract class Animals {

	private String name;
	private int age;
	private int power;
	private int weight;
	private int speed;
	
	private int health;

	public int hunger = 100;

	public Animals(String name, int age) {
		this.name = name;
		this.age = age;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		Tiger tiger = new Tiger("Simba", 4);
		Elephant elephant = new Elephant("Dambo", 10);
		Horse horse = new Horse("Pegas", 15);
		Rabbit rabbit = new Rabbit("Bucks Bunny", 3);
		Wolf wolf = new Wolf("Grey Wolf", 8);

		tiger.say();
		// tiger.setName("Simba");
		// tiger.setAge(10);
		tiger.setPower(20);
		tiger.setWeight(100);
		tiger.setSpeed(75);

		elephant.say();
		// elephant.setName("Dambo");
		// elephant.setAge(20);
		elephant.setPower(20);
		elephant.setWeight(1000);
		elephant.setSpeed(20);

		horse.say();
		// horse.setName("Pegas");
		// horse.setAge(15);
		horse.setPower(3);
		horse.setWeight(350);
		horse.setSpeed(80);

		rabbit.say();
		// rabbit.setName("Bucks Bunny");
		// rabbit.setAge(5);
		rabbit.setPower(3);
		rabbit.setWeight(2);
		rabbit.setSpeed(25);

		wolf.say();
		// wolf.setName("Gray wolf");
		// wolf.setAge(7);
		wolf.setPower(9);
		wolf.setWeight(40);
		wolf.setSpeed(30);

		System.out.println(tiger.getName());
		System.out.println(tiger.getAge());
		System.out.println(tiger.getPower());
		System.out.println(wolf.getName());

		try {
			tiger.feed(-100500);
		} catch (ManyFoodException e) {
			System.out.println("Too many food!");
		} catch (NegativeFoodException e) {
			System.out.println("Too small food!");
		}

		System.out.println("Wolf beat rabbit: " + wolf.fight(rabbit));
		System.out.println("Horse faster than tiger : " + horse.run(tiger));
		System.out.println("Elephant is most havier : " + elephant.weigh(horse));
		
		ZooClinic clinic = new ZooClinic();
		GhostClinic gclinic = new GhostClinic();

//		AnimalsHouse animalsHouse = new AnimalsHouse(2);

		AnimalHouseTwo animalsHouse = new AnimalHouseTwo();
		
		animalsHouse.printHouse();

		
		animalsHouse.addToHouse(wolf);
		animalsHouse.addToHouse(wolf);
		animalsHouse.addToHouse(wolf);
		animalsHouse.addToHouse(wolf);


		animalsHouse.printHouse();
		
		animalsHouse.removeFromHouse(wolf);

		animalsHouse.printHouse();
		
		
/*		clinic.addAnimal(tiger);
		clinic.addAnimal(elephant);
		clinic.addAnimal(horse);
		clinic.addAnimal(rabbit);
		clinic.addAnimal(wolf);
*/
		gclinic.addAnimal(tiger);
		gclinic.addAnimal(elephant);
		gclinic.addAnimal(horse);
		gclinic.addAnimal(rabbit);
		gclinic.addAnimal(wolf);
		
		gclinic.printHealth();

		clinic.printHealth();

		clinic.healthAnimal();
		gclinic.healthAnimal();
		
		clinic.printHealth();
		gclinic.printHealth();

//		System.out.println("Wolf beat rabbit: " + clinic(wolf).getName());

		
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getPower() {
		return power;
	}

	public void setPower(int power) {
		this.power = power;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public abstract void say();

	public abstract void color();

	public int getWeight() {
		return weight;
	}

	public void setWeight(int weight) {
		this.weight = weight;
	}

	public int getSpeed() {
		return speed;
	}

	public void setSpeed(int speed) {
		this.speed = speed;
	}

	public int getHunger() {
		return hunger;
	}

	public void setHunger(int hunger) {
		this.hunger = hunger;
	}

	public int getHealth() {
		return health;
	}

	public void setHealth(int health) {
		this.health = health;
	}

}
