package com.mijecu25.dsa.algorithms.search.logarithmic;

import java.util.List;

import com.mijecu25.dsa.algorithms.search.Search;

/**
 * Search algorithm over a sorted collection that continuously compares the value being searched with the
 * middle of the array. If the value is less than the middle, it searches on the left side; if the value
 * is greater, it searches on the right side. All methods return the index where the elements was found 
 * in the collection.
 *
 * <br>
 * <br>
 *  
 * The methods do not check if the collection is sorted. That is the job of the programmer. If the 
 * collection is not sorted, the methods are not guaranteed to work correctly. (i.e. the element
 * that is being searched could be in the collection, but it was not found by the algorithm since
 * the comparison made the algorithm search on the side of the collection that does not contain the
 * value.
 *   
 * <br>
 * <br>
 * 
 * <i>Runtime: </i> O(log(n))
 * 
 * @author Miguel Velez miguelvelezmj25
 * @version 0.2.0.1
 */
public final class BinarySearch extends Search {
      
    /**
     * Don't let anyone instantiate this class
     */
    private BinarySearch() { ; }
    
    /**
     * Search for the value in the sorted sorted array and return the index.
     * 
     * @param <E> the type of elements in this array.
     * 
     * @param array array that we are searching in.
     * @param value value that is being searched in the array.
     * 
     * @return the index where the value is found in the array, else -1.
     */
    public static <E extends Comparable<E>> int search(E[] array, E value) {                 
        // Get the indexes of the array
        int start = 0;
        int end = array.length - 1;
        int middle = 0;
        
        // While the start index is less than or equal to the end index
        while(start <= end) {
            // Get the middle index of the array
            middle = (start + end) >> 1;
        
            // If the value equals to the current object
            if(value.equals(array[middle])) {
                // Return the index
                return middle;
            }
            
            // If the value is less than the current value
            if(value.compareTo(array[middle]) < 0) {
                // Search on the left half of the array
                end = middle - 1 ;
            }
            else {
                // Search on the right half of the array
                start = middle + 1;
            }
        }
                
        // If the method has not returned by this point, it means that the
        // value was not found. So we return -1
        return -1;
    }
    
    /**
     * Search for the value in the sorted list and return the index. The run time of this algorithm depends on the 
     * implementation of the list. It is advised to use an array based implementation
     * to achieve O(log (n)) runtime.
     * 
     * @param <E> the type of elements in this list.
     * 
     * @param list list that we are searching in.
     * @param value value that is being searched in the list.
     * 
     * @return the index where the value is found in the list, else -1.
     */
    public static <E extends Comparable<E>> int search(List<E> list, E value) { 
        // Get the indexes of the list
        int start = 0;
        int end = list.size() - 1;
        int middle = 0;
        
        // While the start index is less than or equal to the end index
        while(start <= end) {
            // Get the middle index of the list
            middle = (start + end) >> 1;
        
            // If the value equals to the current object
            if(value.equals(list.get(middle))) {
                // Return the index
                return middle;
            }
            
            // If the value is less than the current value
            if(value.compareTo(list.get(middle)) < 0) {
                // Search on the left half of the list
                end = middle - 1 ;
            }
            else {
                // Search on the right half of the list
                start = middle + 1;
            }
        }
                
        // If the method has not returned by this point, it means that the
        // value was not found. So we return -1
        return -1;
    }
    
    /**
     * Search for the value in the sorted int array and return the index.
     *  
     * @param intArray array that we are searching in.
     * @param value value that is being searched in the array.
     * 
     * @return the index where the value is found in the array, else -1.
     */
    public static int search(int[] intArray, int value) { 
        // Get the indexes of the array
        int start = 0;
        int end = intArray.length - 1;
        int middle = 0;
        
        // While the start index is less than or equal to the end index
        while(start <= end) {
            // Get the middle index of the array
            middle = (start + end) >> 1;
        
            // If the value equals to the current object
            if(value == intArray[middle]) {
                // Return the index
                return middle;
            }
            
            // If the value is less than the current value
            if(value < intArray[middle]) {
                // Search on the left half of the array
                end = middle - 1 ;
            }
            else {
                // Search on the right half of the array
                start = middle + 1;
            }
        }
                
        // If the method has not returned by this point, it means that the
        // value was not found. So we return -1
        return -1;
    }
    
    /**
     * Search for the value in the sorted char array and return the index.
     *  
     * @param charArray array that we are searching in.
     * @param value value that is being searched in the array.
     * 
     * @return the index where the value is found in the array, else -1.
     */
    public static int search(char[] charArray, char value) { 
        // Get the indexes of the array
        int start = 0;
        int end = charArray.length - 1;
        int middle = 0;
        
        // While the start index is less than or equal to the end index
        while(start <= end) {
            // Get the middle index of the array
            middle = (start + end) >> 1;
        
            // If the value equals to the current object
            if(value == charArray[middle]) {
                // Return the index
                return middle;
            }
            
            // If the value is less than the current value
            if(value < charArray[middle]) {
                // Search on the left half of the array
                end = middle - 1 ;
            }
            else {
                // Search on the right half of the array
                start = middle + 1;
            }
        }
                
        // If the method has not returned by this point, it means that the
        // value was not found. So we return -1
        return -1;
    }
    
    /**
     * Search for the value in the sorted byte array and return the index.
     *  
     * @param byteArray array that we are searching in.
     * @param value value that is being searched in the array.
     * 
     * @return the index where the value is found in the array, else -1.
     */
    public static int search(byte[] byteArray, byte value) { 
        // Get the indexes of the array
        int start = 0;
        int end = byteArray.length - 1;
        int middle = 0;
        
        // While the start index is less than or equal to the end index
        while(start <= end) {
            // Get the middle index of the array
            middle = (start + end) >> 1;
        
            // If the value equals to the current object
            if(value == byteArray[middle]) {
                // Return the index
                return middle;
            }
            
            // If the value is less than the current value
            if(value < byteArray[middle]) {
                // Search on the left half of the array
                end = middle - 1 ;
            }
            else {
                // Search on the right half of the array
                start = middle + 1;
            }
        }
                
        // If the method has not returned by this point, it means that the
        // value was not found. So we return -1
        return -1;
    }
    
    /**
     * Search for the value in the sorted short array and return the index.
     *  
     * @param shortArray array that we are searching in.
     * @param value value that is being searched in the array.
     * 
     * @return the index where the value is found in the array, else -1.
     */
    public static int search(short[] shortArray, short value) { 
        // Get the indexes of the array
        int start = 0;
        int end = shortArray.length - 1;
        int middle = 0;
        
        // While the start index is less than or equal to the end index
        while(start <= end) {
            // Get the middle index of the array
            middle = (start + end) >> 1;
        
            // If the value equals to the current object
            if(value == shortArray[middle]) {
                // Return the index
                return middle;
            }
            
            // If the value is less than the current value
            if(value < shortArray[middle]) {
                // Search on the left half of the array
                end = middle - 1 ;
            }
            else {
                // Search on the right half of the array
                start = middle + 1;
            }
        }
                
        // If the method has not returned by this point, it means that the
        // value was not found. So we return -1
        return -1;
    }
    
    /**
     * Search for the value in the sorted long array and return the index.
     *  
     * @param longArray array that we are searching in.
     * @param value value that is being searched in the array.
     * 
     * @return the index where the value is found in the array, else -1.
     */
    public static int search(long[] longArray, long value) { 
        // Get the indexes of the array
        int start = 0;
        int end = longArray.length - 1;
        int middle = 0;
        
        // While the start index is less than or equal to the end index
        while(start <= end) {
            // Get the middle index of the array
            middle = (start + end) >> 1;
        
            // If the value equals to the current object
            if(value == longArray[middle]) {
                // Return the index
                return middle;
            }
            
            // If the value is less than the current value
            if(value < longArray[middle]) {
                // Search on the left half of the array
                end = middle - 1 ;
            }
            else {
                // Search on the right half of the array
                start = middle + 1;
            }
        }
                
        // If the method has not returned by this point, it means that the
        // value was not found. So we return -1
        return -1;
    }
    
    /**
     * Search for the value in the sorted float array and return the index.
     *  
     * @param floatArray array that we are searching in.
     * @param value value that is being searched in the array.
     * 
     * @return the index where the value is found in the array, else -1.
     */
    public static int search(float[] floatArray, float value) { 
        // Get the indexes of the array
        int start = 0;
        int end = floatArray.length - 1;
        int middle = 0;
        
        // While the start index is less than or equal to the end index
        while(start <= end) {
            // Get the middle index of the array
            middle = (start + end) >> 1;
        
            // If the value equals to the current object
            if(value == floatArray[middle]) {
                // Return the index
                return middle;
            }
            
            // If the value is less than the current value
            if(value < floatArray[middle]) {
                // Search on the left half of the array
                end = middle - 1 ;
            }
            else {
                // Search on the right half of the array
                start = middle + 1;
            }
        }
                
        // If the method has not returned by this point, it means that the
        // value was not found. So we return -1
        return -1;
    }
    
    /**
     * Search for the value in the sorted double array and return the index.
     *  
     * @param doubleArray array that we are searching in.
     * @param value value that is being searched in the array.
     * 
     * @return the index where the value is found in the array, else -1.
     */
    public static int search(double[] doubleArray, double value) { 
        // Get the indexes of the array
        int start = 0;
        int end = doubleArray.length - 1;
        int middle = 0;
        
        // While the start index is less than or equal to the end index
        while(start <= end) {
            // Get the middle index of the array
            middle = (start + end) >> 1;
        
            // If the value equals to the current object
            if(value == doubleArray[middle]) {
                // Return the index
                return middle;
            }
            
            // If the value is less than the current value
            if(value < doubleArray[middle]) {
                // Search on the left half of the array
                end = middle - 1 ;
            }
            else {
                // Search on the right half of the array
                start = middle + 1;
            }
        }
                
        // If the method has not returned by this point, it means that the
        // value was not found. So we return -1
        return -1;
    }
    
    /**
     * Search for the value in the reverse sorted sorted array and return the index.
     * 
     * @param <E> the type of elements in this array.
     * 
     * @param array array that we are searching in.
     * @param value value that is being searched in the array.
     * 
     * @return the index where the value is found in the array, else -1.
     */
    public static <E extends Comparable<E>> int searchDescending(E[] array, E value) {                 
        // Get the indexes of the array
        int start = 0;
        int end = array.length - 1;
        int middle = 0;
        
        // While the start index is less than or equal to the end index
        while(start <= end) {
            // Get the middle index of the array
            middle = (start + end) >> 1;
        
            // If the value equals to the current object
            if(value.equals(array[middle])) {
                // Return the index
                return middle;
            }
            
            // If the value is greater than the current value
            if(value.compareTo(array[middle]) > 0) {
                // Search on the left half of the array
                end = middle - 1 ;
            }
            else {
                // Search on the right half of the array
                start = middle + 1;
            }
        }
                
        // If the method has not returned by this point, it means that the
        // value was not found. So we return -1
        return -1;
    }
    
    /**
     * Search for the value in the reverse sorted list and return the index. The run time of this algorithm depends on the 
     * implementation of the list. It is advised to use an array based implementation
     * to achieve O(log (n)) runtime.
     * 
     * @param <E> the type of elements in this list.
     * 
     * @param list list that we are searching in.
     * @param value value that is being searched in the list.
     * 
     * @return the index where the value is found in the list, else -1.
     */
    public static <E extends Comparable<E>> int searchDescending(List<E> list, E value) { 
        // Get the indexes of the list
        int start = 0;
        int end = list.size() - 1;
        int middle = 0;
        
        // While the start index is less than or equal to the end index
        while(start <= end) {
            // Get the middle index of the list
            middle = (start + end) >> 1;
        
            // If the value equals to the current object
            if(value.equals(list.get(middle))) {
                // Return the index
                return middle;
            }
            
            // If the value is greater than the current value
            if(value.compareTo(list.get(middle)) > 0) {
                // Search on the left half of the list
                end = middle - 1 ;
            }
            else {
                // Search on the right half of the list
                start = middle + 1;
            }
        }
                
        // If the method has not returned by this point, it means that the
        // value was not found. So we return -1
        return -1;
    }
    
    /**
     * Search for the value in the reverse sorted int array and return the index.
     *  
     * @param intArray array that we are searching in.
     * @param value value that is being searched in the array.
     * 
     * @return the index where the value is found in the array, else -1.
     */
    public static int searchDescending(int[] intArray, int value) { 
        // Get the indexes of the array
        int start = 0;
        int end = intArray.length - 1;
        int middle = 0;
        
        // While the start index is less than or equal to the end index
        while(start <= end) {
            // Get the middle index of the array
            middle = (start + end) >> 1;
        
            // If the value equals to the current object
            if(value == intArray[middle]) {
                // Return the index
                return middle;
            }
            
            // If the value is greater than the current value
            if(value > intArray[middle]) {
                // Search on the left half of the array
                end = middle - 1 ;
            }
            else {
                // Search on the right half of the array
                start = middle + 1;
            }
        }
                
        // If the method has not returned by this point, it means that the
        // value was not found. So we return -1
        return -1;
    }
    
    /**
     * Search for the value in the reverse sorted char array and return the index.
     *  
     * @param charArray array that we are searching in.
     * @param value value that is being searched in the array.
     * 
     * @return the index where the value is found in the array, else -1.
     */
    public static int searchDescending(char[] charArray, char value) { 
        // Get the indexes of the array
        int start = 0;
        int end = charArray.length - 1;
        int middle = 0;
        
        // While the start index is less than or equal to the end index
        while(start <= end) {
            // Get the middle index of the array
            middle = (start + end) >> 1;
        
            // If the value equals to the current object
            if(value == charArray[middle]) {
                // Return the index
                return middle;
            }
            
            // If the value is greater than the current value
            if(value > charArray[middle]) {
                // Search on the left half of the array
                end = middle - 1 ;
            }
            else {
                // Search on the right half of the array
                start = middle + 1;
            }
        }
                
        // If the method has not returned by this point, it means that the
        // value was not found. So we return -1
        return -1;
    }
    
    /**
     * Search for the value in the reverse sorted byte array and return the index.
     *  
     * @param byteArray array that we are searching in.
     * @param value value that is being searched in the array.
     * 
     * @return the index where the value is found in the array, else -1.
     */
    public static int searchDescending(byte[] byteArray, byte value) { 
        // Get the indexes of the array
        int start = 0;
        int end = byteArray.length - 1;
        int middle = 0;
        
        // While the start index is less than or equal to the end index
        while(start <= end) {
            // Get the middle index of the array
            middle = (start + end) >> 1;
        
            // If the value equals to the current object
            if(value == byteArray[middle]) {
                // Return the index
                return middle;
            }
            
            // If the value is greater than the current value
            if(value > byteArray[middle]) {
                // Search on the left half of the array
                end = middle - 1 ;
            }
            else {
                // Search on the right half of the array
                start = middle + 1;
            }
        }
                
        // If the method has not returned by this point, it means that the
        // value was not found. So we return -1
        return -1;
    }
    
    /**
     * Search for the value in the reverse sorted short array and return the index.
     *  
     * @param shortArray array that we are searching in.
     * @param value value that is being searched in the array.
     * 
     * @return the index where the value is found in the array, else -1.
     */
    public static int searchDescending(short[] shortArray, short value) { 
        // Get the indexes of the array
        int start = 0;
        int end = shortArray.length - 1;
        int middle = 0;
        
        // While the start index is less than or equal to the end index
        while(start <= end) {
            // Get the middle index of the array
            middle = (start + end) >> 1;
        
            // If the value equals to the current object
            if(value == shortArray[middle]) {
                // Return the index
                return middle;
            }
            
            // If the value is greater than the current value
            if(value > shortArray[middle]) {
                // Search on the left half of the array
                end = middle - 1 ;
            }
            else {
                // Search on the right half of the array
                start = middle + 1;
            }
        }
                
        // If the method has not returned by this point, it means that the
        // value was not found. So we return -1
        return -1;
    }
    
    /**
     * Search for the value in the reverse sorted long array and return the index.
     *  
     * @param longArray array that we are searching in.
     * @param value value that is being searched in the array.
     * 
     * @return the index where the value is found in the array, else -1.
     */
    public static int searchDescending(long[] longArray, long value) { 
        // Get the indexes of the array
        int start = 0;
        int end = longArray.length - 1;
        int middle = 0;
        
        // While the start index is less than or equal to the end index
        while(start <= end) {
            // Get the middle index of the array
            middle = (start + end) >> 1;
        
            // If the value equals to the current object
            if(value == longArray[middle]) {
                // Return the index
                return middle;
            }
            
            // If the value is greater than the current value
            if(value > longArray[middle]) {
                // Search on the left half of the array
                end = middle - 1 ;
            }
            else {
                // Search on the right half of the array
                start = middle + 1;
            }
        }
                
        // If the method has not returned by this point, it means that the
        // value was not found. So we return -1
        return -1;
    }
    
    /**
     * Search for the value in the reverse sorted float array and return the index.
     *  
     * @param floatArray array that we are searching in.
     * @param value value that is being searched in the array.
     * 
     * @return the index where the value is found in the array, else -1.
     */
    public static int searchDescending(float[] floatArray, float value) { 
        // Get the indexes of the array
        int start = 0;
        int end = floatArray.length - 1;
        int middle = 0;
        
        // While the start index is less than or equal to the end index
        while(start <= end) {
            // Get the middle index of the array
            middle = (start + end) >> 1;
        
            // If the value equals to the current object
            if(value == floatArray[middle]) {
                // Return the index
                return middle;
            }
            
            // If the value is greater than the current value
            if(value > floatArray[middle]) {
                // Search on the left half of the array
                end = middle - 1 ;
            }
            else {
                // Search on the right half of the array
                start = middle + 1;
            }
        }
                
        // If the method has not returned by this point, it means that the
        // value was not found. So we return -1
        return -1;
    }
    
    /**
     * Search for the value in the reverse sorted double array and return the index.
     *  
     * @param doubleArray array that we are searching in.
     * @param value value that is being searched in the array.
     * 
     * @return the index where the value is found in the array, else -1.
     */
    public static int searchDescending(double[] doubleArray, double value) { 
        // Get the indexes of the array
        int start = 0;
        int end = doubleArray.length - 1;
        int middle = 0;
        
        // While the start index is less than or equal to the end index
        while(start <= end) {
            // Get the middle index of the array
            middle = (start + end) >> 1;
        
            // If the value equals to the current object
            if(value == doubleArray[middle]) {
                // Return the index
                return middle;
            }
            
            // If the value is greater than the current value
            if(value > doubleArray[middle]) {
                // Search on the left half of the array
                end = middle - 1 ;
            }
            else {
                // Search on the right half of the array
                start = middle + 1;
            }
        }
                
        // If the method has not returned by this point, it means that the
        // value was not found. So we return -1
        return -1;
    }
    
}
