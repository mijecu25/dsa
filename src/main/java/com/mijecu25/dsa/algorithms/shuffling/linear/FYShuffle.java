package com.mijecu25.dsa.algorithms.shuffling.linear;

import com.mijecu25.dsa.algorithms.shuffling.Shuffle;

/**
 * FYShuffle class that uses the Fisher–Yates shuffle to shuffle
 * elements in arrays. 
 * 
 * @author Miguel Velez
 * @version 0.1.2.3
 */
public final class FYShuffle extends Shuffle {
	
	/**
	 * Don't let anyone instantiate this class
	 */
	private FYShuffle() {
		;
	}
	
	/**
	 * Randomly shuffle the elements in an array  
	 * 
	 * <br>
	 * <br>
	 * 
	 * <i>Runtime: </i> O(n)
	 * 
	 * @param intArray an array of objects to shuffle.
	 */
	public static void shuffle(Object[] array) {
		Object hold = null;
		int arrayLength = array.length;
		int swapPlace = -1;
		
		// Loop through the entire array
		for(int i = 0; i < array.length; i++) {
			hold = array[i];
			swapPlace = (int) (Math.random() * (arrayLength - i));
			array[i] = array[swapPlace];
			array[swapPlace] = hold;
		}
	}
	
	/**
	 * Randomly shuffle an int array  
	 * 
	 * <br>
	 * <br>
	 * 
	 * <i>Runtime: </i> O(n)
	 * 
	 * @param intArray array of integers to shuffle.
	 */
	public static void shuffle(int[] intArray) {
		// Create an array of Integer objects
		Integer[] objectArray = new Integer[intArray.length];
		
		// Loop through all the elements in the int array
		for(int i = 0; i < intArray.length; i++) {
			// Create a new integer object from each element
			objectArray[i] = Integer.valueOf(intArray[i]);
		}
		
		// Shuffle the integer object array
		FYShuffle.shuffle(objectArray);
		
		// Loop through all the elements in the integer object array
		for(int i = 0; i < intArray.length; i++) {
			// Put the in the original primitive array
			intArray[i] = Integer.valueOf(objectArray[i]);
		}
	}
	
	/**
	 * Randomly shuffle an float array  
	 * 
	 * <br>
	 * <br>
	 * 
	 * <i>Runtime: </i> O(n)
	 * 
	 * @param floatArray array of floats to shuffle.
	 */
	public static void shuffle(float[] floatArray) {
		// Create an array of Float objects
		Float[] objectArray = new Float[floatArray.length];
		
		// Loop through all the elements in the float array
		for(int i = 0; i < floatArray.length; i++) {
			// Create a new float object from each element
			objectArray[i] = Float.valueOf(floatArray[i]);
		}
		
		// Shuffle the float object array
		FYShuffle.shuffle(objectArray);
		
		// Loop through all the elements in the float object array
		for(int i = 0; i < floatArray.length; i++) {
			// Put the in the original primitive array
			floatArray[i] = Float.valueOf(objectArray[i]);
		}
	}
	
	/**
	 * Randomly shuffle an byte array  
	 * 
	 * <br>
	 * <br>
	 * 
	 * <i>Runtime: </i> O(n)
	 * 
	 * @param byteArray array of bytes to shuffle.
	 */
	public static void shuffle(byte[] byteArray) {
		// Create an array of Byte objects
		Byte[] objectArray = new Byte[byteArray.length];
		
		// Loop through all the elements in the byte array
		for(int i = 0; i < byteArray.length; i++) {
			// Create a new byte object from each element
			objectArray[i] = Byte.valueOf(byteArray[i]);
		}
		
		// Shuffle the byte object array
		FYShuffle.shuffle(objectArray);
		
		// Loop through all the elements in the byte object array
		for(int i = 0; i < byteArray.length; i++) {
			// Put the in the original primitive array
			byteArray[i] = Byte.valueOf(objectArray[i]);
		}
	}
	
	/**
	 * Randomly shuffle an short array  
	 * 
	 * <br>
	 * <br>
	 * 
	 * <i>Runtime: </i> O(n)
	 * 
	 * @param shortArray array of short to shuffle.
	 */
	public static void shuffle(short[] shortArray) {
		// Create an array of Short objects
		Short[] objectArray = new Short[shortArray.length];
		
		// Loop through all the elements in the short array
		for(int i = 0; i < shortArray.length; i++) {
			// Create a new short object from each element
			objectArray[i] = Short.valueOf(shortArray[i]);
		}
		
		// Shuffle the short object array
		FYShuffle.shuffle(objectArray);
		
		// Loop through all the elements in the short object array
		for(int i = 0; i < shortArray.length; i++) {
			// Put the in the original primitive array
			shortArray[i] = Short.valueOf(objectArray[i]);
		}
	}
	
	/**
	 * Randomly shuffle an long array  
	 * 
	 * <br>
	 * <br>
	 * 
	 * <i>Runtime: </i> O(n)
	 * 
	 * @param longArray array of long to shuffle.
	 */
	public static void shuffle(long[] longArray) {
		// Create an array of Long objects
		Long[] objectArray = new Long[longArray.length];
		
		// Loop through all the elements in the long array
		for(int i = 0; i < longArray.length; i++) {
			// Create a new long object from each element
			objectArray[i] = Long.valueOf(longArray[i]);
		}
		
		// Shuffle the long object array
		FYShuffle.shuffle(objectArray);
		
		// Loop through all the elements in the long object array
		for(int i = 0; i < longArray.length; i++) {
			// Put the in the original primitive array
			longArray[i] = Long.valueOf(objectArray[i]);
		}
	}
	
	/**
	 * Randomly shuffle an double array  
	 * 
	 * <br>
	 * <br>
	 * 
	 * <i>Runtime: </i> O(n)
	 * 
	 * @param doubleArray array of double to shuffle.
	 */
	public static void shuffle(double[] doubleArray) {
		// Create an array of Double objects
		Double[] objectArray = new Double[doubleArray.length];
		
		// Loop through all the elements in the double array
		for(int i = 0; i < doubleArray.length; i++) {
			// Create a new double object from each element
			objectArray[i] = Double.valueOf(doubleArray[i]);
		}
		
		// Shuffle the double object array
		FYShuffle.shuffle(objectArray);
		
		// Loop through all the elements in the double object array
		for(int i = 0; i < doubleArray.length; i++) {
			// Put the in the original primitive array
			doubleArray[i] = Double.valueOf(objectArray[i]);
		}
	}
	
	/**
	 * Randomly shuffle a char array  
	 * 
	 * <br>
	 * <br>
	 * 
	 * <i>Runtime: </i> O(n)
	 * 
	 * @param charArray array of char to shuffle.
	 */
	public static void shuffle(char[] charArray) {
		// Create an array of Character objects
		Character[] objectArray = new Character[charArray.length];
		
		// Loop through all the elements in the character array
		for(int i = 0; i < charArray.length; i++) {
			// Create a new character object from each element
			objectArray[i] = Character.valueOf(charArray[i]);
		}
		
		// Shuffle the character object array
		FYShuffle.shuffle(objectArray);
		
		// Loop through all the elements in the character object array
		for(int i = 0; i < charArray.length; i++) {
			// Put the in the original primitive array
			charArray[i] = Character.valueOf(objectArray[i]);
		}
	}

}
