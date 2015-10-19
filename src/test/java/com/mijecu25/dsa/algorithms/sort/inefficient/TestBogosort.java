package com.mijecu25.dsa.algorithms.sort.inefficient;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import com.mijecu25.dsa.algorithms.sort.Sort;
import com.mijecu25.dsa.algorithms.sort.inefficient.Bogosort;

/**
 * This is the Bogosort test class.
 * 
 * @author Miguel Velez
 * @version 0.1.3.2
 */
public class TestBogosort {
	
	private int[] unsortedList = {5, 2, 24, 8, 15};
	
	@Before
	public void initialize() {
		;
	}
	
	/**
	 * Test Bogosort
	 */
	@Test
	public void testBogosort() {
		// Sort the list using bogosort
		Bogosort.sort(this.unsortedList);
		
		// Assert that the list is sorted
		Assert.assertTrue(Sort.isSorted(this.unsortedList));
	}

	/**
	 * Test descending Bogosort
	 */
	@Test
	public void testDescendingBogosort() {
		// Sort the list using bogosort
		Bogosort.sortDescending(this.unsortedList);

		// Assert that the list is sorted in descending order
		Assert.assertTrue(Sort.isReverseSorted(this.unsortedList));
	}
}
