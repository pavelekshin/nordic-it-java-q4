package ru.inordic.Zoo.Animals;

public class Wolf extends Animals {

	public void say() {
		System.out.println("Woof-woof");
	};
	
	public void color() {
		System.out.println("Grey");
	};
	
	 public boolean fight(Animals anotherAnimals) {
         int powerAdvantage = this.getPower() > anotherAnimals.getPower() ? 1 : 0;
         int weightAdvantage = (this.getWeight() - anotherAnimals.getWeight()) > 0 ? 1 : 0;
         int speedAdvantage = this.getSpeed() > anotherAnimals.getSpeed() ? 1 : 0;

         int score = powerAdvantage + weightAdvantage + speedAdvantage;
         return score > 2 ? true : false;
     }
}
