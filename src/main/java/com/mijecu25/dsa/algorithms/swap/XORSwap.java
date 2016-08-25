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
 * @author Miguel Velez - miguelvelezmj25
 * @version 0.2.0.2
 */
public final class XORSwap extends Swap {
	
    /**
     * Don't let anyone instantiate this class
     */
    private XORSwap() { ; }
    
	/**
     * Swap the elements of two long arrays at the specified positions.
	 * 
	 * @param intArray1 one of the arrays that will have one of its values swapped.
	 * @param array1Index index of the first array that will be swapped.
	 * @param intArray2 other array that will have one of its values swapped.
	 * @param array2Index index of the second array that will be swapped.
	 */
	public static void swap(int[] intArray1, int array1Index, int[] intArray2, int array2Index) {
		if(intArray1[array1Index] != intArray2[array2Index]) {
			intArray1[array1Index] = intArray1[array1Index] ^ intArray2[array2Index];
			intArray2[array2Index] = intArray1[array1Index] ^ intArray2[array2Index];
			intArray1[array1Index] = intArray1[array1Index] ^ intArray2[array2Index];
		}
		
	}
	
	/**
	 * Swap the elements of two int arrays at the same position
	 * 
	 * @param intArray1 one of the arrays that will have one of its values swapped.
	 * @param intArray2 other array that will have one of its values swapped.
	 * @param index index of the arrays that will have their values swapped.
	 */
	public static void swap(int[] intArray1, int[] intArray2, int index) {
		XORSwap.swap(intArray1, index, intArray2, index);
	}
    /**
     * Swap two elements of an int array at the specified positions
     *
     * @param intArray array that will have two of its values swapped.
     * @param index1 one of the indexes of the array.
     * @param index2 other index of the array.
     */
    public static void swap(int[] intArray, int index1, int index2) {
        XORSwap.swap(intArray, index1, intArray, index2);
    }
	/**
	 * Helper method that swaps all the elements of the arrays. This method runs in 
	 * O(<code>Math.min(array1.length, array2.length</code>) time.
	 * 
	 * @param intArray1 one array that will have its values swapped.
	 * @param intArray2 other array that will have its values swapped. 
	 */
	public static void swap(int[] intArray1, int[] intArray2) {		
	    int minLength = Math.min(intArray1.length, intArray2.length);
	    
		for(int i = 0; i < minLength; i++) {
			XORSwap.swap(intArray1, intArray2, i);
		}
	}
	
	/**
     * Swap the elements of two long arrays at the specified positions.
     * 
     * @param longArray1 one of the arrays that will have one of its values swapped.
     * @param array1Index index of the first array that will be swapped.
     * @param longArray2 other array that will have one of its values swapped.
     * @param array2Index index of the second array that will be swapped.
     */
    public static void swap(long[] longArray1, int array1Index, long[] longArray2, int array2Index) {
        if(longArray1[array1Index] != longArray2[array2Index]) {
            longArray1[array1Index] = longArray1[array1Index] ^ longArray2[array2Index];
            longArray2[array2Index] = longArray1[array1Index] ^ longArray2[array2Index];
            longArray1[array1Index] = longArray1[array1Index] ^ longArray2[array2Index];
        }
        
    }
    
    /**
     * Swap the elements of two long arrays at the same position
     * 
     * @param longArray1 one of the arrays that will have one of its values swapped.
     * @param longArray2 other array that will have one of its values swapped.
     * @param index index of the arrays that will have their values swapped.
     */
    public static void swap(long[] longArray1, long[] longArray2, int index) {
        XORSwap.swap(longArray1, index, longArray2, index);
    }
    /**
     * Swap two elements of a long array at the specified positions
     *
     * @param longArray array that will have two of its values swapped.
     * @param index1 one of the indexes of the array.
     * @param index2 other index of the array.
     */
    public static void swap(long[] longArray, int index1, int index2) {
        XORSwap.swap(longArray, index1, longArray, index2);
    }
    
    /**
     * Helper method that swaps all the elements of the array. This method runs in 
     * O(<code>Math.min(array1.length, array2.length</code>) time.
     * 
     * @param longArray1 one array that will have its values swapped.
     * @param longArray2 other array that will have its values swapped. 
     */
    public static void swap(long[] longArray1, long[] longArray2) {     
        int minLength = Math.min(longArray1.length, longArray2.length);
        
        for(int i = 0; i < minLength; i++) {
            XORSwap.swap(longArray1, longArray2, i);
        }
    }
    
    /**
     * Swap the elements of two char arrays at the specified positions.
     * 
     * @param charArray1 one of the arrays that will have one of its values swapped.
     * @param array1Index index of the first array that will be swapped.
     * @param charArray2 other array that will have one of its values swapped.
     * @param array2Index index of the second array that will be swapped.
     */
    public static void swap(char[] charArray1, int array1Index, char[] charArray2, int array2Index) {
        if(charArray1[array1Index] != charArray2[array2Index]) {
            charArray1[array1Index] = (char) (charArray1[array1Index] ^ charArray2[array2Index]);
            charArray2[array2Index] = (char) (charArray1[array1Index] ^ charArray2[array2Index]);
            charArray1[array1Index] = (char) (charArray1[array1Index] ^ charArray2[array2Index]);
        }
        
    }
    
    /**
     * Swap the elements of two char arrays at the same position
     * 
     * @param charArray1 one of the arrays that will have one of its values swapped.
     * @param charArray2 other array that will have one of its values swapped.
     * @param index index of the arrays that will have their values swapped.
     */
    public static void swap(char[] charArray1, char[] charArray2, int index) {
        XORSwap.swap(charArray1, index, charArray2, index);
    }
    /**
     * Swap two elements of a char array at the specified positions
     *
     * @param charArray array that will have two of its values swapped.
     * @param index1 one of the indexes of the array.
     * @param index2 other index of the array.
     */
    public static void swap(char[] charArray, int index1, int index2) {
        XORSwap.swap(charArray, index1, charArray, index2);
    }
    
    /**
     * Helper method that swaps all the elements of the array. This method runs in 
     * O(<code>Math.min(array1.length, array2.length</code>) time.
     * 
     * @param charArray1 one array that will have its values swapped.
     * @param charArray2 other array that will have its values swapped. 
     */
    public static void swap(char[] charArray1, char[] charArray2) {     
        int minLength = Math.min(charArray1.length, charArray2.length);
        
        for(int i = 0; i < minLength; i++) {
            XORSwap.swap(charArray1, charArray2, i);
        }
    }
    
    /**
     * Swap the elements of two byte arrays at the specified positions.
     * 
     * @param byteArray1 one of the arrays that will have one of its values swapped.
     * @param array1Index index of the first array that will be swapped.
     * @param byteArray2 other array that will have one of its values swapped.
     * @param array2Index index of the second array that will be swapped.
     */
    public static void swap(byte[] byteArray1, int array1Index, byte[] byteArray2, int array2Index) {
        if(byteArray1[array1Index] != byteArray2[array2Index]) {
            byteArray1[array1Index] = (byte) (byteArray1[array1Index] ^ byteArray2[array2Index]);
            byteArray2[array2Index] = (byte) (byteArray1[array1Index] ^ byteArray2[array2Index]);
            byteArray1[array1Index] = (byte) (byteArray1[array1Index] ^ byteArray2[array2Index]);
        }
        
    }
    
    /**
     * Swap the elements of two byte arrays at the same position
     * 
     * @param byteArray1 one of the arrays that will have one of its values swapped.
     * @param byteArray2 other array that will have one of its values swapped.
     * @param index index of the arrays that will have their values swapped.
     */
    public static void swap(byte[] byteArray1, byte[] byteArray2, int index) {
        XORSwap.swap(byteArray1, index, byteArray2, index);
    }
    /**
     * Swap two elements of a byte array at the specified positions
     *
     * @param byteArray array that will have two of its values swapped.
     * @param index1 one of the indexes of the array.
     * @param index2 other index of the array.
     */
    public static void swap(byte[] byteArray, int index1, int index2) {
        XORSwap.swap(byteArray, index1, byteArray, index2);
    }
    
    /**
     * Helper method that swaps all the elements of the array. This method runs in 
     * O(<code>Math.min(array1.length, array2.length</code>) time.
     * 
     * @param byteArray1 one array that will have its values swapped.
     * @param byteArray2 other array that will have its values swapped. 
     */
    public static void swap(byte[] byteArray1, byte[] byteArray2) {     
        int minLength = Math.min(byteArray1.length, byteArray2.length);
        
        for(int i = 0; i < minLength; i++) {
            XORSwap.swap(byteArray1, byteArray2, i);
        }
    }
    
    /**
     * Swap the elements of two long arrays at the specified positions.
     * 
     * @param shortArray1 one of the arrays that will have one of its values swapped.
     * @param array1Index index of the first array that will be swapped.
     * @param shortArray2 other array that will have one of its values swapped.
     * @param array2Index index of the second array that will be swapped.
     */
    public static void swap(short[] shortArray1, int array1Index, short[] shortArray2, int array2Index) {
        if(shortArray1[array1Index] != shortArray2[array2Index]) {
            shortArray1[array1Index] = (short) (shortArray1[array1Index] ^ shortArray2[array2Index]);
            shortArray2[array2Index] = (short) (shortArray1[array1Index] ^ shortArray2[array2Index]);
            shortArray1[array1Index] = (short) (shortArray1[array1Index] ^ shortArray2[array2Index]);
        }
        
    }
    
    /**
     * Swap the elements of short long arrays at the same position
     * 
     * @param shortArray1 one of the arrays that will have one of its values swapped.
     * @param shortArray2 other array that will have one of its values swapped.
     * @param index index of the arrays that will have their values swapped.
     */
    public static void swap(short[] shortArray1, short[] shortArray2, int index) {
        XORSwap.swap(shortArray1, index, shortArray2, index);
    }
    /**
     * Swap two elements of a short array at the specified positions
     *
     * @param shortArray array that will have two of its values swapped.
     * @param index1 one of the indexes of the array.
     * @param index2 other index of the array.
     */
    public static void swap(short[] shortArray, int index1, int index2) {
        XORSwap.swap(shortArray, index1, shortArray, index2);
    }
    
    /**
     * Helper method that swaps all the elements of the array. This method runs in 
     * O(<code>Math.min(array1.length, array2.length</code>) time.
     * 
     * @param shortArray1 one array that will have its values swapped.
     * @param shortArray2 other array that will have its values swapped. 
     */
    public static void swap(short[] shortArray1, short[] shortArray2) {     
        int minLength = Math.min(shortArray1.length, shortArray2.length);
        
        for(int i = 0; i < minLength; i++) {
            XORSwap.swap(shortArray1, shortArray2, i);
        }
    }
        
}
