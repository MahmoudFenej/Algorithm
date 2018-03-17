package com.mahmoud.sortingalgorithm;

import com.mahmoud.model.AbstractSortingAlgo;
import com.mahmoud.model.SortingType;

public class BubbleSort extends AbstractSortingAlgo {

	public BubbleSort() {
	}

	@Override
	public void executeSort() {
		int[] array = getRandomArray();

		for (int i = 0; i < array.length - 1; i++)
			for (int j = 0; j < array.length - i - 1; j++)

				if (array[j] > array[j + 1]) {
					// swap temp and array[i]
					int temp = array[j];

					array[j] = array[j + 1];

					array[j + 1] = temp;
				}
	}

	@Override
	public SortingType getSortingType() {
		return SortingType.BubbleSort;
	}
}
