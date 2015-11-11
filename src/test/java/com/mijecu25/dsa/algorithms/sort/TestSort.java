package com.mijecu25.dsa.algorithms.sort;

import java.util.ArrayList;
import java.util.List;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import com.mijecu25.dsa.algorithms.TestAlgorithms;

/**
 * This is the Sort test class.
 * 
 * @author Miguel Velez - miguelvelezmj25
 * @version 0.2.0.2
 */
public class TestSort extends TestAlgorithms {
	private int[]          sortedIntArray = {1, 5, 8, 15};
	private int[]          reverseSortedIntArray = {21, 12, 11, 5, 1};
	private String[]       sortedElements = {"a", "b", "c", "d", "e", "f"};
    private String[]       reverseSortedElements = {"z", "t", "m", "d", "a"};
    private List<String>   sortedList = new ArrayList<>();
    private List<String>   reverseSortedList = new ArrayList<>();
	
	@Before
	public void initialize() { 
	    super.initialize();
	    
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
		Assert.assertTrue(Sort.isSorted(this.sortedIntArray));
		
		// Assert that the unsorted array is not sorted
		Assert.assertFalse(Sort.isSorted(this.intArray1));
	}
	
	/**
	 * Test isReveseSorted.
	 */
	@Test
	public void testIsReverseSorted() {
		// Assert that the reverse sorted array is reverse sorted
		Assert.assertTrue(Sort.isReverseSorted(this.reverseSortedIntArray));
		
		// Assert that the unsorted array is not reverse sorted
		Assert.assertFalse(Sort.isReverseSorted(this.sortedIntArray));
	}
	
	/**
	 * Test isSorted for elements
	 */
	@Test
	public void testIsSortedElements() {        
        // Assert that the array is sorted
        Assert.assertTrue(Sort.isSorted(this.sortedElements));
        
        // Assert that the unsorted array is not sorted
        Assert.assertFalse(Sort.isSorted(this.integerArray1));  
	}
	
	/**
     * Test isReverseSorted for elements
     */
    @Test
    public void testIsReverseSortedElements() {        
        // Assert that the array is reverse sorted
        Assert.assertTrue(Sort.isReverseSorted(this.reverseSortedElements));
        
        // Assert that the unsorted array is not reverse sorted
        Assert.assertFalse(Sort.isReverseSorted(this.integerArray1));  
    }
    
    /**
     * Test isSorted for list
     */
    @Test
    public void testIsSortedList() {          
        // Assert that the list is sorted
        Assert.assertTrue(Sort.isSorted(this.sortedList));
        
        // Add element to list to make it unsorted
        this.sortedList.add(1, "w");
        
        // Assert that the unsorted array is not sorted
        Assert.assertFalse(Sort.isSorted(this.sortedList));  
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
