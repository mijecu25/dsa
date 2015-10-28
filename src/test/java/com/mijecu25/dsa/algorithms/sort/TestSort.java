package com.mijecu25.dsa.algorithms.sort;

import java.util.ArrayList;
import java.util.List;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/**
 * This is the Sort test class.
 * 
 * @author Miguel Velez - miguelvelezmj25
 * @version 0.1.3.4
 */
public class TestSort {
	private int[]          sortedArray = {1, 5, 8, 15};
	private int[]          reverseSortedArray = {21, 12, 11, 5, 1};
	private int[]          unsortedArray = {5, 2, 24, 8, 15};
	private String[]       sortedElements = {"a", "b", "c", "d", "e", "f"};
    private String[]       unsortedElements = {"a", "b", "c", "g", "e", "f"};
    private String[]       reverseSortedElements = {"z", "t", "m", "d", "a"};
    private List<String>   sortedList = new ArrayList<>();
    private List<String>   reverseSortedList = new ArrayList<>();
	
	@Before
	public void initialize() { 
        sortedList.add("a");
        sortedList.add("b");
        sortedList.add("c");
        sortedList.add("d");
        sortedList.add("e");
        sortedList.add("f");
        
        reverseSortedList.add("f");
        reverseSortedList.add("e");
        reverseSortedList.add("d");
        reverseSortedList.add("c");
        reverseSortedList.add("b");
        reverseSortedList.add("a");
    }
	
	/**
	 * Test isSorted.
	 */
	@Test
	public void testIsSorted() {
		// Assert that the sorted array is sorted
		Assert.assertTrue(Sort.isSorted(this.sortedArray));
		
		// Assert that the unsorted array is not sorted
		Assert.assertFalse(Sort.isSorted(this.unsortedArray));
	}
	
	/**
	 * Test isReveseSorted.
	 */
	@Test
	public void testIsReverseSorted() {
		// Assert that the reverse sorted array is reverse sorted
		Assert.assertTrue(Sort.isReverseSorted(this.reverseSortedArray));
		
		// Assert that the unsorted array is not reverse sorted
		Assert.assertFalse(Sort.isReverseSorted(this.sortedArray));
	}
	
	/**
	 * Test isSorted for elements
	 */
	@Test
	public void testIsSortedElements() {        
        // Assert that the array is sorted
        Assert.assertTrue(Sort.isSorted(this.sortedElements));
        
        // Assert that the unsorted array is not sorted
        Assert.assertFalse(Sort.isSorted(this.unsortedElements));  
	}
	
	/**
     * Test isReverseSorted for elements
     */
    @Test
    public void testIsReverseSortedElements() {        
        // Assert that the array is reverse sorted
        Assert.assertTrue(Sort.isReverseSorted(this.reverseSortedElements));
        
        // Assert that the unsorted array is not reverse sorted
        Assert.assertFalse(Sort.isReverseSorted(this.unsortedElements));  
    }
    
    /**
     * Test isSorted for list
     */
    @Test
    public void testIsSortedList() {          
        // Assert that the list is sorted
        Assert.assertTrue(Sort.isSorted(sortedList));
        
        // Add element to list to make it unsorted
        sortedList.add(1, "w");
        
        // Assert that the unsorted array is not sorted
        Assert.assertFalse(Sort.isSorted(sortedList));  
    }
    
    /**
     * Test isReverseSorted for list
     */
    @Test
    public void testIsReverseSortedList() {        
        // Assert that the array is reverse sorted
        Assert.assertTrue(Sort.isReverseSorted(this.reverseSortedList));
        
        // Add element to list to make it unsorted
        this.reverseSortedList.add(1, "w");
        
        // Assert that the sorted array is not reverse sorted
        Assert.assertFalse(Sort.isReverseSorted(this.reverseSortedList));  
    }
	
}
