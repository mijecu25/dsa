package com.mijecu25.dsa.algorithms.search.linear;

import com.mijecu25.dsa.algorithms.search.Search;

/**
 * Search algorithm that linearly searches for an element in an collection. All methods return the 
 * index where the elements was found in the collection.
 *  
 * <br>
 * <br>
 * 
 * <i>Runtime: </i> O(n)
 * 
 * @author Miguel Velez - miguelvelezmj25
 * @version 0.1.3.1
 */
public class LinearSearch extends Search {
    
    /**
     * Search for the value in the array.
     * 
     * @param <E> - the type of elements in this array.
     * 
     * @param array - array that we are searching in.
     * @param value - value that is being searched in the array.
     * 
     * @return the index where the value is found in the array, else -1.
     */
    public static <E> int search(E[] array, E value) { 
        // Loop through the entire array
        for(int i = 0; i < array.length; i++) {
            // If the current value equals the value we are looking for
            if(array[i] == value) {
                // Return the index
                return i;
            }
        }
        
        // If the method has not returned by this point, it means that the
        // value was not found. So we return -1
        return -1;
    }
    
    /**
     * Search for the value in the int array.
     *  
     * @param intArray - array that we are searching in.
     * @param value - value that is being searched in the array.
     * 
     * @return the index where the value is found in the array, else -1.
     */
    public static int search(int[] intArray, int value) { 
        // Loop through the entire array
        for(int i = 0; i < intArray.length; i++) {
            // If the current value equals the value we are looking for
            if(intArray[i] == value) {
                // Return the index
                return i;
            }
        }
        
        // If the method has not returned by this point, it means that the
        // value was not found. So we return -1
        return -1;
    }
    
    /**
     * Search for the value in the char array.
     *  
     * @param charArray - array that we are searching in.
     * @param value - value that is being searched in the array.
     * 
     * @return the index where the value is found in the array, else -1.
     */
    public static int search(char[] charArray, char value) { 
        // Loop through the entire array
        for(int i = 0; i < charArray.length; i++) {
            // If the current value equals the value we are looking for
            if(charArray[i] == value) {
                // Return the index
                return i;
            }
        }
        
        // If the method has not returned by this point, it means that the
        // value was not found. So we return -1
        return -1;
    }
    
    /**
     * Search for the value in the byte array.
     *  
     * @param byteArray - array that we are searching in.
     * @param value - value that is being searched in the array.
     * 
     * @return the index where the value is found in the array, else -1.
     */
    public static int search(byte[] byteArray, byte value) { 
        // Loop through the entire array
        for(int i = 0; i < byteArray.length; i++) {
            // If the current value equals the value we are looking for
            if(byteArray[i] == value) {
                // Return the index
                return i;
            }
        }
        
        // If the method has not returned by this point, it means that the
        // value was not found. So we return -1
        return -1;
    }
    
    /**
     * Search for the value in the short array.
     *  
     * @param shortArray - array that we are searching in.
     * @param value - value that is being searched in the array.
     * 
     * @return the index where the value is found in the array, else -1.
     */
    public static int search(short[] shortArray, short value) { 
        // Loop through the entire array
        for(int i = 0; i < shortArray.length; i++) {
            // If the current value equals the value we are looking for
            if(shortArray[i] == value) {
                // Return the index
                return i;
            }
        }
        
        // If the method has not returned by this point, it means that the
        // value was not found. So we return -1
        return -1;
    }
    
    /**
     * Search for the value in the long array.
     *  
     * @param longArray - array that we are searching in.
     * @param value - value that is being searched in the array.
     * 
     * @return the index where the value is found in the array, else -1.
     */
    public static int search(long[] longArray, long value) { 
        // Loop through the entire array
        for(int i = 0; i < longArray.length; i++) {
            // If the current value equals the value we are looking for
            if(longArray[i] == value) {
                // Return the index
                return i;
            }
        }
        
        // If the method has not returned by this point, it means that the
        // value was not found. So we return -1
        return -1;
    }
    
    /**
     * Search for the value in the float array.
     *  
     * @param floatArray - array that we are searching in.
     * @param value - value that is being searched in the array.
     * 
     * @return the index where the value is found in the array, else -1.
     */
    public static int search(float[] floatArray, float value) { 
        // Loop through the entire array
        for(int i = 0; i < floatArray.length; i++) {
            // If the current value equals the value we are looking for
            if(floatArray[i] == value) {
                // Return the index
                return i;
            }
        }
        
        // If the method has not returned by this point, it means that the
        // value was not found. So we return -1
        return -1;
    }
    
    /**
     * Search for the value in the double array.
     *  
     * @param doubleArray - array that we are searching in.
     * @param value - value that is being searched in the array.
     * 
     * @return the index where the value is found in the array, else -1.
     */
    public static int search(double[] doubleArray, double value) { 
        // Loop through the entire array
        for(int i = 0; i < doubleArray.length; i++) {
            // If the current value equals the value we are looking for
            if(doubleArray[i] == value) {
                // Return the index
                return i;
            }
        }
        
        // If the method has not returned by this point, it means that the
        // value was not found. So we return -1
        return -1;
    }

}
