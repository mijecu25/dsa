package com.mijecu25.dsa.algorithms.search.linear;

import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

import java.util.ArrayList;
import java.util.List;

import org.junit.Assert;

/**
 * Test for LinearSearch class.
 * 
 * @author Miguel Velez - miguelvelezmj25
 * @version 0.1.3.5
 */
public class TestLinearSearch {
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
        
        // Search for a value that is not in the list
        index = LinearSearch.search(this.list, 75);
        // Assert that the value was not found
        Assert.assertTrue(index < 0);
    }
    
    /**
     * Test backwards search for elements.
     */
    @Test
    public void search4() {
        // Search for a value in the array backwards
        int index = LinearSearch.searchLast(this.array, 2);
        // Assert that the value was found
        Assert.assertTrue(index >= 0);
        
        // Search for a value that is not in the array
        index = LinearSearch.searchLast(this.array, 75);
        // Assert that the value was not found
        Assert.assertTrue(index < 0);
    }
    
    /**
     * Test backwards search for primitives
     */
    @Test
    public void search5() {
        // Search for a value in the array backwards
        int index = LinearSearch.searchLast(this.int1, 8);
        // Assert that the value was found
        Assert.assertTrue(index >= 0);
        
        // Search for a value that is not in the array
        index = LinearSearch.searchLast(this.int1, 75);
        // Assert that the value was not found
        Assert.assertTrue(index < 0);
    }
    
    /**
     * Test backwards search for lists
     */
    @Test
    public void search6() {
        // Search for a value in the list backwards
        int index = LinearSearch.searchLast(this.list, 9);
        // Assert that the value was found
        Assert.assertTrue(index >= 0);
        
        // Search for a value that is not in the list
        index = LinearSearch.searchLast(this.list, 75);
        // Assert that the value was not found
        Assert.assertTrue(index < 0);
    }
    
    /**
     * Test search occurrence for elements.
     */
    @Test
    public void search7() {
        // Search for the second occurrence of a value in the array
        int index = LinearSearch.search(this.array, 3, 2);
        // Assert that the value was found
        Assert.assertTrue(index >= 0);
        
        // Search for occurrence of a value that is not in the array
        index = LinearSearch.search(this.array, 75, 5);
        // Assert that the value was not found
        Assert.assertTrue(index < 0);
        
        // Assert that we get an illegal argument exception for research an invalid occurrence
        exception.expect(IllegalArgumentException.class);
        LinearSearch.search(this.array, 3, 0);
        
    }
    
    /**
     * Test search occurrence for primitives
     */
    @Test
    public void search8() {
        // Search for the second occurrence of a value in the array
        int index = LinearSearch.search(this.int1, 1, 2);
        // Assert that the value was found
        Assert.assertTrue(index >= 0);
        
        // Search for occurrence of a value that is not in the array
        index = LinearSearch.search(this.int1, 75, 5);
        // Assert that the value was not found
        Assert.assertTrue(index < 0);
        
        // Assert that we get an illegal argument exception for research an invalid occurrence
        exception.expect(IllegalArgumentException.class);
        LinearSearch.search(this.int1, 1, 0);
    }
    
    /**
     * Test search occurrence for lists
     */
    @Test
    public void search9() {
        // Search for occurrence of a value in the list
        int index = LinearSearch.search(this.list, 3, 2);
        // Assert that the value was found
        Assert.assertTrue(index >= 0);
        
        // Search for occurrence a value that is not in the list
        index = LinearSearch.search(this.list, 75, 5);
        // Assert that the value was not found
        Assert.assertTrue(index < 0);
        
        // Assert that we get an illegal argument exception for research an invalid occurrence
        exception.expect(IllegalArgumentException.class);
        LinearSearch.search(this.list, 3, -3);
    }
    
    /**
     * Test search occurrence for elements from the back.
     */
    @Test
    public void search10() {
        // Search for the second occurrence of a value in the array from the end
        int index = LinearSearch.searchLast(this.array, 3, 2);
        // Assert that the value was found
        Assert.assertTrue(index >= 0);
        
        // Search for occurrence of a value that is not in the array from the end
        index = LinearSearch.searchLast(this.array, 75, 5);
        // Assert that the value was not found
        Assert.assertTrue(index < 0);
        
        // Assert that we get an illegal argument exception for research an invalid occurrence
        exception.expect(IllegalArgumentException.class);
        LinearSearch.searchLast(this.array, 3, 0);
        
    }
    
    /**
     * Test search occurrence for primitives from the back
     */
    @Test
    public void search11() {
        // Search for the second occurrence of a value in the array from the end
        int index = LinearSearch.searchLast(this.int1, 1, 2);
        // Assert that the value was found
        Assert.assertTrue(index >= 0);
        
        // Search for occurrence of a value that is not in the array from the end
        index = LinearSearch.searchLast(this.int1, 75, 5);
        // Assert that the value was not found
        Assert.assertTrue(index < 0);
        
        // Assert that we get an illegal argument exception for research an invalid occurrence
        exception.expect(IllegalArgumentException.class);
        LinearSearch.searchLast(this.int1, 1, 0);
    }
    
    /**
     * Test search occurrence for lists from the back
     */
    @Test
    public void search12() {
        // Search for occurrence of a value in the list from the end
        int index = LinearSearch.searchLast(this.list, 3, 2);
        // Assert that the value was found
        Assert.assertTrue(index >= 0);
        
        // Search for occurrence a value that is not in the list from the end
        index = LinearSearch.searchLast(this.list, 75, 5);
        // Assert that the value was not found
        Assert.assertTrue(index < 0);
        
        // Assert that we get an illegal argument exception for research an invalid occurrence
        exception.expect(IllegalArgumentException.class);
        LinearSearch.searchLast(this.list, 3, -3);
    }

}
