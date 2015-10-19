package com.mijecu25.dsa.algorithms.swap;

/**
 * Swapping algorithm that uses the XOR operation to swap elements in an array. This class does
 * not support arrays of type <code>float</code> and <code>double</code> since the <code>^</code>
 * is not supported for those types. 
 * 
 * <br>
 * <br>
 * 
 * All of the methods run in O(1) time. The helper methods that swap all of the elements of
 * the array run in O(Math.min(<code>array1.length, array2.length</code>) time.
 * 
 * <br>
 * <br>
 * 
 * <i>Runtime: </i> O(1)
 * 
 * @author Miguel Velez
 * @version 0.1.3.2
 */
public class XORSwap extends Swap {
	
	/**
     * Helper method that swaps all the elements of the array. This method runs in 
     * O(<code>Math.min(array1.length, array2.length</code>) time.
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
		
	}
	
	/**
	 * Swap all the elements of two int arrays at the same position
	 * 
	 * @param intArray1 one of the arrays that will have one of its values swapped.
	 * @param intArray2 the other array that will have one of its values swapped.
	 * @param index the index of the arrays that will have their values swapped.
	 */
	public static void swap(int[] intArray1, int[] intArray2, int index) {
		// Call the other method by passing the index twice
		XORSwap.swap(intArray1, index, intArray2, index);
	}
	
	/**
	 * Helper method that swaps all the elements of the array. This method runs in 
	 * O(<code>Math.min(array1.length, array2.length</code>) time.
	 * 
	 * @param intArray1 one array that will have its values swapped.
	 * @param intArray2 the other array that will have its values swapped. 
	 */
	public static void swap(int[] intArray1, int[] intArray2) {		
	    // Get the minimum length of both arrays
	    int minLength = Math.min(intArray1.length, intArray2.length);
	    
		// Loop through the values of the array
		for(int i = 0; i < minLength; i++) {
			// Call the method that swaps the same index
			XORSwap.swap(intArray1, intArray2, i);
		}
	}
	
	/**
     * Helper method that swaps all the elements of the array. This method runs in 
     * O(<code>Math.min(array1.length, array2.length</code>) time.
     * 
     * @param longArray1 one of the arrays that will have one of its values swapped.
     * @param array1Index the index of the first array that will be swapped.
     * @param longArray2 the other array that will have one of its values swapped.
     * @param array2Index the index of the second array that will be swapped.
     */
    public static void swap(long[] longArray1, int array1Index, long[] longArray2, int array2Index) {
        // If the values are not the same
        if(longArray1[array1Index] != longArray2[array2Index]) {
            longArray1[array1Index] = longArray1[array1Index] ^ longArray2[array2Index];
            longArray2[array2Index] = longArray1[array1Index] ^ longArray2[array2Index];
            longArray1[array1Index] = longArray1[array1Index] ^ longArray2[array2Index];
        }
        
    }
    
    /**
     * Swap all the elements of two long arrays at the same position
     * 
     * @param longArray1 one of the arrays that will have one of its values swapped.
     * @param longArray2 the other array that will have one of its values swapped.
     * @param index the index of the arrays that will have their values swapped.
     */
    public static void swap(long[] longArray1, long[] longArray2, int index) {
        // Call the other method by passing the index twice
        XORSwap.swap(longArray1, index, longArray2, index);
    }
    
    /**
     * Swap all the elements of the array
     * 
     * @param longArray1 one array that will have its values swapped.
     * @param longArray2 the other array that will have its values swapped. 
     */
    public static void swap(long[] longArray1, long[] longArray2) {     
        // Get the minimum length of both arrays
        int minLength = Math.min(longArray1.length, longArray2.length);
        
        // Loop through the values of the array
        for(int i = 0; i < minLength; i++) {
            // Call the method that swaps the same index
            XORSwap.swap(longArray1, longArray2, i);
        }
    }
    
    /**
     * Swap the elements of two char arrays at the specified positions.
     * 
     * @param charArray1 one of the arrays that will have one of its values swapped.
     * @param array1Index the index of the first array that will be swapped.
     * @param charArray2 the other array that will have one of its values swapped.
     * @param array2Index the index of the second array that will be swapped.
     */
    public static void swap(char[] charArray1, int array1Index, char[] charArray2, int array2Index) {
        // If the values are not the same
        if(charArray1[array1Index] != charArray2[array2Index]) {
            charArray1[array1Index] = (char) (charArray1[array1Index] ^ charArray2[array2Index]);
            charArray2[array2Index] = (char) (charArray1[array1Index] ^ charArray2[array2Index]);
            charArray1[array1Index] = (char) (charArray1[array1Index] ^ charArray2[array2Index]);
        }
        
    }
    
    /**
     * Swap all the elements of two char arrays at the same position
     * 
     * @param charArray1 one of the arrays that will have one of its values swapped.
     * @param charArray2 the other array that will have one of its values swapped.
     * @param index the index of the arrays that will have their values swapped.
     */
    public static void swap(char[] charArray1, char[] charArray2, int index) {
        // Call the other method by passing the index twice
        XORSwap.swap(charArray1, index, charArray2, index);
    }
    
    /**
     * Helper method that swaps all the elements of the array. This method runs in 
     * O(<code>Math.min(array1.length, array2.length</code>) time.
     * 
     * @param charArray1 one array that will have its values swapped.
     * @param charArray2 the other array that will have its values swapped. 
     */
    public static void swap(char[] charArray1, char[] charArray2) {     
        // Get the minimum length of both arrays
        int minLength = Math.min(charArray1.length, charArray2.length);
        
        // Loop through the values of the array
        for(int i = 0; i < minLength; i++) {
            // Call the method that swaps the same index
            XORSwap.swap(charArray1, charArray2, i);
        }
    }
    
    /**
     * Swap the elements of two byte arrays at the specified positions.
     * 
     * @param byteArray1 one of the arrays that will have one of its values swapped.
     * @param array1Index the index of the first array that will be swapped.
     * @param byteArray2 the other array that will have one of its values swapped.
     * @param array2Index the index of the second array that will be swapped.
     */
    public static void swap(byte[] byteArray1, int array1Index, byte[] byteArray2, int array2Index) {
        // If the values are not the same
        if(byteArray1[array1Index] != byteArray2[array2Index]) {
            byteArray1[array1Index] = (byte) (byteArray1[array1Index] ^ byteArray2[array2Index]);
            byteArray2[array2Index] = (byte) (byteArray1[array1Index] ^ byteArray2[array2Index]);
            byteArray1[array1Index] = (byte) (byteArray1[array1Index] ^ byteArray2[array2Index]);
        }
        
    }
    
    /**
     * Swap all the elements of two byte arrays at the same position
     * 
     * @param byteArray1 one of the arrays that will have one of its values swapped.
     * @param byteArray2 the other array that will have one of its values swapped.
     * @param index the index of the arrays that will have their values swapped.
     */
    public static void swap(byte[] byteArray1, byte[] byteArray2, int index) {
        // Call the other method by passing the index twice
        XORSwap.swap(byteArray1, index, byteArray2, index);
    }
    
    /**
     * Helper method that swaps all the elements of the array. This method runs in 
     * O(<code>Math.min(array1.length, array2.length</code>) time.
     * 
     * @param byteArray1 one array that will have its values swapped.
     * @param byteArray2 the other array that will have its values swapped. 
     */
    public static void swap(byte[] byteArray1, byte[] byteArray2) {     
        // Get the minimum length of both arrays
        int minLength = Math.min(byteArray1.length, byteArray2.length);
        
        // Loop through the values of the array
        for(int i = 0; i < minLength; i++) {
            // Call the method that swaps the same index
            XORSwap.swap(byteArray1, byteArray2, i);
        }
    }
    
    /**
     * Helper method that swaps all the elements of the array. This method runs in 
     * O(<code>Math.min(array1.length, array2.length</code>) time.
     * 
     * @param shortArray1 one of the arrays that will have one of its values swapped.
     * @param array1Index the index of the first array that will be swapped.
     * @param shortArray2 the other array that will have one of its values swapped.
     * @param array2Index the index of the second array that will be swapped.
     */
    public static void swap(short[] shortArray1, int array1Index, short[] shortArray2, int array2Index) {
        // If the values are not the same
        if(shortArray1[array1Index] != shortArray2[array2Index]) {
            shortArray1[array1Index] = (short) (shortArray1[array1Index] ^ shortArray2[array2Index]);
            shortArray2[array2Index] = (short) (shortArray1[array1Index] ^ shortArray2[array2Index]);
            shortArray1[array1Index] = (short) (shortArray1[array1Index] ^ shortArray2[array2Index]);
        }
        
    }
    
    /**
     * Swap all the elements of short long arrays at the same position
     * 
     * @param shortArray1 one of the arrays that will have one of its values swapped.
     * @param shortArray2 the other array that will have one of its values swapped.
     * @param index the index of the arrays that will have their values swapped.
     */
    public static void swap(short[] shortArray1, short[] shortArray2, int index) {
        // Call the other method by passing the index twice
        XORSwap.swap(shortArray1, index, shortArray2, index);
    }
    
    /**
     * Swap all the elements of the array
     * 
     * @param shortArray1 one array that will have its values swapped.
     * @param shortArray2 the other array that will have its values swapped. 
     */
    public static void swap(short[] shortArray1, short[] shortArray2) {     
        // Get the minimum length of both arrays
        int minLength = Math.min(shortArray1.length, shortArray2.length);
        
        // Loop through the values of the array
        for(int i = 0; i < minLength; i++) {
            // Call the method that swaps the same index
            XORSwap.swap(shortArray1, shortArray2, i);
        }
    }
        
}
