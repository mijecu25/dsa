package com.mijecu25.dsa.algorithms.swap;

import java.util.List;

/**
 * Swapping algorithm that trivial swaps elements in an array by using a temporary variable.
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
 * @version 0.1.3.5
 */
public class TrivialSwap extends Swap {
   
    /**
     * Swap the elements of two arrays at the specified positions.
     * 
     * @param <E> - the type of elements in this array.
     * 
     * @param array1 - one of the arrays that will have one of its values swapped.
     * @param array1Index - the index of the first array that will be swapped.
     * @param array2 - the other array that will have one of its values swapped.
     * @param array2Index - the index of the second array that will be swapped.
     */
    public static <E> void swap(E[] array1, int array1Index, E[] array2, int array2Index) {
        // If the values are not the same
        if(array1[array1Index] != array2[array2Index]) {
            // Place the element of the first array in a variable
            E hold = array1[array1Index];
            // Set the element of the first array equal to the element in the second array
            array1[array1Index] = array2[array2Index];
            // Set the element of the second array equal to the temporary variable
            array2[array2Index] = hold;
        }
        
    }
    
    /**
     * Swap the elements of two arrays at the same position
     * 
     * @param <E> - the type of elements in this list.
     * 
     * @param array1 - one of the arrays that will have one of its values swapped.
     * @param array2 - the other array that will have one of its values swapped.
     * @param index - the index of the arrays that will have their values swapped.
     */
    public static <E> void swap(E[] array1, E[] array2, int index) {
        // Call the other method by passing the index twice
        TrivialSwap.swap(array1, index, array2, index);
    }
    
    /**
     * Swap two elements of array at the specified positions
     * 
     * @param <E> - the type of elements in this list.
     *
     * @param array - array that will have two of its values swapped.
     * @param index1 - one of the indexes of the array.
     * @param index2 - other index of the array.
     */
    public static <E> void swap(E[] array, int index1, int index2) {
        // Call the other method by passing the array twice
        TrivialSwap.swap(array, index1, array, index2);
    }
    
    /**
     * Helper method that swaps all the elements of the arrays. This method runs in 
     * O(<code>Math.min(array1.length, array2.length</code>) time.
     * 
     * @param <E> - the type of elements in this list.
     * 
     * @param array1 one array that will have its values swapped.
     * @param array2 the other array that will have its values swapped. 
     */
    public static <E> void swap(E[] array1, E[] array2) {     
        // Get the minimum length of both arrays
        int minLength = Math.min(array1.length, array2.length);
        
        // Loop through the values of the array
        for(int i = 0; i < minLength; i++) {
            // Call the method that swaps the same index
            TrivialSwap.swap(array1, array2, i);
        }
    }
    
    /**
     * Swap the elements of two lists at the specified positions. The run time of this method
     * depends on the implementation of the lists since elements are removed and added in the
     * lists.
     * 
     * @param <E> - the type of elements in this list.
     *  
     * @param list1 - one of the lists that will have one of its values swapped.
     * @param list1Index - the index of the first list that will be swapped.
     * @param list2 - the other list that will have one of its values swapped.
     * @param list2Index - the index of the second list that will be swapped.
     */
    public static <E> void swap(List<E> list1, int list1Index, List<E> list2, int list2Index) {
        // If the values are not the same
        if(list1.get(list1Index) != list2.get(list2Index)) {
            // Remove the element of the first list in a variable
            E hold = list1.remove(list1Index);            

            // If the lists are different
            if(list1 != list2 || list1Index > list2Index){
                // Set the element of the first list equal to the element in the second list
                list1.add(list1Index, list2.get(list2Index));
            }
            else {
                // Set the element of the first list equal to the element in the second list
                // We have to decrease the index since we are working on the same list
                // and we just removed an element from it
                list1.add(list1Index, list2.get(list2Index-1));
            }
            // Remove the element of the second list
            list2.remove(list2Index);
            // Set the element of the second list equal to the temporary variable
            list2.add(list2Index, hold);                
        }
        
    }
    
    /**
     * Swap all the elements of two lists at the same position. The run time of this method
     * depends on the implementation of the lists since elements are removed and added in the
     * lists.
     * 
     * @param <E> - the type of elements in this list.
     *  
     * @param intArray1 - one of the lists that will have one of its values swapped.
     * @param intArray2 - the other list that will have one of its values swapped.
     * @param index - the index of the lists that will have their values swapped.
     */
    public static <E> void swap(List<E> list1, List<E> list2, int index) {
        // Call the other method by passing the index twice
        TrivialSwap.swap(list1, index, list2, index);
    }
    
    /**
     * Swap two elements of a list at the specified positions. The run time of this method
     * depends on the implementation of the lists since elements are removed and added in the
     * lists.
     * 
     * @param <E> - the type of elements in this list.
     * 
     * @param list - list that will have two of its values swapped.
     * @param index1 - one of the indexes of the list.
     * @param index2 - other index of the list.
     */
    public static <E> void swap(List<E> list, int index1, int index2) {
        // Call the other method by passing the list twice
        TrivialSwap.swap(list, index1, list, index2);
    }
    
    /**
     * Helper method that swaps all the elements of the arrays. The run time of this method
     * depends on the implementation of the lists since elements are removed and added in the
     * lists. It also depends on the length of the shortest list.
     *  
     * @param <E> - the type of elements in this list. 
     * 
     * @param intArray1 one array that will have its values swapped.
     * @param intArray2 the other array that will have its values swapped. 
     */
    public static <E> void swap(List<E> list1, List<E> list2) {     
        // Get the minimum length of both arrays
        int minLength = Math.min(list1.size(), list2.size());
        
        // Loop through the values of the array
        for(int i = 0; i < minLength; i++) {
            // Call the method that swaps the same index
            TrivialSwap.swap(list1, list2, i);
        }
    }
    
    /**
     * Swap the elements of two int arrays at the specified positions.
     *  
     * @param intArray1 - one of the arrays that will have one of its values swapped.
     * @param array1Index - the index of the first array that will be swapped.
     * @param intArray2 - the other array that will have one of its values swapped.
     * @param array2Index - the index of the second array that will be swapped.
     */
    public static void swap(int[] intArray1, int array1Index, int[] intArray2, int array2Index) {
        // If the values are not the same
        if(intArray1[array1Index] != intArray2[array2Index]) {
            // Place the element of the first array in a variable
            int hold = intArray1[array1Index];
            // Set the element of the first array equal to the element in the second array
            intArray1[array1Index] = intArray2[array2Index];
            // Set the element of the second array equal to the temporary variable
            intArray2[array2Index] = hold;
        }
        
    }
    
    /**
     * Swap the elements of two int arrays at the same position
     *  
     * @param intArray1 - one of the arrays that will have one of its values swapped.
     * @param intArray2 - the other array that will have one of its values swapped.
     * @param index - the index of the arrays that will have their values swapped.
     */
    public static void swap(int[] intArray1, int[] intArray2, int index) {
        // Call the other method by passing the index twice
        TrivialSwap.swap(intArray1, index, intArray2, index);
    }
    
    /**
     * Swap two elements of an int array at the specified positions
     *
     * @param intArray - array that will have two of its values swapped.
     * @param index1 - one of the indexes of the array.
     * @param index2 - other index of the array.
     */
    public static void swap(int[] intArray, int index1, int index2) {
        // Call the other method by passing the array twice
        TrivialSwap.swap(intArray, index1, intArray, index2);
    }
    
    /**
     * Helper method that swaps all the elements of the arrays. This method runs in 
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
            TrivialSwap.swap(intArray1, intArray2, i);
        }
    }
    
    /**
     * Swap the elements of two char arrays at the specified positions.
     *  
     * @param charArray1 - one of the arrays that will have one of its values swapped.
     * @param array1Index - the index of the first array that will be swapped.
     * @param charArray2 - the other array that will have one of its values swapped.
     * @param array2Index - the index of the second array that will be swapped.
     */
    public static void swap(char[] charArray1, int array1Index, char[] charArray2, int array2Index) {
        // If the values are not the same
        if(charArray1[array1Index] != charArray2[array2Index]) {
            // Place the element of the first array in a variable
            char hold = charArray1[array1Index];
            // Set the element of the first array equal to the element in the second array
            charArray1[array1Index] = charArray2[array2Index];
            // Set the element of the second array equal to the temporary variable
            charArray2[array2Index] = hold;
        }
        
    }
    
    /**
     * Swap the elements of two char arrays at the same position
     *  
     * @param charArray1 - one of the arrays that will have one of its values swapped.
     * @param charArray2 - the other array that will have one of its values swapped.
     * @param index - the index of the arrays that will have their values swapped.
     */
    public static void swap(char[] charArray1, char[] charArray2, int index) {
        // Call the other method by passing the index twice
        TrivialSwap.swap(charArray1, index, charArray2, index);
    }
    
    /**
     * Swap two elements of a char array at the specified positions
     *
     * @param charArray - array that will have two of its values swapped.
     * @param index1 - one of the indexes of the array.
     * @param index2 - other index of the array.
     */
    public static void swap(char[] charArray, int index1, int index2) {
        // Call the other method by passing the array twice
        TrivialSwap.swap(charArray, index1, charArray, index2);
    }
    
    /**
     * Helper method that swaps all the elements of the arrays. This method runs in 
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
            TrivialSwap.swap(charArray1, charArray2, i);
        }
    }
    
    /**
     * Swap the elements of two byte arrays at the specified positions.
     *  
     * @param byteArray1 - one of the arrays that will have one of its values swapped.
     * @param array1Index - the index of the first array that will be swapped.
     * @param byteArray2 - the other array that will have one of its values swapped.
     * @param array2Index - the index of the second array that will be swapped.
     */
    public static void swap(byte[] byteArray1, int array1Index, byte[] byteArray2, int array2Index) {
        // If the values are not the same
        if(byteArray1[array1Index] != byteArray2[array2Index]) {
            // Place the element of the first array in a variable
            byte hold = byteArray1[array1Index];
            // Set the element of the first array equal to the element in the second array
            byteArray1[array1Index] = byteArray2[array2Index];
            // Set the element of the second array equal to the temporary variable
            byteArray2[array2Index] = hold;
        }
        
    }
    
    /**
     * Swap the elements of two byte arrays at the same position
     *  
     * @param byteArray1 - one of the arrays that will have one of its values swapped.
     * @param byteArray2 - the other array that will have one of its values swapped.
     * @param index - the index of the arrays that will have their values swapped.
     */
    public static void swap(byte[] byteArray1, byte[] byteArray2, int index) {
        // Call the other method by passing the index twice
        TrivialSwap.swap(byteArray1, index, byteArray2, index);
    }
    
    /**
     * Swap two elements of a byte array at the specified positions
     *
     * @param byteArray - array that will have two of its values swapped.
     * @param index1 - one of the indexes of the array.
     * @param index2 - other index of the array.
     */
    public static void swap(byte[] byteArray, int index1, int index2) {
        // Call the other method by passing the array twice
        TrivialSwap.swap(byteArray, index1, byteArray, index2);
    }
    
    /**
     * Helper method that swaps all the elements of the arrays. This method runs in 
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
            TrivialSwap.swap(byteArray1, byteArray2, i);
        }
    }
    
    /**
     * Swap the elements of two short arrays at the specified positions.
     *  
     * @param shortArray1 - one of the arrays that will have one of its values swapped.
     * @param array1Index - the index of the first array that will be swapped.
     * @param shortArray2 - the other array that will have one of its values swapped.
     * @param array2Index - the index of the second array that will be swapped.
     */
    public static void swap(short[] shortArray1, int array1Index, short[] shortArray2, int array2Index) {
        // If the values are not the same
        if(shortArray1[array1Index] != shortArray2[array2Index]) {
            // Place the element of the first array in a variable
            short hold = shortArray1[array1Index];
            // Set the element of the first array equal to the element in the second array
            shortArray1[array1Index] = shortArray2[array2Index];
            // Set the element of the second array equal to the temporary variable
            shortArray2[array2Index] = hold;
        }
        
    }
    
    /**
     * Swap the elements of two short arrays at the same position
     *  
     * @param shortArray1 - one of the arrays that will have one of its values swapped.
     * @param shortArray2 - the other array that will have one of its values swapped.
     * @param index - the index of the arrays that will have their values swapped.
     */
    public static void swap(short[] shortArray1, short[] shortArray2, int index) {
        // Call the other method by passing the index twice
        TrivialSwap.swap(shortArray1, index, shortArray2, index);
    }
    
    /**
     * Swap two elements of a short array at the specified positions
     *
     * @param shortArray - array that will have two of its values swapped.
     * @param index1 - one of the indexes of the array.
     * @param index2 - other index of the array.
     */
    public static void swap(short[] shortArray, int index1, int index2) {
        // Call the other method by passing the array twice
        TrivialSwap.swap(shortArray, index1, shortArray, index2);
    }
    
    /**
     * Helper method that swaps all the elements of the arrays. This method runs in 
     * O(<code>Math.min(array1.length, array2.length</code>) time.
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
            TrivialSwap.swap(shortArray1, shortArray2, i);
        }
    }
    
    /**
     * Swap the elements of two long arrays at the specified positions.
     *  
     * @param longArray1 - one of the arrays that will have one of its values swapped.
     * @param array1Index - the index of the first array that will be swapped.
     * @param longArray2 - the other array that will have one of its values swapped.
     * @param array2Index - the index of the second array that will be swapped.
     */
    public static void swap(long[] longArray1, int array1Index, long[] longArray2, int array2Index) {
        // If the values are not the same
        if(longArray1[array1Index] != longArray2[array2Index]) {
            // Place the element of the first array in a variable
            long hold = longArray1[array1Index];
            // Set the element of the first array equal to the element in the second array
            longArray1[array1Index] = longArray2[array2Index];
            // Set the element of the second array equal to the temporary variable
            longArray2[array2Index] = hold;
        }
        
    }
    
    /**
     * Swap the elements of two long arrays at the same position
     *  
     * @param longArray1 - one of the arrays that will have one of its values swapped.
     * @param longArray2 - the other array that will have one of its values swapped.
     * @param index - the index of the arrays that will have their values swapped.
     */
    public static void swap(long[] longArray1, long[] longArray2, int index) {
        // Call the other method by passing the index twice
        TrivialSwap.swap(longArray1, index, longArray2, index);
    }
    
    /**
     * Swap two elements of a long array at the specified positions
     *
     * @param longArray - array that will have two of its values swapped.
     * @param index1 - one of the indexes of the array.
     * @param index2 - other index of the array.
     */
    public static void swap(long[] longArray, int index1, int index2) {
        // Call the other method by passing the array twice
        TrivialSwap.swap(longArray, index1, longArray, index2);
    }
    
    /**
     * Helper method that swaps all the elements of the arrays. This method runs in 
     * O(<code>Math.min(array1.length, array2.length</code>) time.
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
            TrivialSwap.swap(longArray1, longArray2, i);
        }
    }
    
    /**
     * Swap the elements of two float arrays at the specified positions.
     *  
     * @param floatArray1 - one of the arrays that will have one of its values swapped.
     * @param array1Index - the index of the first array that will be swapped.
     * @param floatArray2 - the other array that will have one of its values swapped.
     * @param array2Index - the index of the second array that will be swapped.
     */
    public static void swap(float[] floatArray1, int array1Index, float[] floatArray2, int array2Index) {
        // If the values are not the same
        if(floatArray1[array1Index] != floatArray2[array2Index]) {
            // Place the element of the first array in a variable
            float hold = floatArray1[array1Index];
            // Set the element of the first array equal to the element in the second array
            floatArray1[array1Index] = floatArray2[array2Index];
            // Set the element of the second array equal to the temporary variable
            floatArray2[array2Index] = hold;
        }
        
    }
    
    /**
     * Swap the elements of two float arrays at the same position
     *  
     * @param floatArray1 - one of the arrays that will have one of its values swapped.
     * @param floatArray2 - the other array that will have one of its values swapped.
     * @param index - the index of the arrays that will have their values swapped.
     */
    public static void swap(float[] floatArray1, float[] floatArray2, int index) {
        // Call the other method by passing the index twice
        TrivialSwap.swap(floatArray1, index, floatArray2, index);
    }
    
    /**
     * Swap two elements of a float array at the specified positions
     *
     * @param floatArray - array that will have two of its values swapped.
     * @param index1 - one of the indexes of the array.
     * @param index2 - other index of the array.
     */
    public static void swap(float[] floatArray, int index1, int index2) {
        // Call the other method by passing the array twice
        TrivialSwap.swap(floatArray, index1, floatArray, index2);
    }
    
    /**
     * Helper method that swaps all the elements of the arrays. This method runs in 
     * O(<code>Math.min(array1.length, array2.length</code>) time.
     *  
     * @param floatArray1 one array that will have its values swapped.
     * @param floatArray2 the other array that will have its values swapped. 
     */
    public static void swap(float[] floatArray1, float[] floatArray2) {     
        // Get the minimum length of both arrays
        int minLength = Math.min(floatArray1.length, floatArray2.length);
        
        // Loop through the values of the array
        for(int i = 0; i < minLength; i++) {
            // Call the method that swaps the same index
            TrivialSwap.swap(floatArray1, floatArray2, i);
        }
    }
    
    /**
     * Swap the elements of two double arrays at the specified positions.
     *  
     * @param doubleArray1 - one of the arrays that will have one of its values swapped.
     * @param array1Index - the index of the first array that will be swapped.
     * @param doubleArray2 - the other array that will have one of its values swapped.
     * @param array2Index - the index of the second array that will be swapped.
     */
    public static void swap(double[] doubleArray1, int array1Index, double[] doubleArray2, int array2Index) {
        // If the values are not the same
        if(doubleArray1[array1Index] != doubleArray2[array2Index]) {
            // Place the element of the first array in a variable
            double hold = doubleArray1[array1Index];
            // Set the element of the first array equal to the element in the second array
            doubleArray1[array1Index] = doubleArray2[array2Index];
            // Set the element of the second array equal to the temporary variable
            doubleArray2[array2Index] = hold;
        }
        
    }
    
    /**
     * Swap the elements of two double arrays at the same position
     *  
     * @param doubleArray1 - one of the arrays that will have one of its values swapped.
     * @param doubleArray2 - the other array that will have one of its values swapped.
     * @param index - the index of the arrays that will have their values swapped.
     */
    public static void swap(double[] doubleArray1, double[] doubleArray2, int index) {
        // Call the other method by passing the index twice
        TrivialSwap.swap(doubleArray1, index, doubleArray2, index);
    }
    
    /**
     * Swap two elements of a double array at the specified positions
     *
     * @param doubleArray - array that will have two of its values swapped.
     * @param index1 - one of the indexes of the array.
     * @param index2 - other index of the array.
     */
    public static void swap(double[] doubleArray, int index1, int index2) {
        // Call the other method by passing the array twice
        TrivialSwap.swap(doubleArray, index1, doubleArray, index2);
    }
    
    /**
     * Helper method that swaps all the elements of the arrays. This method runs in 
     * O(<code>Math.min(array1.length, array2.length</code>) time.
     *  
     * @param doubleArray1 one array that will have its values swapped.
     * @param doubleArray2 the other array that will have its values swapped. 
     */
    public static void swap(double[] doubleArray1, double[] doubleArray2) {     
        // Get the minimum length of both arrays
        int minLength = Math.min(doubleArray1.length, doubleArray2.length);
        
        // Loop through the values of the array
        for(int i = 0; i < minLength; i++) {
            // Call the method that swaps the same index
            TrivialSwap.swap(doubleArray1, doubleArray2, i);
        }
    }
    
}
