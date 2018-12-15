package org.zia.training.abstractClass;

public class GrandFather{
	
	void grandFatherMethod() {
		int age=85;
		int x=10;
		int y=x+10;
		int z=x+y;
		System.out.println("If x=10 and y=x+10 then z is "+z);
		System.out.println("I am in Grand Father Method and I am "+age +" years old.");
		
		int[] X = {5,10,15};
		for(int temp : X) {
			System.out.println(temp);
		}
	}
}
