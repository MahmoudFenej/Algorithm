package com.mahmoud.client;

import com.mahmoud.model.AbstractSortingAlgo;
import com.mahmoud.sortingalgorithm.InsertionSort;
import com.mahmoud.sortingalgorithm.SelectionSort;

public class MainApplicationContext {
	public static void main(String[] args) {

		AbstractSortingAlgo selectionSort = new SelectionSort();
		AbstractSortingAlgo insertionSort = new InsertionSort();
		AbstractSortingAlgo bubbleSort = new InsertionSort();

		testSorting(selectionSort);
		testSorting(insertionSort);
		testSorting(bubbleSort);

	}

	private static void testSorting(AbstractSortingAlgo selectionSort) {
		doSort(selectionSort, 100);
		doSort(selectionSort, 1000);
		doSort(selectionSort, 5000);
		doSort(selectionSort, 10000);
		doSort(selectionSort, 50000);
		doSort(selectionSort, 100000);
		doSort(selectionSort, 500000);
		doSort(selectionSort, 1000000);
		doSort(selectionSort, 5000000);
		doSort(selectionSort, 10000000);
		doSort(selectionSort, 50000000);
		doSort(selectionSort, 100000000);
	}

	private static void doSort(AbstractSortingAlgo sortingAlgo, int arraySize) {
		sortingAlgo.setArraySize(arraySize);
		sortingAlgo.sort();
	}

}
