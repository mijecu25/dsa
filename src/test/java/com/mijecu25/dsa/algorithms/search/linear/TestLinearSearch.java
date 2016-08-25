package com.mijecu25.dsa.algorithms.search.linear;

import com.mijecu25.dsa.algorithms.search.TestSearch;
import com.mijecu25.dsa.algorithms.sort.quadratic.Selection;

import org.junit.Before;
import org.junit.Test;
import org.junit.Assert;

/**
 * Test for LinearSearch class.
 * 
 * @author Miguel Velez - miguelvelezmj25
 * @version 0.2.0.2
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
        int index = LinearSearch.search(this.integerArray1, 2);
        Assert.assertTrue(index >= 0);
        
        index = LinearSearch.search(this.integerArray1, 75);
        Assert.assertTrue(index < 0);
    }
    
    /**
     * Test search for primitives
     */
    @Test
    public void search2() {
        int index = LinearSearch.search(this.intArray1, 8);
        Assert.assertTrue(index >= 0);
        
        index = LinearSearch.search(this.intArray1, 75);
        Assert.assertTrue(index < 0);
    }
    
    /**
     * Test search for lists
     */
    @Test
    public void search3() {
        int index = LinearSearch.search(this.list1, 9);
        Assert.assertTrue(index >= 0);
        
        index = LinearSearch.search(this.list1, 75);
        Assert.assertTrue(index < 0);
    }
    
    /**
     * Test backwards search for elements.
     */
    @Test
    public void search4() {
        int index = LinearSearch.searchLast(this.integerArray1, 2);
        Assert.assertTrue(index >= 0);
        
        index = LinearSearch.searchLast(this.integerArray1, 75);
        Assert.assertTrue(index < 0);
    }
    
    /**
     * Test backwards search for primitives
     */
    @Test
    public void search5() {
        int index = LinearSearch.searchLast(this.intArray1, 8);
        Assert.assertTrue(index >= 0);
        
        index = LinearSearch.searchLast(this.intArray1, 75);
        Assert.assertTrue(index < 0);
    }
    
    /**
     * Test backwards search for lists
     */
    @Test
    public void search6() {
        int index = LinearSearch.searchLast(this.list1, 9);
        Assert.assertTrue(index >= 0);
        
        index = LinearSearch.searchLast(this.list1, 75);
        Assert.assertTrue(index < 0);
    }
    
    /**
     * Test search occurrence for elements.
     */
    @Test
    public void search7() {
        int index = LinearSearch.search(this.integerArray1, 3, 2);
        Assert.assertTrue(index >= 0);
        
        index = LinearSearch.search(this.integerArray1, 75, 5);
        Assert.assertTrue(index < 0);
        
        exception.expect(IllegalArgumentException.class);
        LinearSearch.search(this.integerArray1, 3, 0);
        
    }
    
    /**
     * Test search occurrence for primitives
     */
    @Test
    public void search8() {
        int index = LinearSearch.search(this.intArray1, 1, 2);
        Assert.assertTrue(index >= 0);
        
        index = LinearSearch.search(this.intArray1, 75, 5);
        Assert.assertTrue(index < 0);
        
        exception.expect(IllegalArgumentException.class);
        LinearSearch.search(this.intArray1, 1, 0);
    }
    
    /**
     * Test search occurrence for lists
     */
    @Test
    public void search9() {
        int index = LinearSearch.search(this.list1, 3, 2);
        Assert.assertTrue(index >= 0);
        
        index = LinearSearch.search(this.list1, 75, 5);
        Assert.assertTrue(index < 0);
        
        exception.expect(IllegalArgumentException.class);
        LinearSearch.search(this.list1, 3, -3);
    }
    
    /**
     * Test search occurrence for elements from the back.
     */
    @Test
    public void search10() {
        int index = LinearSearch.searchLast(this.integerArray1, 3, 2);
        Assert.assertTrue(index >= 0);
        
        index = LinearSearch.searchLast(this.integerArray1, 75, 5);
        Assert.assertTrue(index < 0);
        
        exception.expect(IllegalArgumentException.class);
        LinearSearch.searchLast(this.integerArray1, 3, 0);
        
    }
    
    /**
     * Test search occurrence for primitives from the back
     */
    @Test
    public void search11() {
        int index = LinearSearch.searchLast(this.intArray1, 1, 2);
        Assert.assertTrue(index >= 0);
        
        index = LinearSearch.searchLast(this.intArray1, 75, 5);
        Assert.assertTrue(index < 0);
        
        exception.expect(IllegalArgumentException.class);
        LinearSearch.searchLast(this.intArray1, 1, 0);
    }
    
    /**
     * Test search occurrence for lists from the back
     */
    @Test
    public void search12() {
        int index = LinearSearch.searchLast(this.list1, 3, 2);
        Assert.assertTrue(index >= 0);
        
        index = LinearSearch.searchLast(this.list1, 75, 5);
        Assert.assertTrue(index < 0);
        
        exception.expect(IllegalArgumentException.class);
        LinearSearch.searchLast(this.list1, 3, -3);
    }
    
    /**
     * Test searchMin for elements.
     */
    @Test
    public void search13() {
        Selection.sort(this.integerArray1);
        
        Integer min = this.integerArray1[0];
                
        Assert.assertTrue(LinearSearch.searchMin(this.integerArray1) == min);
    }
    
    /**
     * Test searchMax for elements
     */
    @Test
    public void search14() {
        Selection.sort(this.integerArray1);
        
        Integer max = this.integerArray1[this.integerArray1.length - 1 ];
                
        Assert.assertTrue(LinearSearch.searchMax(this.integerArray1) == max);
    }
    





    





    
    /**
     * Test searchMin for primitives.
     */
    @Test
    public void search17() {
        Selection.sort(this.intArray1);
        
        Integer min = this.intArray1[0];
                
        Assert.assertTrue(LinearSearch.searchMin(this.intArray1) == min);
    }
    
    /**
     * Test searchMax for primitives
     */
    @Test
    public void search18() {
        Selection.sort(this.intArray1);
        
        Integer max = this.intArray1[this.intArray1.length - 1 ];
                
        Assert.assertTrue(LinearSearch.searchMax(this.intArray1) == max);
    }
    





    





    
    /**
     * Test searchMin for lists.
     */
    @Test
    public void search21() {
        Selection.sort(this.list1);
        
        Integer min = this.list1.get(0);
                
        Assert.assertTrue(LinearSearch.searchMin(this.list1) == min);
    }
    
    /**
     * Test searchMax for lists
     */
    @Test
    public void search22() {
        Selection.sort(this.list1);
        
        Integer max = this.list1.get(this.list1.size() - 1);
                
        Assert.assertTrue(LinearSearch.searchMax(this.list1) == max);
    }
    





    





    
}
