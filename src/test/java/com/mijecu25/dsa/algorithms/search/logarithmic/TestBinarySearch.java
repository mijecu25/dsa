package com.mijecu25.dsa.algorithms.search.logarithmic;

import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

import com.mijecu25.dsa.algorithms.sort.inefficient.Bogosort;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.junit.Assert;

/**
 * Test for BinarySearch class.
 * 
 * @author Miguel Velez - miguelvelezmj25
 * @version 0.1.3.1
 */
public class TestBinarySearch {
    private Integer[] array = {1, 2, 3, 4, 1, 3, 4};
    private List<Integer> list = new ArrayList<>();
    private int[] int1 = { 1, 5, 3, 8, 14, 5, 1, 7, 10};
    
    @Rule
    public ExpectedException exception = ExpectedException.none();
    
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
        // Sort the array
        // TODO use insertion sort
        Arrays.sort(this.array);
        
        // Search for a value in the array
        int index = BinarySearch.search(this.array, 2);
        // Assert that the value was found
        Assert.assertTrue(index >= 0);
        
        // Search for a value that is not in the array
        index = BinarySearch.search(this.array, 75);
        // Assert that the value was not found
        Assert.assertTrue(index < 0);
    }
    
    /**
     * Test search for primitives
     */
    @Test
    public void search2() {
        // Sort the array
        // TODO use insertion sort
        Arrays.sort(this.int1);
        
        // Search for a value in the array
        int index = BinarySearch.search(this.int1, 8);
        // Assert that the value was found
        Assert.assertTrue(index >= 0);
        
        // Search for a value that is not in the array
        index = BinarySearch.search(this.int1, 75);
        // Assert that the value was not found
        Assert.assertTrue(index < 0);
    }
    
    /**
     * Test search for lists
     */
    @Test
    public void search3() {
        // Sort the list
        // TODO use insertion sort
        Bogosort.sort(this.list);
        
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
        // Reverse sort the array
        // TODO use insertion sort
        Bogosort.sortDescending(this.array);
        
        // Search for a value in the array
        int index = BinarySearch.searchDescending(this.array, 2);
        // Assert that the value was found
        Assert.assertTrue(index >= 0);
        
        // Search for a value that is not in the array
        index = BinarySearch.search(this.array, 75);
        // Assert that the value was not found
        Assert.assertTrue(index < 0);
    }
    
    /**
     * Test reverse search for primitives
     */
    @Test
    public void search5() {
        // Reverse sort the array
        // TODO use insertion sort
        Bogosort.sortDescending(this.int1);
        
        // Search for a value in the array
        int index = BinarySearch.searchDescending(this.int1, 8);
        // Assert that the value was found
        Assert.assertTrue(index >= 0);
        
        // Search for a value that is not in the array
        index = BinarySearch.search(this.int1, 75);
        // Assert that the value was not found
        Assert.assertTrue(index < 0);
    }
    
    /**
     * Test reverse search for lists
     */
    @Test
    public void search6() {
        // Reverse sort the list
        // TODO use insertion sort
        Bogosort.sortDescending(this.list);
        
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
