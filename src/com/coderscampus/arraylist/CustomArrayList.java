package com.coderscampus.arraylist;

public class CustomArrayList<T> implements CustomList<T> {
	Object[] currentItems = new Object[10];
	int sizeOfArray = 0;

	@Override
	public boolean add(T item) {
		if (sizeOfArray == currentItems.length) {
			currentItems = resizingOfMyArray();
		}
		sizeOfArray++;
		return true;
	}

	@SuppressWarnings("unused")
	private Object[] resizingOfMyArray() throws ArrayIndexOutOfBoundsException {
		Object[] updatedItems = new Object[sizeOfArray * 2];

		for (int i = 0; i < sizeOfArray; i++) {
			updatedItems[i] = currentItems[i];
			System.out.println("Successfully Resized the array for you!");
			return updatedItems;
			
		}
		return null;
	}

	@Override
	public int getSize() {
		System.out.println("Size of Array is: "+sizeOfArray);
		return sizeOfArray;
	}

	@SuppressWarnings("unchecked")
	@Override
	public T get(int index) {
		if(index <= sizeOfArray) {
			System.out.println("index: " + index + " < arraySize: " + sizeOfArray);
			return (T) currentItems[index];
		} else {			
			System.out.println("The index of the object array is bigger than the arraySize");
		}
		
		return null;
	}

}
