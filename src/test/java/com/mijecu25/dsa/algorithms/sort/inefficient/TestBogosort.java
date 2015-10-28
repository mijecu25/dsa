package com.mijecu25.dsa.algorithms.sort.inefficient;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import com.mijecu25.dsa.algorithms.sort.Sort;

/**
 * This is the Bogosort test class.
 * 
 * @author Miguel Velez - miguelvelezmj25
 * @version 0.1.3.6
 */
public class TestBogosort {
	
	private int[]      unsortedArray = {5, 2, 24, 8, 15};
	
	@Before
	public void initialize() { ; }
	
	/**
	 * Test Bogosort
	 */
	@Test
	public void testBogosort() {
		// Sort the array using bogosort
		Bogosort.sort(this.unsortedArray);
		
		// Assert that the array is sorted
		Assert.assertTrue(Sort.isSorted(this.unsortedArray));
	}

	/**
	 * Test descending Bogosort
	 */
	@Test
	public void testDescendingBogosort() {
		// Sort the array using bogosort
		Bogosort.sortDescending(this.unsortedArray);

		// Assert that the array is sorted in descending order
		Assert.assertTrue(Sort.isReverseSorted(this.unsortedArray));
	}
	    
}
