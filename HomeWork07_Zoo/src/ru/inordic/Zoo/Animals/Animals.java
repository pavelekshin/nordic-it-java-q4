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
		tiger.setName("Leva");
		System.out.println(tiger.getName());
		tiger.setAge(10);
		System.out.println(tiger.getAge());
		tiger.setPower(20);
		System.out.println(tiger.getPower());
		
		rabbit.say();
		
		wolf.say();
		
		horse.say();
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
