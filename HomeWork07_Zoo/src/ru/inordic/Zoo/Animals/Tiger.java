package ru.inordic.Zoo.Animals;

import ru.inordic.Zoo.Exceptions.*;

public class Tiger extends Animals {

	public Tiger(String name, int age) {
		super(name, age);
	}

	public void say() {
		System.out.println(getName() + " is said: " + "Arghh-Arghh");
	};

	public void feed(int eat) throws ManyFoodException, NegativeFoodException {
		if (eat > hunger) {
			throw new ManyFoodException();
		} else if (eat < 0) {
			throw new NegativeFoodException();
		}
		hunger -= eat;
	}

	public void color() {
		System.out.println("Orange with black stripes");
	};

}
