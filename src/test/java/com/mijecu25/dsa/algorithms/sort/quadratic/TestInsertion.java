package com.mijecu25.dsa.algorithms.sort.quadratic;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import com.mijecu25.dsa.algorithms.sort.Sort;
import com.mijecu25.dsa.algorithms.sort.TestSort;

/**
 * This is the Insertion sort test class.
 * 
 * @author Miguel Velez - miguelvelezmj25
 * @version 0.2.0.2
 */
public class TestInsertion extends TestSort {
		
	@Before
	public void initialize() { 
	    super.initialize();
	}
	
	/**
	 * Test Insertion primitives
	 */
	@Test
	public void testInsertion() {
		Insertion.sort(this.intArray1);
		
		Assert.assertTrue(Sort.isSorted(this.intArray1));
	}
	/**
	 * Test descending Insertion primitives
	 */
	@Test
	public void testDescendingInsertion() {
		Insertion.sortDescending(this.intArray1);

		Assert.assertTrue(Sort.isReverseSorted(this.intArray1));
	}
	
	   /**
     * Test Insertion elements
     */
    @Test
    public void testInsertion2() {
        Insertion.sort(this.integerArray1);
        
        Assert.assertTrue(Sort.isSorted(this.integerArray1));
    }
    /**
     * Test descending Insertion elements
     */
    @Test
    public void testDescendingInsertion2() {
        Insertion.sortDescending(this.integerArray1);

        Assert.assertTrue(Sort.isReverseSorted(this.integerArray1));
    }
    
    /**
     * Test Insertion list
     */
    @Test
    public void testInsertion3() {
        Insertion.sort(this.list1);
        
        Assert.assertTrue(Sort.isSorted(this.list1));
    }
    /**
     * Test descending Insertion list
     */
    @Test
    public void testDescendingInsertion3() {
        Insertion.sortDescending(this.list1);

        Assert.assertTrue(Sort.isReverseSorted(this.list1));
    }
	    
}
