package ru.inordic.Zoo.Animals;

public abstract class Animals {

	private String name;
	private int age;
	private int power;
	private int weight;
	private int speed;

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
		tiger.setWeight(100);
		tiger.setSpeed(75);


		elephant.say();
		elephant.setName("Dambo");
		elephant.setAge(20);
		elephant.setPower(20);
		elephant.setWeight(1000);
		elephant.setSpeed(20);

		horse.say();
		horse.setName("Pegas");
		horse.setAge(15);
		horse.setPower(3);
		horse.setWeight(350);
		horse.setSpeed(80);


		rabbit.say();
		rabbit.setName("Bucks Bunny");
		rabbit.setAge(5);
		rabbit.setPower(3);
		rabbit.setWeight(2);
		rabbit.setSpeed(25);

		wolf.say();
		wolf.setName("Gray wolf");
		wolf.setAge(7);
		wolf.setPower(9);
		wolf.setWeight(40);
		wolf.setSpeed(30);

		System.out.println(tiger.getName());
		System.out.println(tiger.getAge());
		System.out.println(tiger.getPower());
		System.out.println(wolf.getName());


		System.out.println("Wolf beat rabbit: " +wolf.fight(rabbit));
		System.out.println("Horse faster than tiger : " +horse.run(tiger));
		System.out.println("Elephant is most havier : " +elephant.weigh(horse));

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
	
}
