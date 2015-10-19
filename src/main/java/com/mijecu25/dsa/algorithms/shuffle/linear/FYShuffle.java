package com.mijecu25.dsa.algorithms.shuffle.linear;

import com.mijecu25.dsa.algorithms.shuffle.Shuffle;
import com.mijecu25.dsa.algorithms.swap.XORSwap;

/**
 * FYShuffle class that uses the Fisher–Yates shuffle to shuffle
 * elements in arrays. 
 * 
 * <br>
 * <br>
 * 
 * <i>Runtime: </i> O(n)
 * 
 * @author Miguel Velez
 * @version 0.1.3.3
 */
public final class FYShuffle extends Shuffle {
	// TODO make it work for lists
	/**
	 * Don't let anyone instantiate this class
	 */
	private FYShuffle() {
		;
	}
	
	/**
	 * Randomly shuffle the elements in an array  
	 * 
	 * @param array - an array of objects to shuffle.
	 */
	public static void shuffle(Object[] array) {
		Object hold = null;
		int arrayLength = array.length;
		int swapPlace = -1;
		
		// Loop through the entire array
		for(int i = 0; i < array.length; i++) {
			// TOD use trivial swap
			hold = array[i];
			swapPlace = (int) (Math.random() * (arrayLength - i));
			array[i] = array[swapPlace];
			array[swapPlace] = hold;
		}
	}
	
	/**
	 * Randomly shuffle an int array  
	 *  
	 * @param intArray - array of integers to shuffle.
	 */
	public static void shuffle(int[] intArray) {
		// Place hold for the random place to swap
		int swapPlace = 0;

		// Loop through the entire array
		for(int i = 0; i < intArray.length; i++) {
			// Pick a random index
			swapPlace = (int) (Math.random() * (intArray.length - 1));
			// Use xor swap to swap the elements current element with the random element
			XORSwap.swap(intArray, i, intArray, swapPlace);
		}
	}
	
	/**
	 * Randomly shuffle an float array  
	 * 
	 * @param floatArray - array of floats to shuffle.
	 */
	public static void shuffle(float[] floatArray) {
		// Place hold for the random place to swap
		int swapPlace = 0;

		// Loop through the entire array
		for(int i = 0; i < floatArray.length; i++) {
			// Pick a random index
			swapPlace = (int) (Math.random() * (floatArray.length - 1));
			// TODO use trivial swap
//			// Use xor swap to swap the elements current element with the random element
//			XORSwap.swap(floatArray, i, floatArray, swapPlace);
		}
	}
	
	/**
	 * Randomly shuffle an byte array  
	 * 
	 * @param byteArray - array of bytes to shuffle.
	 */
	public static void shuffle(byte[] byteArray) {
		// Place hold for the random place to swap
		int swapPlace = 0;

		// Loop through the entire array
		for(int i = 0; i < byteArray.length; i++) {
			// Pick a random index
			swapPlace = (int) (Math.random() * (byteArray.length - 1));
			// Use xor swap to swap the elements current element with the random element
			XORSwap.swap(byteArray, i, byteArray, swapPlace);
		}
	}
	
	/**
	 * Randomly shuffle an short array  
	 * 
	 * @param shortArray - array of short to shuffle.
	 */
	public static void shuffle(short[] shortArray) {
		// Place hold for the random place to swap
		int swapPlace = 0;

		// Loop through the entire array
		for(int i = 0; i < shortArray.length; i++) {
			// Pick a random index
			swapPlace = (int) (Math.random() * (shortArray.length - 1));
			// Use xor swap to swap the elements current element with the random element
			XORSwap.swap(shortArray, i, shortArray, swapPlace);
		}
	}
	
	/**
	 * Randomly shuffle an long array  
	 * 
	 * @param longArray - array of long to shuffle.
	 */
	public static void shuffle(long[] longArray) {
		// Place hold for the random place to swap
		int swapPlace = 0;

		// Loop through the entire array
		for(int i = 0; i < longArray.length; i++) {
			// Pick a random index
			swapPlace = (int) (Math.random() * (longArray.length - 1));
			// Use xor swap to swap the elements current element with the random element
			XORSwap.swap(longArray, i, longArray, swapPlace);
		}
	}
	
	/**
	 * Randomly shuffle a double array  
	 * 
	 * @param doubleArray - array of double to shuffle.
	 */
	public static void shuffle(double[] doubleArray) {
		// Place hold for the random place to swap
		int swapPlace = 0;

		// Loop through the entire array
		for(int i = 0; i < doubleArray.length; i++) {
			// Pick a random index
			swapPlace = (int) (Math.random() * (doubleArray.length - 1));
			// TODO use trivial swap
//			// Use xor swap to swap the elements current element with the random element
//			XORSwap.swap(floatArray, i, floatArray, swapPlace);
		}
	}
	
	/**
	 * Randomly shuffle a char array  
	 * 
	 * @param charArray - array of char to shuffle.
	 */
	public static void shuffle(char[] charArray) {
		// Place hold for the random place to swap
		int swapPlace = 0;

		// Loop through the entire array
		for(int i = 0; i < charArray.length; i++) {
			// Pick a random index
			swapPlace = (int) (Math.random() * (charArray.length - 1));
			// Use xor swap to swap the elements current element with the random element
			XORSwap.swap(charArray, i, charArray, swapPlace);
		}
	}

}
