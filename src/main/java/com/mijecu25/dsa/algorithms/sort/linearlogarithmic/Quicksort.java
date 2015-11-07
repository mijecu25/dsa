package com.mijecu25.dsa.algorithms.sort.linearlogarithmic;

import com.mijecu25.dsa.algorithms.sort.Sort;
import com.mijecu25.dsa.algorithms.swap.XORSwap;

/**
 * Linear logarithmic sorting algorithm. This recursive algorithm partitions the collection into
 * two sub collections around a pivot. The pivot is chosen to be the end of the current sub collection.
 * One sub collection has all elements less than the pivot and the other has all the elements
 * greater than the pivot. The sub collections are sorted by recursive calls to this algorithm.
 * Although this algorithm is asymptotically faster than other algorithms, because it is recursive,
 * it might perform slower when used with small collections. Also, if the list is very large, you could
 * get an StackOverflowError if the algorithm recurses too deeply. 
 * 
 * <br>
 * <br>
 * 
 * This algorithm has a worst case performance of O(n<sup>2</sup>) because the pivot has to be chosen. 
 * The implementation of this algorithm chooses the pivot to be the end of the sub collection to avoid
 * this runtime. 
 * 
 * <br>
 * <br>
 * 
 * <i>Worst case performance: </i> O(n<sup>2</sup>)
 * <br>
 * <i>Best case performance: </i> O(n log(n))
 * <br>
 * <i>Average case performance: </i> O(n log(n))
 * 
 * @author Miguel Velez - miguelvelezmj25
 * @version 0.1.3.2
 */
public class Quicksort extends Sort {
    
    /**
     * Don't let anyone instantiate this class
     */
    private Quicksort() { ; }
    
    /**
     * Sort the array in ascending order using this algorithm.
     * 
     * @param intArray - the array that we want to sort
     */
    public static void sort(int[] intArray) {
        // Call the subroutine in ascending order
        Quicksort.sort(intArray, 0, intArray.length - 1, false);
    }
    
    /**
     * Sort the array in descending order using this algorithm.
     * 
     * @param intArray - the array that we want to sort
     */
    public static void sortDescending(int[] intArray) {
        // Call the subroutine in ascending order
        Quicksort.sort(intArray, 0, intArray.length - 1, true);
    }
    
    /**
     * 
     * @param intArray
     * @param start
     * @param end
     * @param descending
     */
    private static void sort(int[] intArray, int start, int end, boolean descending) {
        if(start >= end) {
            return ;
        }

        int pivot = 0;
        
        if(descending) {
            pivot = Quicksort.partitionDescending(intArray, start, end);
        }
        else {
            pivot = Quicksort.partition(intArray, start, end);
        }
        
        Quicksort.sort(intArray, start, pivot - 1, descending);
        Quicksort.sort(intArray, pivot + 1, end, descending);   
    }
    
    /**
     * 
     * @param intArray
     * @param start
     * @param end
     * @return
     */
    private static int partition(int[] intArray, int start, int end) {
        int pivot = intArray[end];
        
        int i = start - 1;
        
        for(int j = start; j < end; j++) {
            if(intArray[j] <= pivot) {
                i++;
                XORSwap.swap(intArray, i, j);
            }
        }
        
        XORSwap.swap(intArray, i + 1, end);
        
        return i + 1;
    }
    
    /**
     * 
     * @param intArray
     * @param start
     * @param end
     * @return
     */
    private static int partitionDescending(int[] intArray, int start, int end) {
        int pivot = intArray[end];
        
        int i = start - 1;
        
        for(int j = start; j < end; j++) {
            if(intArray[j] >= pivot) {
                i++;
                XORSwap.swap(intArray, i, j);
            }
        }
        
        XORSwap.swap(intArray, i + 1, end);
        
        return i + 1;
    }

}
