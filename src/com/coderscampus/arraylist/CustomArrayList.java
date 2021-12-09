package com.coderscampus.arraylist;

public class CustomArrayList<T> implements CustomList<T> {
	Object[] currentItems = new Object[10];
	int sizeOfArray = 0;

	@Override
	public boolean add(T item) {
		System.out.println("---");
		if (sizeOfArray == currentItems.length) {
			System.out.println("I will resize the Array - NOW!");
			currentItems = resizingOfMyArray();
		}
		currentItems[sizeOfArray] = item;
		sizeOfArray++;
		return true;
	}

	private Object[] resizingOfMyArray() throws ArrayIndexOutOfBoundsException {
		Object[] updatedItems = new Object[sizeOfArray * 2];

		for (int i = 0; i < sizeOfArray; i++) {
			updatedItems[i] = currentItems[i];
		}
		return updatedItems;
	}

	@Override
	public int getSize() {
		return sizeOfArray;
	}

	@SuppressWarnings("unchecked")
	@Override
	public T get(int index) throws IndexOutOfBoundsException {
		if (index >= sizeOfArray) {
			System.err.println("The array is out of beyond");
		}

		return (T) currentItems[index];
	}

}
