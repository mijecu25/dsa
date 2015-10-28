package com.mijecu25.dsa.algorithms.search.linear;

import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import org.junit.Assert;

/**
 * Test for LinearSearch class.
 * 
 * @author Miguel Velez - miguelvelezmj25
 * @version 0.1.3.2
 */
public class TestLinearSearch {
    private Integer[] array = {1, 2, 3, 4, 1, 3, 4};
    private List<Integer> list = new ArrayList<>();
    private int[] int1 = { 1, 5, 3, 8, 14, 5, 1, 7, 10};
    
    @Before
    public void initialize() { 
        list.add(4);
        list.add(3);
        list.add(1);
        list.add(9);
        list.add(3);
        list.add(1);
    }
    
    /**
     * Test search for elements.
     */
    @Test
    public void search1() {
        // Search for a value in the array
        int index = LinearSearch.search(this.array, 2);
        // Assert that the value was found
        Assert.assertTrue(index >= 0);
        
        // Search for a value that is not in the array
        index = LinearSearch.search(this.array, 75);
        // Assert that the value was not found
        Assert.assertTrue(index < 0);
    }
    
    /**
     * Test search for primitives
     */
    @Test
    public void search2() {
        // Search for a value in the array
        int index = LinearSearch.search(this.int1, 8);
        // Assert that the value was found
        Assert.assertTrue(index >= 0);
        
        // Search for a value that is not in the array
        index = LinearSearch.search(this.int1, 75);
        // Assert that the value was not found
        Assert.assertTrue(index < 0);
    }
    
    /**
     * Test search for lists
     */
    @Test
    public void search3() {
        // Search for a value in the list
        int index = LinearSearch.search(this.list, 9);
        // Assert that the value was found
        Assert.assertTrue(index >= 0);
        
        // Search for a value that is not in the array
        index = LinearSearch.search(this.list, 75);
        // Assert that the value was not found
        Assert.assertTrue(index < 0);
    }

}
