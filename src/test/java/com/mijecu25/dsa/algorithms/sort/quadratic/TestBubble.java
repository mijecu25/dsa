package com.mijecu25.dsa.algorithms.sort.quadratic;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import com.mijecu25.dsa.algorithms.sort.Sort;
import com.mijecu25.dsa.algorithms.sort.TestSort;

/**
 * This is the Bubble sort test class.
 * 
 * @author Miguel Velez - miguelvelezmj25
 * @version 0.2.0.2
 */
public class TestBubble extends TestSort {

    @Before
    public void initialize() { 
        super.initialize();
    }
    
    /**
     * Test Bubble primitives
     */
    @Test
    public void testBubble() {
        // Sort the array using bubble
        Bubble.sort(this.intArray1);
        
        // Assert that the array is sorted
        Assert.assertTrue(Sort.isSorted(this.intArray1));
    }

    /**
     * Test descending Bubble primitives
     */
    @Test
    public void testDescendingBubble() {
        // Sort the array using bubble
        Bubble.sortDescending(this.intArray1);

        // Assert that the array is sorted in descending order
        Assert.assertTrue(Sort.isReverseSorted(this.intArray1));
    }
    
       /**
     * Test Bubble elements
     */
    @Test
    public void testBubble2() {
        // Sort the array using bubble
        Bubble.sort(this.integerArray1);
        
        // Assert that the array is sorted
        Assert.assertTrue(Sort.isSorted(this.integerArray1));
    }

    /**
     * Test descending Bubble elements
     */
    @Test
    public void testDescendingBubble2() {
        // Sort the array using bubble
        Bubble.sortDescending(this.integerArray1);

        // Assert that the array is sorted in descending order
        Assert.assertTrue(Sort.isReverseSorted(this.integerArray1));
    }
    
    /**
     * Test Bubble list
     */
    @Test
    public void testBubble3() {
        // Sort the array using bubble
        Bubble.sort(this.list1);
        
        // Assert that the array is sorted
        Assert.assertTrue(Sort.isSorted(this.list1));
    }

    /**
     * Test descending Bubble list
     */
    @Test
    public void testDescendingBubble3() {
        // Sort the array using bubble
        Bubble.sortDescending(this.list1);

        // Assert that the array is sorted in descending order
        Assert.assertTrue(Sort.isReverseSorted(this.list1));
    }
    
}