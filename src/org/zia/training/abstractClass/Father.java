package org.zia.training.abstractClass;

public class Father extends GrandFather{
	void fatherMethod() {
		int age=65;
		
		switch (age){
		case 0:
			System.out.println("The age is not 0");
		break;
		case 65:
			System.out.println("I'm in Father Method and my age is "+age);
		break;
		default:
			System.out.println("No value");
		break;
		}
		
	}
}
