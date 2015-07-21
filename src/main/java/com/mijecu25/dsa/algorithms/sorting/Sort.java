package com.mijecu25.dsa.algorithms.sorting;

/**
 * Sort class that implements different algorithms and utilities
 * for sorting.
 * 
 * @author Miguel Velez
 * @version 0.1.2.3
 */
public final class Sort {
	
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
