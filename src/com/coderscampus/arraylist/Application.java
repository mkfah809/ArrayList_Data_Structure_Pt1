package com.coderscampus.arraylist;

public class Application {

	public static void main(String[] args) {
		CustomArrayList<Integer> elements = new CustomArrayList<>();
				
		populateNumbers(elements);

	}

	private static void populateNumbers(CustomList<Integer> elements) {
		for (int element=0; element < 10; element++) {
			elements.add(element);
		}
	}


}
