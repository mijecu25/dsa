package com.mijecu25.dsa.algorithms.shuffle.linear;

import java.util.List;

import com.mijecu25.dsa.algorithms.shuffle.Shuffle;
import com.mijecu25.dsa.algorithms.swap.TrivialSwap;
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
 * @author Miguel Velez - miguelvelezmj25
 * @version 0.2.0.2s
 */
public final class FYShuffle extends Shuffle {
    /**
	 * Don't let anyone instantiate this class
	 */
	private FYShuffle() { ; }
	
	/**
	 * Randomly shuffle the elements in an array  
	 * 
     * @param <E> the type of elements in this arrays.
	 * 
	 * @param array an array of objects to shuffle.
	 */
	public static <E> void shuffle(E[] array) {
		int swapPlace = -1;
		
		for(int i = 0; i < array.length; i++) {
            swapPlace = (int) (Math.random() * (array.length - 1 ));
            TrivialSwap.swap(array, i, swapPlace);
		}
	}
	
	/**
     * Randomly shuffle the elements in a list
	 * 
     * @param <E> the type of elements in this list.
	 * 
	 * @param list a list of objects to shuffle.
	 */
	public static <E> void shuffle(List<E> list) {
        int swapPlace = -1;
        
        for(int i = 0; i < list.size(); i++) { 
            swapPlace = (int) (Math.random() * (list.size() - 1));
            TrivialSwap.swap(list, i, swapPlace);
        }
	}
	
	/**
	 * Randomly shuffle an int array  
	 *  
	 * @param intArray array of integers to shuffle.
	 */
	public static void shuffle(int[] intArray) {
		int swapPlace = -1;

		for(int i = 0; i < intArray.length; i++) {
			swapPlace = (int) (Math.random() * (intArray.length - 1 ));
			XORSwap.swap(intArray, i, swapPlace);
		}
	}
	
	/**
	 * Randomly shuffle an float array  
	 * 
	 * @param floatArray array of floats to shuffle.
	 */
	public static void shuffle(float[] floatArray) {
		int swapPlace = -1;

		for(int i = 0; i < floatArray.length; i++) {
            swapPlace = (int) (Math.random() * (floatArray.length - 1 ));
            TrivialSwap.swap(floatArray, i, swapPlace);
		}
	}
	
	/**
	 * Randomly shuffle an byte array  
	 * 
	 * @param byteArray array of bytes to shuffle.
	 */
	public static void shuffle(byte[] byteArray) {
		int swapPlace = -1;

		for(int i = 0; i < byteArray.length; i++) {
			swapPlace = (int) (Math.random() * (byteArray.length - 1 ));
			XORSwap.swap(byteArray, i, swapPlace);
		}
	}
	
	/**
	 * Randomly shuffle an short array  
	 * 
	 * @param shortArray array of short to shuffle.
	 */
	public static void shuffle(short[] shortArray) {
		int swapPlace = -1;

		for(int i = 0; i < shortArray.length; i++) {
			swapPlace = (int) (Math.random() * (shortArray.length - 1 ));
			XORSwap.swap(shortArray, i, swapPlace);
		}
	}
	
	/**
	 * Randomly shuffle an long array  
	 * 
	 * @param longArray array of long to shuffle.
	 */
	public static void shuffle(long[] longArray) {
		int swapPlace = -1;

		for(int i = 0; i < longArray.length; i++) {
			swapPlace = (int) (Math.random() * (longArray.length - 1 ));
			XORSwap.swap(longArray, i, swapPlace);
		}
	}
	
	/**
	 * Randomly shuffle a double array  
	 * 
	 * @param doubleArray array of double to shuffle.
	 */
	public static void shuffle(double[] doubleArray) {
		int swapPlace = -1;

		for(int i = 0; i < doubleArray.length; i++) {
            swapPlace = (int) (Math.random() * (doubleArray.length - 1 ));
            TrivialSwap.swap(doubleArray, i, swapPlace);
		}
	}
	
	/**
	 * Randomly shuffle a char array  
	 * 
	 * @param charArray array of char to shuffle.
	 */
	public static void shuffle(char[] charArray) {
		int swapPlace = -1;

		for(int i = 0; i < charArray.length; i++) {
			swapPlace = (int) (Math.random() * (charArray.length - 1 ));
			XORSwap.swap(charArray, i, swapPlace);
		}
	}
}
