package com.mijecu25.dsa.algorithms.sort.linearlogarithmic;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import com.mijecu25.dsa.algorithms.sort.Sort;
import com.mijecu25.dsa.algorithms.sort.TestSort;

/**
 * This is the Merge sort test class.
 * 
 * @author Miguel Velez - miguelvelezmj25
 * @version 0.1.3.1
 */
public class TestMerge extends TestSort {

    @Before
    public void initialize() { 
        super.initialize();
    }
    
    /**
     * Test Merge for primitives
     */
    @Test
    public void testMerge() {
        // Sort the array using Merge
        Merge.sort(this.intArray1);
        
        // Assert that the array is sorted
        Assert.assertTrue(Sort.isSorted(this.intArray1));
    }
    
    /**
     * Test Merge descending for primitives
     */
    @Test
    public void testMergeDescending() {
        // Sort the array using Merge
        Merge.sortDescending(this.intArray1);
        
        // Assert that the array is sorted
        Assert.assertTrue(Sort.isReverseSorted(this.intArray1));
    }
    
}
