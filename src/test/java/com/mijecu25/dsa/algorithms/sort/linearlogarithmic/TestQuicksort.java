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
 * @version 0.1.3.1
 */
public class TestQuicksort extends TestSort {
    
    @Before
    public void initialize() { 
        super.initialize();
    }
    
    /**
     * Test Merge for primitives
     */
    @Test
    public void testQuicksort1() {
        // Sort the array using Quicksort
        Quicksort.sort(this.intArray1);
        
        // Assert that the array is sorted
        Assert.assertTrue(Sort.isSorted(this.intArray1));
    }
    
    /**
     * Test Merge descending for primitives
     */
    @Test
    public void testQuicksortDescending1() {
        // Sort the array using Quicksort
        Quicksort.sortDescending(this.intArray1);
        
        // Assert that the array is sorted
        Assert.assertTrue(Sort.isReverseSorted(this.intArray1));
    }
}
