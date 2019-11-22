package ru.inordic.dog;

public class Dog {
	
	private String name;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Dog dog = new Dog();
		dog.setName("Pes");
		System.out.print(dog.getName());
		System.out.print("\n");
		dog.say();

	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	public void say() {
		System.out.print("woof-woof" + "\n");
	}

}
