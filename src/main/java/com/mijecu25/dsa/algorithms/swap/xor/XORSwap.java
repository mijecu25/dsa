package com.mijecu25.dsa.algorithms.swap.xor;

import com.mijecu25.dsa.algorithms.swap.Swap;

/**
 * Swapping algorithm that uses the XOR operation.
 * 
 * <br>
 * <br>
 * 
 * <i>Runtime: </i> O(1)
 * 
 * @author Miguel Velez
 *
 */
public class XORSwap extends Swap {
	
	/**
	 * Swap the elements of two int arrays at the specified positions.
	 * 
	 * @param intArray1 one of the arrays that will have one of its values swapped.
	 * @param array1Index the index of the first array that will be swapped.
	 * @param intArray2 the other array that will have one of its values swapped.
	 * @param array2Index the index of the second array that will be swapped.
	 */
	public static void swap(int[] intArray1, int array1Index, int[] intArray2, int array2Index) {
		// If the values are not the same
		if(intArray1[array1Index] != intArray2[array2Index]) {
			intArray1[array1Index] = intArray1[array1Index] ^ intArray2[array2Index];
			intArray2[array2Index] = intArray1[array1Index] ^ intArray2[array2Index];
			intArray1[array1Index] = intArray1[array1Index] ^ intArray2[array2Index];
		}
		
		// If the values are the same, nothing is executed
	}
	
	/**
	 * Swap the elements of two int arrays at the same position
	 * 
	 * @param intArray1 one of the arrays that will have one of its values swapped.
	 * @param intArray2 the other array that will have one of its values swapped.
	 * @param index the index of the arrays that will have their values swapped.
	 */
	public static void swap(int[] intArray1, int[] intArray2, int index) {
		// Call the other method by passing the index twice
		XORSwap.swap(intArray1, index, intArray2, index);
	}
	
	
	public static void swap(int[] intArray1, int[] intArray2) {
		// Check if they are the arrays are the same length
		if(intArray1.length != intArray2.length) {
			// Throw exception
			throw new ArrayIndexOutOfBoundsException("The length of the arrays "
					+ "that you provided are not the same: " + intArray1.length
					+ " -- " + intArray2.length);
		}
		
		// Loop through the values of the array
		for(int i = 0; i < intArray1.length; i++) {
			// Call the method that swappes the same index
			XORSwap.swap(intArray1, intArray2, i);
		}
	}
	
	// TODO swap arrays of different length

}
