package com.learnjava.corejava;

import java.util.ArrayList;
import java.util.List;

public class GenericsRuntimeCheck {

	public static void main(String[] args) {
		
		List<String> namesList = new ArrayList<>();
		
		addToNames(namesList, "Name 1");
		addToNames(namesList, "Name 2");
		System.out.println(namesList);
		
		incorrectAddToNames(namesList, 100);
		System.out.println(namesList);
		
		// Throws Runtime cast exception, no compile time error - This is Type erasure
		//String myName = names.get(2);
		
		String[] namesArray = new String[5];
		addToArray(namesArray, "Name 1");
		
		// The runtime exception occurs inside the method, as we are trying to assign an integer to a String array
		// Array is a runtime construct and hence at runtime , it is a String array
		// While for generics at runtime, the list is a basic list object and not of any specific type
		incorrectAddToArray(namesArray, 100);
		
		String myName = namesArray[0];

	}
	
	private static void addToNames(List<String> names, String s) {
		names.add(s);
	}
	
	private static void incorrectAddToNames(List list, Integer i) {
		list.add(i);
	}
	
	private static void addToArray(String[] namesArray, String s) {
		namesArray[0] = s;
	}
	
	private static void incorrectAddToArray(Object[] namesArray, Integer i) {
		namesArray[0] = i;
	}

}
