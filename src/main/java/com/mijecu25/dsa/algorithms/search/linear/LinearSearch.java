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
 * @version 0.2.0.2
 */
public final class LinearSearch extends Search {
    
    /**
     * Don't let anyone instantiate this class
     */
    private LinearSearch() { ; }
    
    /**
     * Search for the value in the array and return the index of the first occurrence from the
     * beginning of the array.
     * 
     * @param <E> the type of elements in this array.
     * 
     * @param array array that we are searching in.
     * @param value value that is being searched in the array.
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
     * @param <E> the type of elements in this list.
     * 
     * @param list list that we are searching in.
     * @param value value that is being searched in the list.
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
     * @param intArray array that we are searching in.
     * @param value value that is being searched in the array.
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
     * @param charArray array that we are searching in.
     * @param value value that is being searched in the array.
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
     * @param byteArray array that we are searching in.
     * @param value value that is being searched in the array.
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
     * @param shortArray array that we are searching in.
     * @param value value that is being searched in the array.
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
     * @param longArray array that we are searching in.
     * @param value value that is being searched in the array.
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
     * @param floatArray array that we are searching in.
     * @param value value that is being searched in the array.
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
     * @param doubleArray array that we are searching in.
     * @param value value that is being searched in the array.
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
     * @param <E> the type of elements in this array.
     * 
     * @param array array that we are searching in.
     * @param value value that is being searched in the array.
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
     * @param <E> the type of elements in this list.
     * 
     * @param list list that we are searching in.
     * @param value value that is being searched in the list.
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
     * @param intArray array that we are searching in.
     * @param value value that is being searched in the array.
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
     * @param charArray array that we are searching in.
     * @param value value that is being searched in the array.
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
     * @param byteArray array that we are searching in.
     * @param value value that is being searched in the array.
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
     * @param shortArray array that we are searching in.
     * @param value value that is being searched in the array.
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
     * @param longArray array that we are searching in.
     * @param value value that is being searched in the array.
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
     * @param floatArray array that we are searching in.
     * @param value value that is being searched in the array.
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
     * @param doubleArray array that we are searching in.
     * @param value value that is being searched in the array.
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
     * @param <E> the type of elements in this array.
     * 
     * @param array array that we are searching in.
     * @param value value that is being searched in the array.
     * @param occurrence number of times we have seen the value before returning the index.
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
     * Search for the minimum element in the array.
     * 
     * @param <E> the type of elements in this array.
     * 
     * @param array array that we are searching in.
     * 
     * @return the minimum element in the array.
     */
    public static <E extends Comparable<E>> E searchMin(E[] array) {
        // If the array is empty
        if(array.length == 0) {
            throw new IllegalArgumentException("The array you provided does not have any elements");
        }
        
        // Set the minimum to the first element
        E min = array[0];
        
        // Loop through the entire array from the second element
        for(int i = 1; i < array.length; i++) {
            // If the current element is less than the minimum
            if(array[i].compareTo(min) < 0) {
                // Change the minimum value
                min = array[i];
            }
        }
        
        // Return the minimum value
        return min;
    }
    
//    /**
//     * Find the index of the minimum value in the array.
//     * 
//     * @param <E> the type of elements in this array.
//     * 
//     * @param array array that we are searching in.
//     * 
//     * @return the index of the minimum element in the array
//     */
//    public static <E extends Comparable<E>> int findMin(E[] array) {
//        // If the array is empty
//        if(array.length == 0) {
//            throw new IllegalArgumentException("The array you provided does not have any elements");
//        }
//        
//        // Set the minimum index to the beginning of the array
//        int minIndex = 0;
//        
//        // Loop through the entire array from the second element
//        for(int i = 1; i < array.length; i++) {
//            // If the current element is less than the minimum
//            if(array[i].compareTo(array[minIndex]) < 0) {
//                // Change the minimum index
//                minIndex = i;
//            }
//        }
//        
//        // Return the minimum index
//        return minIndex;
//    }
    
    /**
     * Search for the maximum element in the array.
     *      
     * @param <E> the type of elements in this array.
     * 
     * @param array array that we are searching in.
     * 
     * @return the maximum element in the array.
     */
    public static <E extends Comparable<E>> E searchMax(E[] array) {
        // If the array is empty
        if(array.length == 0) {
            throw new IllegalArgumentException("The array you provided does not have any elements");
        }
        
        // Set the maximum to the first element
        E max = array[0];
        
        // Loop through the entire array from the second element
        for(int i = 1; i < array.length; i++) {
            // If the current element is greater than the maximum
            if(array[i].compareTo(max) > 0 ) {
                // Change the maximum value
                max = array[i];
            }
        }
        
        // Return the maximum value
        return max;
    }
    
//    /**
//     * Find the first index of the maximum value in the array.
//     *
//     * @param <E> the type of elements in this array.
//     * 
//     * @param array array that we are searching in.
//     * 
//     * @return the index of the maximum element in the array
//     */
//    public static <E extends Comparable<E>> int findMax(E[] array) {
//        // If the array is empty
//        if(array.length == 0) {
//            throw new IllegalArgumentException("The array you provided does not have any elements");
//        }
//        
//        // Set the maximum index to the beginning of the array
//        int maxIndex = 0;
//        
//        // Loop through the entire array from the second element
//        for(int i = 1; i < array.length; i++) {
//            // If the current element is greater than the maximum
//            if(array[i].compareTo(array[maxIndex]) > 0) {
//                // Change the maximum index
//                maxIndex = i;
//            }
//        }
//        
//        // Return the maximum index
//        return maxIndex;
//    }
    
    /**
     * Search for the value in the list and return the index of the specified occurrence from the
     * beginning of the list. The run time of this algorithm depends on the 
     * implementation of the list. It is advised to use an array based implementation
     * to achieve O(n) runtime.
     * 
     * @param <E> the type of elements in this list.
     * 
     * @param list list that we are searching in.
     * @param value value that is being searched in the list.
     * @param occurrence number of times we have seen the value before returning the index.
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
     * Search for the minimum element in the list.
     * 
     * @param <E> the type of elements in this list.
     * 
     * @param list list that we are searching in.
     * 
     * @return the minimum element in the list.
     */
    public static <E extends Comparable<E>> E searchMin(List<E> list) {
        // If the array is empty
        if(list.size() == 0) {
            throw new IllegalArgumentException("The list you provided does not have any elements");
        }
        
        // Set the minimum to the first element
        E min = list.get(0);
        
        // Loop through the entire list from the second element
        for(int i = 1; i < list.size(); i++) {
            // If the current element is less than the minimum
            if(list.get(i).compareTo(min) < 0) {
                // Change the minimum value
                min = list.get(i);
            }
        }
        
        // Return the minimum value
        return min;
    }
    
//    /**
//     * Find the index of the minimum value in the list.
//     * 
//     * @param <E> the type of elements in this list.
//     * 
//     * @param array list that we are searching in.
//     * 
//     * @return the index of the minimum element in the list
//     */
//    public static <E extends Comparable<E>> int findMin(List<E> list) {
//        // If the list is empty
//        if(list.size() == 0) {
//            throw new IllegalArgumentException("The list you provided does not have any elements");
//        }
//        
//        // Set the minimum index to the beginning of the list
//        int minIndex = 0;
//        
//        // Loop through the entire list from the second element
//        for(int i = 1; i < list.size(); i++) {
//            // If the current element is less than the minimum
//            if(list.get(i).compareTo(list.get(minIndex)) < 0) {
//                // Change the minimum index
//                minIndex = i;
//            }
//        }
//        
//        // Return the minimum index
//        return minIndex;
//    }
    
    /**
     * Search for the maximum element in the list.
     *      
     * @param <E> the type of elements in this list.
     * 
     * @param list list that we are searching in.
     * 
     * @return the maximum element in the list.
     */
    public static <E extends Comparable<E>> E searchMax(List<E> list) {
        // If the list is empty
        if(list.size() == 0) {
            throw new IllegalArgumentException("The list you provided does not have any elements");
        }
        
        // Set the maximum to the first element
        E max = list.get(0);
        
        // Loop through the entire list from the second element
        for(int i = 1; i < list.size(); i++) {
            // If the current element is greater than the maximum
            if(list.get(i).compareTo(max) > 0 ) {
                // Change the maximum value
                max = list.get(i);
            }
        }
        
        // Return the maximum value
        return max;
    }
    
//    /**
//     * Find the first index of the maximum value in the list.
//     *
//     * @param <E> the type of elements in this list.
//     * 
//     * @param array list that we are searching in.
//     * 
//     * @return the index of the maximum element in the list
//     */
//    public static <E extends Comparable<E>> int findMax(List<E> list) {
//        // If the list is empty
//        if(list.size() == 0) {
//            throw new IllegalArgumentException("The array you provided does not have any elements");
//        }
//        
//        // Set the maximum index to the beginning of the list
//        int maxIndex = 0;
//        
//        // Loop through the entire list from the second element
//        for(int i = 1; i < list.size(); i++) {
//            // If the current element is greater than the maximum
//            if(list.get(i).compareTo(list.get(maxIndex)) > 0) {
//                // Change the maximum index
//                maxIndex = i;
//            }
//        }
//        
//        // Return the maximum index
//        return maxIndex;
//    }
    
    /**
     * Search for the value in the int array and return the index of the specified occurrence from the
     * beginning of the array.
     *  
     * @param intArray array that we are searching in.
     * @param value value that is being searched in the array.
     * @param occurrence number of times we have seen the value before returning the index.
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
     * Search for the minimum element in the array.
     * 
     * @param intArray array that we are searching in.
     * 
     * @return the minimum element in the array.
     */
    public static int searchMin(int[] intArray) {
        // If the array is empty
        if(intArray.length == 0) {
            throw new IllegalArgumentException("The array you provided does not have any elements");
        }
        
        // Set the minimum to the first element
        int min = intArray[0];
        
        // Loop through the entire array from the second element
        for(int i = 1; i < intArray.length; i++) {
            // If the current element is less than the minimum
            if(intArray[i] < min) {
                // Change the minimum value
                min = intArray[i];
            }
        }
        
        // Return the minimum value
        return min;
    }
    
//    /**
//     * Find the first index of the minimum value in the array.
//     * 
//     * @param intArray array that we are searching in.
//     * 
//     * @return the index of the minimum element in the array
//     */
//    public static int findMin(int[] intArray) {
//        // If the array is empty
//        if(intArray.length == 0) {
//            throw new IllegalArgumentException("The array you provided does not have any elements");
//        }
//        
//        // Set the minimum index to the beginning of the array
//        int minIndex = 0;
//        
//        // Loop through the entire array from the second element
//        for(int i = 1; i < intArray.length; i++) {
//            // If the current element is less than the minimum
//            if(intArray[i] < intArray[minIndex]) {
//                // Change the minimum index
//                minIndex = i;
//            }
//        }
//        
//        // Return the minimum index
//        return minIndex;
//    }
    
    /**
     * Search for the maximum element in the array.
     * 
     * @param intArray array that we are searching in.
     * 
     * @return the maximum element in the array.
     */
    public static double searchMax(int[] intArray) {
        // If the array is empty
        if(intArray.length == 0) {
            throw new IllegalArgumentException("The array you provided does not have any elements");
        }
        
        // Set the maximum to the first element
        int max = intArray[0];
        
        // Loop through the entire array from the second element
        for(int i = 1; i < intArray.length; i++) {
            // If the current element is greater than the maximum
            if(intArray[i] > max) {
                // Change the maximum value
                max = intArray[i];
            }
        }
        
        // Return the maximum value
        return max;
    }
    
//    /**
//     * Find the first index of the maximum value in the array.
//     * 
//     * @param intArray array that we are searching in.
//     * 
//     * @return the index of the maximum element in the array
//     */
//    public static int findMax(int[] intArray) {
//        // If the array is empty
//        if(intArray.length == 0) {
//            throw new IllegalArgumentException("The array you provided does not have any elements");
//        }
//        
//        // Set the maximum index to the beginning of the array
//        int maxIndex = 0;
//        
//        // Loop through the entire array from the second element
//        for(int i = 1; i < intArray.length; i++) {
//            // If the current element is greater than the maximum
//            if(intArray[i] > intArray[maxIndex]) {
//                // Change the maximum index
//                maxIndex = i;
//            }
//        }
//        
//        // Return the maximum index
//        return maxIndex;
//    }
    
    /**
     * Search for the value in the char array and return the index of the first occurrence from the
     * beginning of the array.
     *  
     * @param charArray array that we are searching in.
     * @param value value that is being searched in the array.
     * @param occurrence number of times we have seen the value before returning the index.
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
     * Search for the minimum element in the array.
     * 
     * @param charArray array that we are searching in.
     * 
     * @return the minimum element in the array.
     */
    public static char searchMin(char[] charArray) {
        // If the array is empty
        if(charArray.length == 0) {
            throw new IllegalArgumentException("The array you provided does not have any elements");
        }
        
        // Set the minimum to the first element
        char min = charArray[0];
        
        // Loop through the entire array from the second element
        for(int i = 1; i < charArray.length; i++) {
            // If the current element is less than the minimum
            if(charArray[i] < min) {
                // Change the minimum value
                min = charArray[i];
            }
        }
        
        // Return the minimum value
        return min;
    }
    
//    /**
//     * Find the first index of the minimum value in the array.
//     * 
//     * @param charArray array that we are searching in.
//     * 
//     * @return the index of the minimum element in the array
//     */
//    public static int findMin(char[] charArray) {
//        // If the array is empty
//        if(charArray.length == 0) {
//            throw new IllegalArgumentException("The array you provided does not have any elements");
//        }
//        
//        // Set the minimum index to the beginning of the array
//        int minIndex = 0;
//        
//        // Loop through the entire array from the second element
//        for(int i = 1; i < charArray.length; i++) {
//            // If the current element is less than the minimum
//            if(charArray[i] < charArray[minIndex]) {
//                // Change the minimum index
//                minIndex = i;
//            }
//        }
//        
//        // Return the minimum index
//        return minIndex;
//    }
    
    /**
     * Search for the maximum element in the array.
     * 
     * @param charArray array that we are searching in.
     * 
     * @return the maximum element in the array.
     */
    public static char searchMax(char[] charArray) {
        // If the array is empty
        if(charArray.length == 0) {
            throw new IllegalArgumentException("The array you provided does not have any elements");
        }
        
        // Set the maximum to the first element
        char max = charArray[0];
        
        // Loop through the entire array from the second element
        for(int i = 1; i < charArray.length; i++) {
            // If the current element is greater than the maximum
            if(charArray[i] > max) {
                // Change the maximum value
                max = charArray[i];
            }
        }
        
        // Return the maximum value
        return max;
    }
    
//    /**
//     * Find the first index of the maximum value in the array.
//     * 
//     * @param charArray array that we are searching in.
//     * 
//     * @return the index of the maximum element in the array
//     */
//    public static int findMax(char[] charArray) {
//        // If the array is empty
//        if(charArray.length == 0) {
//            throw new IllegalArgumentException("The array you provided does not have any elements");
//        }
//        
//        // Set the maximum index to the beginning of the array
//        int maxIndex = 0;
//        
//        // Loop through the entire array from the second element
//        for(int i = 1; i < charArray.length; i++) {
//            // If the current element is greater than the maximum
//            if(charArray[i] > charArray[maxIndex]) {
//                // Change the maximum index
//                maxIndex = i;
//            }
//        }
//        
//        // Return the maximum index
//        return maxIndex;
//    }
    
    /**
     * Search for the value in the byte array and return the index of the first occurrence from the
     * beginning of the array.
     *  
     * @param byteArray array that we are searching in.
     * @param value value that is being searched in the array.
     * @param occurrence number of times we have seen the value before returning the index.
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
     * Search for the minimum element in the array.
     * 
     * @param byteArray array that we are searching in.
     * 
     * @return the minimum element in the array.
     */
    public static byte searchMin(byte[] byteArray) {
        // If the array is empty
        if(byteArray.length == 0) {
            throw new IllegalArgumentException("The array you provided does not have any elements");
        }
        
        // Set the minimum to the first element
        byte min = byteArray[0];
        
        // Loop through the entire array from the second element
        for(int i = 1; i < byteArray.length; i++) {
            // If the current element is less than the minimum
            if(byteArray[i] < min) {
                // Change the minimum value
                min = byteArray[i];
            }
        }
        
        // Return the minimum value
        return min;
    }
    
//    /**
//     * Find the first index of the minimum value in the array.
//     * 
//     * @param byteArray array that we are searching in.
//     * 
//     * @return the index of the minimum element in the array
//     */
//    public static int findMin(byte[] byteArray) {
//        // If the array is empty
//        if(byteArray.length == 0) {
//            throw new IllegalArgumentException("The array you provided does not have any elements");
//        }
//        
//        // Set the minimum index to the beginning of the array
//        int minIndex = 0;
//        
//        // Loop through the entire array from the second element
//        for(int i = 1; i < byteArray.length; i++) {
//            // If the current element is less than the minimum
//            if(byteArray[i] < byteArray[minIndex]) {
//                // Change the minimum index
//                minIndex = i;
//            }
//        }
//        
//        // Return the minimum index
//        return minIndex;
//    }
    
    /**
     * Search for the maximum element in the array.
     * 
     * @param byteArray array that we are searching in.
     * 
     * @return the maximum element in the array.
     */
    public static byte searchMax(byte[] byteArray) {
        // If the array is empty
        if(byteArray.length == 0) {
            throw new IllegalArgumentException("The array you provided does not have any elements");
        }
        
        // Set the maximum to the first element
        byte max = byteArray[0];
        
        // Loop through the entire array from the second element
        for(int i = 1; i < byteArray.length; i++) {
            // If the current element is greater than the maximum
            if(byteArray[i] > max) {
                // Change the maximum value
                max = byteArray[i];
            }
        }
        
        // Return the maximum value
        return max;
    }
    
//    /**
//     * Find the first index of the maximum value in the array.
//     * 
//     * @param byteArray array that we are searching in.
//     * 
//     * @return the index of the maximum element in the array
//     */
//    public static int findMax(byte[] byteArray) {
//        // If the array is empty
//        if(byteArray.length == 0) {
//            throw new IllegalArgumentException("The array you provided does not have any elements");
//        }
//        
//        // Set the maximum index to the beginning of the array
//        int maxIndex = 0;
//        
//        // Loop through the entire array from the second element
//        for(int i = 1; i < byteArray.length; i++) {
//            // If the current element is greater than the maximum
//            if(byteArray[i] > byteArray[maxIndex]) {
//                // Change the maximum index
//                maxIndex = i;
//            }
//        }
//        
//        // Return the maximum index
//        return maxIndex;
//    }
    
    /**
     * Search for the value in the short array and return the index of the first occurrence from the
     * beginning of the array.
     *  
     * @param shortArray array that we are searching in.
     * @param value value that is being searched in the array.
     * @param occurrence number of times we have seen the value before returning the index.
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
     * Search for the minimum element in the array.
     * 
     * @param shortArray array that we are searching in.
     * 
     * @return the minimum element in the array.
     */
    public static short searchMin(short[] shortArray) {
        // If the array is empty
        if(shortArray.length == 0) {
            throw new IllegalArgumentException("The array you provided does not have any elements");
        }
        
        // Set the minimum to the first element
        short min = shortArray[0];
        
        // Loop through the entire array from the second element
        for(int i = 1; i < shortArray.length; i++) {
            // If the current element is less than the minimum
            if(shortArray[i] < min) {
                // Change the minimum value
                min = shortArray[i];
            }
        }
        
        // Return the minimum value
        return min;
    }
    
//    /**
//     * Find the first index of the minimum value in the array.
//     * 
//     * @param shortArray array that we are searching in.
//     * 
//     * @return the index of the minimum element in the array
//     */
//    public static int findMin(short[] shortArray) {
//        // If the array is empty
//        if(shortArray.length == 0) {
//            throw new IllegalArgumentException("The array you provided does not have any elements");
//        }
//        
//        // Set the minimum index to the beginning of the array
//        int minIndex = 0;
//        
//        // Loop through the entire array from the second element
//        for(int i = 1; i < shortArray.length; i++) {
//            // If the current element is less than the minimum
//            if(shortArray[i] < shortArray[minIndex]) {
//                // Change the minimum index
//                minIndex = i;
//            }
//        }
//        
//        // Return the minimum index
//        return minIndex;
//    }
    
    /**
     * Search for the maximum element in the array.
     * 
     * @param shortArray array that we are searching in.
     * 
     * @return the maximum element in the array.
     */
    public static short searchMax(short[] shortArray) {
        // If the array is empty
        if(shortArray.length == 0) {
            throw new IllegalArgumentException("The array you provided does not have any elements");
        }
        
        // Set the maximum to the first element
        short max = shortArray[0];
        
        // Loop through the entire array from the second element
        for(int i = 1; i < shortArray.length; i++) {
            // If the current element is greater than the maximum
            if(shortArray[i] > max) {
                // Change the maximum value
                max = shortArray[i];
            }
        }
        
        // Return the maximum value
        return max;
    }
    
//    /**
//     * Find the first index of the maximum value in the array.
//     * 
//     * @param shortArray array that we are searching in.
//     * 
//     * @return the index of the maximum element in the array
//     */
//    public static int findMax(short[] shortArray) {
//        // If the array is empty
//        if(shortArray.length == 0) {
//            throw new IllegalArgumentException("The array you provided does not have any elements");
//        }
//        
//        // Set the maximum index to the beginning of the array
//        int maxIndex = 0;
//        
//        // Loop through the entire array from the second element
//        for(int i = 1; i < shortArray.length; i++) {
//            // If the current element is greater than the maximum
//            if(shortArray[i] > shortArray[maxIndex]) {
//                // Change the maximum index
//                maxIndex = i;
//            }
//        }
//        
//        // Return the maximum index
//        return maxIndex;
//    }
    
    /**
     * Search for the value in the long array and return the index of the first occurrence from the
     * beginning of the array.
     *  
     * @param longArray array that we are searching in.
     * @param value value that is being searched in the array.
     * @param occurrence number of times we have seen the value before returning the index.
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
     * Search for the minimum element in the array.
     * 
     * @param longArray array that we are searching in.
     * 
     * @return the minimum element in the array.
     */
    public static long searchMin(long[] longArray) {
        // If the array is empty
        if(longArray.length == 0) {
            throw new IllegalArgumentException("The array you provided does not have any elements");
        }
        
        // Set the minimum to the first element
        long min = longArray[0];
        
        // Loop through the entire array from the second element
        for(int i = 1; i < longArray.length; i++) {
            // If the current element is less than the minimum
            if(longArray[i] < min) {
                // Change the minimum value
                min = longArray[i];
            }
        }
        
        // Return the minimum value
        return min;
    }
    
//    /**
//     * Find the first index of the minimum value in the array.
//     * 
//     * @param longArray array that we are searching in.
//     * 
//     * @return the index of the minimum element in the array
//     */
//    public static int findMin(long[] longArray) {
//        // If the array is empty
//        if(longArray.length == 0) {
//            throw new IllegalArgumentException("The array you provided does not have any elements");
//        }
//        
//        // Set the minimum index to the beginning of the array
//        int minIndex = 0;
//        
//        // Loop through the entire array from the second element
//        for(int i = 1; i < longArray.length; i++) {
//            // If the current element is less than the minimum
//            if(longArray[i] < longArray[minIndex]) {
//                // Change the minimum index
//                minIndex = i;
//            }
//        }
//        
//        // Return the minimum index
//        return minIndex;
//    }
    
    /**
     * Search for the maximum element in the array.
     * 
     * @param longArray array that we are searching in.
     * 
     * @return the maximum element in the array.
     */
    public static long searchMax(long[] longArray) {
        // If the array is empty
        if(longArray.length == 0) {
            throw new IllegalArgumentException("The array you provided does not have any elements");
        }
        
        // Set the maximum to the first element
        long max = longArray[0];
        
        // Loop through the entire array from the second element
        for(int i = 1; i < longArray.length; i++) {
            // If the current element is greater than the maximum
            if(longArray[i] > max) {
                // Change the maximum value
                max = longArray[i];
            }
        }
        
        // Return the maximum value
        return max;
    }
    
//    /**
//     * Find the first index of the maximum value in the array.
//     * 
//     * @param longArray array that we are searching in.
//     * 
//     * @return the index of the maximum element in the array
//     */
//    public static int findMax(long[] longArray) {
//        // If the array is empty
//        if(longArray.length == 0) {
//            throw new IllegalArgumentException("The array you provided does not have any elements");
//        }
//        
//        // Set the maximum index to the beginning of the array
//        int maxIndex = 0;
//        
//        // Loop through the entire array from the second element
//        for(int i = 1; i < longArray.length; i++) {
//            // If the current element is greater than the maximum
//            if(longArray[i] > longArray[maxIndex]) {
//                // Change the maximum index
//                maxIndex = i;
//            }
//        }
//        
//        // Return the maximum index
//        return maxIndex;
//    }
    
    /**
     * Search for the value in the float array and return the index of the first occurrence from the
     * beginning of the array.
     *  
     * @param floatArray array that we are searching in.
     * @param value value that is being searched in the array.
     * @param occurrence number of times we have seen the value before returning the index.
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
     * Search for the minimum element in the array.
     * 
     * @param floatArray array that we are searching in.
     * 
     * @return the minimum element in the array.
     */
    public static float searchMin(float[] floatArray) {
        // If the array is empty
        if(floatArray.length == 0) {
            throw new IllegalArgumentException("The array you provided does not have any elements");
        }
        
        // Set the minimum to the first element
        float min = floatArray[0];
        
        // Loop through the entire array from the second element
        for(int i = 1; i < floatArray.length; i++) {
            // If the current element is less than the minimum
            if(floatArray[i] < min) {
                // Change the minimum value
                min = floatArray[i];
            }
        }
        
        // Return the minimum value
        return min;
    }
    
//    /**
//     * Find the first index of the minimum value in the array.
//     * 
//     * @param floatArray array that we are searching in.
//     * 
//     * @return the index of the minimum element in the array
//     */
//    public static int findMin(float[] floatArray) {
//        // If the array is empty
//        if(floatArray.length == 0) {
//            throw new IllegalArgumentException("The array you provided does not have any elements");
//        }
//        
//        // Set the minimum index to the beginning of the array
//        int minIndex = 0;
//        
//        // Loop through the entire array from the second element
//        for(int i = 1; i < floatArray.length; i++) {
//            // If the current element is less than the minimum
//            if(floatArray[i] < floatArray[minIndex]) {
//                // Change the minimum index
//                minIndex = i;
//            }
//        }
//        
//        // Return the minimum index
//        return minIndex;
//    }
    
    /**
     * Search for the maximum element in the array.
     * 
     * @param floatArray array that we are searching in.
     * 
     * @return the maximum element in the array.
     */
    public static double searchMax(float[] floatArray) {
        // If the array is empty
        if(floatArray.length == 0) {
            throw new IllegalArgumentException("The array you provided does not have any elements");
        }
        
        // Set the maximum to the first element
        float max = floatArray[0];
        
        // Loop through the entire array from the second element
        for(int i = 1; i < floatArray.length; i++) {
            // If the current element is greater than the maximum
            if(floatArray[i] > max) {
                // Change the maximum value
                max = floatArray[i];
            }
        }
        
        // Return the maximum value
        return max;
    }
    
//    /**
//     * Find the first index of the maximum value in the array.
//     * 
//     * @param floatArray array that we are searching in.
//     * 
//     * @return the index of the maximum element in the array
//     */
//    public static int findMax(float[] floatArray) {
//        // If the array is empty
//        if(floatArray.length == 0) {
//            throw new IllegalArgumentException("The array you provided does not have any elements");
//        }
//        
//        // Set the maximum index to the beginning of the array
//        int maxIndex = 0;
//        
//        // Loop through the entire array from the second element
//        for(int i = 1; i < floatArray.length; i++) {
//            // If the current element is greater than the maximum
//            if(floatArray[i] > floatArray[maxIndex]) {
//                // Change the maximum index
//                maxIndex = i;
//            }
//        }
//        
//        // Return the maximum index
//        return maxIndex;
//    }
    
    /**
     * Search for the value in the double array and return the index of the first occurrence from the
     * beginning of the array.
     *  
     * @param doubleArray array that we are searching in.
     * @param value value that is being searched in the array.
     * @param occurrence number of times we have seen the value before returning the index.
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
     * Search for the minimum element in the array.
     * 
     * @param doubleArray array that we are searching in.
     * 
     * @return the minimum element in the array.
     */
    public static double searchMin(double[] doubleArray) {
        // If the array is empty
        if(doubleArray.length == 0) {
            throw new IllegalArgumentException("The array you provided does not have any elements");
        }
        
        // Set the minimum to the first element
        double min = doubleArray[0];
        
        // Loop through the entire array from the second element
        for(int i = 1; i < doubleArray.length; i++) {
            // If the current element is less than the minimum
            if(doubleArray[i] < min) {
                // Change the minimum value
                min = doubleArray[i];
            }
        }
        
        // Return the minimum value
        return min;
    }
    
//    /**
//     * Find the first index of the minimum value in the array.
//     * 
//     * @param doubleArray array that we are searching in.
//     * 
//     * @return the index of the minimum element in the array
//     */
//    public static int findMin(double[] doubleArray) {
//        // If the array is empty
//        if(doubleArray.length == 0) {
//            throw new IllegalArgumentException("The array you provided does not have any elements");
//        }
//        
//        // Set the minimum index to the beginning of the array
//        int minIndex = 0;
//        
//        // Loop through the entire array from the second element
//        for(int i = 1; i < doubleArray.length; i++) {
//            // If the current element is less than the minimum
//            if(doubleArray[i] < doubleArray[minIndex]) {
//                // Change the minimum index
//                minIndex = i;
//            }
//        }
//        
//        // Return the minimum index
//        return minIndex;
//    }
    
    /**
     * Search for the maximum element in the array.
     * 
     * @param doubleArray array that we are searching in.
     * 
     * @return the maximum element in the array.
     */
    public static double searchMax(double[] doubleArray) {
        // If the array is empty
        if(doubleArray.length == 0) {
            throw new IllegalArgumentException("The array you provided does not have any elements");
        }
        
        // Set the maximum to the first element
        double max = doubleArray[0];
        
        // Loop through the entire array from the second element
        for(int i = 1; i < doubleArray.length; i++) {
            // If the current element is greater than the maximum
            if(doubleArray[i] > max) {
                // Change the maximum value
                max = doubleArray[i];
            }
        }
        
        // Return the maximum value
        return max;
    }
    
//    /**
//     * Find the first index of the maximum value in the array.
//     * 
//     * @param doubleArray array that we are searching in.
//     * 
//     * @return the index of the maximum element in the array
//     */
//    public static int findMax(double[] doubleArray) {
//        // If the array is empty
//        if(doubleArray.length == 0) {
//            throw new IllegalArgumentException("The array you provided does not have any elements");
//        }
//        
//        // Set the maximum index to the beginning of the array
//        int maxIndex = 0;
//        
//        // Loop through the entire array from the second element
//        for(int i = 1; i < doubleArray.length; i++) {
//            // If the current element is greater than the maximum
//            if(doubleArray[i] > doubleArray[maxIndex]) {
//                // Change the maximum index
//                maxIndex = i;
//            }
//        }
//        
//        // Return the maximum index
//        return maxIndex;
//    }
    
    /**
     * Search for the value in the array and return the index of the specified occurrence from the
     * end of the array.
     * 
     * @param <E> the type of elements in this array.
     * 
     * @param array array that we are searching in.
     * @param value value that is being searched in the array.
     * @param occurrence number of times we have seen the value before returning the index.
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
     * @param <E> the type of elements in this list.
     * 
     * @param list list that we are searching in.
     * @param value value that is being searched in the list.
     * @param occurrence number of times we have seen the value before returning the index.
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
     * @param intArray array that we are searching in.
     * @param value value that is being searched in the array.
     * @param occurrence number of times we have seen the value before returning the index.
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
     * @param charArray array that we are searching in.
     * @param value value that is being searched in the array.
     * @param occurrence number of times we have seen the value before returning the index.
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
     * @param byteArray array that we are searching in.
     * @param value value that is being searched in the array.
     * @param occurrence number of times we have seen the value before returning the index.
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
     * @param shortArray array that we are searching in.
     * @param value value that is being searched in the array.
     * @param occurrence number of times we have seen the value before returning the index.
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
     * @param longArray array that we are searching in.
     * @param value value that is being searched in the array.
     * @param occurrence number of times we have seen the value before returning the index.
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
     * @param floatArray array that we are searching in.
     * @param value value that is being searched in the array.
     * @param occurrence number of times we have seen the value before returning the index.
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
     * @param doubleArray array that we are searching in.
     * @param value value that is being searched in the array.
     * @param occurrence number of times we have seen the value before returning the index.
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
