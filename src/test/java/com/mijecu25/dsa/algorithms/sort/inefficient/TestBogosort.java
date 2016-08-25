package com.mijecu25.dsa.algorithms.sort.inefficient;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import com.mijecu25.dsa.algorithms.sort.Sort;
import com.mijecu25.dsa.algorithms.sort.TestSort;
/**
 * This is the Bogosort test class.
 * 
 * @author Miguel Velez - miguelvelezmj25
 * @version 0.2.0.2
 */
public class TestBogosort extends TestSort {
		
	@Before
	public void initialize() { 
	    super.initialize(); 
    }
	
	/**
     * Test Bogosort primitives
     */
    @Test
    public void testBogosort() {
        Bogosort.sort(this.intArray1);
        
        Assert.assertTrue(Sort.isSorted(this.intArray1));
    }
    /**
     * Test descending Bogosort primitives
     */
    @Test
    public void testDescendingBogosort() {
        Bogosort.sortDescending(this.intArray1);

        Assert.assertTrue(Sort.isReverseSorted(this.intArray1));
    }
    
    /**
     * Test Bogosort elements
     */
    @Test
    public void testBogosort2() {
        Bogosort.sort(this.integerArray1);
        
        Assert.assertTrue(Sort.isSorted(this.integerArray1));
    }
    /**
     * Test descending Bogosort elements
     */
    @Test
    public void testDescendingBogosort2() {
        Bogosort.sortDescending(this.integerArray1);

        Assert.assertTrue(Sort.isReverseSorted(this.integerArray1));
    }
    
    /**
     * Test Bogosort list
     */
    @Test
    public void testBogosort3() {
        Bogosort.sort(this.list1);
        
        Assert.assertTrue(Sort.isSorted(this.list1));
    }
    /**
     * Test descending Bogosort list
     */
    @Test
    public void testDescendingBogosort3() {
        Bogosort.sortDescending(this.list1);

        Assert.assertTrue(Sort.isReverseSorted(this.list1));
    }
    	    
}
