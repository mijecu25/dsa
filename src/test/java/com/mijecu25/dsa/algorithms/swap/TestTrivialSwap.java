package com.mijecu25.dsa.algorithms.swap;

import java.util.ArrayList;
import java.util.List;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/**
 * Test for TrivialSwap class.
 * 
 * @author Miguel Velez - miguelvelezmj25
 * @version 0.1.3.7
 */
public class TestTrivialSwap extends TestSwap {
	
	@Before
	public void initialize() { 
	    super.initialize();
	}	

	/**
	 * Test swap(E[] array1, int array1Index, E[] array2, int array2Index)
	 */
	@Test 
	public void swap1() {
		// Get the first and second element of the first and second lists
		int a = this.integerArray1[0];
		int b = this.integerArray2[1];
		
		// Swap the first element of the first list with the last element
		// of the second list
		TrivialSwap.swap(this.integerArray1, 0, this.integerArray2, 1);
		
		// Assert that the values were swapped
		Assert.assertTrue(this.integerArray1[0] == b);
		Assert.assertTrue(this.integerArray2[1] == a);
	}
	
	/**
	 * Test swap(E[] array1, E[] array2, int index)
	 */
	@Test
	public void swap2() {
		// Get the third elements of both lists
		int a = this.integerArray1[2];
		int b = this.integerArray2[2];
		
		// Swap the third elements
		TrivialSwap.swap(this.integerArray1, this.integerArray2, 2);
		
		// Assert that the values were swapped
		Assert.assertTrue(this.integerArray1[2] == b);
		Assert.assertTrue(this.integerArray2[2] == a);	
	}
	
	/**
	 * Test swap(E[] array1, E[] array2)
	 */
	@Test
	public void swap3() {
		// Get the lists
		Integer[] a = new Integer[this.integerArray1.length];
		System.arraycopy(this.integerArray1, 0, a, 0, this.integerArray1.length);
		Integer[] b = new Integer[this.integerArray2.length];
		System.arraycopy(this.integerArray2, 0, b, 0, this.integerArray2.length);
		
		// Swap the last elements
		TrivialSwap.swap(this.integerArray1, this.integerArray2);
		
		// Assert that the values were swapped
		for(int i = 0; i < Math.min(this.integerArray1.length, this.integerArray2.length); i++) {
			Assert.assertTrue(this.integerArray1[i] == b[i]);
			Assert.assertTrue(this.integerArray2[i] == a[i]);			
		}
				
	}
	
	/**
	 * Test void swap(E[] array, int index1, int index2)
	 */
	@Test
	public void swap7() {
	    // Get elements from a list
        int a = this.integerArray1[this.integerArray1.length-1];
        int b = this.integerArray1[0];

        // Swap the last elements
        TrivialSwap.swap(this.integerArray1, 0, this.integerArray1.length-1);

        // Assert that the values were swapped
        Assert.assertTrue(this.integerArray1[this.integerArray1.length-1] == b);
        Assert.assertTrue(this.integerArray1[0] == a);
	}
	
	/**
     * Test swap(int[] intArray1, int array1Index, int[] intArray2, int array2Index)
     */
    @Test 
    public void swap4() {
        // Get the first and second element of the first and second lists
        int a = this.intArray1[0];
        int b = this.intArray2[1];
        
        // Swap the first element of the first list with the last element
        // of the second list
        TrivialSwap.swap(this.intArray1, 0, this.intArray2, 1);
        
        // Assert that the values were swapped
        Assert.assertTrue(this.intArray1[0] == b);
        Assert.assertTrue(this.intArray2[1] == a);
    }
    
    /**
     * Test swap(int[] intArray1, int[] intArray2, int index)
     */
    @Test
    public void swap5() {
        // Get the second elements of both lists
        int a = this.intArray1[1];
        int b = this.intArray2[1];
        
        // Swap the last elements
        TrivialSwap.swap(this.intArray1, this.intArray2, 1);
        
        // Assert that the values were swapped
        Assert.assertTrue(this.intArray1[1] == b);
        Assert.assertTrue(this.intArray2[1] == a);    
    }
    
    /**
     * Test swap(int[] intArray1, int[] intArray2)
     */
    @Test
    public void swap6() {
        // Get the lists
        int[] a = new int[this.intArray1.length];
        System.arraycopy(this.intArray1, 0, a, 0, this.intArray1.length);
        int[] b = new int[this.integerArray2.length];
        System.arraycopy(this.intArray2, 0, b, 0, this.intArray2.length);
        
        // Swap the last elements
        TrivialSwap.swap(this.intArray1, this.intArray2);
        
        // Assert that the values were swapped
        for(int i = 0; i < Math.min(this.intArray1.length, this.intArray2.length); i++) {
            Assert.assertTrue(this.intArray1[i] == b[i]);
            Assert.assertTrue(this.intArray2[i] == a[i]);           
        }
               
    }
    
    /**
     * Test swap(int[] intArray1, int index1, int index2)
     */
    @Test
    public void swap8() {
        // Get elements from an array
        int a = this.intArray1[this.intArray1.length-1];
        int b = this.intArray1[0];

        // Swap the last elements
        TrivialSwap.swap(this.intArray1, 0, this.intArray1.length-1);

        // Assert that the values were swapped
        Assert.assertTrue(this.intArray1[this.intArray1.length-1] == b);
        Assert.assertTrue(this.intArray1[0] == a);
    }
    
    /**
     * Test swap(List<E> list, int index1, int index2)
     */
    @Test
    public void swap12() {
        // Get elements from a list
        int a = this.list1.get(this.list1.size()-1);
        int b = this.list1.get(0);

        // Swap the first and last elements
        TrivialSwap.swap(this.list1, 0, this.list1.size()-1);

        // Assert that the values were swapped
        Assert.assertTrue(this.list1.get(this.list1.size()-1) == b);
        Assert.assertTrue(this.list1.get(0) == a);
    }
    
   /**
    * Test swap(List<E> list1, int list1Index, List<E> list2, int list2Index)
    */
    @Test
    public void swap9() {
        // Get the first and second element of the first and second lists
        int a = this.list1.get(0);
        int b = this.list2.get(1);
        
        // Swap the first element of the first list with the last element
        // of the second list
        TrivialSwap.swap(this.list1, 0, this.list2, 1);
        
        // Assert that the values were swapped
        Assert.assertTrue(this.list1.get(0) == b);
        Assert.assertTrue(this.list2.get(1) == a);
    }
    
    /**
     * Test swap(List<E> list1, List<E> list2, int index)
     */
    @Test
    public void swap10() {
        // Get the first and second element of the first and second lists
        int a = this.list1.get(0);
        int b = this.list2.get(0);
        
        // Swap the first element of the first list with the last element
        // of the second list
        TrivialSwap.swap(this.list1, this.list2, 0);
        
        // Assert that the values were swapped
        Assert.assertTrue(this.list1.get(0) == b);
        Assert.assertTrue(this.list2.get(0) == a); 
    }
    
    /**
     * Test swap(List<E> list1, List<E> list2)
     */
    @Test
    public void swap11() {
        // Get the lists
        List<Integer> a = new ArrayList<>();
        a.addAll(this.list1);
        List<Integer> b = new ArrayList<>();
        b.addAll(this.list2);
        
        // Swap the last elements
        TrivialSwap.swap(this.list1, this.list2);

        // Assert that the values were swapped
        for(int i = 0; i < Math.min(this.list1.size(), this.list2.size()); i++) {
            
            Assert.assertTrue(this.list1.get(i) == b.get(i));
            Assert.assertTrue(this.list2.get(i) == a.get(i));           
        }
              
    }
	
}
