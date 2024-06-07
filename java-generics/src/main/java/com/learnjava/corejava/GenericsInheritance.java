package com.learnjava.corejava;

import java.util.ArrayList;
import java.util.List;

public class GenericsInheritance {

	public static void main(String[] args) {

		List<String> names = new ArrayList<>();
		
		names.add("Name 1");
		names.add("Name 2");
		
		printList(names);
		
		List<Integer> numbers = new ArrayList<>();
		numbers.add(10);
		numbers.add(20);
		
		printList(numbers);

	}

	// Object does not work here for the method call above
	// polymorphism does not work with generics
/*	private static void printList(List<Object> names) {
		
		names.forEach(System.out::println);
	}*/
	
	// How do we make this work ?
	// We want to make it work for both List<String> and List<Integer>
	// ? is an unknown type. Any type. Data modification would still not be allowed
	private static void printList(List<?> names) {
		
		names.forEach(System.out::println);
	}
	
	
	
}

