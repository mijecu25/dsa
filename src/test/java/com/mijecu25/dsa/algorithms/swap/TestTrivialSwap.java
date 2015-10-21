package com.mijecu25.dsa.algorithms.swap;

import java.util.ArrayList;
import java.util.List;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/**
 * Test for TrivialSwap class.
 * 
 * @author Miguel Velez
 * @version 0.1.3.4
 */
public class TestTrivialSwap {
	private Integer[] array1 = {1, 2, 3, 4};
	private Integer[] array2 = {5, 6, 7, 8};
	private int[] int1 = {1, 2, 3, 4};
    private int[] int2 = {5, 6, 7, 8};
    private List<Integer> list1 = new ArrayList<>();
    private List<Integer> list2 = new ArrayList<>();
	
	@Before
	public void initialize() { 
	    list1.add(1);
	    list1.add(2);
	    list1.add(3);
	    list1.add(4);
	    list2.add(5);
	    list2.add(6);
	    list2.add(7);
	    list2.add(8);    
	}	

	/**
	 * Test swap(E[] array1, int array1Index, E[] array2, int array2Index)
	 */
	@Test 
	public void swap1() {
		// Get the first and second element of the first and second lists
		int a = this.array1[0];
		int b = this.array2[1];
		
		// Swap the first element of the first list with the last element
		// of the second list
		TrivialSwap.swap(this.array1, 0, this.array2, 1);
		
		// Assert that the values were swapped
		Assert.assertTrue(this.array1[0] == b);
		Assert.assertTrue(this.array2[1] == a);
	}
	
	/**
	 * Test swap(E[] array1, E[] array2, int index)
	 */
	@Test
	public void swap2() {
		// Get the last elements of both lists
		int a = this.array1[this.array1.length-1];
		int b = this.array2[this.array2.length-1];
		
		// Swap the last elements
		TrivialSwap.swap(this.array1, this.array2, this.array1.length-1);
		
		// Assert that the values were swapped
		Assert.assertTrue(this.array1[this.array1.length-1] == b);
		Assert.assertTrue(this.array2[this.array2.length-1] == a);	
	}
	
	/**
	 * Test swap(E[] array1, E[] array2)
	 */
	@Test
	public void swap3() {
		// Get the lists
		Integer[] a = new Integer[this.array1.length];
		System.arraycopy(this.array1, 0, a, 0, this.array1.length);
		Integer[] b = new Integer[this.array2.length];
		System.arraycopy(this.array2, 0, b, 0, this.array2.length);
		
		// Swap the last elements
		TrivialSwap.swap(this.array1, this.array2);
		
		// Assert that the values were swapped
		for(int i = 0; i < this.array1.length; i++) {
			Assert.assertTrue(this.array1[i] == b[i]);
			Assert.assertTrue(this.array2[i] == a[i]);			
		}
				
	}
	
	/**
	 * Test void swap(E[] array, int index1, int index2)
	 */
	@Test
	public void swap7() {
	    // Get elements from a list
        int a = this.array1[this.array1.length-1];
        int b = this.array1[0];

        // Swap the last elements
        TrivialSwap.swap(this.array1, 0, this.array1.length-1);

        // Assert that the values were swapped
        Assert.assertTrue(this.array1[this.array1.length-1] == b);
        Assert.assertTrue(this.array1[0] == a);
	}
	
	/**
     * Test swap(int[] intArray1, int array1Index, int[] intArray2, int array2Index)
     */
    @Test 
    public void swap4() {
        // Get the first and second element of the first and second lists
        int a = this.int1[0];
        int b = this.int2[1];
        
        // Swap the first element of the first list with the last element
        // of the second list
        TrivialSwap.swap(this.int1, 0, this.int2, 1);
        
        // Assert that the values were swapped
        Assert.assertTrue(this.int1[0] == b);
        Assert.assertTrue(this.int2[1] == a);
    }
    
    /**
     * Test swap(int[] intArray1, int[] intArray2, int index)
     */
    @Test
    public void swap5() {
        // Get the last elements of both lists
        int a = this.int1[this.int1.length-1];
        int b = this.int2[this.int2.length-1];
        
        // Swap the last elements
        TrivialSwap.swap(this.int1, this.int2, this.int1.length-1);
        
        // Assert that the values were swapped
        Assert.assertTrue(this.int1[this.int1.length-1] == b);
        Assert.assertTrue(this.int2[this.int2.length-1] == a);    
    }
    
    /**
     * Test swap(int[] intArray1, int[] intArray2)
     */
    @Test
    public void swap6() {
        // Get the lists
        int[] a = new int[this.int1.length];
        System.arraycopy(this.int1, 0, a, 0, this.int1.length);
        int[] b = new int[this.array2.length];
        System.arraycopy(this.int2, 0, b, 0, this.int2.length);
        
        // Swap the last elements
        TrivialSwap.swap(this.int1, this.int2);
        
        // Assert that the values were swapped
        for(int i = 0; i < this.int1.length; i++) {
            Assert.assertTrue(this.int1[i] == b[i]);
            Assert.assertTrue(this.int2[i] == a[i]);           
        }
               
    }
    
    /**
     * Test swap(int[] intArray1, int index1, int index2)
     */
    @Test
    public void swap8() {
        // Get elements from an array
        int a = this.int1[this.int1.length-1];
        int b = this.int1[0];

        // Swap the last elements
        TrivialSwap.swap(this.int1, 0, this.int1.length-1);

        // Assert that the values were swapped
        Assert.assertTrue(this.int1[this.int1.length-1] == b);
        Assert.assertTrue(this.int1[0] == a);
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
        for(int i = 0; i < this.list1.size(); i++) {
            
            Assert.assertTrue(this.list1.get(i) == b.get(i));
            Assert.assertTrue(this.list2.get(i) == a.get(i));           
        }
              
    }
	
}
