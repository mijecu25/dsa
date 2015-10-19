package com.mijecu25.dsa.algorithms.sort.inefficient;

import com.mijecu25.dsa.algorithms.sort.Sort;

/**
 * Ineffective recursive sorting algorithm based on swapping the
 * start and end of a list and then repeating the same process on
 * smaller segments of the list. 
 * 
 * <br>
 * <br>
 * 
 * The algorithms consists of the following:
 * <br>
 * If the value at the end is smaller than the value at the start, swap them.
 * <br>
 * If there are 3 or more elements in the list, then:
 * <br>
 * &nbsp; Stooge sort the initial 2/3 of the list
 * <br>
 * &nbsp; Stooge sort the final 2/3 of the list
 * <br>
 * &nbsp; Stooge sort the initial 2/3 of the list again
 * <br>
 * else: exit the procedure
 * 
 * <br>
 * <br>
 * 
 * <i>Worst case performance: </i> O(n<sup>log 3/log 1.5</sup>)
 * 
 * @author Miguel Velez
 * @version 0.1.3.1
 */
public final class Stooge extends Sort {

	/**
	 * Don't let anyone instantiate this class
	 */
	private Stooge() {
		;
	}

	/**
	 * Sort the int array using this algorithm.
	 * 
	 * @param intArray the array of ints that we want to sort
	 */
	public static void sort(int[] intArray) {
		// If the value of the end is less than the value of the start
		if(intArray[0] > intArray[intArray.length]) {
			// swap the values
		}
	}
	
}
