package com.mahmoud.sortingalgorithm;

import com.mahmoud.model.AbstractSortingAlgo;
import com.mahmoud.model.SortingType;

public class SelectionSort extends AbstractSortingAlgo {

	public SelectionSort() {
	}

	@Override
	public void executeSort() {
		int[] array = getRandomArray();

		// One by one move boundary of unsorted subarray
		for (int i = 0; i < array.length - 1; i++) {
			// Find the minimum element in unsorted array
			int min = i;
			for (int j = i + 1; j < array.length; j++)
				if (array[j] < array[min])
					min = j;

			// Swap the found minimum element with the first // element
			int temp = array[min];
			array[min] = array[i];
			array[i] = temp;
		}
	}

	@Override
	public SortingType getSortingType() {
		return SortingType.SelectionSort;
	}
}
