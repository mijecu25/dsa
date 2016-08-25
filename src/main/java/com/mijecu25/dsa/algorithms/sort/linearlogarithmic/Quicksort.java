package com.mijecu25.dsa.algorithms.sort.linearlogarithmic;

import java.util.List;

import com.mijecu25.dsa.algorithms.sort.Sort;
import com.mijecu25.dsa.algorithms.swap.TrivialSwap;
import com.mijecu25.dsa.algorithms.swap.XORSwap;

/**
 * Linear logarithmic sorting algorithm. This recursive algorithm partitions the collection into
 * two sub collections around a pivot. The pivot is chosen to be the end of the current sub collection.
 * One sub collection has all elements less than the pivot and the other has all the elements
 * greater than the pivot. The sub collections are sorted by recursive calls to this algorithm.
 * Although this algorithm is asymptotically faster than other algorithms, because it is recursive,
 * it might perform slower when used with small collections. Also, if the list is very large, you could
 * get an StackOverflowError if the algorithm recurses too deeply. The implemenation of this algorithm
 * is in place
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
 * @version 0.2.0.2
 */
public class Quicksort extends Sort {
    
    /**
     * Don't let anyone instantiate this class
     */
    private Quicksort() { ; }
    
    /**
     * Sort the array in ascending order using this algorithm.
     * 
     * @param intArray the array that we want to sort
     */
    public static void sort(int[] intArray) {
        Quicksort.sort(intArray, 0, intArray.length - 1 , false);
    }
    
    /**
     * Sort the array in descending order using this algorithm.
     * 
     * @param intArray the array that we want to sort
     */
    public static void sortDescending(int[] intArray) {
        Quicksort.sort(intArray, 0, intArray.length - 1 , true);
    }
    
    /**
     * Sort the array in ascending order using this algorithm.
     * 
     * @param charArray the array that we want to sort
     */
    public static void sort(char[] charArray) {
        Quicksort.sort(charArray, 0, charArray.length - 1 , false);
    }
    
    /**
     * Sort the array in descending order using this algorithm.
     * 
     * @param charArray the array that we want to sort
     */
    public static void sortDescending(char[] charArray) {
        Quicksort.sort(charArray, 0, charArray.length - 1 , true);
    }
    
    /**
     * Sort the array in ascending order using this algorithm.
     * 
     * @param byteArray the array that we want to sort
     */
    public static void sort(byte[] byteArray) {
        Quicksort.sort(byteArray, 0, byteArray.length - 1 , false);
    }
    
    /**
     * Sort the array in descending order using this algorithm.
     * 
     * @param byteArray the array that we want to sort
     */
    public static void sortDescending(byte[] byteArray) {
        Quicksort.sort(byteArray, 0, byteArray.length - 1 , true);
    }
    
    /**
     * Sort the array in ascending order using this algorithm.
     * 
     * @param shortArray the array that we want to sort
     */
    public static void sort(short[] shortArray) {
        Quicksort.sort(shortArray, 0, shortArray.length - 1 , false);
    }
    
    /**
     * Sort the array in descending order using this algorithm.
     * 
     * @param shortArray the array that we want to sort
     */
    public static void sortDescending(short[] shortArray) {
        Quicksort.sort(shortArray, 0, shortArray.length - 1 , true);
    }
    
    /**
     * Sort the array in ascending order using this algorithm.
     * 
     * @param longArray the array that we want to sort
     */
    public static void sort(long[] longArray) {
        Quicksort.sort(longArray, 0, longArray.length - 1 , false);
    }
    
    /**
     * Sort the array in descending order using this algorithm.
     * 
     * @param longArray the array that we want to sort
     */
    public static void sortDescending(long[] longArray) {
        Quicksort.sort(longArray, 0, longArray.length - 1 , true);
    }
    
    /**
     * Sort the array in ascending order using this algorithm.
     * 
     * @param floatArray the array that we want to sort
     */
    public static void sort(float[] floatArray) {
        Quicksort.sort(floatArray, 0, floatArray.length - 1 , false);
    }
    
    /**
     * Sort the array in descending order using this algorithm.
     * 
     * @param floatArray the array that we want to sort
     */
    public static void sortDescending(float[] floatArray) {
        Quicksort.sort(floatArray, 0, floatArray.length - 1 , true);
    }
    
    /**
     * Sort the array in ascending order using this algorithm.
     * 
     * @param doubleArray the array that we want to sort
     */
    public static void sort(double[] doubleArray) {
        Quicksort.sort(doubleArray, 0, doubleArray.length - 1 , false);
    }
    
    /**
     * Sort the array in descending order using this algorithm.
     * 
     * @param doubleArray the array that we want to sort
     */
    public static void sortDescending(double[] doubleArray) {
        Quicksort.sort(doubleArray, 0, doubleArray.length - 1 , true);
    }
    
    /**
     * Sort the array in ascending order using this algorithm.
     * 
     * @param <E> the type of elements in this array.
     * 
     * @param intArray the array that we want to sort
     */
    public static <E extends Comparable<E>> void sort(E[] intArray) {
        Quicksort.sort(intArray, 0, intArray.length - 1 , false);
    }
    
    /**
     * Sort the array in descending order using this algorithm.
     * 
     * @param <E> the type of elements in this array.
     * 
     * @param intArray the array that we want to sort
     */
    public static <E extends Comparable<E>> void sortDescending(E[] intArray) {
        Quicksort.sort(intArray, 0, intArray.length - 1 , true);
    }
    
    /**
     * Sort the list in ascending order using this algorithm.
     * 
     * @param <E> the type of elements in this list.
     * 
     * @param list the list that we want to sort
     */
    public static <E extends Comparable<E>> void sort(List<E> list) {
        Quicksort.sort(list, 0, list.size() - 1, false);
    }
    
    /**
     * Sort the list in descending order using this algorithm.
     * 
     * @param <E> the type of elements in this list.
     * 
     * @param list the list that we want to sort
     */
    public static <E extends Comparable<E>> void sortDescending(List<E> list) {
        Quicksort.sort(list, 0, list.size() - 1, true);
    }
    
    
    /**
     * Sort routine that recursively calls itself after the partition algorithm sorted the elements
     * in order. This routine is used for both the ascending and descending algorithms. The only
     * difference is the call to the partition algorithm.
     * 
     * @param intArray array that we want to sort
     * @param start index of the starting point to sort
     * @param end index of the end point to sort
     * @param descending boolean value that determines if we want to do descending sort
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
     * Routine that arranges the elements in ascending order around a pivot. This routine 
     * runs in O(n) time.
     * 
     * @param intArray array that we want to sort
     * @param start index of the starting point to sort
     * @param end index of the end point to sort
     *
     * @return an integer that represent the index of the pivot
     */
    private static int partition(int[] intArray, int start, int end) {
        int pivot = intArray[end];
        int index = start - 1;
        
        for(int j = start; j < end; j++) {
            if(intArray[j] <= pivot) {
                index++;
                XORSwap.swap(intArray, index, j);
            }
        }
        
        XORSwap.swap(intArray, index + 1, end);
        
        return index + 1;
    }
    
    /**
     * Routine that arranges the elements in descending order around a pivot. This routine 
     * runs in O(n) time.
     * 
     * @param intArray array that we want to sort
     * @param start index of the starting point to sort
     * @param end index of the end point to sort
     * 
     * @return an integer that represent the index of the pivot
     */
    private static int partitionDescending(int[] intArray, int start, int end) {
        int pivot = intArray[end];
        int index = start - 1;
        
        for(int j = start; j < end; j++) {
            if(intArray[j] >= pivot) {
                index++;
                XORSwap.swap(intArray, index, j);
            }
        }
        
        XORSwap.swap(intArray, index + 1, end);
        
        return index + 1;
    }
    
    /**
     * Sort routine that recursively calls itself after the partition algorithm sorted the elements
     * in order. This routine is used for both the ascending and descending algorithms. The only
     * difference is the call to the partition algorithm.
     * 
     * @param charArray array that we want to sort
     * @param start index of the starting point to sort
     * @param end index of the end point to sort
     * @param descending boolean value that determines if we want to do descending sort
     */
    private static void sort(char[] charArray, int start, int end, boolean descending) {
        if(start >= end) {
            return ;
        }

        int pivot = 0;
        
        if(descending) {
            pivot = Quicksort.partitionDescending(charArray, start, end);
        }
        else {
            pivot = Quicksort.partition(charArray, start, end);
        }
        
        Quicksort.sort(charArray, start, pivot - 1, descending);
        Quicksort.sort(charArray, pivot + 1, end, descending);   
    }
    
    /**
     * Routine that arranges the elements in ascending order around a pivot. This routine 
     * runs in O(n) time.
     * 
     * @param charArray array that we want to sort
     * @param start index of the starting point to sort
     * @param end index of the end point to sort
     *
     * @return an integer that represent the index of the pivot
     */
    private static int partition(char[] charArray, int start, int end) {
        char pivot = charArray[end];
        int index = start - 1;
        
        for(int j = start; j < end; j++) {
            if(charArray[j] <= pivot) {
                index++;
                XORSwap.swap(charArray, index, j);
            }
        }
        
        XORSwap.swap(charArray, index + 1, end);
        
        return index + 1;
    }
    
    /**
     * Routine that arranges the elements in descending order around a pivot. This routine 
     * runs in O(n) time.
     * 
     * @param charArray array that we want to sort
     * @param start index of the starting point to sort
     * @param end index of the end point to sort
     * 
     * @return an integer that represent the index of the pivot
     */
    private static int partitionDescending(char[] charArray, int start, int end) {
        char pivot = charArray[end];
        int index = start - 1;
        
        for(int j = start; j < end; j++) {
            if(charArray[j] >= pivot) {
                index++;
                XORSwap.swap(charArray, index, j);
            }
        }
        
        XORSwap.swap(charArray, index + 1, end);
        
        return index + 1;
    }
    /**
     * Sort routine that recursively calls itself after the partition algorithm sorted the elements
     * in order. This routine is used for both the ascending and descending algorithms. The only
     * difference is the call to the partition algorithm.
     * 
     * @param byteArray array that we want to sort
     * @param start index of the starting point to sort
     * @param end index of the end point to sort
     * @param descending boolean value that determines if we want to do descending sort
     */
    private static void sort(byte[] byteArray, int start, int end, boolean descending) {
        if(start >= end) {
            return ;
        }

        int pivot = 0;
        
        if(descending) {
            pivot = Quicksort.partitionDescending(byteArray, start, end);
        }
        else {
            pivot = Quicksort.partition(byteArray, start, end);
        }
        
        Quicksort.sort(byteArray, start, pivot - 1, descending);
        Quicksort.sort(byteArray, pivot + 1, end, descending);   
    }
    
    /**
     * Routine that arranges the elements in ascending order around a pivot. This routine 
     * runs in O(n) time.
     * 
     * @param byteArray array that we want to sort
     * @param start index of the starting point to sort
     * @param end index of the end point to sort
     *
     * @return an integer that represent the index of the pivot
     */
    private static int partition(byte[] byteArray, int start, int end) {
        byte pivot = byteArray[end];
        int index = start - 1;
        
        for(int j = start; j < end; j++) {
            if(byteArray[j] <= pivot) {
                index++;
                XORSwap.swap(byteArray, index, j);
            }
        }
        
        XORSwap.swap(byteArray, index + 1, end);
        
        return index + 1;
    }
    
    /**
     * Routine that arranges the elements in descending order around a pivot. This routine 
     * runs in O(n) time.
     * 
     * @param byteArray array that we want to sort
     * @param start index of the starting point to sort
     * @param end index of the end point to sort
     * 
     * @return an integer that represent the index of the pivot
     */
    private static int partitionDescending(byte[] byteArray, int start, int end) {
        byte pivot = byteArray[end];
        int index = start - 1;
        
        for(int j = start; j < end; j++) {
            if(byteArray[j] >= pivot) {
                index++;
                XORSwap.swap(byteArray, index, j);
            }
        }
        
        XORSwap.swap(byteArray, index + 1, end);
        
        return index + 1;
    }
    /**
     * Sort routine that recursively calls itself after the partition algorithm sorted the elements
     * in order. This routine is used for both the ascending and descending algorithms. The only
     * difference is the call to the partition algorithm.
     * 
     * @param shortArray array that we want to sort
     * @param start index of the starting point to sort
     * @param end index of the end point to sort
     * @param descending boolean value that determines if we want to do descending sort
     */
    private static void sort(short[] shortArray, int start, int end, boolean descending) {
        if(start >= end) {
            return ;
        }

        int pivot = 0;
        
        if(descending) {
            pivot = Quicksort.partitionDescending(shortArray, start, end);
        }
        else {
            pivot = Quicksort.partition(shortArray, start, end);
        }
        
        Quicksort.sort(shortArray, start, pivot - 1, descending);
        Quicksort.sort(shortArray, pivot + 1, end, descending);   
    }
    
    /**
     * Routine that arranges the elements in ascending order around a pivot. This routine 
     * runs in O(n) time.
     * 
     * @param shortArray array that we want to sort
     * @param start index of the starting point to sort
     * @param end index of the end point to sort
     *
     * @return an integer that represent the index of the pivot
     */
    private static int partition(short[] shortArray, int start, int end) {
        short pivot = shortArray[end];
        int index = start - 1;
        
        for(int j = start; j < end; j++) {
            if(shortArray[j] <= pivot) {
                index++;
                XORSwap.swap(shortArray, index, j);
            }
        }
        
        XORSwap.swap(shortArray, index + 1, end);
        
        return index + 1;
    }
    
    /**
     * Routine that arranges the elements in descending order around a pivot. This routine 
     * runs in O(n) time.
     * 
     * @param shortArray array that we want to sort
     * @param start index of the starting point to sort
     * @param end index of the end point to sort
     * 
     * @return an integer that represent the index of the pivot
     */
    private static int partitionDescending(short[] shortArray, int start, int end) {
        short pivot = shortArray[end];
        int index = start - 1;
        
        for(int j = start; j < end; j++) {
            if(shortArray[j] >= pivot) {
                index++;
                XORSwap.swap(shortArray, index, j);
            }
        }
        
        XORSwap.swap(shortArray, index + 1, end);
        
        return index + 1;
    }
    /**
     * Sort routine that recursively calls itself after the partition algorithm sorted the elements
     * in order. This routine is used for both the ascending and descending algorithms. The only
     * difference is the call to the partition algorithm.
     * 
     * @param longArray array that we want to sort
     * @param start index of the starting point to sort
     * @param end index of the end point to sort
     * @param descending boolean value that determines if we want to do descending sort
     */
    private static void sort(long[] longArray, int start, int end, boolean descending) {
        if(start >= end) {
            return ;
        }

        int pivot = 0;
        
        if(descending) {
            pivot = Quicksort.partitionDescending(longArray, start, end);
        }
        else {
            pivot = Quicksort.partition(longArray, start, end);
        }
        
        Quicksort.sort(longArray, start, pivot - 1, descending);
        Quicksort.sort(longArray, pivot + 1, end, descending);   
    }
    
    /**
     * Routine that arranges the elements in ascending order around a pivot. This routine 
     * runs in O(n) time.
     * 
     * @param longArray array that we want to sort
     * @param start index of the starting point to sort
     * @param end index of the end point to sort
     *
     * @return an integer that represent the index of the pivot
     */
    private static int partition(long[] longArray, int start, int end) {
        long pivot = longArray[end];
        int index = start - 1;
        
        for(int j = start; j < end; j++) {
            if(longArray[j] <= pivot) {
                index++;
                XORSwap.swap(longArray, index, j);
            }
        }
        
        XORSwap.swap(longArray, index + 1, end);
        
        return index + 1;
    }
    
    /**
     * Routine that arranges the elements in descending order around a pivot. This routine 
     * runs in O(n) time.
     * 
     * @param longArray array that we want to sort
     * @param start index of the starting point to sort
     * @param end index of the end point to sort
     * 
     * @return an integer that represent the index of the pivot
     */
    private static int partitionDescending(long[] longArray, int start, int end) {
        long pivot = longArray[end];
        int index = start - 1;
        
        for(int j = start; j < end; j++) {
            if(longArray[j] >= pivot) {
                index++;
                XORSwap.swap(longArray, index, j);
            }
        }
        
        XORSwap.swap(longArray, index + 1, end);
        
        return index + 1;
    }
    /**
     * Sort routine that recursively calls itself after the partition algorithm sorted the elements
     * in order. This routine is used for both the ascending and descending algorithms. The only
     * difference is the call to the partition algorithm.
     * 
     * @param floatArray array that we want to sort
     * @param start index of the starting point to sort
     * @param end index of the end point to sort
     * @param descending boolean value that determines if we want to do descending sort
     */
    private static void sort(float[] floatArray, int start, int end, boolean descending) {
        if(start >= end) {
            return ;
        }

        int pivot = 0;
        
        if(descending) {
            pivot = Quicksort.partitionDescending(floatArray, start, end);
        }
        else {
            pivot = Quicksort.partition(floatArray, start, end);
        }
        
        Quicksort.sort(floatArray, start, pivot - 1, descending);
        Quicksort.sort(floatArray, pivot + 1, end, descending);   
    }
    
    /**
     * Routine that arranges the elements in ascending order around a pivot. This routine 
     * runs in O(n) time.
     * 
     * @param floatArray array that we want to sort
     * @param start index of the starting point to sort
     * @param end index of the end point to sort
     *
     * @return an integer that represent the index of the pivot
     */
    private static int partition(float[] floatArray, int start, int end) {
        float pivot = floatArray[end];
        int index = start - 1;
        
        for(int j = start; j < end; j++) {
            if(floatArray[j] <= pivot) {
                index++;
                TrivialSwap.swap(floatArray, index, j);
            }
        }
        
        TrivialSwap.swap(floatArray, index + 1, end);
        
        return index + 1;
    }
    
    /**
     * Routine that arranges the elements in descending order around a pivot. This routine 
     * runs in O(n) time.
     * 
     * @param floatArray array that we want to sort
     * @param start index of the starting point to sort
     * @param end index of the end point to sort
     * 
     * @return an integer that represent the index of the pivot
     */
    private static int partitionDescending(float[] floatArray, int start, int end) {
        float pivot = floatArray[end];
        int index = start - 1;
        
        for(int j = start; j < end; j++) {
            if(floatArray[j] >= pivot) {
                index++;
                TrivialSwap.swap(floatArray, index, j);
            }
        }
        
        TrivialSwap.swap(floatArray, index + 1, end);
        
        return index + 1;
    }
    /**
     * Sort routine that recursively calls itself after the partition algorithm sorted the elements
     * in order. This routine is used for both the ascending and descending algorithms. The only
     * difference is the call to the partition algorithm.
     * 
     * @param doubleArray array that we want to sort
     * @param start index of the starting point to sort
     * @param end index of the end point to sort
     * @param descending boolean value that determines if we want to do descending sort
     */
    private static void sort(double[] doubleArray, int start, int end, boolean descending) {
        if(start >= end) {
            return ;
        }

        int pivot = 0;
        
        if(descending) {
            pivot = Quicksort.partitionDescending(doubleArray, start, end);
        }
        else {
            pivot = Quicksort.partition(doubleArray, start, end);
        }
        
        Quicksort.sort(doubleArray, start, pivot - 1, descending);
        Quicksort.sort(doubleArray, pivot + 1, end, descending);   
    }
    
    /**
     * Routine that arranges the elements in ascending order around a pivot. This routine 
     * runs in O(n) time.
     * 
     * @param doubleArray array that we want to sort
     * @param start index of the starting point to sort
     * @param end index of the end point to sort
     *
     * @return an integer that represent the index of the pivot
     */
    private static int partition(double[] doubleArray, int start, int end) {
        double pivot = doubleArray[end];
        int index = start - 1;
        
        for(int j = start; j < end; j++) {
            if(doubleArray[j] <= pivot) {
                index++;
                TrivialSwap.swap(doubleArray, index, j);
            }
        }
        
        TrivialSwap.swap(doubleArray, index + 1, end);
        
        return index + 1;
    }
    
    /**
     * Routine that arranges the elements in descending order around a pivot. This routine 
     * runs in O(n) time.
     * 
     * @param dobuleArray array that we want to sort
     * @param start index of the starting point to sort
     * @param end index of the end point to sort
     * 
     * @return an integer that represent the index of the pivot
     */
    private static int partitionDescending(double[] dobuleArray, int start, int end) {
        double pivot = dobuleArray[end];
        int index = start - 1;
        
        for(int j = start; j < end; j++) {
            if(dobuleArray[j] >= pivot) {
                index++;
                TrivialSwap.swap(dobuleArray, index, j);
            }
        }
        
        TrivialSwap.swap(dobuleArray, index + 1, end);
        
        return index + 1;
    }
    /**
     * Sort routine that recursively calls itself after the partition algorithm sorted the elements
     * in order. This routine is used for both the ascending and descending algorithms. The only
     * difference is the call to the partition algorithm.
     * 
     * @param <E> the type of elements in this array.
     * 
     * @param intArray array that we want to sort
     * @param start index of the starting point to sort
     * @param end index of the end point to sort
     * @param descending boolean value that determines if we want to do descending sort
     */
    private static <E extends Comparable<E>> void sort(E[] intArray, int start, int end, boolean descending) {
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
     * Routine that arranges the elements in ascending order around a pivot. This routine 
     * runs in O(n) time.
     * 
     * @param <E> the type of elements in this array.
     * 
     * @param array array that we want to sort
     * @param start index of the starting point to sort
     * @param end index of the end point to sort
     *
     * @return an integer that represent the index of the pivot
     */
    private static <E extends Comparable<E>> int partition(E[] array, int start, int end) {
        E pivot = array[end];
        int index = start - 1;
        
        for(int j = start; j < end; j++) {
            if(array[j].compareTo(pivot) <= 0) {
                index++;
                TrivialSwap.swap(array, index, j);
            }
        }
        
        TrivialSwap.swap(array, index + 1, end);
        
        return index + 1;
    }
    
    /**
     * Routine that arranges the elements in descending order around a pivot. This routine 
     * runs in O(n) time.
     * 
     * @param <E> the type of elements in this array.
     * 
     * @param array array that we want to sort
     * @param start index of the starting point to sort
     * @param end index of the end point to sort
     * 
     * @return an integer that represent the index of the pivot
     */
    private static <E extends Comparable<E>> int partitionDescending(E[] array, int start, int end) {
        E pivot = array[end];
        int index = start - 1;
        
        for(int j = start; j < end; j++) {
            if(array[j].compareTo(pivot) >= 0) {
                index++;
                TrivialSwap.swap(array, index, j);
            }
        }
        
        TrivialSwap.swap(array, index + 1, end);
        
        return index + 1;
    }
    
    /**
     * Sort routine that recursively calls itself after the partition algorithm sorted the elements
     * in order. This routine is used for both the ascending and descending algorithms. The only
     * difference is the call to the partition algorithm.
     * 
     * @param <E> the type of elements in this list.
     * 
     * @param list list that we want to sort
     * @param start index of the starting point to sort
     * @param end index of the end point to sort
     * @param descending boolean value that determines if we want to do descending sort
     */
    private static <E extends Comparable<E>> void sort(List<E> list, int start, int end, boolean descending) {
        if(start >= end) {
            return ;
        }

        int pivot = 0;
        
        if(descending) {
            pivot = Quicksort.partitionDescending(list, start, end);
        }
        else {
            pivot = Quicksort.partition(list, start, end);
        }
        
        Quicksort.sort(list, start, pivot - 1, descending);
        Quicksort.sort(list, pivot + 1, end, descending);   
    }
    
    /**
     * Routine that arranges the elements in ascending order around a pivot. This routine 
     * runs in O(n) time.
     * 
     * @param <E> the type of elements in this list.
     * 
     * @param list array that we want to sort
     * @param start index of the starting point to sort
     * @param end index of the end point to sort
     *
     * @return an integer that represent the index of the pivot
     */
    private static <E extends Comparable<E>> int partition(List<E> list, int start, int end) {
        E pivot = list.get(end);
        int index = start - 1;
        
        for(int j = start; j < end; j++) {
            if(list.get(j).compareTo(pivot) <= 0) {
                index++;
                TrivialSwap.swap(list, index, j);
            }
        }
        
        TrivialSwap.swap(list, index + 1, end);
        
        return index + 1;
    }
    
    /**
     * Routine that arranges the elements in descending order around a pivot. This routine 
     * runs in O(n) time.
     * 
     * @param <E> the type of elements in this list.
     * 
     * @param list list that we want to sort
     * @param start index of the starting point to sort
     * @param end index of the end point to sort
     * 
     * @return an integer that represent the index of the pivot
     */
    private static <E extends Comparable<E>> int partitionDescending(List<E> list, int start, int end) {
        E pivot = list.get(end);
        int index = start - 1;
        
        for(int j = start; j < end; j++) {
            if(list.get(j).compareTo(pivot) >= 0) {
                index++;
                TrivialSwap.swap(list, index, j);
            }
        }
        
        TrivialSwap.swap(list, index + 1, end);
        
        return index + 1;
    }
    
}
