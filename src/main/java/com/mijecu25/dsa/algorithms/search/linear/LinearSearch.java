package com.mijecu25.dsa.algorithms.search.linear;

import java.util.List;

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
 * @version 0.1.3.3
 */
public class LinearSearch extends Search {
    
    /**
     * Search for the value in the array and return the index of the first occurrence from the
     * beginning of the array.
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
     * Search for the value in the list and return the index of the first occurrence from the
     * beginning of the list. The run time of this algorithm depends on the 
     * implementation of the list. It is advised to use an array based implementation
     * to achieve O(n) runtime.
     * 
     * @param <E> - the type of elements in this list.
     * 
     * @param list - list that we are searching in.
     * @param value - value that is being searched in the list.
     * 
     * @return the index where the value is found in the list, else -1.
     */
    public static <E> int search(List<E> list, E value) { 
        // Loop through the entire list
        for(int i = 0; i < list.size(); i++) {
            // If the current value equals the value we are looking for
            if(list.get(i) == value) {
                // Return the index
                return i;
            }
        }
        
        // If the method has not returned by this point, it means that the
        // value was not found. So we return -1
        return -1;
    }
    
    /**
     * Search for the value in the int array and return the index of the first occurrence from the
     * beginning of the array.
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
     * Search for the value in the char array and return the index of the first occurrence from the
     * beginning of the array.
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
     * Search for the value in the byte array and return the index of the first occurrence from the
     * beginning of the array.
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
     * Search for the value in the short array and return the index of the first occurrence from the
     * beginning of the array.
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
     * Search for the value in the long array and return the index of the first occurrence from the
     * beginning of the array.
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
     * Search for the value in the float array and return the index of the first occurrence from the
     * beginning of the array.
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
     * Search for the value in the double array and return the index of the first occurrence from the
     * beginning of the array.
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
    
    /**
     * Search for the value in the array and return the index of the first occurrence from the
     * end of the array
     * 
     * @param <E> - the type of elements in this array.
     * 
     * @param array - array that we are searching in.
     * @param value - value that is being searched in the array.
     * 
     * @return the index where the value is found in the array, else -1.
     */
    public static <E> int searchLast(E[] array, E value) { 
        // Loop through the entire array backwards
        for(int i = array.length-1; i >=0; i--) {
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
     * Search for the value in the list and return the index of the first occurrence from the
     * end of the list. The run time of this algorithm depends on the 
     * implementation of the list. It is advised to use an array based implementation
     * to achieve O(n) runtime.
     * 
     * @param <E> - the type of elements in this list.
     * 
     * @param list - list that we are searching in.
     * @param value - value that is being searched in the list.
     * 
     * @return the index where the value is found in the list, else -1.
     */
    public static <E> int searchLast(List<E> list, E value) { 
        // Loop through the entire list backwards
        for(int i = list.size()-1; i >=0; i--) {
            // If the current value equals the value we are looking for
            if(list.get(i) == value) {
                // Return the index
                return i;
            }
        }
        
        // If the method has not returned by this point, it means that the
        // value was not found. So we return -1
        return -1;
    }
    
    /**
     * Search for the value in the array and return the index of the first occurrence from the
     * end of the array
     *  
     * @param intArray - array that we are searching in.
     * @param value - value that is being searched in the array.
     * 
     * @return the index where the value is found in the array, else -1.
     */
    public static int searchLast(int[] intArray, int value) { 
        // Loop through the entire array backwards
        for(int i = intArray.length-1; i >=0; i--) {
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
     * Search for the value in char array and return the index of the first occurrence from the
     * end of the array
     *  
     * @param charArray - array that we are searching in.
     * @param value - value that is being searched in the array.
     * 
     * @return the index where the value is found in the array, else -1.
     */
    public static int searchLast(char[] charArray, char value) { 
        // Loop through the entire array backwards
        for(int i = charArray.length-1; i >=0; i--) {
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
     * Search for the value in the byte array and return the index of the first occurrence from the
     * end of the array
     *  
     * @param byteArray - array that we are searching in.
     * @param value - value that is being searched in the array.
     * 
     * @return the index where the value is found in the array, else -1.
     */
    public static int searchLast(byte[] byteArray, byte value) { 
        // Loop through the entire array backwards
        for(int i = byteArray.length-1; i >=0; i--) {
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
     * Search for the value in the short array and return the index of the first occurrence from the
     * end of the array
     *  
     * @param shortArray - array that we are searching in.
     * @param value - value that is being searched in the array.
     * 
     * @return the index where the value is found in the array, else -1.
     */
    public static int searchLast(short[] shortArray, short value) { 
        // Loop through the entire array backwards
        for(int i = shortArray.length-1; i >=0; i--) {
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
     * Search for the value in the long array and return the index of the first occurrence from the
     * end of the array
     *  
     * @param longArray - array that we are searching in.
     * @param value - value that is being searched in the array.
     * 
     * @return the index where the value is found in the array, else -1.
     */
    public static int searchLast(long[] longArray, long value) { 
        // Loop through the entire array backwards
        for(int i = longArray.length-1; i >=0; i--) {
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
     * Search for the value in the float array and return the index of the first occurrence from the
     * end of the array
     *  
     * @param floatArray - array that we are searching in.
     * @param value - value that is being searched in the array.
     * 
     * @return the index where the value is found in the array, else -1.
     */
    public static int searchLast(float[] floatArray, float value) { 
        // Loop through the entire array backwards
        for(int i = floatArray.length-1; i >=0; i--) {
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
     * Search for the value in the double array and return the index of the first occurrence from the
     * end of the array
     *  
     * @param doubleArray - array that we are searching in.
     * @param value - value that is being searched in the array.
     * 
     * @return the index where the value is found in the array, else -1.
     */
    public static int searchLast(double[] doubleArray, double value) { 
        // Loop through the entire array backwards
        for(int i = doubleArray.length-1; i >=0; i--) {
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
