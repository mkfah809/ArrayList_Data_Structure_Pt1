package com.coderscampus.arraylist;

import java.util.ArrayList;

public class Application {

	public static void main(String[] args) {
		CustomArrayList<Integer> elements = new CustomArrayList<>();
	
		ArrayList<Integer> anElements = new ArrayList<>();		
		populateNumbers(elements);
		//elements = anElements;
		getSizeOfArray(elements);
		
	}

	private static void getSizeOfArray(CustomArrayList<Integer> elements) {
		// then you should validate that all the elements you've inserted
		//actually exist in your data structure
		for (int i=0; i<elements.getSize(); i++) {
		    System.out.println(elements.get(i));
		}
	}

	private static void populateNumbers(CustomList<Integer> elements) {
		// adding to the element list
		for (int element=1; element < 60; element++) {
			elements.add(element);
		}
	}


}
