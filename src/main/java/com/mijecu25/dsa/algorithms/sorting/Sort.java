package com.mijecu25.dsa.algorithms.sorting;

import com.mijecu25.dsa.algorithms.shuffling.Shuffle;

/**
 * Sort class that implements different algorithms and utilities
 * for sorting.
 * 
 * @author Miguel Velez
 * @version 0.1.2.4
 */
public final class Sort {
	
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
	public static void bogosort(int[] intArray) {
		// While the integer array is not sorted
		while(!Sort.isSorted(intArray)) {
			// Randomly shuffle the array using fyShuffle
			Shuffle.fyShuffle(intArray);
		}
	}
		
	/**
	 * Check if the integer array is sorted. It loops through the entire integer
	 * array once, checking that the elements are sorted.
	 * 
	 * <br>
	 * <br>
	 * 
	 * <i>Runtime: </i> O(n)
	 * 
	 * @param intArray the integer array to check
	 * @return <i>true</i> if the integer array is sorted, else <i>false</i>.
	 */
	public static boolean isSorted(int[] intArray) {
		// Loop through all the elements in the list
		for(int i = 0; i < intArray.length - 1; i++) {
			
			// If the current element is greater than the next element		
			if(intArray[i] > intArray [i + 1]) {
				// The list is not sorted
				return false;
			}
			
		}
		
		// If we loop through the entire list without returning, it means
		// that the list is sorted
		return true;
	}
	
	/**
	 * Check if the integer array is reverse sorted. It loops through the entire integer
	 * array once, checking that the elements are reverse sorted.
	 * 
	 * <br>
	 * <br>
	 * 
	 * <i>Runtime: </i> O(n)
	 * 
	 * @param intArray the integer array to check
	 * @return <i>true</i> if the integer array is reverse sorted, else <i>false</i>.
	 */
	public static boolean isReverseSorted(int[] intArray) {
		// Loop through all the elements in the list
		
		for(int i = 0; i < intArray.length - 1; i++) {
			// If the current element is greater than the next element		
			if(intArray[i] < intArray [i + 1]) {
				// The list is not reverse sorted
				return false;
			}
			
		}
		
		// If we loop through the entire list without returning, it means
		// that the list is sorted
		return true;
	}

}
