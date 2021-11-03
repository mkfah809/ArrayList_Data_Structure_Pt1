package com.coderscampus.arraylist;

public class CustomArrayList<T> implements CustomList<T> {
	Object[] CurrentItems = new Object[3];
	int arraySize = 0;

	@Override
	public boolean add(T item) {
		if (arraySize == CurrentItems.length) {
			System.out.println("Size of array is " + arraySize + " equal to size of items array is " + CurrentItems.length);			
			CurrentItems = resizingOfArray();
		}
			arraySize++;
			
		return true;
	}

	private Object[] resizingOfArray() {
		Object[] newItems = new Object[arraySize * 2];
		for (int i = 0; i < arraySize; i++) {
			newItems[i] = CurrentItems[i];
			CurrentItems[i] = newItems[i];
		}
		return newItems;
	}

	@Override
	public int getSize() {
		System.out.println(arraySize);
		return arraySize;
	}

	@Override
	public T get(int index) {
		// TODO Auto-generated method stub
		return null;
	}

}
