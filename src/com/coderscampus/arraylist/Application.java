package com.coderscampus.arraylist;


public class Application {

	public static void main(String[] args) {
		launch();
		}
	private static void launch() {
		Application getArray = new Application();
		CustomArrayList<Integer> elements = new CustomArrayList<>();
		getArray.populateNumbers(elements);
		getArray.getSizeOfArray(elements);
	}
	private void getSizeOfArray(CustomArrayList<Integer> elements) {
		
		for (int i=0; i<elements.getSize(); i++) {
		    System.out.println(i);
		}
	}
	private void populateNumbers(CustomList<Integer> elements) {
		for (int populateListOfNumbers=0; populateListOfNumbers < 20; populateListOfNumbers++) {
			elements.add(populateListOfNumbers);
		}
		System.out.println("********** Array re-sized **********");
	}
}
