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
 * @author Miguel Velez - miguelvelezmj25
 * @version 0.2.0.2
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
        int start = 0;
        int end = array.length - 1;
        int middle = 0;
        
        while(start <= end) {
            middle = (start + end) >> 1;
        
            if(value.equals(array[middle])) {
                return middle;
            }
            
            if(value.compareTo(array[middle]) < 0) {
                end = middle - 1 ;
            }
            else {
                start = middle + 1;
            }
        }
                

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
        int start = 0;
        int end = list.size() - 1;
        int middle = 0;
        
        while(start <= end) {
            middle = (start + end) >> 1;
        
            if(value.equals(list.get(middle))) {
                return middle;
            }
            
            if(value.compareTo(list.get(middle)) < 0) {
                end = middle - 1 ;
            }
            else {
                start = middle + 1;
            }
        }
                

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
        int start = 0;
        int end = intArray.length - 1;
        int middle = 0;
        
        while(start <= end) {
            middle = (start + end) >> 1;
        
            if(value == intArray[middle]) {
                return middle;
            }
            
            if(value < intArray[middle]) {
                end = middle - 1 ;
            }
            else {
                start = middle + 1;
            }
        }
                

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
        int start = 0;
        int end = charArray.length - 1;
        int middle = 0;
        
        while(start <= end) {
            middle = (start + end) >> 1;
        
            if(value == charArray[middle]) {
                return middle;
            }
            
            if(value < charArray[middle]) {
                end = middle - 1 ;
            }
            else {
                start = middle + 1;
            }
        }
                

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
        int start = 0;
        int end = byteArray.length - 1;
        int middle = 0;
        
        while(start <= end) {
            middle = (start + end) >> 1;
        
            if(value == byteArray[middle]) {
                return middle;
            }
            
            if(value < byteArray[middle]) {
                end = middle - 1 ;
            }
            else {
                start = middle + 1;
            }
        }
                

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
        int start = 0;
        int end = shortArray.length - 1;
        int middle = 0;
        
        while(start <= end) {
            middle = (start + end) >> 1;
        
            if(value == shortArray[middle]) {
                return middle;
            }
            
            if(value < shortArray[middle]) {
                end = middle - 1 ;
            }
            else {
                start = middle + 1;
            }
        }
                

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
        int start = 0;
        int end = longArray.length - 1;
        int middle = 0;
        
        while(start <= end) {
            middle = (start + end) >> 1;
        
            if(value == longArray[middle]) {
                return middle;
            }
            
            if(value < longArray[middle]) {
                end = middle - 1 ;
            }
            else {
                start = middle + 1;
            }
        }
                

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
        int start = 0;
        int end = floatArray.length - 1;
        int middle = 0;
        
        while(start <= end) {
            middle = (start + end) >> 1;
        
            if(value == floatArray[middle]) {
                return middle;
            }
            
            if(value < floatArray[middle]) {
                end = middle - 1 ;
            }
            else {
                start = middle + 1;
            }
        }
                

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
        int start = 0;
        int end = doubleArray.length - 1;
        int middle = 0;
        
        while(start <= end) {
            middle = (start + end) >> 1;
        
            if(value == doubleArray[middle]) {
                return middle;
            }
            
            if(value < doubleArray[middle]) {
                end = middle - 1 ;
            }
            else {
                start = middle + 1;
            }
        }
                

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
        int start = 0;
        int end = array.length - 1;
        int middle = 0;
        
        while(start <= end) {
            middle = (start + end) >> 1;
        
            if(value.equals(array[middle])) {
                return middle;
            }
            
            if(value.compareTo(array[middle]) > 0) {
                end = middle - 1 ;
            }
            else {
                start = middle + 1;
            }
        }
                

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
        int start = 0;
        int end = list.size() - 1;
        int middle = 0;
        
        while(start <= end) {
            middle = (start + end) >> 1;
        
            if(value.equals(list.get(middle))) {
                return middle;
            }
            
            if(value.compareTo(list.get(middle)) > 0) {
                end = middle - 1 ;
            }
            else {
                start = middle + 1;
            }
        }
                

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
        int start = 0;
        int end = intArray.length - 1;
        int middle = 0;
        
        while(start <= end) {
            middle = (start + end) >> 1;
        
            if(value == intArray[middle]) {
                return middle;
            }
            
            if(value > intArray[middle]) {
                end = middle - 1 ;
            }
            else {
                start = middle + 1;
            }
        }
                

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
        int start = 0;
        int end = charArray.length - 1;
        int middle = 0;
        
        while(start <= end) {
            middle = (start + end) >> 1;
        
            if(value == charArray[middle]) {
                return middle;
            }
            
            if(value > charArray[middle]) {
                end = middle - 1 ;
            }
            else {
                start = middle + 1;
            }
        }
                

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
        int start = 0;
        int end = byteArray.length - 1;
        int middle = 0;
        
        while(start <= end) {
            middle = (start + end) >> 1;
        
            if(value == byteArray[middle]) {
                return middle;
            }
            
            if(value > byteArray[middle]) {
                end = middle - 1 ;
            }
            else {
                start = middle + 1;
            }
        }
                

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
        int start = 0;
        int end = shortArray.length - 1;
        int middle = 0;
        
        while(start <= end) {
            middle = (start + end) >> 1;
        
            if(value == shortArray[middle]) {
                return middle;
            }
            
            if(value > shortArray[middle]) {
                end = middle - 1 ;
            }
            else {
                start = middle + 1;
            }
        }
                

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
        int start = 0;
        int end = longArray.length - 1;
        int middle = 0;
        
        while(start <= end) {
            middle = (start + end) >> 1;
        
            if(value == longArray[middle]) {
                return middle;
            }
            
            if(value > longArray[middle]) {
                end = middle - 1 ;
            }
            else {
                start = middle + 1;
            }
        }
                

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
        int start = 0;
        int end = floatArray.length - 1;
        int middle = 0;
        
        while(start <= end) {
            middle = (start + end) >> 1;
        
            if(value == floatArray[middle]) {
                return middle;
            }
            
            if(value > floatArray[middle]) {
                end = middle - 1 ;
            }
            else {
                start = middle + 1;
            }
        }
                

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
        int start = 0;
        int end = doubleArray.length - 1;
        int middle = 0;
        
        while(start <= end) {
            middle = (start + end) >> 1;
        
            if(value == doubleArray[middle]) {
                return middle;
            }
            
            if(value > doubleArray[middle]) {
                end = middle - 1 ;
            }
            else {
                start = middle + 1;
            }
        }
                

        return -1;
    }
    
}
