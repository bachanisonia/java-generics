package com.learnjava.corejava;

import java.util.ArrayList;
import java.util.List;


public class UpperBoundWildcard {

	public static void main(String[] args) {
		
		List<Integer> numbers = new ArrayList<>();
		numbers.add(1);
		numbers.add(2);
		printNumbers(numbers);
		
		List<Double> doubles = new ArrayList<>();
		doubles.add((double) 1);
		doubles.add((double) 2);
		
		printNumbers(doubles);

	}
	
	private static void printNumbers(List<? extends Number> numbers) {
		numbers.forEach(System.out::println);
		
		Number number = numbers.get(0);
		System.out.println("First Number : " + number);
		
		// Add still does not work
		//numbers.add((Number) 100);
	}

}
