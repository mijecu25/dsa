package com.mijecu25.dsa.algorithms.sort.quadratic;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import com.mijecu25.dsa.algorithms.sort.Sort;

/**
 * This is the Insertion sort test class.
 * 
 * @author Miguel Velez - miguelvelezmj25
 * @version 0.1.3.6
 */
public class TestInsertion {
	
	private int[] unsortedArray = {5, 2, 24, 8, 15};
	
	@Before
	public void initialize() { ; }
	
	/**
	 * Test Insertion
	 */
	@Test
	public void testInsertion() {
		// Sort the array using insertion
		Insertion.sort(this.unsortedArray);
		
		// Assert that the array is sorted
		Assert.assertTrue(Sort.isSorted(this.unsortedArray));
	}

	/**
	 * Test descending Insertion
	 */
	@Test
	public void testDescendingInsertion() {
		// Sort the array using insertion
		Insertion.sortDescending(this.unsortedArray);

		// Assert that the array is sorted in descending order
		Assert.assertTrue(Sort.isReverseSorted(this.unsortedArray));
	}
	    
}
