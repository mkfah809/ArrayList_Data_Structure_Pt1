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
	public T get(int index)  {
		if (index < sizeOfArray) {
			// System.out.println("index: " + index + " < arraySize: " + sizeOfArray);
			return (T) currentItems[index];
		} else if(index >= sizeOfArray) {
			throw new ArrayIndexOutOfBoundsException("The index of the object array is bigger than the arraySize");
		}

		return null;
	}

}
