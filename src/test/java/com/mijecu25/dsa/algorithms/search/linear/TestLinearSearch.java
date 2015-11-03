package com.mijecu25.dsa.algorithms.search.linear;

import org.junit.Before;
import org.junit.Test;

import com.mijecu25.dsa.algorithms.search.TestSearch;

import org.junit.Assert;

/**
 * Test for LinearSearch class.
 * 
 * @author Miguel Velez - miguelvelezmj25
 * @version 0.1.3.7
 */
public class TestLinearSearch extends TestSearch {

    @Before
    public void initialize() { 
        super.initialize();
    }
    
    /**
     * Test search for elements.
     */
    @Test
    public void search1() {
        // Search for a value in the array
        int index = LinearSearch.search(this.integerArray, 2);
        // Assert that the value was found
        Assert.assertTrue(index >= 0);
        
        // Search for a value that is not in the array
        index = LinearSearch.search(this.integerArray, 75);
        // Assert that the value was not found
        Assert.assertTrue(index < 0);
    }
    
    /**
     * Test search for primitives
     */
    @Test
    public void search2() {
        // Search for a value in the array
        int index = LinearSearch.search(this.intArray, 8);
        // Assert that the value was found
        Assert.assertTrue(index >= 0);
        
        // Search for a value that is not in the array
        index = LinearSearch.search(this.intArray, 75);
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
        int index = LinearSearch.searchLast(this.integerArray, 2);
        // Assert that the value was found
        Assert.assertTrue(index >= 0);
        
        // Search for a value that is not in the array
        index = LinearSearch.searchLast(this.integerArray, 75);
        // Assert that the value was not found
        Assert.assertTrue(index < 0);
    }
    
    /**
     * Test backwards search for primitives
     */
    @Test
    public void search5() {
        // Search for a value in the array backwards
        int index = LinearSearch.searchLast(this.intArray, 8);
        // Assert that the value was found
        Assert.assertTrue(index >= 0);
        
        // Search for a value that is not in the array
        index = LinearSearch.searchLast(this.intArray, 75);
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
        int index = LinearSearch.search(this.integerArray, 3, 2);
        // Assert that the value was found
        Assert.assertTrue(index >= 0);
        
        // Search for occurrence of a value that is not in the array
        index = LinearSearch.search(this.integerArray, 75, 5);
        // Assert that the value was not found
        Assert.assertTrue(index < 0);
        
        // Assert that we get an illegal argument exception for research an invalid occurrence
        exception.expect(IllegalArgumentException.class);
        LinearSearch.search(this.integerArray, 3, 0);
        
    }
    
    /**
     * Test search occurrence for primitives
     */
    @Test
    public void search8() {
        // Search for the second occurrence of a value in the array
        int index = LinearSearch.search(this.intArray, 1, 2);
        // Assert that the value was found
        Assert.assertTrue(index >= 0);
        
        // Search for occurrence of a value that is not in the array
        index = LinearSearch.search(this.intArray, 75, 5);
        // Assert that the value was not found
        Assert.assertTrue(index < 0);
        
        // Assert that we get an illegal argument exception for research an invalid occurrence
        exception.expect(IllegalArgumentException.class);
        LinearSearch.search(this.intArray, 1, 0);
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
        int index = LinearSearch.searchLast(this.integerArray, 3, 2);
        // Assert that the value was found
        Assert.assertTrue(index >= 0);
        
        // Search for occurrence of a value that is not in the array from the end
        index = LinearSearch.searchLast(this.integerArray, 75, 5);
        // Assert that the value was not found
        Assert.assertTrue(index < 0);
        
        // Assert that we get an illegal argument exception for research an invalid occurrence
        exception.expect(IllegalArgumentException.class);
        LinearSearch.searchLast(this.integerArray, 3, 0);
        
    }
    
    /**
     * Test search occurrence for primitives from the back
     */
    @Test
    public void search11() {
        // Search for the second occurrence of a value in the array from the end
        int index = LinearSearch.searchLast(this.intArray, 1, 2);
        // Assert that the value was found
        Assert.assertTrue(index >= 0);
        
        // Search for occurrence of a value that is not in the array from the end
        index = LinearSearch.searchLast(this.intArray, 75, 5);
        // Assert that the value was not found
        Assert.assertTrue(index < 0);
        
        // Assert that we get an illegal argument exception for research an invalid occurrence
        exception.expect(IllegalArgumentException.class);
        LinearSearch.searchLast(this.intArray, 1, 0);
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
