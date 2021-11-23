package com.coderscampus.arraylist;


public class Application {

	public static void main(String[] args) 
	{launch();}
	private static void launch() {
		Application getArray = new Application();
		CustomArrayList<Integer> elements = new CustomArrayList<>();
		getArray.populateNumbers(elements);
		getArray.getSizeOfArray(elements);
	}
	private void getSizeOfArray(CustomArrayList<Integer> elements) {
		for (int i=1; i<elements.getSize(); i++) {
			System.out.println(elements.get(i));
		}
	}
	private void populateNumbers(CustomList<Integer> elements) {
		for (int populateListOfNumbers=1; populateListOfNumbers <= 101; populateListOfNumbers++) {
			elements.add(populateListOfNumbers);
		}
		elements.add(1000);
		
		System.out.println("********** Array re-sized **********");
	}
}
