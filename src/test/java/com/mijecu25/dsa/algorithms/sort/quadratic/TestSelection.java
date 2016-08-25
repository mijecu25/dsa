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
 * @version 0.2.0.2
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
        Selection.sort(this.intArray1);
        
        Assert.assertTrue(Sort.isSorted(this.intArray1));
    }
    /**
     * Test descending Selection primitives
     */
    @Test
    public void testDescendingSelection() {
        Selection.sortDescending(this.intArray1);

        Assert.assertTrue(Sort.isReverseSorted(this.intArray1));
    }
    
       /**
     * Test Selection elements
     */
    @Test
    public void testSelection2() {
        Selection.sort(this.integerArray1);
        
        Assert.assertTrue(Sort.isSorted(this.integerArray1));
    }
    /**
     * Test descending Selection elements
     */
    @Test
    public void testDescendingSelection2() {
        Selection.sortDescending(this.integerArray1);

        Assert.assertTrue(Sort.isReverseSorted(this.integerArray1));
    }
    
    /**
     * Test Selection list
     */
    @Test
    public void testSelection3() {
        Selection.sort(this.list1);
        
        Assert.assertTrue(Sort.isSorted(this.list1));
    }
    /**
     * Test descending Selection list
     */
    @Test
    public void testDescendingSelection3() {
        Selection.sortDescending(this.list1);

        Assert.assertTrue(Sort.isReverseSorted(this.list1));
    }
    
}
