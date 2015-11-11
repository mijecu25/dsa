package com.mijecu25.dsa.algorithms.search.linear;

import org.junit.Before;
import org.junit.Test;

import com.mijecu25.dsa.algorithms.search.TestSearch;
import com.mijecu25.dsa.algorithms.sort.quadratic.Selection;

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
        // Search for a value in the array
        int index = LinearSearch.search(this.integerArray1, 2);
        // Assert that the value was found
        Assert.assertTrue(index >= 0);
        
        // Search for a value that is not in the array
        index = LinearSearch.search(this.integerArray1, 75);
        // Assert that the value was not found
        Assert.assertTrue(index < 0);
    }
    
    /**
     * Test search for primitives
     */
    @Test
    public void search2() {
        // Search for a value in the array
        int index = LinearSearch.search(this.intArray1, 8);
        // Assert that the value was found
        Assert.assertTrue(index >= 0);
        
        // Search for a value that is not in the array
        index = LinearSearch.search(this.intArray1, 75);
        // Assert that the value was not found
        Assert.assertTrue(index < 0);
    }
    
    /**
     * Test search for lists
     */
    @Test
    public void search3() {
        // Search for a value in the list1
        int index = LinearSearch.search(this.list1, 9);
        // Assert that the value was found
        Assert.assertTrue(index >= 0);
        
        // Search for a value that is not in the list1
        index = LinearSearch.search(this.list1, 75);
        // Assert that the value was not found
        Assert.assertTrue(index < 0);
    }
    
    /**
     * Test backwards search for elements.
     */
    @Test
    public void search4() {
        // Search for a value in the array backwards
        int index = LinearSearch.searchLast(this.integerArray1, 2);
        // Assert that the value was found
        Assert.assertTrue(index >= 0);
        
        // Search for a value that is not in the array
        index = LinearSearch.searchLast(this.integerArray1, 75);
        // Assert that the value was not found
        Assert.assertTrue(index < 0);
    }
    
    /**
     * Test backwards search for primitives
     */
    @Test
    public void search5() {
        // Search for a value in the array backwards
        int index = LinearSearch.searchLast(this.intArray1, 8);
        // Assert that the value was found
        Assert.assertTrue(index >= 0);
        
        // Search for a value that is not in the array
        index = LinearSearch.searchLast(this.intArray1, 75);
        // Assert that the value was not found
        Assert.assertTrue(index < 0);
    }
    
    /**
     * Test backwards search for lists
     */
    @Test
    public void search6() {
        // Search for a value in the list1 backwards
        int index = LinearSearch.searchLast(this.list1, 9);
        // Assert that the value was found
        Assert.assertTrue(index >= 0);
        
        // Search for a value that is not in the list1
        index = LinearSearch.searchLast(this.list1, 75);
        // Assert that the value was not found
        Assert.assertTrue(index < 0);
    }
    
    /**
     * Test search occurrence for elements.
     */
    @Test
    public void search7() {
        // Search for the second occurrence of a value in the array
        int index = LinearSearch.search(this.integerArray1, 3, 2);
        // Assert that the value was found
        Assert.assertTrue(index >= 0);
        
        // Search for occurrence of a value that is not in the array
        index = LinearSearch.search(this.integerArray1, 75, 5);
        // Assert that the value was not found
        Assert.assertTrue(index < 0);
        
        // Assert that we get an illegal argument exception for research an invalid occurrence
        exception.expect(IllegalArgumentException.class);
        LinearSearch.search(this.integerArray1, 3, 0);
        
    }
    
    /**
     * Test search occurrence for primitives
     */
    @Test
    public void search8() {
        // Search for the second occurrence of a value in the array
        int index = LinearSearch.search(this.intArray1, 1, 2);
        // Assert that the value was found
        Assert.assertTrue(index >= 0);
        
        // Search for occurrence of a value that is not in the array
        index = LinearSearch.search(this.intArray1, 75, 5);
        // Assert that the value was not found
        Assert.assertTrue(index < 0);
        
        // Assert that we get an illegal argument exception for research an invalid occurrence
        exception.expect(IllegalArgumentException.class);
        LinearSearch.search(this.intArray1, 1, 0);
    }
    
    /**
     * Test search occurrence for lists
     */
    @Test
    public void search9() {
        // Search for occurrence of a value in the list1
        int index = LinearSearch.search(this.list1, 3, 2);
        // Assert that the value was found
        Assert.assertTrue(index >= 0);
        
        // Search for occurrence a value that is not in the list1
        index = LinearSearch.search(this.list1, 75, 5);
        // Assert that the value was not found
        Assert.assertTrue(index < 0);
        
        // Assert that we get an illegal argument exception for research an invalid occurrence
        exception.expect(IllegalArgumentException.class);
        LinearSearch.search(this.list1, 3, -3);
    }
    
    /**
     * Test search occurrence for elements from the back.
     */
    @Test
    public void search10() {
        // Search for the second occurrence of a value in the array from the end
        int index = LinearSearch.searchLast(this.integerArray1, 3, 2);
        // Assert that the value was found
        Assert.assertTrue(index >= 0);
        
        // Search for occurrence of a value that is not in the array from the end
        index = LinearSearch.searchLast(this.integerArray1, 75, 5);
        // Assert that the value was not found
        Assert.assertTrue(index < 0);
        
        // Assert that we get an illegal argument exception for research an invalid occurrence
        exception.expect(IllegalArgumentException.class);
        LinearSearch.searchLast(this.integerArray1, 3, 0);
        
    }
    
    /**
     * Test search occurrence for primitives from the back
     */
    @Test
    public void search11() {
        // Search for the second occurrence of a value in the array from the end
        int index = LinearSearch.searchLast(this.intArray1, 1, 2);
        // Assert that the value was found
        Assert.assertTrue(index >= 0);
        
        // Search for occurrence of a value that is not in the array from the end
        index = LinearSearch.searchLast(this.intArray1, 75, 5);
        // Assert that the value was not found
        Assert.assertTrue(index < 0);
        
        // Assert that we get an illegal argument exception for research an invalid occurrence
        exception.expect(IllegalArgumentException.class);
        LinearSearch.searchLast(this.intArray1, 1, 0);
    }
    
    /**
     * Test search occurrence for lists from the back
     */
    @Test
    public void search12() {
        // Search for occurrence of a value in the list1 from the end
        int index = LinearSearch.searchLast(this.list1, 3, 2);
        // Assert that the value was found
        Assert.assertTrue(index >= 0);
        
        // Search for occurrence a value that is not in the list1 from the end
        index = LinearSearch.searchLast(this.list1, 75, 5);
        // Assert that the value was not found
        Assert.assertTrue(index < 0);
        
        // Assert that we get an illegal argument exception for research an invalid occurrence
        exception.expect(IllegalArgumentException.class);
        LinearSearch.searchLast(this.list1, 3, -3);
    }
    
    /**
     * Test searchMin for elements.
     */
    @Test
    public void search13() {
        // Sort the array
        Selection.sort(this.integerArray1);
        
        // The minimum element is at the beginning
        Integer min = this.integerArray1[0];
                
        // The minimum element is at the beginning
        Assert.assertTrue(LinearSearch.searchMin(this.integerArray1) == min);
    }
    
    /**
     * Test searchMax for elements
     */
    @Test
    public void search14() {
        // Sort the array
        Selection.sort(this.integerArray1);
        
        // The maximum element is at the end
        Integer max = this.integerArray1[this.integerArray1.length - 1 ];
                
        // The minimum element is at the end
        Assert.assertTrue(LinearSearch.searchMax(this.integerArray1) == max);
    }
    
//    /**
//     * Test findMin for elements
//     */
//    @Test
//    public void search15() {
//        // Sort the array
//        Selection.sort(this.integerArray1);
//                
//        // The minimum element is at the beginning
//        Assert.assertTrue(LinearSearch.findMin(this.integerArray1) == 0);
//    }
    
//    /**
//     * Test findMax for elements.
//     */
//    @Test
//    public void search16() {
//        // Sort the array
//        Selection.sort(this.integerArray1);
//                
//        // The minimum element is at the end
//        Assert.assertTrue(LinearSearch.findMax(this.integerArray1) == (this.integerArray1.length - 1 ));
//    }
    
    /**
     * Test searchMin for primitives.
     */
    @Test
    public void search17() {
        // Sort the array
        Selection.sort(this.intArray1);
        
        // The minimum element is at the beginning
        Integer min = this.intArray1[0];
                
        // The minimum element is at the beginning
        Assert.assertTrue(LinearSearch.searchMin(this.intArray1) == min);
    }
    
    /**
     * Test searchMax for primitives
     */
    @Test
    public void search18() {
        // Sort the array
        Selection.sort(this.intArray1);
        
        // The maximum element is at the end
        Integer max = this.intArray1[this.intArray1.length - 1 ];
                
        // The minimum element is at the end
        Assert.assertTrue(LinearSearch.searchMax(this.intArray1) == max);
    }
    
//    /**
//     * Test findMin for primitives
//     */
//    @Test
//    public void search19() {
//        // Sort the array
//        Selection.sort(this.intArray1);
//                
//        // The minimum element is at the beginning
//        Assert.assertTrue(LinearSearch.findMin(this.intArray1) == 0);
//    }
    
//    /**
//     * Test findMax for elements.
//     */
//    @Test
//    public void search20() {
//        // Sort the array
//        Selection.sort(this.intArray1);
//                
//        // The minimum element is at the end
//        Assert.assertTrue(LinearSearch.findMax(this.intArray1) == (this.intArray1.length - 1 ));
//    }
    
    /**
     * Test searchMin for lists.
     */
    @Test
    public void search21() {
        // Sort the list
        Selection.sort(this.list1);
        
        // The minimum element is at the beginning
        Integer min = this.list1.get(0);
                
        // The minimum element is at the beginning
        Assert.assertTrue(LinearSearch.searchMin(this.list1) == min);
    }
    
    /**
     * Test searchMax for lists
     */
    @Test
    public void search22() {
        // Sort the list
        Selection.sort(this.list1);
        
        // The maximum element is at the end
        Integer max = this.list1.get(this.list1.size() - 1);
                
        // The minimum element is at the end
        Assert.assertTrue(LinearSearch.searchMax(this.list1) == max);
    }
    
//    /**
//     * Test findMin for lists
//     */
//    @Test
//    public void search23() {
//        // Sort the list
//        Selection.sort(this.list1);
//                
//        // The minimum element is at the beginning
//        Assert.assertTrue(LinearSearch.findMin(this.list1) == 0);
//    }
    
//    /**
//     * Test findMax for lists.
//     */
//    @Test
//    public void search24() {
//        // Sort the array
//        Selection.sort(this.list1);
//                
//        // The minimum element is at the end
//        Assert.assertTrue(LinearSearch.findMax(this.list1) == (this.list1.size() - 1));
//    }
    

}
