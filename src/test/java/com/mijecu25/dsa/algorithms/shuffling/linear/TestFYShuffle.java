package com.mijecu25.dsa.algorithms.shuffling.linear;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import com.mijecu25.dsa.algorithms.shuffling.linear.FYShuffle;
import com.mijecu25.dsa.algorithms.sorting.Sort;

/**
 * This is the FYShuffle test class.
 * 
 * @author Miguel Velez
 * @version 0.1.2.3
 */
public class TestFYShuffle {
	private int[] sortedList = {1, 5, 8, 15};
	
	@Before
	public void initialize() {
		;
	}	
	
	/**
	 * Test shuffle
	 */
	@Test 
	public void shuffle() {
		// Create a new array
		int[] random = new int[this.sortedList.length];
		
		// Make a copy of the sorted array to avoid pointing to the same memory reference
		System.arraycopy(this.sortedList, 0, random, 0, this.sortedList.length);
				
		// Shuffle the new array
		FYShuffle.shuffle(random);
		
		// Assert that the sorted list is sorted
		Assert.assertTrue(Sort.isSorted(this.sortedList));
		
		// Assert that the random list is not sorted
		// NOTE that it might be sorted. Just run again
		Assert.assertFalse(Sort.isSorted(random));		
	}

}
