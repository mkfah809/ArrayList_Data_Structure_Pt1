package com.coderscampus.arraylist;


public class Application {

	public static void main(String[] args) {
		CustomArrayList<Integer> elements = new CustomArrayList<>();
		populateNumbers(elements);
		getSizeOfArray(elements);
		System.out.println("");
	
		Object[] originalArray = new Object[5];   
		Object[] largerArray = new Object[10];
		System.arraycopy(originalArray, 0, largerArray, 0, originalArray.length);
		}

	private static void getSizeOfArray(CustomArrayList<Integer> elements) {
		
		for (int i=0; i<elements.getSize(); i++) {
		    System.out.println("element.get(i) is equal to  " + elements.get(i));
		    System.out.println("");
		}
	}

	private static void populateNumbers(CustomList<Integer> elements) {
		// adding to the element list
		for (int element=0; element < 100; element++) {
			elements.add(element);
		}
		
	}


}
