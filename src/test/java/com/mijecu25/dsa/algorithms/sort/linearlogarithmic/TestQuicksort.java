package com.mijecu25.dsa.algorithms.sort.linearlogarithmic;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import com.mijecu25.dsa.algorithms.sort.Sort;
import com.mijecu25.dsa.algorithms.sort.TestSort;

/**
 * This is the Quicksort test class.
 * 
 * @author Miguel Velez - miguelvelezmj25
 * @version 0.2.0.2
 */
public class TestQuicksort extends TestSort {
    
    @Before
    public void initialize() { 
        super.initialize();
    }
    
    /**
     * Test Quicksort for primitives
     */
    @Test
    public void testQuicksort1() {
        // Sort the array using Quicksort
        Quicksort.sort(this.intArray1);
        
        // Assert that the array is sorted
        Assert.assertTrue(Sort.isSorted(this.intArray1));
    }
    
    /**
     * Test Quicksort descending for primitives
     */
    @Test
    public void testQuicksortDescending1() {
        // Sort the array using Quicksort
        Quicksort.sortDescending(this.intArray1);
        
        // Assert that the array is sorted
        Assert.assertTrue(Sort.isReverseSorted(this.intArray1));
    }
    
    /**
     * Test Quicksort for elements
     */
    @Test
    public void testQuicksort2() {
        // Sort the array using Quicksort
        Quicksort.sort(this.integerArray1);
        
        // Assert that the array is sorted
        Assert.assertTrue(Sort.isSorted(this.integerArray1));
    }
    
    /**
     * Test Quicksort descending for elements
     */
    @Test
    public void testQuicksortDescending2() {
        // Sort the array using Quicksort
        Quicksort.sortDescending(this.integerArray1);
        
        // Assert that the array is sorted
        Assert.assertTrue(Sort.isReverseSorted(this.integerArray1));
    }  
    
    /**
     * Test Quicksort for list
     */
    @Test
    public void testQuicksort3() {
        // Sort the list using Quicksort
        Quicksort.sort(this.list1);
        
        // Assert that the list is sorted
        Assert.assertTrue(Sort.isSorted(this.list1));
    }
    
    /**
     * Test Quicksort descending for lists
     */
    @Test
    public void testQuicksortDescending3() {
        // Sort the list using Quicksort
        Quicksort.sortDescending(this.list1);
        
        // Assert that the list is sorted
        Assert.assertTrue(Sort.isReverseSorted(this.list1));
    }
    
}
