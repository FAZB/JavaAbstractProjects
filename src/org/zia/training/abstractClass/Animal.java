package org.zia.training.abstractClass;

//an abstract class can contain abstract methods and concrete methods
public abstract class Animal {

	abstract void soundOfAnimal();
	
	public void typeOfAnimal(String type) {
		System.out.println(type + " sounds: ");
	}
}
