package com.coderscampus.arraylist;

public class CustomArrayList<T> implements CustomList<T> {
	Object[] items = new Object[3];
	int arraySize = 0;
	Object[] newItems = new Object[arraySize * 2];

	@Override
	public boolean add(T item) {
		if (arraySize == items.length) {
			for (int i = 0; i < arraySize; i++) {
				newItems[i] = items[i];
				items = newItems;
			}
		}
			arraySize++;
			
		return true;
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
