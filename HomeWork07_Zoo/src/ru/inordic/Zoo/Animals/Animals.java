package ru.inordic.Zoo.Animals;

public abstract class Animals {

	private String name;
	private int age;
	private int power;

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Tiger tiger = new Tiger();
		Elephant elephant = new Elephant();
		Horse horse = new Horse();
		Rabbit rabbit = new Rabbit();
		Wolf wolf = new Wolf();

		tiger.say();
		tiger.setName("Simba");
		tiger.setAge(10);
		tiger.setPower(20);
		
		elephant.say();
		elephant.setName("Dambo");
		elephant.setAge(20);
		elephant.setPower(20);
		
		horse.say();
		horse.setName("Pegas");
		horse.setAge(15);
		horse.setPower(3);
		
		rabbit.say();
		rabbit.setName("Bucks Bunny");
		rabbit.setAge(5);
		rabbit.setPower(3);
		
		wolf.say();
		wolf.setName("Gray wolf");
		wolf.setAge(7);
		wolf.setPower(9);
		
		System.out.println(tiger.getName());
		System.out.println(tiger.getAge());
		System.out.println(tiger.getPower());

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
}
