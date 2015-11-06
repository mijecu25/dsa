package com.mijecu25.dsa.algorithms.sort.linearlogarithmic;

import com.mijecu25.dsa.algorithms.sort.Sort;

/**
 * Linear logarithmic sorting algorithm. TODO
 * 
 * <br>
 * <br>
 * 
 * <i>Worst case performance: </i> O(n log(n))
 * <br>
 * <i>Best case performance: </i> O(n log(n))
 * <br>
 * <i>Average case performance: </i> O(n log(n))
 * 
 * @author Miguel Velez - miguelvelezmj25
 * @version 0.1.3.2
 */
public class Merge extends Sort {
    
    /**
     * Don't let anyone instantiate this class
     */
    private Merge() { ; }
        

    /**
     * Sort the int array in ascending order using this algorithm.
     * 
     * @param intArray - the array of ints that we want to sort
     */
    public static void sort(int[] intArray) {
        // Call the sort routine in ascending order
        Merge.sort(intArray, 0, intArray.length-1, false);
    }
            
    /**
     * Sort the int array in descending order using this algorithm.
     *
     * @param intArray - the array of ints that we want to sort
     */
    public static void sortDescending(int[] intArray) {
        // Call the sort routine in descending order
        Merge.sort(intArray, 0, intArray.length-1, true);
    }
    
    /**
     * Sort routine that recursively calls itself after splitting the original array
     * in half. This routine is used for both ascending and descending sort since 
     * the work done is similar. The only difference is when calling the merge
     * routine.
     * 
     * @param intArray - array that we want to sort
     * @param start - index of the starting point to sort
     * @param end - index of the end point to sort
     * @param descending - boolean value that determines if we want to do descending sort
     */
    private static void sort(int[] intArray, int start, int end, boolean descending) {
        // If start index equals the end index
        if(start == end) {
            return ;
        }
        
        // Get the middle of the array
        int middle = (start + end) >> 1;
        
        // Recursively call the same routine on the left half of the array
        Merge.sort(intArray, start, middle, descending);
        // Recursively call the same routine on the right half of the array
        Merge.sort(intArray, middle + 1, end, descending);
        
        // If we want descending sort
        if(descending) {
            // Call the descending merge routine
            Merge.mergeDescending(intArray, start, middle, end);                        
        }
        else {
            // Call the ascending merge routine
            Merge.merge(intArray, start, middle, end);            
        }
    }
    
    /**
     * Merge two sorted arrays into a bigger array in ascending order. This routine runs in O(n) time.
     * 
     * @param intArray - array with two sorted sub arrays that will be merged
     * @param start - index of the starting point of the left array
     * @param middle - index that splits the array in two sub arrays
     * @param end - index of the end point of the right array
     */
    private static void merge(int[] intArray, int start, int middle, int end) {
        // Create a temporary array
        int[] temp = new int[intArray.length];
        
        // Copy all of the elements from the original array to the temp array
        System.arraycopy(intArray, 0, temp, 0, intArray.length);
        
        // Initialize auxiliary indexes
        int left = start;
        int right  = middle + 1;
        int current = start;
        
        // While the left index is less or equal to the middle index and the right
        // index is less or equal to the end index
        while(left <= middle && right <= end) {
            // If the left value is less or equal to the right value
            if(temp[left] <= temp[right]) {
                // Set the current value to the left value
                intArray[current] = temp[left];
                // Move the left pointer to the right
                left++;
            }
            else {
                // Set the current value to the right value
                intArray[current] = temp[right];
                // Move the right pointer to the right
                right++;
            }
            
            // Move the current pointer to the right
            current++;
        }
        
        // While the left index is less or equal to the middle index
        while(left <= middle) {
            // Set the current value to the left value
            intArray[current] = temp[left];
            // Move the left pointer to the right
            left++;
            // Move the current pointer to the right
            current++;
        }
        
        // There is no need to put the rest of the element of the right sub array, since they are already 
        // in sorted order since all of the small elements where put to the left of the array.
    }
    
    /**
     * Merge two sorted arrays into a bigger array in descending order. This routine runs in O(n) time.
     * 
     * @param intArray - array with two sorted sub arrays that will be merged
     * @param start - index of the starting point of the left array
     * @param middle - index that splits the array in two sub arrays
     * @param end - index of the end point of the right array
     */
    private static void mergeDescending(int[] intArray, int start, int middle, int end) {
        // Create a temporary array
        int[] temp = new int[intArray.length];
        
        // Copy all of the elements from the original array to the temp array
        System.arraycopy(intArray, 0, temp, 0, intArray.length);
        
        // Initialize auxiliary indexes
        int left = start;
        int right  = middle + 1;
        int current = start;
        
        // While the left index is less or equal to the middle index and the right
        // index is less or equal to the end index
        while(left <= middle && right <= end) {
            // If the left value is greater or equal to the right value
            if(temp[left] >= temp[right]) {
                // Set the current value to the left value
                intArray[current] = temp[left];
                // Move the left pointer to the right
                left++;
            }
            else {
                // Set the current value to the right value
                intArray[current] = temp[right];
                // Move the right pointer to the right
                right++;
            }
            
            // Move the current pointer to the right
            current++;
        }
        
        // While the left index is less or equal to the middle index
        while(left <= middle) {
            // Set the current value to the left value
            intArray[current] = temp[left];
            // Move the left pointer to the right
            left++;
            // Move the current pointer to the right
            current++;
        }
        
        // There is no need to put the rest of the element of the right sub array, since they are already 
        // in sorted order since all of the small elements where put to the left of the array.
    }
    
}
