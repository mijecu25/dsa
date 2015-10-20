package com.mijecu25.dsa.algorithms.swap;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/**
 * Test for XORSwap class.
 * 
 * @author Miguel Velez
 * @version 0.1.3.5
 */
public class TestXORSwap {
	private int[] list1 = {1, 2, 3, 4};
	private int[] list2 = {5, 6, 7, 8};
	
	@Before
	public void initialize() { ; }	
	
	/**
	 * Test swap(int[] intArray1, int array1Index, int[] intArray2, int array2Index)
	 */
	@Test 
	public void swap1() {
		// Get the first and second element of the first and second lists
		int a = this.list1[0];
		int b = this.list2[1];
		
		// Swap the first element of the first list with the last element
		// of the second list
		XORSwap.swap(this.list1, 0, this.list2, 1);
		
		// Assert that the values were swapped
		Assert.assertTrue(this.list1[0] == b);
		Assert.assertTrue(this.list2[1] == a);
	}
	
	/**
	 * Test swap(int[] intArray1, int[] intArray2, int index)
	 */
	@Test
	public void swap2() {
		// Get the last elements of both lists
		int a = this.list1[this.list1.length-1];
		int b = this.list2[this.list2.length-1];
		
		// Swap the last elements
		XORSwap.swap(this.list1, this.list2, this.list1.length-1);
		
		// Assert that the values were swapped
		Assert.assertTrue(this.list1[this.list1.length-1] == b);
		Assert.assertTrue(this.list2[this.list2.length-1] == a);	
	}
	
	/**
	 * Test swap(int[] intArray1, int[] intArray2)
	 */
	@Test
	public void swap3() {
		// Get the lists
		int[] a = new int[this.list1.length];
		System.arraycopy(this.list1, 0, a, 0, this.list1.length);
		int[] b = new int[this.list2.length];
		System.arraycopy(this.list2, 0, b, 0, this.list2.length);
		
		// Swap the last elements
		XORSwap.swap(this.list1, this.list2);
		
		// Assert that the values were swapped
		for(int i = 0; i < this.list1.length; i++) {
			Assert.assertTrue(this.list1[i] == b[i]);
			Assert.assertTrue(this.list2[i] == a[i]);			
		}
				
		// Try swapping lists of different lengths
		XORSwap.swap(this.list1, new int[0]);
	}

	/**
	 * Test swap(int[] intArray1, int index1, int index2)
	 */
	@Test
	public void swap4() {
		// Get elements from a list
		int a = this.list1[this.list1.length-1];
		int b = this.list1[0];

		// Swap the last elements
		XORSwap.swap(this.list1, 0, this.list1.length-1);

		// Assert that the values were swapped
		Assert.assertTrue(this.list1[this.list1.length-1] == b);
		Assert.assertTrue(this.list1[0] == a);
	}
	
}
