package org.zia.training.abstractClass;

public class FamilyDemo {

	public static void main(String[] args) {
		Me me = new Me();
		me.meMethod();
		System.out.println("************************************************");

		Father father = new Father();
		father.fatherMethod();
		System.out.println("-----");

		father.grandFatherMethod();
	}
}
