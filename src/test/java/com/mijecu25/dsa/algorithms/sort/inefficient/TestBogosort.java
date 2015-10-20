package com.mijecu25.dsa.algorithms.sort.inefficient;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import com.mijecu25.dsa.algorithms.sort.Sort;

/**
 * This is the Bogosort test class.
 * 
 * @author Miguel Velez
 * @version 0.1.3.4
 */
public class TestBogosort {
	
	private int[] unsortedList = {5, 2, 24, 8, 15};
	private double[] unsortedList2 = {5.2, 2.4, 24.2, 8.1, 15.5, 8.2};
	
	@Before
	public void initialize() { ; }
	
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
	
	/**
     * Test Bogosort of doubles, floats, and elements
     */
    @Test
    public void testBogosort2() {
        // Sort the list using bogosort
        Bogosort.sort(this.unsortedList2);
        
        // Assert that the list is sorted
        Assert.assertTrue(Sort.isSorted(this.unsortedList2));
    }

    /**
     * Test descending Bogosort of doubles, floats, and elements
     */
    @Test
    public void testDescendingBogosort2() {
        // Sort the list using bogosort
        Bogosort.sortDescending(this.unsortedList2);

        // Assert that the list is sorted in descending order
        Assert.assertTrue(Sort.isReverseSorted(this.unsortedList2));
    }
}
