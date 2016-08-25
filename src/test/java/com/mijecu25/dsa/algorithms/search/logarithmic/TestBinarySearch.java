package com.mijecu25.dsa.algorithms.search.logarithmic;

import com.mijecu25.dsa.algorithms.search.TestSearch;
import com.mijecu25.dsa.algorithms.sort.quadratic.Insertion;

import org.junit.Before;
import org.junit.Test;
import org.junit.Assert;

/**
 * Test for BinarySearch class.
 * 
 * @author Miguel Velez - miguelvelezmj25
 * @version 0.2.0.2
 */
public class TestBinarySearch extends TestSearch {
    @Before
    public void initialize() { 
        super.initialize();
    }
    
    /**
     * Test search for elements.
     */
    @Test
    public void search1() {
        Insertion.sort(this.integerArray1);
        
        int index = BinarySearch.search(this.integerArray1, 2);
        Assert.assertTrue(index >= 0);
        
        index = BinarySearch.search(this.integerArray1, 75);
        Assert.assertTrue(index < 0);
    }
    
    /**
     * Test search for primitives
     */
    @Test
    public void search2() {
        Insertion.sort(this.intArray1);
        
        int index = BinarySearch.search(this.intArray1, 8);
        Assert.assertTrue(index >= 0);
        
        index = BinarySearch.search(this.intArray1, 75);
        Assert.assertTrue(index < 0);
    }
    
    /**
     * Test search for list1s
     */
    @Test
    public void search3() {
        Insertion.sort(this.list1);
        
        int index = BinarySearch.search(this.list1, 9);
        Assert.assertTrue(index >= 0);
        
        index = BinarySearch.search(this.list1, 75);
        Assert.assertTrue(index < 0);
    }
    
    /**
     * Test reverse search for elements.
     */
    @Test
    public void search4() {
        Insertion.sortDescending(this.integerArray1);
        
        int index = BinarySearch.searchDescending(this.integerArray1, 2);
        Assert.assertTrue(index >= 0);
        
        index = BinarySearch.search(this.integerArray1, 75);
        Assert.assertTrue(index < 0);
    }
    
    /**
     * Test reverse search for primitives
     */
    @Test
    public void search5() {
        Insertion.sortDescending(this.intArray1);
        
        int index = BinarySearch.searchDescending(this.intArray1, 8);
        Assert.assertTrue(index >= 0);
        
        index = BinarySearch.search(this.intArray1, 75);
        Assert.assertTrue(index < 0);
    }
    
    /**
     * Test reverse search for list1s
     */
    @Test
    public void search6() {
        Insertion.sortDescending(this.list1);
        
        int index = BinarySearch.searchDescending(this.list1, 9);
        Assert.assertTrue(index >= 0);
        
        index = BinarySearch.search(this.list1, 75);
        Assert.assertTrue(index < 0);
    }
}
