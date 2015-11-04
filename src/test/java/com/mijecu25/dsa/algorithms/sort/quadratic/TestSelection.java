package com.mijecu25.dsa.algorithms.sort.quadratic;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import com.mijecu25.dsa.algorithms.sort.Sort;
import com.mijecu25.dsa.algorithms.sort.TestSort;

/**
 * This is the Selection sort test class.
 * 
 * @author Miguel Velez - miguelvelezmj25
 * @version 0.1.3.1
 */
public class TestSelection extends TestSort {

    @Before
    public void initialize() { 
        super.initialize();
    }
    
    /**
     * Test Selection primitives
     */
    @Test
    public void testSelection() {
        // Sort the array using selection
        Selection.sort(this.intArray1);
        
        // Assert that the array is sorted
        Assert.assertTrue(Sort.isSorted(this.intArray1));
    }

    /**
     * Test descending Selection primitives
     */
    @Test
    public void testDescendingSelection() {
        // Sort the array using selection
        Selection.sortDescending(this.intArray1);

        // Assert that the array is sorted in descending order
        Assert.assertTrue(Sort.isReverseSorted(this.intArray1));
    }
    
       /**
     * Test Selection elements
     */
    @Test
    public void testSelection2() {
        // Sort the array using selection
        Selection.sort(this.integerArray1);
        
        // Assert that the array is sorted
        Assert.assertTrue(Sort.isSorted(this.integerArray1));
    }

    /**
     * Test descending Selection elements
     */
    @Test
    public void testDescendingSelection2() {
        // Sort the array using selection
        Selection.sortDescending(this.integerArray1);

        // Assert that the array is sorted in descending order
        Assert.assertTrue(Sort.isReverseSorted(this.integerArray1));
    }
    
    /**
     * Test Selection list
     */
    @Test
    public void testSelection3() {
        // Sort the array using selection
        Selection.sort(this.list1);
        
        // Assert that the array is sorted
        Assert.assertTrue(Sort.isSorted(this.list1));
    }

    /**
     * Test descending Selection list
     */
    @Test
    public void testDescendingSelection3() {
        // Sort the array using selection
        Selection.sortDescending(this.list1);

        // Assert that the array is sorted in descending order
        Assert.assertTrue(Sort.isReverseSorted(this.list1));
    }
    
}
