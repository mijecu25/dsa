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
 * @version 0.1.3.1
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
        Merge.sort(intArray, 0, intArray.length, false);
    }
            
    /**
     * Sort the int array in descending order using this algorithm.
     *
     * @param intArray - the array of ints that we want to sort
     */
    public static void sortDescending(int[] intArray) {
        // Call the sort routine in descending order
        Merge.sort(intArray, 0, intArray.length, true);
    }
    
    /**
     * TODO 
     * @param intArray
     * @param start
     * @param end
     * @param descending
     */
    private static void sort(int[] intArray, int start, int end, boolean descending) {
        // If start
        if(start == end) {
            return ;
        }
        
        int middle = (start + end) >> 1;
        
        Merge.sort(intArray, start, middle, descending);
        Merge.sort(intArray, middle + 1, end, descending);
        
        if(descending) {
            Merge.mergeDescending(intArray, start, middle, end);                        
        }
        else {
            Merge.merge(intArray, start, middle, end);            
        }
    }
    
    /**
     * TODO 
     * @param intArray
     * @param start
     * @param middle
     * @param end
     */
    private static void merge(int[] intArray, int start, int middle, int end) {
        int[] temp = new int[intArray.length];
        
        System.arraycopy(intArray, 0, temp, 0, intArray.length);
        
        int left = start;
        int right  = middle + 1;
        int current = start;
        
        while(left <= middle && right <= end) {
            if(temp[left] <= temp[right]) {
                intArray[current] = temp[left];
                left++;
            }
            else {
                intArray[current] = temp[right];
                right++;
            }
        }
        
        while(left <= middle) {
            intArray[current] = temp[right];
            current++;
            right++;
        }
    }
    
    /**
     * TODO 
     * @param intArray
     * @param start
     * @param middle
     * @param end
     */
    private static void mergeDescending(int[] intArray, int start, int middle, int end) {
        int[] temp = new int[intArray.length];
        
        System.arraycopy(intArray, 0, temp, 0, intArray.length);
        
        int left = start;
        int right  = middle + 1;
        int current = start;
        
        while(left <= middle && right <= end) {
            if(temp[left] >= temp[right]) {
                intArray[current] = temp[left];
                left++;
            }
            else {
                intArray[current] = temp[right];
                right++;
            }
        }
        
        while(left <= middle) {
            intArray[current] = temp[right];
            current++;
            right++;
        }
    }
    
}
