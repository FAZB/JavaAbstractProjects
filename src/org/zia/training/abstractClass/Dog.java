/**
 * 
 */
package org.zia.training.abstractClass;

public class Dog extends Animal{

	public static void main(String[] args) {
		Animal animal = new Dog();
		animal.typeOfAnimal("Dog");
		animal.soundOfAnimal();
	}

	@Override
	void soundOfAnimal() {
		System.out.println("Woof Woof...");
		
	}
}
