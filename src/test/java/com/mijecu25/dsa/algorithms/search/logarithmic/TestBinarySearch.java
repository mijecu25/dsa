package com.mijecu25.dsa.algorithms.search.logarithmic;

import org.junit.Before;
import org.junit.Test;

import com.mijecu25.dsa.algorithms.search.TestSearch;
import com.mijecu25.dsa.algorithms.sort.quadratic.Insertion;

import org.junit.Assert;

/**
 * Test for BinarySearch class.
 * 
 * @author Miguel Velez - miguelvelezmj25
 * @version 0.1.3.4
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
        // Sort the array
        Insertion.sort(this.integerArray);
        
        // Search for a value in the array
        int index = BinarySearch.search(this.integerArray, 2);
        // Assert that the value was found
        Assert.assertTrue(index >= 0);
        
        // Search for a value that is not in the array
        index = BinarySearch.search(this.integerArray, 75);
        // Assert that the value was not found
        Assert.assertTrue(index < 0);
    }
    
    /**
     * Test search for primitives
     */
    @Test
    public void search2() {
        // Sort the array
        Insertion.sort(this.intArray);
        
        // Search for a value in the array
        int index = BinarySearch.search(this.intArray, 8);
        // Assert that the value was found
        Assert.assertTrue(index >= 0);
        
        // Search for a value that is not in the array
        index = BinarySearch.search(this.intArray, 75);
        // Assert that the value was not found
        Assert.assertTrue(index < 0);
    }
    
    /**
     * Test search for lists
     */
    @Test
    public void search3() {
        // Sort the array
        Insertion.sort(this.list);
        
        // Search for a value in the list
        int index = BinarySearch.search(this.list, 9);
        // Assert that the value was found
        Assert.assertTrue(index >= 0);
        
        // Search for a value that is not in the list
        index = BinarySearch.search(this.list, 75);
        // Assert that the value was not found
        Assert.assertTrue(index < 0);
    }
    
    /**
     * Test reverse search for elements.
     */
    @Test
    public void search4() {
        // Sort the array
        Insertion.sortDescending(this.integerArray);
        
        // Search for a value in the array
        int index = BinarySearch.searchDescending(this.integerArray, 2);
        // Assert that the value was found
        Assert.assertTrue(index >= 0);
        
        // Search for a value that is not in the array
        index = BinarySearch.search(this.integerArray, 75);
        // Assert that the value was not found
        Assert.assertTrue(index < 0);
    }
    
    /**
     * Test reverse search for primitives
     */
    @Test
    public void search5() {
        // Sort the array
        Insertion.sortDescending(this.intArray);
        
        // Search for a value in the array
        int index = BinarySearch.searchDescending(this.intArray, 8);
        // Assert that the value was found
        Assert.assertTrue(index >= 0);
        
        // Search for a value that is not in the array
        index = BinarySearch.search(this.intArray, 75);
        // Assert that the value was not found
        Assert.assertTrue(index < 0);
    }
    
    /**
     * Test reverse search for lists
     */
    @Test
    public void search6() {
        // Sort the array
        Insertion.sortDescending(this.list);
        
        // Search for a value in the list
        int index = BinarySearch.searchDescending(this.list, 9);
        // Assert that the value was found
        Assert.assertTrue(index >= 0);
        
        // Search for a value that is not in the list
        index = BinarySearch.search(this.list, 75);
        // Assert that the value was not found
        Assert.assertTrue(index < 0);
    }

}
