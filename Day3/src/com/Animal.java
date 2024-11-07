package com;

public abstract class Animal {
	private String name="DefaultName";
	public Animal() {
		System.out.println("Animal Constructor");
	}
	public abstract void eat();
	public void displayAnimalName(String name) {
		System.out.println("Name="+name);
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
}

class Dog extends Animal {

	@Override
	public void eat() {
		System.out.println("Dog Eat");		
	}
}

class Cow extends Animal {
	@Override
	public void eat() {
		System.out.println("Cow Eat");
		
	}	
}