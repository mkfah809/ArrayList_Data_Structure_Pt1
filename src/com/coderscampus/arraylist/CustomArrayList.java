package com.coderscampus.arraylist;

public class CustomArrayList<T> implements CustomList<T> {
	Object[] currentItems = new Object[3];
	int arraySize = 0;

	@Override
	public boolean add(T item) {
		if (arraySize == currentItems.length) {
			currentItems = resizingOfMyArray();
		}
			arraySize++;
			
		return true;
	}

	private Object[] resizingOfMyArray() {
		Object[] updatedItems = new Object[arraySize * 2];
		for (int i = 0; i < arraySize; i++) {
			updatedItems[i] = currentItems[i];
			//currentItems[i] = updatedItems[i];
			return updatedItems;
			
		}
		System.out.println("out of loop");
		return null;
	}

	@Override
	public int getSize() {
		System.out.println(arraySize);
		return arraySize;
	}

	@SuppressWarnings("unchecked")
	@Override
	public T get(int index) {
		if(index < arraySize) {
			return (T) currentItems[index];
		} else {			
			System.out.println("The index of the object array is bigger than the arraySize");
		}
		return null;
	}

}
