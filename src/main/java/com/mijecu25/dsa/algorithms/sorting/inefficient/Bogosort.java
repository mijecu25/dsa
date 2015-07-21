package com.mijecu25.dsa.algorithms.sorting.inefficient;

import com.mijecu25.dsa.algorithms.shuffling.linear.FYShuffle;
import com.mijecu25.dsa.algorithms.sorting.Sort;

/**
 * Ineffective sorting algorithm based on the generate and test paradigm. Keep
 * shuffling the list until it is sorted.
 * 
 * <br>
 * <br>
 * 
 * <i>Worst case performance: </i> Unbounded
 * <br>
 * <i>Best case performance: </i> O(n)
 * <br>
 * <i>Average case performance: </i> O((n+1)!) 
 * 
 * @author Miguel Velez
 * @version 0.1.2.6
 */
public final class Bogosort {
	
	/**
	 * Don't let anyone instantiate this class
	 */
	private Bogosort() {
		;
	}
	
	/**
	 * Sort the int array using this algorithm.
	 * 
	 * @param intArray the array of ints that we want to sort
	 */
	public static void sort(int[] intArray) {
		// While the integer array is not sorted
		while(!Sort.isSorted(intArray)) {
			// Randomly shuffle the array using fyShuffle
			FYShuffle.shuffle(intArray);
		}
	}
	
	/**
	 * Sort the byte array using this algorithm.
	 * 
	 * @param byteArray the array of bytes that we want to sort
	 */
	public static void sort(byte[] byteArray) {
		// While the byte array is not sorted
		while(!Sort.isSorted(byteArray)) {
			// Randomly shuffle the array using fyShuffle
			FYShuffle.shuffle(byteArray);
		}
	}
	
	/**
	 * Sort the char array using this algorithm.
	 * 
	 * @param charArray the array of chars that we want to sort
	 */
	public static void sort(char[] charArray) {
		// While the char array is not sorted
		while(!Sort.isSorted(charArray)) {
			// Randomly shuffle the array using fyShuffle
			FYShuffle.shuffle(charArray);
		}
	}
	
	/**
	 * Sort the double array using this algorithm.
	 * 
	 * @param doubleArray the array of double that we want to sort
	 */
	public static void sort(double[] doubleArray) {
		// While the double array is not sorted
		while(!Sort.isSorted(doubleArray)) {
			// Randomly shuffle the array using fyShuffle
			FYShuffle.shuffle(doubleArray);
		}
	}
	
	/**
	 * Sort the float array using this algorithm.
	 * 
	 * @param floatArray the array of float that we want to sort
	 */
	public static void sort(float[] floatArray) {
		// While the float array is not sorted
		while(!Sort.isSorted(floatArray)) {
			// Randomly shuffle the array using fyShuffle
			FYShuffle.shuffle(floatArray);
		}
	}
	
	/**
	 * Sort the long array using this algorithm.
	 * 
	 * @param longArray the array of longs that we want to sort
	 */
	public static void sort(long[] longArray) {
		// While the long array is not sorted
		while(!Sort.isSorted(longArray)) {
			// Randomly shuffle the array using fyShuffle
			FYShuffle.shuffle(longArray);
		}
	}
	
	/**
	 * Sort the short array using this algorithm.
	 * 
	 * @param shortArray the array of shorts that we want to sort
	 */
	public static void sort(short[] shortArray) {
		// While the short array is not sorted
		while(!Sort.isSorted(shortArray)) {
			// Randomly shuffle the array using fyShuffle
			FYShuffle.shuffle(shortArray);
		}
	}
			
}
