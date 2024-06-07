package com.learnjava.corejava.zoo;

public class Zoo {

	public static void main(String[] args) {
		
		//Cage cage = new Cage();
		Cage<Lion> lionCage = new Cage<>();
		lionCage.setAnimal1(new Lion());
		lionCage.setAnimal2(new Lion());
		
		// Gives a compile time error
		//lionCage.setAnimal2(new Monkey());
		
		Monkey m1 = new Monkey();
		m1.setType("Large");
		
		Monkey m2 = new Monkey();
		m2.setType("Medium");
		
		Cage<Monkey> monkeyCage = new Cage(m1, m2);
		System.out.println(monkeyCage.isCompatible(m1, m2));
		
		// Raw type can be converted to parameterized type and vice versa 
		// This was to support backward compatibility and not break any code
		// The type checking is defeated here
		// So for the generic types you created, you must have new Cage<>();
		//Cage<Monkey> monkeyCage2 = new Cage(new Monkey(), new Lion());
		
		// So instead this is how it must be done, so that the type check happens at right hand side too
		Cage<Monkey> monkeyCage2 = new Cage<>(new Monkey(), new Monkey());
	
		
	}

}
