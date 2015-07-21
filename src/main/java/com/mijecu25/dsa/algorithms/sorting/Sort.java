package com.mijecu25.dsa.algorithms.sorting;

/**
 * Sort class that implements different algorithms and utilities
 * for sorting.
 * 
 * @author Miguel Velez
 * @version 0.1.2.1
 */
public final class Sort {
	
	/**
	 * Check if the integer array is sorted. It loops through the entire integer
	 * array once, checking that the elements are ordered.
	 * 
	 * <br>
	 * <br>
	 * 
	 * <i>Runtime: </i> O(n)
	 * 
	 * @param intArray the integer array to check
	 * @return <i>true</i> if the integer array is sorted, else <i>false</i>.
	 */
	public static boolean isOrdered(int[] intArray) {
		// Loop through all the elements in the list
		for(int i = 0; i < intArray.length - 1; i++) {
			// If the current element is greater than the next element		
			if(intArray[i] > intArray [i + 1]) {
				// The list is not ordered
				return false;
			}
			
		}
		
		// If we loop through the entire list without returning, it means
		// that the list is ordered
		return true;
	}

}
