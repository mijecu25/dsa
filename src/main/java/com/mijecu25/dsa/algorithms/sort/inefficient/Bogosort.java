package com.mijecu25.dsa.algorithms.sort.inefficient;

import com.mijecu25.dsa.algorithms.shuffle.linear.FYShuffle;
import com.mijecu25.dsa.algorithms.sort.Sort;

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
 * @version 0.1.3.4
 */
public final class Bogosort extends Sort {
	
	/**
	 * Don't let anyone instantiate this class
	 */
	private Bogosort() { ; }
	
	// TODO make it work for lists with comparable interface
	
	/**
	 * Sort the int array in ascending order using this algorithm.
	 * 
	 * @param intArray - the array of ints that we want to sort
	 */
	public static void sort(int[] intArray) {
		// While the integer array is not sorted
		while(!Sort.isSorted(intArray)) {
			// Randomly shuffle the array using fyShuffle
			FYShuffle.shuffle(intArray);
		}
	}
	
	/**
	 * Sort the byte array in ascending order using this algorithm.
	 * 
	 * @param byteArray - the array of bytes that we want to sort
	 */
	public static void sort(byte[] byteArray) {
		// While the byte array is not sorted
		while(!Sort.isSorted(byteArray)) {
			// Randomly shuffle the array using fyShuffle
			FYShuffle.shuffle(byteArray);
		}
	}
	
	/**
	 * Sort the char array in ascending order using this algorithm.
	 *
	 * @param charArray - the array of chars that we want to sort
	 */
	public static void sort(char[] charArray) {
		// While the char array is not sorted
		while(!Sort.isSorted(charArray)) {
			// Randomly shuffle the array using fyShuffle
			FYShuffle.shuffle(charArray);
		}
	}
	
	/**
	 * Sort the double array in ascending order using this algorithm.
	 * 
	 * @param doubleArray - the array of double that we want to sort
	 */
	public static void sort(double[] doubleArray) {
		// While the double array is not sorted
		while(!Sort.isSorted(doubleArray)) {
			// Randomly shuffle the array using fyShuffle
			FYShuffle.shuffle(doubleArray);
		}
	}
	
	/**
	 * Sort the float array in ascending order using this algorithm.
	 * 
	 * @param floatArray - the array of float that we want to sort
	 */
	public static void sort(float[] floatArray) {
		// While the float array is not sorted
		while(!Sort.isSorted(floatArray)) {
			// Randomly shuffle the array using fyShuffle
			FYShuffle.shuffle(floatArray);
		}
	}
	
	/**
	 * Sort the long array in ascending order using this algorithm.
	 * 
	 * @param longArray - the array of longs that we want to sort
	 */
	public static void sort(long[] longArray) {
		// While the long array is not sorted
		while(!Sort.isSorted(longArray)) {
			// Randomly shuffle the array using fyShuffle
			FYShuffle.shuffle(longArray);
		}
	}
	
	/**
	 * Sort the short array in ascending order using this algorithm.
	 * 
	 * @param shortArray - the array of shorts that we want to sort
	 */
	public static void sort(short[] shortArray) {
		// While the short array is not sorted
		while(!Sort.isSorted(shortArray)) {
			// Randomly shuffle the array using fyShuffle
			FYShuffle.shuffle(shortArray);
		}
	}

	/**
	 * Sort the int array in descending order using this algorithm.
	 *
	 * @param intArray - the array of ints that we want to sort
	 */
	public static void sortDescending(int[] intArray) {
		// While the integer array is not sorted
		while(!Sort.isReverseSorted(intArray)) {
			// Randomly shuffle the array using fyShuffle
			FYShuffle.shuffle(intArray);
		}
	}

	/**
	 * Sort the byte array in descending order using this algorithm.
	 *
	 * @param byteArray - the array of bytes that we want to sort
	 */
	public static void sortDescending(byte[] byteArray) {
		// While the byte array is not sorted
		while(!Sort.isReverseSorted(byteArray)) {
			// Randomly shuffle the array using fyShuffle
			FYShuffle.shuffle(byteArray);
		}
	}

	/**
	 * Sort the char array in descending order using this algorithm.
	 *
	 * @param charArray - the array of chars that we want to sort
	 */
	public static void sortDescending(char[] charArray) {
		// While the char array is not sorted
		while(!Sort.isReverseSorted(charArray)) {
			// Randomly shuffle the array using fyShuffle
			FYShuffle.shuffle(charArray);
		}
	}

	/**
	 * Sort the double array in descending order using this algorithm.
	 *
	 * @param doubleArray - the array of double that we want to sort
	 */
	public static void sortDescending(double[] doubleArray) {
		// While the double array is not sorted
		while(!Sort.isReverseSorted(doubleArray)) {
			// Randomly shuffle the array using fyShuffle
			FYShuffle.shuffle(doubleArray);
		}
	}

	/**
	 * Sort the float array in descending order using this algorithm.
	 *
	 * @param floatArray - the array of float that we want to sort
	 */
	public static void sortDescending(float[] floatArray) {
		// While the float array is not sorted
		while(!Sort.isReverseSorted(floatArray)) {
			// Randomly shuffle the array using fyShuffle
			FYShuffle.shuffle(floatArray);
		}
	}

	/**
	 * Sort the long array in descending order using this algorithm.
	 *
	 * @param longArray - the array of longs that we want to sort
	 */
	public static void sortDescending(long[] longArray) {
		// While the long array is not sorted
		while(!Sort.isReverseSorted(longArray)) {
			// Randomly shuffle the array using fyShuffle
			FYShuffle.shuffle(longArray);
		}
	}

	/**
	 * Sort the short array in descending order using this algorithm.
	 *
	 * @param shortArray - the array of shorts that we want to sort
	 */
	public static void sortDescending(short[] shortArray) {
		// While the short array is not sorted
		while(!Sort.isReverseSorted(shortArray)) {
			// Randomly shuffle the array using fyShuffle
			FYShuffle.shuffle(shortArray);
		}
	}
			
}
