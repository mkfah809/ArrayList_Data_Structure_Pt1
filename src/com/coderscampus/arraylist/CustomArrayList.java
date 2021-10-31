package com.coderscampus.arraylist;

public class CustomArrayList<T> implements CustomList<T> {
	Object[] items = new Object[10];

	@Override
	public boolean add(T item) {
		int arraySize = 0;
		if (arraySize == items.length) {
			for (int i = 0; i < arraySize; i++) {
				Object[] newItems = new Object[10];
				newItems[i] = items[i];
			}
			return true;
		}
		return false;
	}

	@Override
	public int getSize() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public T get(int index) {
		// TODO Auto-generated method stub
		return null;
	}

}
