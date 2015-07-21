package com.mijecu25.dsa.algorithms.sorting;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/**
 * This is the Sort test class.
 * 
 * @author Miguel Velez
 * @version 0.1.2.1
 */
public class TestSort {
	private int[] sortedList = {1, 5, 8, 15};
	private int[] unsortedList = {5, 2, 24, 8, 15};
	
	@Before
	public void initialize() {
		;
	}
	
	/**
	 * Test isSorted.
	 */
	@Test
	public void testIsSorted() {
		// Assert that the sorted list is sorted
		Assert.assertTrue(Sort.isOrdered(this.sortedList));
		
		// Assert that the unsorted list is not sorted
		Assert.assertFalse(Sort.isOrdered(this.unsortedList));
	}

}
