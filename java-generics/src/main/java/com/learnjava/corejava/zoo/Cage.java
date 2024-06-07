package com.learnjava.corejava.zoo;

public class Cage<E extends Animal> {

	// Add animals lion and monkey to the zoo cage
	// They don't share any interface or an abstract class
	// We can use the super class of all the objects in java - Object
	
	private E animal1;
	private E animal2;
	
	public Cage() {
		
	}
	
	public Cage(E animal1, E animal2) {
		this.animal1 = animal1;
		this.animal2 = animal2;
	}
	
	public Object getAnimal1() {
		return animal1;
	}
	public void setAnimal1(E animal1) {
		this.animal1 = animal1;
	}
	public Object getAnimal2() {
		return animal2;
	}
	public void setAnimal2(E animal2) {
		this.animal2 = animal2;
	}
	
	public boolean isCompatible(E animal1, E animal2) {
		
		return animal1.getType().equals(animal2.getType());
	}
	
}
