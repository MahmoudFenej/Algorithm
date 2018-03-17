package com.mahmoud.model;

import java.time.Duration;
import java.time.Instant;
import java.util.Random;

public abstract class AbstractSortingAlgo {
	private int arraySize = 0;

	public AbstractSortingAlgo() {
	}

	public int[] getRandomArray() {
		Random r = new Random();
		int[] array = new int[arraySize];
		for (int a = 0; a < array.length; a++) {
			if ((a + 1) % 10 != 0) {
				array[a] = (a + 1) * 10;
			} else {
				array[a] = r.nextInt(1000);
			}
		}
		return array;
	}

	public abstract void executeSort();
	public abstract SortingType getSortingType();

	public void sort() {
		Instant beforeSorting = Instant.now();
		executeSort();
		Instant afterSorting = Instant.now();
		Duration duration = Duration.between(beforeSorting, afterSorting);
		System.out.println(getSortingType() + " duration: " + duration.toMillis() + " for arraySize : " + arraySize);
	}

	public int getArraySize() {
		return arraySize;
	}

	public void setArraySize(int arraySize) {
		this.arraySize = arraySize;
	}

}
