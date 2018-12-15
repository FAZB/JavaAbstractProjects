package org.zia.training.abstractClass;

public class Cat extends Animal{

	public static void main(String[] args) {
		Animal animal = new Cat();
			animal.typeOfAnimal("Cat");
			animal.soundOfAnimal();
	}

	@Override
	void soundOfAnimal() {
		System.out.println("Mew Mew...");
		
	}

}
