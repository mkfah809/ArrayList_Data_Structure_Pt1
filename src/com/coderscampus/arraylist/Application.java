package com.coderscampus.arraylist;

public class Application {

	public static void main(String[] args) {
		CustomList<Integer> elements = new CustomArrayList<>();
				
		populateNumbers(elements);

	}

	private static void populateNumbers(CustomList<Integer> elements) {
		for (int element=0; element < 4; element++) {
			elements.add(element);
		}
	}


}
