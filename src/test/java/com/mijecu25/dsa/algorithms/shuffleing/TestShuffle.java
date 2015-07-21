package com.mijecu25.dsa.algorithms.shuffleing;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import com.mijecu25.dsa.algorithms.sorting.Sort;

/**
 * This is the Shuffle test class.
 * 
 * @author Miguel Velez
 * @version 0.1.2.1
 */
public class TestShuffle {
	private int[] sortedList = {1, 5, 8, 15};
	
	@Before
	public void initialize() {
		;
	}	
	
	/**
	 * Test fy shuffle
	 */
	@Test 
	public void testFYShuffle() {
		// Create a new array
		int[] random = new int[this.sortedList.length];
		
		// Make a copy of the sorted array to avoid pointing to the same memory reference
		System.arraycopy(this.sortedList, 0, random, 0, this.sortedList.length);
				
		// Shuffle the new array
		Shuffle.fyShuffle(random);
		
		// Assert that the sorted list is sorted
		Assert.assertTrue(Sort.isSorted(this.sortedList));
		
		// Assert that the random list is not sorted
		// NOTE that it might be sorted. Just run again
		Assert.assertFalse(Sort.isSorted(random));		
	}

}
