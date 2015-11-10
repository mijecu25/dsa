package com.mijecu25.dsa.algorithms.swap;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/**
 * Test for XORSwap class.
 * 
 * @author Miguel Velez miguelvelezmj25
 * @version 0.2.0.1
 */
public class TestXORSwap extends TestSwap {
	
    @Before
    public void initialize() { 
        super.initialize();
    }   
	
	/**
	 * Test swap(int[] intArray1, int array1Index, int[] intArray2, int array2Index)
	 */
	@Test 
	public void swap1() {
		// Get the first and second element of the first and second lists
		int a = this.intArray1[0];
		int b = this.intArray2[1];
		
		// Swap the first element of the first list with the last element
		// of the second list
		XORSwap.swap(this.intArray1, 0, this.intArray2, 1);
		
		// Assert that the values were swapped
		Assert.assertTrue(this.intArray1[0] == b);
		Assert.assertTrue(this.intArray2[1] == a);
	}
	
	/**
	 * Test swap(int[] intArray1, int[] intArray2, int index)
	 */
	@Test
	public void swap2() {
		// Get the second elements of both lists
		int a = this.intArray1[1];
		int b = this.intArray2[1];
		
		// Swap the last elements
		XORSwap.swap(this.intArray1, this.intArray2, 1);
		
		// Assert that the values were swapped
		Assert.assertTrue(this.intArray1[1] == b);
		Assert.assertTrue(this.intArray2[1] == a);	
	}
	
	/**
	 * Test swap(int[] intArray1, int[] intArray2)
	 */
	@Test
	public void swap3() {
		// Get the lists
		int[] a = new int[this.intArray1.length];
		System.arraycopy(this.intArray1, 0, a, 0, this.intArray1.length);
		int[] b = new int[this.intArray2.length];
		System.arraycopy(this.intArray2, 0, b, 0, this.intArray2.length);
		
		// Swap the last elements
		XORSwap.swap(this.intArray1, this.intArray2);
		
		// Assert that the values were swapped
		for(int i = 0; i < Math.min(this.intArray1.length, this.intArray2.length); i++) {
			Assert.assertTrue(this.intArray1[i] == b[i]);
			Assert.assertTrue(this.intArray2[i] == a[i]);			
		}
				
		// Try swapping lists of different lengths
		XORSwap.swap(this.intArray1, new int[0]);
	}

	/**
	 * Test swap(int[] intArray1, int index1, int index2)
	 */
	@Test
	public void swap4() {
		// Get elements from a list
		int a = this.intArray1[this.intArray1.length-1];
		int b = this.intArray1[0];

		// Swap the last elements
		XORSwap.swap(this.intArray1, 0, this.intArray1.length-1);

		// Assert that the values were swapped
		Assert.assertTrue(this.intArray1[this.intArray1.length-1] == b);
		Assert.assertTrue(this.intArray1[0] == a);
	}
	
}
