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
 * @version 0.2.0.2
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
        Merge.sort(this.intArray1);
        
        Assert.assertTrue(Sort.isSorted(this.intArray1));
    }
    
    /**
     * Test Merge descending for primitives
     */
    @Test
    public void testMergeDescending() {
        Merge.sortDescending(this.intArray1);
        
        Assert.assertTrue(Sort.isReverseSorted(this.intArray1));
    }
    
    /**
     * Test Merge for elements
     */
    @Test
    public void testMerge2() {
        Merge.sort(this.integerArray1);
        
        Assert.assertTrue(Sort.isSorted(this.integerArray1));
    }
    
    /**
     * Test Merge descending for elements
     */
    @Test
    public void testMergeDescending2() {
        Merge.sortDescending(this.integerArray1);
        
        Assert.assertTrue(Sort.isReverseSorted(this.integerArray1));
    }  
    
    /**
     * Test Merge for list
     */
    @Test
    public void testMerge3() {
        Merge.sort(this.list1);
        
        Assert.assertTrue(Sort.isSorted(this.list1));
    }
    
    /**
     * Test Merge descending for lists
     */
    @Test
    public void testMergeDescending3() {
        Merge.sortDescending(this.list1);
        
        Assert.assertTrue(Sort.isReverseSorted(this.list1));
    }
    
    
}
