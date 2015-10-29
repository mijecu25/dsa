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
 * @version 0.1.3.5
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
        // Search for the first occurrence in the array
        return LinearSearch.search(array, value, 1);
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
        // Search for the firt ocurrence in the list
        return LinearSearch.search(list, value, 1);
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
        // Search for the first occurrence in the array
        return LinearSearch.search(intArray, value, 1);
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
        // Search for the first occurrence in the array
        return LinearSearch.search(charArray, value, 1);
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
        // Search for the first occurrence in the array
        return LinearSearch.search(byteArray, value, 1);
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
        // Search for the first occurrence in the array
        return LinearSearch.search(shortArray, value, 1);
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
        // Search for the first occurrence in the array
        return LinearSearch.search(longArray, value, 1);
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
        // Search for the first occurrence in the array
        return LinearSearch.search(floatArray, value, 1);
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
        // Search for the first occurrence in the array
        return LinearSearch.search(doubleArray, value, 1);
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
        // Search for the first occurrence in the array from the end
        return LinearSearch.searchLast(array, value, 1);
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
        // Search for the first occurrence in the list from the end
        return LinearSearch.searchLast(list, value, 1);
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
        // Search for the first occurrence in the array from the end
        return LinearSearch.searchLast(intArray, value, 1);
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
        // Search for the first occurrence in the array from the end
        return LinearSearch.searchLast(charArray, value, 1);
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
        // Search for the first occurrence in the array from the end
        return LinearSearch.searchLast(byteArray, value, 1);
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
        // Search for the first occurrence in the array from the end
        return LinearSearch.searchLast(shortArray, value, 1);
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
        // Search for the first occurrence in the array from the end
        return LinearSearch.searchLast(longArray, value, 1);
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
        // Search for the first occurrence in the array from the end
        return LinearSearch.searchLast(floatArray, value, 1);
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
        // Search for the first occurrence in the array from the end
        return LinearSearch.searchLast(doubleArray, value, 1);
    }
    
    /**
     * Search for the value in the array and return the index of the specified occurrence from the
     * beginning of the array.
     * 
     * @param <E> - the type of elements in this array.
     * 
     * @param array - array that we are searching in.
     * @param value - value that is being searched in the array.
     * @param occurrence - number of times we have seen the value before returning the index.
     * 
     * @return the index where the value is found in the array, else -1.
     */
    public static <E> int search(E[] array, E value, int occurrence) { 
        // Check that occurrence is greater than 0
        if(occurrence <= 0) {
            throw new IllegalArgumentException("Occurrence must be greater or equal to 1 and less than "
                    + "the array length: " + occurrence);
        }
        
        // The number of times the value has been currently seen is 0
        int valuesSeen = 0;
        
        // Loop through the entire array
        for(int i = 0; i < array.length; i++) {
            // If the current value equals the value we are looking for 
            if(array[i] == value) {
                // Increment the times we have seen the value
                valuesSeen++;
                
                // If the number of times we have seen the value matches
                // the number of before returning
                if(valuesSeen == occurrence) {
                    // Return the index
                    return i;
                }
            }
        }
        
        // If the method has not returned by this point, it means that the
        // value was not found. So we return -1
        return -1;
    }
    
    /**
     * Search for the value in the list and return the index of the specified occurrence from the
     * beginning of the list. The run time of this algorithm depends on the 
     * implementation of the list. It is advised to use an array based implementation
     * to achieve O(n) runtime.
     * 
     * @param <E> - the type of elements in this list.
     * 
     * @param list - list that we are searching in.
     * @param value - value that is being searched in the list.
     * @param occurrence - number of times we have seen the value before returning the index.
     * 
     * @return the index where the value is found in the list, else -1.
     */
    public static <E> int search(List<E> list, E value, int occurrence) { 
        // If the occurrence is less or equal to 0 or greater than the size of the list
        if(occurrence <= 0 || occurrence > list.size()) {
            throw new IllegalArgumentException("Occurrence must be greater or equal to 1 and less than "
                    + "the list length: " + occurrence);
        }
        
        // The number of times the value has been currently seen is 0
        int valuesSeen = 0;
        
        // Loop through the entire array
        for(int i = 0; i < list.size(); i++) {
            // If the current value equals the value we are looking for 
            if(list.get(i) == value) {
                // Increment the times we have seen the value
                valuesSeen++;
                
                // If the number of times we have seen the value matches
                // the number of before returning
                if(valuesSeen == occurrence) {
                    // Return the index
                    return i;
                }
            }
        }
        
        // If the method has not returned by this point, it means that the
        // value was not found. So we return -1
        return -1;
    }
    
    /**
     * Search for the value in the int array and return the index of the specified occurrence from the
     * beginning of the array.
     *  
     * @param intArray - array that we are searching in.
     * @param value - value that is being searched in the array.
     * @param occurrence - number of times we have seen the value before returning the index.
     * 
     * @return the index where the value is found in the array, else -1.
     */
    public static int search(int[] intArray, int value, int occurrence) { 
        // If the occurrence is less or equal to 0 or greater than the size of the array
        if(occurrence <= 0 || occurrence > intArray.length) {
            throw new IllegalArgumentException("Occurrence must be greater or equal to 1 and less than "
                    + "the array length: " + occurrence);
        }
        
        // The number of times the value has been currently seen is 0
        int valuesSeen = 0;
        
        // Loop through the entire array
        for(int i = 0; i < intArray.length; i++) {
            // If the current value equals the value we are looking for 
            if(intArray[i] == value) {
                // Increment the times we have seen the value
                valuesSeen++;
                
                // If the number of times we have seen the value matches
                // the number of before returning
                if(valuesSeen == occurrence) {
                    // Return the index
                    return i;
                }
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
     * @param occurrence - number of times we have seen the value before returning the index.
     * 
     * @return the index where the value is found in the array, else -1.
     */
    public static int search(char[] charArray, char value, int occurrence) { 
        // If the occurrence is less or equal to 0 or greater than the size of the array
        if(occurrence <= 0 || occurrence > charArray.length) {
            throw new IllegalArgumentException("Occurrence must be greater or equal to 1 and less than "
                    + "the array length: " + occurrence);
        }
        
        // The number of times the value has been currently seen is 0
        int valuesSeen = 0;
        
        // Loop through the entire array
        for(int i = 0; i < charArray.length; i++) {
            // If the current value equals the value we are looking for 
            if(charArray[i] == value) {
                // Increment the times we have seen the value
                valuesSeen++;
                
                // If the number of times we have seen the value matches
                // the number of before returning
                if(valuesSeen == occurrence) {
                    // Return the index
                    return i;
                }
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
     * @param occurrence - number of times we have seen the value before returning the index.
     * 
     * @return the index where the value is found in the array, else -1.
     */
    public static int search(byte[] byteArray, byte value, int occurrence) { 
        // If the occurrence is less or equal to 0 or greater than the size of the array
        if(occurrence <= 0 || occurrence > byteArray.length) {
            throw new IllegalArgumentException("Occurrence must be greater or equal to 1 and less than "
                    + "the array length: " + occurrence);
        }
        
        // The number of times the value has been currently seen is 0
        int valuesSeen = 0;
        
        // Loop through the entire array
        for(int i = 0; i < byteArray.length; i++) {
            // If the current value equals the value we are looking for 
            if(byteArray[i] == value) {
                // Increment the times we have seen the value
                valuesSeen++;
                
                // If the number of times we have seen the value matches
                // the number of before returning
                if(valuesSeen == occurrence) {
                    // Return the index
                    return i;
                }
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
     * @param occurrence - number of times we have seen the value before returning the index.
     * 
     * @return the index where the value is found in the array, else -1.
     */
    public static int search(short[] shortArray, short value, int occurrence) { 
        // If the occurrence is less or equal to 0 or greater than the size of the array
        if(occurrence <= 0 || occurrence > shortArray.length) {
            throw new IllegalArgumentException("Occurrence must be greater or equal to 1 and less than "
                    + "the array length: " + occurrence);
        }
        
        // The number of times the value has been currently seen is 0
        int valuesSeen = 0;
        
        // Loop through the entire array
        for(int i = 0; i < shortArray.length; i++) {
            // If the current value equals the value we are looking for 
            if(shortArray[i] == value) {
                // Increment the times we have seen the value
                valuesSeen++;
                
                // If the number of times we have seen the value matches
                // the number of before returning
                if(valuesSeen == occurrence) {
                    // Return the index
                    return i;
                }
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
     * @param occurrence - number of times we have seen the value before returning the index.
     * 
     * @return the index where the value is found in the array, else -1.
     */
    public static int search(long[] longArray, long value, int occurrence) { 
        // If the occurrence is less or equal to 0 or greater than the size of the array
        if(occurrence <= 0 || occurrence > longArray.length) {
            throw new IllegalArgumentException("Occurrence must be greater or equal to 1 and less than "
                    + "the array length: " + occurrence);
        }
        
        // The number of times the value has been currently seen is 0
        int valuesSeen = 0;
        
        // Loop through the entire array
        for(int i = 0; i < longArray.length; i++) {
            // If the current value equals the value we are looking for 
            if(longArray[i] == value) {
                // Increment the times we have seen the value
                valuesSeen++;
                
                // If the number of times we have seen the value matches
                // the number of before returning
                if(valuesSeen == occurrence) {
                    // Return the index
                    return i;
                }
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
     * @param occurrence - number of times we have seen the value before returning the index.
     * 
     * @return the index where the value is found in the array, else -1.
     */
    public static int search(float[] floatArray, float value, int occurrence) { 
        // If the occurrence is less or equal to 0 or greater than the size of the array
        if(occurrence <= 0 || occurrence > floatArray.length) {
            throw new IllegalArgumentException("Occurrence must be greater or equal to 1 and less than "
                    + "the array length: " + occurrence);
        }
        
        // The number of times the value has been currently seen is 0
        int valuesSeen = 0;
        
        // Loop through the entire array
        for(int i = 0; i < floatArray.length; i++) {
            // If the current value equals the value we are looking for 
            if(floatArray[i] == value) {
                // Increment the times we have seen the value
                valuesSeen++;
                
                // If the number of times we have seen the value matches
                // the number of before returning
                if(valuesSeen == occurrence) {
                    // Return the index
                    return i;
                }
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
     * @param occurrence - number of times we have seen the value before returning the index.
     * 
     * @return the index where the value is found in the array, else -1.
     */
    public static int search(double[] doubleArray, double value, int occurrence) { 
        // If the occurrence is less or equal to 0 or greater than the size of the array
        if(occurrence <= 0 || occurrence > doubleArray.length) {
            throw new IllegalArgumentException("Occurrence must be greater or equal to 1 and less than "
                    + "the array length: " + occurrence);
        }
        
        // The number of times the value has been currently seen is 0
        int valuesSeen = 0;
        
        // Loop through the entire array
        for(int i = 0; i < doubleArray.length; i++) {
            // If the current value equals the value we are looking for 
            if(doubleArray[i] == value) {
                // Increment the times we have seen the value
                valuesSeen++;
                
                // If the number of times we have seen the value matches
                // the number of before returning
                if(valuesSeen == occurrence) {
                    // Return the index
                    return i;
                }
            }
        }
        
        // If the method has not returned by this point, it means that the
        // value was not found. So we return -1
        return -1;
    }
    
    /**
     * Search for the value in the array and return the index of the specified occurrence from the
     * end of the array.
     * 
     * @param <E> - the type of elements in this array.
     * 
     * @param array - array that we are searching in.
     * @param value - value that is being searched in the array.
     * @param occurrence - number of times we have seen the value before returning the index.
     * 
     * @return the index where the value is found in the array, else -1.
     */
    public static <E> int searchLast(E[] array, E value, int occurrence) { 
        // If the occurrence is less or equal to 0 or greater than the size of the array
        if(occurrence <= 0 || occurrence > array.length) {
            throw new IllegalArgumentException("Occurrence must be greater or equal to 1 and less than "
                    + "the array length: " + occurrence);
        }
        
        // The number of times the value has been currently seen is 0
        int valuesSeen = 0;
        
        // Loop through the entire array backwards
        for(int i = array.length-1; i >=0; i--) {
            // If the current value equals the value we are looking for 
            if(array[i] == value) {
                // Increment the times we have seen the value
                valuesSeen++;
                
                // If the number of times we have seen the value matches
                // the number of before returning
                if(valuesSeen == occurrence) {
                    // Return the index
                    return i;
                }
            }
        }
        
        // If the method has not returned by this point, it means that the
        // value was not found. So we return -1
        return -1;
    }
    
    /**
     * Search for the value in the list and return the index of the specified occurrence from the
     * end of the list. The run time of this algorithm depends on the 
     * implementation of the list. It is advised to use an array based implementation
     * to achieve O(n) runtime.
     * 
     * @param <E> - the type of elements in this list.
     * 
     * @param list - list that we are searching in.
     * @param value - value that is being searched in the list.
     * @param occurrence - number of times we have seen the value before returning the index.
     * 
     * @return the index where the value is found in the list, else -1.
     */
    public static <E> int searchLast(List<E> list, E value, int occurrence) { 
        // If the occurrence is less or equal to 0 or greater than the size of the list
        if(occurrence <= 0 || occurrence > list.size()) {
            throw new IllegalArgumentException("Occurrence must be greater or equal to 1 and less than "
                    + "the list length: " + occurrence);
        }
        
        // The number of times the value has been currently seen is 0
        int valuesSeen = 0;
        
        // Loop through the entire list backwards
        for(int i = list.size()-1; i >=0; i--) {
            // If the current value equals the value we are looking for 
            if(list.get(i) == value) {
                // Increment the times we have seen the value
                valuesSeen++;
                
                // If the number of times we have seen the value matches
                // the number of before returning
                if(valuesSeen == occurrence) {
                    // Return the index
                    return i;
                }
            }
        }
        
        // If the method has not returned by this point, it means that the
        // value was not found. So we return -1
        return -1;
    }
    
    /**
     * Search for the value in the int array and return the index of the specified occurrence from the
     * end of the array.
     *  
     * @param intArray - array that we are searching in.
     * @param value - value that is being searched in the array.
     * @param occurrence - number of times we have seen the value before returning the index.
     * 
     * @return the index where the value is found in the array, else -1.
     */
    public static int searchLast(int[] intArray, int value, int occurrence) { 
        // If the occurrence is less or equal to 0 or greater than the size of the array
        if(occurrence <= 0 || occurrence > intArray.length) {
            throw new IllegalArgumentException("Occurrence must be greater or equal to 1 and less than "
                    + "the array length: " + occurrence);
        }
        
        // The number of times the value has been currently seen is 0
        int valuesSeen = 0;
        
        // Loop through the entire array backwards
        for(int i = intArray.length-1; i >=0; i--) {
            // If the current value equals the value we are looking for 
            if(intArray[i] == value) {
                // Increment the times we have seen the value
                valuesSeen++;
                
                // If the number of times we have seen the value matches
                // the number of before returning
                if(valuesSeen == occurrence) {
                    // Return the index
                    return i;
                }
            }
        }
        
        // If the method has not returned by this point, it means that the
        // value was not found. So we return -1
        return -1;
    }
    
    /**
     * Search for the value in the char array and return the index of the first occurrence from the
     * end of the array.
     *  
     * @param charArray - array that we are searching in.
     * @param value - value that is being searched in the array.
     * @param occurrence - number of times we have seen the value before returning the index.
     * 
     * @return the index where the value is found in the array, else -1.
     */
    public static int searchLast(char[] charArray, char value, int occurrence) { 
        // If the occurrence is less or equal to 0 or greater than the size of the array
        if(occurrence <= 0 || occurrence > charArray.length) {
            throw new IllegalArgumentException("Occurrence must be greater or equal to 1 and less than "
                    + "the array length: " + occurrence);
        }
        
        // The number of times the value has been currently seen is 0
        int valuesSeen = 0;
        
        // Loop through the entire array backwards
        for(int i = charArray.length-1; i >=0; i--) {
            // If the current value equals the value we are looking for 
            if(charArray[i] == value) {
                // Increment the times we have seen the value
                valuesSeen++;
                
                // If the number of times we have seen the value matches
                // the number of before returning
                if(valuesSeen == occurrence) {
                    // Return the index
                    return i;
                }
            }
        }
        
        // If the method has not returned by this point, it means that the
        // value was not found. So we return -1
        return -1;
    }
    
    /**
     * Search for the value in the byte array and return the index of the first occurrence from the
     * end of the array.
     *  
     * @param byteArray - array that we are searching in.
     * @param value - value that is being searched in the array.
     * @param occurrence - number of times we have seen the value before returning the index.
     * 
     * @return the index where the value is found in the array, else -1.
     */
    public static int searchLast(byte[] byteArray, byte value, int occurrence) { 
        // If the occurrence is less or equal to 0 or greater than the size of the array
        if(occurrence <= 0 || occurrence > byteArray.length) {
            throw new IllegalArgumentException("Occurrence must be greater or equal to 1 and less than "
                    + "the array length: " + occurrence);
        }
        
        // The number of times the value has been currently seen is 0
        int valuesSeen = 0;
        
        // Loop through the entire array backwards
        for(int i = byteArray.length-1; i >=0; i--) {
            // If the current value equals the value we are looking for 
            if(byteArray[i] == value) {
                // Increment the times we have seen the value
                valuesSeen++;
                
                // If the number of times we have seen the value matches
                // the number of before returning
                if(valuesSeen == occurrence) {
                    // Return the index
                    return i;
                }
            }
        }
        
        // If the method has not returned by this point, it means that the
        // value was not found. So we return -1
        return -1;
    }
    
    /**
     * Search for the value in the short array and return the index of the first occurrence from the
     * end of the array.
     *  
     * @param shortArray - array that we are searching in.
     * @param value - value that is being searched in the array.
     * @param occurrence - number of times we have seen the value before returning the index.
     * 
     * @return the index where the value is found in the array, else -1.
     */
    public static int searchLast(short[] shortArray, short value, int occurrence) { 
        // If the occurrence is less or equal to 0 or greater than the size of the array
        if(occurrence <= 0 || occurrence > shortArray.length) {
            throw new IllegalArgumentException("Occurrence must be greater or equal to 1 and less than "
                    + "the array length: " + occurrence);
        }
        
        // The number of times the value has been currently seen is 0
        int valuesSeen = 0;
        
        // Loop through the entire array backwards
        for(int i = shortArray.length-1; i >=0; i--) {
            // If the current value equals the value we are looking for 
            if(shortArray[i] == value) {
                // Increment the times we have seen the value
                valuesSeen++;
                
                // If the number of times we have seen the value matches
                // the number of before returning
                if(valuesSeen == occurrence) {
                    // Return the index
                    return i;
                }
            }
        }
        
        // If the method has not returned by this point, it means that the
        // value was not found. So we return -1
        return -1;
    }
    
    /**
     * Search for the value in the long array and return the index of the first occurrence from the
     * end of the array.
     *  
     * @param longArray - array that we are searching in.
     * @param value - value that is being searched in the array.
     * @param occurrence - number of times we have seen the value before returning the index.
     * 
     * @return the index where the value is found in the array, else -1.
     */
    public static int searchLast(long[] longArray, long value, int occurrence) { 
        // If the occurrence is less or equal to 0 or greater than the size of the array
        if(occurrence <= 0 || occurrence > longArray.length) {
            throw new IllegalArgumentException("Occurrence must be greater or equal to 1 and less than "
                    + "the array length: " + occurrence);
        }
        
        // The number of times the value has been currently seen is 0
        int valuesSeen = 0;
        
        // Loop through the entire array backwards
        for(int i = longArray.length-1; i >=0; i--) {
            // If the current value equals the value we are looking for 
            if(longArray[i] == value) {
                // Increment the times we have seen the value
                valuesSeen++;
                
                // If the number of times we have seen the value matches
                // the number of before returning
                if(valuesSeen == occurrence) {
                    // Return the index
                    return i;
                }
            }
        }
        
        // If the method has not returned by this point, it means that the
        // value was not found. So we return -1
        return -1;
    }
    
    /**
     * Search for the value in the float array and return the index of the first occurrence from the
     * end of the array.
     *  
     * @param floatArray - array that we are searching in.
     * @param value - value that is being searched in the array.
     * @param occurrence - number of times we have seen the value before returning the index.
     * 
     * @return the index where the value is found in the array, else -1.
     */
    public static int searchLast(float[] floatArray, float value, int occurrence) { 
        // If the occurrence is less or equal to 0 or greater than the size of the array
        if(occurrence <= 0 || occurrence > floatArray.length) {
            throw new IllegalArgumentException("Occurrence must be greater or equal to 1 and less than "
                    + "the array length: " + occurrence);
        }
        
        // The number of times the value has been currently seen is 0
        int valuesSeen = 0;
        
        // Loop through the entire array backwards
        for(int i = floatArray.length-1; i >=0; i--) {
            // If the current value equals the value we are looking for 
            if(floatArray[i] == value) {
                // Increment the times we have seen the value
                valuesSeen++;
                
                // If the number of times we have seen the value matches
                // the number of before returning
                if(valuesSeen == occurrence) {
                    // Return the index
                    return i;
                }
            }
        }
        
        // If the method has not returned by this point, it means that the
        // value was not found. So we return -1
        return -1;
    }
    
    /**
     * Search for the value in the double array and return the index of the first occurrence from the
     * end of the array.
     *  
     * @param doubleArray - array that we are searching in.
     * @param value - value that is being searched in the array.
     * @param occurrence - number of times we have seen the value before returning the index.
     * 
     * @return the index where the value is found in the array, else -1.
     */
    public static int searchLast(double[] doubleArray, double value, int occurrence) { 
        // If the occurrence is less or equal to 0 or greater than the size of the array
        if(occurrence <= 0 || occurrence > doubleArray.length) {
            throw new IllegalArgumentException("Occurrence must be greater or equal to 1 and less than "
                    + "the array length: " + occurrence);
        }
        
        // The number of times the value has been currently seen is 0
        int valuesSeen = 0;
        
        // Loop through the entire array backwards
        for(int i = doubleArray.length-1; i >=0; i--) {
            // If the current value equals the value we are looking for 
            if(doubleArray[i] == value) {
                // Increment the times we have seen the value
                valuesSeen++;
                
                // If the number of times we have seen the value matches
                // the number of before returning
                if(valuesSeen == occurrence) {
                    // Return the index
                    return i;
                }
            }
        }
        
        // If the method has not returned by this point, it means that the
        // value was not found. So we return -1
        return -1;
    }

}
