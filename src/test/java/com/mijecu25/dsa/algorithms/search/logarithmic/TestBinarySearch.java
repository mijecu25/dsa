package com.mijecu25.dsa.algorithms.search.logarithmic;

import org.junit.Before;
import org.junit.Test;

import com.mijecu25.dsa.algorithms.search.TestSearch;
import com.mijecu25.dsa.algorithms.sort.quadratic.Insertion;

import org.junit.Assert;

/**
 * Test for BinarySearch class.
 * 
 * @author Miguel Velez miguelvelezmj25
 * @version 0.2.0.1
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
        Insertion.sort(this.integerArray1);
        
        // Search for a value in the array
        int index = BinarySearch.search(this.integerArray1, 2);
        // Assert that the value was found
        Assert.assertTrue(index >= 0);
        
        // Search for a value that is not in the array
        index = BinarySearch.search(this.integerArray1, 75);
        // Assert that the value was not found
        Assert.assertTrue(index < 0);
    }
    
    /**
     * Test search for primitives
     */
    @Test
    public void search2() {
        // Sort the array
        Insertion.sort(this.intArray1);
        
        // Search for a value in the array
        int index = BinarySearch.search(this.intArray1, 8);
        // Assert that the value was found
        Assert.assertTrue(index >= 0);
        
        // Search for a value that is not in the array
        index = BinarySearch.search(this.intArray1, 75);
        // Assert that the value was not found
        Assert.assertTrue(index < 0);
    }
    
    /**
     * Test search for list1s
     */
    @Test
    public void search3() {
        // Sort the array
        Insertion.sort(this.list1);
        
        // Search for a value in the list1
        int index = BinarySearch.search(this.list1, 9);
        // Assert that the value was found
        Assert.assertTrue(index >= 0);
        
        // Search for a value that is not in the list1
        index = BinarySearch.search(this.list1, 75);
        // Assert that the value was not found
        Assert.assertTrue(index < 0);
    }
    
    /**
     * Test reverse search for elements.
     */
    @Test
    public void search4() {
        // Sort the array
        Insertion.sortDescending(this.integerArray1);
        
        // Search for a value in the array
        int index = BinarySearch.searchDescending(this.integerArray1, 2);
        // Assert that the value was found
        Assert.assertTrue(index >= 0);
        
        // Search for a value that is not in the array
        index = BinarySearch.search(this.integerArray1, 75);
        // Assert that the value was not found
        Assert.assertTrue(index < 0);
    }
    
    /**
     * Test reverse search for primitives
     */
    @Test
    public void search5() {
        // Sort the array
        Insertion.sortDescending(this.intArray1);
        
        // Search for a value in the array
        int index = BinarySearch.searchDescending(this.intArray1, 8);
        // Assert that the value was found
        Assert.assertTrue(index >= 0);
        
        // Search for a value that is not in the array
        index = BinarySearch.search(this.intArray1, 75);
        // Assert that the value was not found
        Assert.assertTrue(index < 0);
    }
    
    /**
     * Test reverse search for list1s
     */
    @Test
    public void search6() {
        // Sort the array
        Insertion.sortDescending(this.list1);
        
        // Search for a value in the list1
        int index = BinarySearch.searchDescending(this.list1, 9);
        // Assert that the value was found
        Assert.assertTrue(index >= 0);
        
        // Search for a value that is not in the list1
        index = BinarySearch.search(this.list1, 75);
        // Assert that the value was not found
        Assert.assertTrue(index < 0);
    }

}
