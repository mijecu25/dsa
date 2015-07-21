package com.mijecu25.dsa.algorithms.sorting.inefficient;

import com.mijecu25.dsa.algorithms.shuffling.linear.FYShuffle;
import com.mijecu25.dsa.algorithms.sorting.Sort;

/**
 * Sort class that implements different algorithms and utilities
 * for sorting.
 * 
 * @author Miguel Velez
 * @version 0.1.2.5
 */
public final class Bogosort {
	
	/**
	 * Don't let anyone instantiate this class
	 */
	private Bogosort() {
		;
	}
	
	/**
	 * Ineffective sorting algorithm based on the generate and test paradigm. Keep
	 * shuffling the list until it is sorted.
	 * 
	 * <br>
	 * <br>
	 * 
	 * <i>Worst case performance: </i> Unbounded
	 * <br>
	 * <i>Best case performance: </i> O(n)
	 * <br>
	 * <i>Average case performance: </i> O((n+1)!) 
	 * 
	 * @param intArray the array of ints that we want to sort
	 */
	public static void sort(int[] intArray) {
		// While the integer array is not sorted
		while(!Sort.isSorted(intArray)) {
			// Randomly shuffle the array using fyShuffle
			FYShuffle.shuffle(intArray);
		}
	}
		
}
