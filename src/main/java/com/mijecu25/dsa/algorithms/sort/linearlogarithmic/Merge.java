package com.mijecu25.dsa.algorithms.sort.linearlogarithmic;

import java.util.LinkedList;
import java.util.List;

import com.mijecu25.dsa.algorithms.sort.Sort;

/**
 * Linear logarithmic sorting algorithm. This recursive algorithm divides the collection in half
 * until having a collection of one element, and then repeatedly merges the collection until
 * having a sorted collection. The implementation of this algorithm is stable. Although this
 * algorithm is asymptotically faster than other algorithms, because it is recursive, it might
 * perform slower when used with small collections. Also, if the list is very large, you could
 * get an StackOverflowError if the algorithm recurses too deeply.
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
 * @version 0.2.0.2
 */
public class Merge extends Sort {
    
    /**
     * Don't let anyone instantiate this class
     */
    private Merge() { ; }
        
    /**
     * Sort the array in ascending order using this algorithm.
     * 
     * @param intArray the array that we want to sort
     */
    public static void sort(int[] intArray) {
        Merge.sort(intArray, 0, intArray.length-1, false);
    }
            
    /**
     * Sort the array in descending order using this algorithm.
     *
     * @param intArray the array that we want to sort
     */
    public static void sortDescending(int[] intArray) {
        Merge.sort(intArray, 0, intArray.length-1, true);
    }
    
    /**
     * Sort the array in ascending order using this algorithm.
     * 
     * @param charArray the array that we want to sort
     */
    public static void sort(char[] charArray) {
        Merge.sort(charArray, 0, charArray.length-1, false);
    }
            
    /**
     * Sort the array in descending order using this algorithm.
     *
     * @param charArray the array that we want to sort
     */
    public static void sortDescending(char[] charArray) {
        Merge.sort(charArray, 0, charArray.length-1, true);
    }
    
    /**
     * Sort the array in ascending order using this algorithm.
     * 
     * @param byteArray the array that we want to sort
     */
    public static void sort(byte[] byteArray) {
        Merge.sort(byteArray, 0, byteArray.length-1, false);
    }
            
    /**
     * Sort the array in descending order using this algorithm.
     *
     * @param byteArray the array that we want to sort
     */
    public static void sortDescending(byte[] byteArray) {
        Merge.sort(byteArray, 0, byteArray.length-1, true);
    }
    
    /**
     * Sort the array in ascending order using this algorithm.
     * 
     * @param shortArray the array that we want to sort
     */
    public static void sort(short[] shortArray) {
        Merge.sort(shortArray, 0, shortArray.length-1, false);
    }
            
    /**
     * Sort the array in descending order using this algorithm.
     *
     * @param shortArray the array that we want to sort
     */
    public static void sortDescending(short[] shortArray) {
        Merge.sort(shortArray, 0, shortArray.length-1, true);
    }
    
    /**
     * Sort the array in ascending order using this algorithm.
     * 
     * @param longArray the array that we want to sort
     */
    public static void sort(long[] longArray) {
        Merge.sort(longArray, 0, longArray.length-1, false);
    }
            
    /**
     * Sort the array in descending order using this algorithm.
     *
     * @param longArray the array that we want to sort
     */
    public static void sortDescending(long[] longArray) {
        Merge.sort(longArray, 0, longArray.length-1, true);
    }
    
    /**
     * Sort the array in ascending order using this algorithm.
     * 
     * @param floatArray the array that we want to sort
     */
    public static void sort(float[] floatArray) {
        Merge.sort(floatArray, 0, floatArray.length-1, false);
    }
            
    /**
     * Sort the array in descending order using this algorithm.
     *
     * @param floatArray the array that we want to sort
     */
    public static void sortDescending(float[] floatArray) {
        Merge.sort(floatArray, 0, floatArray.length-1, true);
    }
    
    /**
     * Sort the array in ascending order using this algorithm.
     * 
     * @param doubleArray the array that we want to sort
     */
    public static void sort(double[] doubleArray) {
        Merge.sort(doubleArray, 0, doubleArray.length-1, false);
    }
            
    /**
     * Sort the array in descending order using this algorithm.
     *
     * @param doubleArray the array that we want to sort
     */
    public static void sortDescending(double[] doubleArray) {
        Merge.sort(doubleArray, 0, doubleArray.length-1, true);
    }
    
    /**
     * Sort the array in ascending order using this algorithm.
     * 
     * @param <E> the type of elements in this array.
     * 
     * @param intArray the array that we want to sort
     */
    public static <E extends Comparable<E>> void sort(E[] intArray) {
        Merge.sort(intArray, 0, intArray.length-1, false);
    }
            
    /**
     * Sort the array in descending order using this algorithm.
     * 
     * @param <E> the type of elements in this array.
     *
     * @param intArray the array that we want to sort
     */
    public static <E extends Comparable<E>> void sortDescending(E[] intArray) {
        Merge.sort(intArray, 0, intArray.length-1, true);
    }
    
    /**
     * Sort the list in ascending order using this algorithm.
     * 
     * @param <E> the type of elements in this list.
     * 
     * @param list the list that we want to sort
     */
    public static <E extends Comparable<E>> void sort(List<E> list) {
        Merge.sort(list, 0, list.size()-1, false);
    }
            
    /**
     * Sort the list in descending order using this algorithm.
     * 
     * @param <E> the type of elements in this array.
     *
     * @param list the array that we want to sort
     */
    public static <E extends Comparable<E>> void sortDescending(List<E> list) {
        Merge.sort(list, 0, list.size()-1, true);
    }
    
    /**
     * Sort routine that recursively calls itself after splitting the original array
     * in half. This routine is used for both ascending and descending sort since 
     * the work done is similar. The only difference is when calling the merge
     * routine.
     * 
     * @param intArray array that we want to sort
     * @param start index of the starting point to sort
     * @param end index of the end point to sort
     * @param descending boolean value that determines if we want to do descending sort
     */
    private static void sort(int[] intArray, int start, int end, boolean descending) {
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
     * Merge two sorted arrays into a bigger array in ascending order. This routine runs in O(n) time.
     * 
     * @param intArray array with two sorted sub arrays that will be merged
     * @param start index of the starting point of the left array
     * @param middle index that splits the array in two sub arrays
     * @param end index of the end point of the right array
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
            
            current++;
        }
        
        while(left <= middle) {
            intArray[current] = temp[left];
            left++;
            current++;
        }
        

    }
    
    /**
     * Merge two sorted arrays into a bigger array in descending order. This routine runs in O(n) time.
     * 
     * @param intArray array with two sorted sub arrays that will be merged
     * @param start index of the starting point of the left array
     * @param middle index that splits the array in two sub arrays
     * @param end index of the end point of the right array
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
            
            current++;
        }
        
        while(left <= middle) {
            intArray[current] = temp[left];
            left++;
            current++;
        }
        

    }
    
    /**
     * Sort routine that recursively calls itself after splitting the original array
     * in half. This routine is used for both ascending and descending sort since 
     * the work done is similar. The only difference is when calling the merge
     * routine.
     * 
     * @param charArray array that we want to sort
     * @param start index of the starting point to sort
     * @param end index of the end point to sort
     * @param descending boolean value that determines if we want to do descending sort
     */
    private static void sort(char[] charArray, int start, int end, boolean descending) {
        if(start == end) {
            return ;
        }
        
        int middle = (start + end) >> 1;
        
        Merge.sort(charArray, start, middle, descending);
        Merge.sort(charArray, middle + 1, end, descending);
        
        if(descending) {
            Merge.mergeDescending(charArray, start, middle, end);                        
        }
        else {
            Merge.merge(charArray, start, middle, end);            
        }
    }
    
    /**
     * Merge two sorted arrays into a bigger array in ascending order. This routine runs in O(n) time.
     * 
     * @param charArray array with two sorted sub arrays that will be merged
     * @param start index of the starting point of the left array
     * @param middle index that splits the array in two sub arrays
     * @param end index of the end point of the right array
     */
    private static void merge(char[] charArray, int start, int middle, int end) {
        char[] temp = new char[charArray.length];
        
        System.arraycopy(charArray, 0, temp, 0, charArray.length);
        
        int left = start;
        int right  = middle + 1;
        int current = start;
        

        while(left <= middle && right <= end) {
            if(temp[left] <= temp[right]) {
                charArray[current] = temp[left];
                left++;
            }
            else {
                charArray[current] = temp[right];
                right++;
            }
            
            current++;
        }
        
        while(left <= middle) {
            charArray[current] = temp[left];
            left++;
            current++;
        }
        

    }
    
    /**
     * Merge two sorted arrays into a bigger array in descending order. This routine runs in O(n) time.
     * 
     * @param charArray array with two sorted sub arrays that will be merged
     * @param start index of the starting point of the left array
     * @param middle index that splits the array in two sub arrays
     * @param end index of the end point of the right array
     */
    private static void mergeDescending(char[] charArray, int start, int middle, int end) {
        char[] temp = new char[charArray.length];
        
        System.arraycopy(charArray, 0, temp, 0, charArray.length);
        
        int left = start;
        int right  = middle + 1;
        int current = start;
        

        while(left <= middle && right <= end) {
            if(temp[left] >= temp[right]) {
                charArray[current] = temp[left];
                left++;
            }
            else {
                charArray[current] = temp[right];
                right++;
            }
            
            current++;
        }
        
        while(left <= middle) {
            charArray[current] = temp[left];
            left++;
            current++;
        }
        

    }
    
    /**
     * Sort routine that recursively calls itself after splitting the original array
     * in half. This routine is used for both ascending and descending sort since 
     * the work done is similar. The only difference is when calling the merge
     * routine.
     * 
     * @param byteArray array that we want to sort
     * @param start index of the starting point to sort
     * @param end index of the end point to sort
     * @param descending boolean value that determines if we want to do descending sort
     */
    private static void sort(byte[] byteArray, int start, int end, boolean descending) {
        if(start == end) {
            return ;
        }
        
        int middle = (start + end) >> 1;
        
        Merge.sort(byteArray, start, middle, descending);
        Merge.sort(byteArray, middle + 1, end, descending);
        
        if(descending) {
            Merge.mergeDescending(byteArray, start, middle, end);                        
        }
        else {
            Merge.merge(byteArray, start, middle, end);            
        }
    }
    
    /**
     * Merge two sorted arrays into a bigger array in ascending order. This routine runs in O(n) time.
     * 
     * @param byteArray array with two sorted sub arrays that will be merged
     * @param start index of the starting point of the left array
     * @param middle index that splits the array in two sub arrays
     * @param end index of the end point of the right array
     */
    private static void merge(byte[] byteArray, int start, int middle, int end) {
        byte[] temp = new byte[byteArray.length];
        
        System.arraycopy(byteArray, 0, temp, 0, byteArray.length);
        
        int left = start;
        int right  = middle + 1;
        int current = start;
        

        while(left <= middle && right <= end) {
            if(temp[left] <= temp[right]) {
                byteArray[current] = temp[left];
                left++;
            }
            else {
                byteArray[current] = temp[right];
                right++;
            }
            
            current++;
        }
        
        while(left <= middle) {
            byteArray[current] = temp[left];
            left++;
            current++;
        }
        

    }
    
    /**
     * Merge two sorted arrays into a bigger array in descending order. This routine runs in O(n) time.
     * 
     * @param byteArray array with two sorted sub arrays that will be merged
     * @param start index of the starting point of the left array
     * @param middle index that splits the array in two sub arrays
     * @param end index of the end point of the right array
     */
    private static void mergeDescending(byte[] byteArray, int start, int middle, int end) {
        byte[] temp = new byte[byteArray.length];
        
        System.arraycopy(byteArray, 0, temp, 0, byteArray.length);
        
        int left = start;
        int right  = middle + 1;
        int current = start;
        

        while(left <= middle && right <= end) {
            if(temp[left] >= temp[right]) {
                byteArray[current] = temp[left];
                left++;
            }
            else {
                byteArray[current] = temp[right];
                right++;
            }
            
            current++;
        }
        
        while(left <= middle) {
            byteArray[current] = temp[left];
            left++;
            current++;
        }
        

    }
    
    /**
     * Sort routine that recursively calls itself after splitting the original array
     * in half. This routine is used for both ascending and descending sort since 
     * the work done is similar. The only difference is when calling the merge
     * routine.
     * 
     * @param shortArray array that we want to sort
     * @param start index of the starting point to sort
     * @param end index of the end point to sort
     * @param descending boolean value that determines if we want to do descending sort
     */
    private static void sort(short[] shortArray, int start, int end, boolean descending) {
        if(start == end) {
            return ;
        }
        
        int middle = (start + end) >> 1;
        
        Merge.sort(shortArray, start, middle, descending);
        Merge.sort(shortArray, middle + 1, end, descending);
        
        if(descending) {
            Merge.mergeDescending(shortArray, start, middle, end);                        
        }
        else {
            Merge.merge(shortArray, start, middle, end);            
        }
    }
    
    /**
     * Merge two sorted arrays into a bigger array in ascending order. This routine runs in O(n) time.
     * 
     * @param shortArray array with two sorted sub arrays that will be merged
     * @param start index of the starting point of the left array
     * @param middle index that splits the array in two sub arrays
     * @param end index of the end point of the right array
     */
    private static void merge(short[] shortArray, int start, int middle, int end) {
        short[] temp = new short[shortArray.length];
        
        System.arraycopy(shortArray, 0, temp, 0, shortArray.length);
        
        int left = start;
        int right  = middle + 1;
        int current = start;
        

        while(left <= middle && right <= end) {
            if(temp[left] <= temp[right]) {
                shortArray[current] = temp[left];
                left++;
            }
            else {
                shortArray[current] = temp[right];
                right++;
            }
            
            current++;
        }
        
        while(left <= middle) {
            shortArray[current] = temp[left];
            left++;
            current++;
        }
        

    }
    
    /**
     * Merge two sorted arrays into a bigger array in descending order. This routine runs in O(n) time.
     * 
     * @param shortArray array with two sorted sub arrays that will be merged
     * @param start index of the starting point of the left array
     * @param middle index that splits the array in two sub arrays
     * @param end index of the end point of the right array
     */
    private static void mergeDescending(short[] shortArray, int start, int middle, int end) {
        short[] temp = new short[shortArray.length];
        
        System.arraycopy(shortArray, 0, temp, 0, shortArray.length);
        
        int left = start;
        int right  = middle + 1;
        int current = start;
        

        while(left <= middle && right <= end) {
            if(temp[left] >= temp[right]) {
                shortArray[current] = temp[left];
                left++;
            }
            else {
                shortArray[current] = temp[right];
                right++;
            }
            
            current++;
        }
        
        while(left <= middle) {
            shortArray[current] = temp[left];
            left++;
            current++;
        }
        

    }
    
    /**
     * Sort routine that recursively calls itself after splitting the original array
     * in half. This routine is used for both ascending and descending sort since 
     * the work done is similar. The only difference is when calling the merge
     * routine.
     * 
     * @param longArray array that we want to sort
     * @param start index of the starting point to sort
     * @param end index of the end point to sort
     * @param descending boolean value that determines if we want to do descending sort
     */
    private static void sort(long[] longArray, int start, int end, boolean descending) {
        if(start == end) {
            return ;
        }
        
        int middle = (start + end) >> 1;
        
        Merge.sort(longArray, start, middle, descending);
        Merge.sort(longArray, middle + 1, end, descending);
        
        if(descending) {
            Merge.mergeDescending(longArray, start, middle, end);                        
        }
        else {
            Merge.merge(longArray, start, middle, end);            
        }
    }
    
    /**
     * Merge two sorted arrays into a bigger array in ascending order. This routine runs in O(n) time.
     * 
     * @param longArray array with two sorted sub arrays that will be merged
     * @param start index of the starting point of the left array
     * @param middle index that splits the array in two sub arrays
     * @param end index of the end point of the right array
     */
    private static void merge(long[] longArray, int start, int middle, int end) {
        long[] temp = new long[longArray.length];
        
        System.arraycopy(longArray, 0, temp, 0, longArray.length);
        
        int left = start;
        int right  = middle + 1;
        int current = start;
        

        while(left <= middle && right <= end) {
            if(temp[left] <= temp[right]) {
                longArray[current] = temp[left];
                left++;
            }
            else {
                longArray[current] = temp[right];
                right++;
            }
            
            current++;
        }
        
        while(left <= middle) {
            longArray[current] = temp[left];
            left++;
            current++;
        }
        

    }
    
    /**
     * Merge two sorted arrays into a bigger array in descending order. This routine runs in O(n) time.
     * 
     * @param longArray array with two sorted sub arrays that will be merged
     * @param start index of the starting point of the left array
     * @param middle index that splits the array in two sub arrays
     * @param end index of the end point of the right array
     */
    private static void mergeDescending(long[] longArray, int start, int middle, int end) {
        long[] temp = new long[longArray.length];
        
        System.arraycopy(longArray, 0, temp, 0, longArray.length);
        
        int left = start;
        int right  = middle + 1;
        int current = start;
        

        while(left <= middle && right <= end) {
            if(temp[left] >= temp[right]) {
                longArray[current] = temp[left];
                left++;
            }
            else {
                longArray[current] = temp[right];
                right++;
            }
            
            current++;
        }
        
        while(left <= middle) {
            longArray[current] = temp[left];
            left++;
            current++;
        }
        

    }
    
    /**
     * Sort routine that recursively calls itself after splitting the original array
     * in half. This routine is used for both ascending and descending sort since 
     * the work done is similar. The only difference is when calling the merge
     * routine.
     * 
     * @param floatArray array that we want to sort
     * @param start index of the starting point to sort
     * @param end index of the end point to sort
     * @param descending boolean value that determines if we want to do descending sort
     */
    private static void sort(float[] floatArray, int start, int end, boolean descending) {
        if(start == end) {
            return ;
        }
        
        int middle = (start + end) >> 1;
        
        Merge.sort(floatArray, start, middle, descending);
        Merge.sort(floatArray, middle + 1, end, descending);
        
        if(descending) {
            Merge.mergeDescending(floatArray, start, middle, end);                        
        }
        else {
            Merge.merge(floatArray, start, middle, end);            
        }
    }
    
    /**
     * Merge two sorted arrays into a bigger array in ascending order. This routine runs in O(n) time.
     * 
     * @param floatArray array with two sorted sub arrays that will be merged
     * @param start index of the starting point of the left array
     * @param middle index that splits the array in two sub arrays
     * @param end index of the end point of the right array
     */
    private static void merge(float[] floatArray, int start, int middle, int end) {
        float[] temp = new float[floatArray.length];
        
        System.arraycopy(floatArray, 0, temp, 0, floatArray.length);
        
        int left = start;
        int right  = middle + 1;
        int current = start;
        

        while(left <= middle && right <= end) {
            if(temp[left] <= temp[right]) {
                floatArray[current] = temp[left];
                left++;
            }
            else {
                floatArray[current] = temp[right];
                right++;
            }
            
            current++;
        }
        
        while(left <= middle) {
            floatArray[current] = temp[left];
            left++;
            current++;
        }
        

    }
    
    /**
     * Merge two sorted arrays into a bigger array in descending order. This routine runs in O(n) time.
     * 
     * @param floatArray array with two sorted sub arrays that will be merged
     * @param start index of the starting point of the left array
     * @param middle index that splits the array in two sub arrays
     * @param end index of the end point of the right array
     */
    private static void mergeDescending(float[] floatArray, int start, int middle, int end) {
        float[] temp = new float[floatArray.length];
        
        System.arraycopy(floatArray, 0, temp, 0, floatArray.length);
        
        int left = start;
        int right  = middle + 1;
        int current = start;
        

        while(left <= middle && right <= end) {
            if(temp[left] >= temp[right]) {
                floatArray[current] = temp[left];
                left++;
            }
            else {
                floatArray[current] = temp[right];
                right++;
            }
            
            current++;
        }
        
        while(left <= middle) {
            floatArray[current] = temp[left];
            left++;
            current++;
        }
        

    }
    
    /**
     * Sort routine that recursively calls itself after splitting the original array
     * in half. This routine is used for both ascending and descending sort since 
     * the work done is similar. The only difference is when calling the merge
     * routine.
     * 
     * @param doubleArray array that we want to sort
     * @param start index of the starting point to sort
     * @param end index of the end point to sort
     * @param descending boolean value that determines if we want to do descending sort
     */
    private static void sort(double[] doubleArray, int start, int end, boolean descending) {
        if(start == end) {
            return ;
        }
        
        int middle = (start + end) >> 1;
        
        Merge.sort(doubleArray, start, middle, descending);
        Merge.sort(doubleArray, middle + 1, end, descending);
        
        if(descending) {
            Merge.mergeDescending(doubleArray, start, middle, end);                        
        }
        else {
            Merge.merge(doubleArray, start, middle, end);            
        }
    }
    
    /**
     * Merge two sorted arrays into a bigger array in ascending order. This routine runs in O(n) time.
     * 
     * @param doubleArray array with two sorted sub arrays that will be merged
     * @param start index of the starting point of the left array
     * @param middle index that splits the array in two sub arrays
     * @param end index of the end point of the right array
     */
    private static void merge(double[] doubleArray, int start, int middle, int end) {
        double[] temp = new double[doubleArray.length];
        
        System.arraycopy(doubleArray, 0, temp, 0, doubleArray.length);
        
        int left = start;
        int right  = middle + 1;
        int current = start;
        

        while(left <= middle && right <= end) {
            if(temp[left] <= temp[right]) {
                doubleArray[current] = temp[left];
                left++;
            }
            else {
                doubleArray[current] = temp[right];
                right++;
            }
            
            current++;
        }
        
        while(left <= middle) {
            doubleArray[current] = temp[left];
            left++;
            current++;
        }
        

    }
    
    /**
     * Merge two sorted arrays into a bigger array in descending order. This routine runs in O(n) time.
     * 
     * @param doubleArray array with two sorted sub arrays that will be merged
     * @param start index of the starting point of the left array
     * @param middle index that splits the array in two sub arrays
     * @param end index of the end point of the right array
     */
    private static void mergeDescending(double[] doubleArray, int start, int middle, int end) {
        double[] temp = new double[doubleArray.length];
        
        System.arraycopy(doubleArray, 0, temp, 0, doubleArray.length);
        
        int left = start;
        int right  = middle + 1;
        int current = start;
        

        while(left <= middle && right <= end) {
            if(temp[left] >= temp[right]) {
                doubleArray[current] = temp[left];
                left++;
            }
            else {
                doubleArray[current] = temp[right];
                right++;
            }
            
            current++;
        }
        
        while(left <= middle) {
            doubleArray[current] = temp[left];
            left++;
            current++;
        }
        

    }
    
    /**
     * Sort routine that recursively calls itself after splitting the original array
     * in half. This routine is used for both ascending and descending sort since 
     * the work done is similar. The only difference is when calling the merge
     * routine.
     * 
     * @param <E> the type of elements in this array.
     * 
     * @param array array that we want to sort
     * @param start index of the starting point to sort
     * @param end index of the end point to sort
     * @param descending boolean value that determines if we want to do descending sort
     */
    private static <E extends Comparable<E>> void sort(E[] array, int start, int end, boolean descending) {
        if(start == end) {
            return ;
        }
        
        int middle = (start + end) >> 1;
        
        Merge.sort(array, start, middle, descending);
        Merge.sort(array, middle + 1, end, descending);
        
        if(descending) {
            Merge.mergeDescending(array, start, middle, end);                        
        }
        else {
            Merge.merge(array, start, middle, end);            
        }
    }
    
    /**
     * Merge two sorted arrays into a bigger array in ascending order. This routine runs in O(n) time.
     * 
     * @param <E> the type of elements in this array.
     * 
     * @param array array with two sorted sub arrays that will be merged
     * @param start index of the starting point of the left array
     * @param middle index that splits the array in two sub arrays
     * @param end index of the end point of the right array
     */
    private static <E extends Comparable<E>> void merge(E[] array, int start, int middle, int end) {
        List<E> temp = new LinkedList<>();
        
        for(int i = 0; i < array.length; i++) {
            temp.add(array[i]);
        }
        
        int left = start;
        int right  = middle + 1;
        int current = start;
        

        while(left <= middle && right <= end) {
            if(temp.get(left).compareTo(temp.get(right)) <= 0) {
                array[current] = temp.get(left);
                left++;
            }
            else {
                array[current] = temp.get(right);
                right++;
            }
            
            current++;
        }
        
        while(left <= middle) {
            array[current] = temp.get(left);
            left++;
            current++;
        }
        

    }
    
    /**
     * Merge two sorted arrays into a bigger array in descending order. This routine runs in O(n) time.
     * @param <E>
     * 
     * @param array array with two sorted sub arrays that will be merged
     * @param start index of the starting point of the left array
     * @param middle index that splits the array in two sub arrays
     * @param end index of the end point of the right array
     */
    private static <E extends Comparable<E>> void mergeDescending(E[] array, int start, int middle, int end) {
        List<E> temp = new LinkedList<>();
        
        for(int i = 0; i < array.length; i++) {
            temp.add(array[i]);
        }
        
        int left = start;
        int right  = middle + 1;
        int current = start;
        

        while(left <= middle && right <= end) {
            if(temp.get(left).compareTo(temp.get(right)) >= 0) {
                array[current] = temp.get(left);
                left++;
            }
            else {
                array[current] = temp.get(right);
                right++;
            }
            
            current++;
        }
        
        while(left <= middle) {
            array[current] = temp.get(left);
            left++;
            current++;
        }
        

    }
    
    /**
     * Sort routine that recursively calls itself after splitting the original list
     * in half. This routine is used for both ascending and descending sort since 
     * the work done is similar. The only difference is when calling the merge
     * routine.
     * 
     * @param <E> the type of elements in this list.
     * 
     * @param list list that we want to sort
     * @param start index of the starting point to sort
     * @param end index of the end point to sort
     * @param descending boolean value that determines if we want to do descending sort
     */
    private static <E extends Comparable<E>> void sort(List<E> list, int start, int end, boolean descending) {
        if(start == end) {
            return ;
        }
        
        int middle = (start + end) >> 1;
        
        Merge.sort(list, start, middle, descending);
        Merge.sort(list, middle + 1, end, descending);
        
        if(descending) {
            Merge.mergeDescending(list, start, middle, end);                        
        }
        else {
            Merge.merge(list, start, middle, end);            
        }
    }
    
    /**
     * Merge two sorted list into a bigger list in ascending order. This routine runs in O(n) time.
     * 
     * @param <E> the type of elements in this list.
     * 
     * @param list list with two sorted sub arrays that will be merged
     * @param start index of the starting point of the left list
     * @param middle index that splits the array in two sub lists
     * @param end index of the end point of the right list
     */
    private static <E extends Comparable<E>> void merge(List<E> list, int start, int middle, int end) {
        List<E> temp = new LinkedList<>();
        
        for(int i = 0; i < list.size(); i++) {
            temp.add(list.get(i));
        }
        
        int left = start;
        int right  = middle + 1;
        int current = start;
        

        while(left <= middle && right <= end) {
            list.remove(current);
            
            if(temp.get(left).compareTo(temp.get(right)) <= 0) {
                list.add(current, temp.get(left));
                left++;
            }
            else {
                list.add(current, temp.get(right));
                right++;
            }
            
            current++;
        }
        
        while(left <= middle) {
            list.remove(current);
            list.add(current, temp.get(left));
            left++;
            current++;
        }
        

    }
    
    /**
     * Merge two sorted arrays into a bigger array in descending order. This routine runs in O(n) time.
     * @param <E>
     * 
     * @param list array with two sorted sub arrays that will be merged
     * @param start index of the starting point of the left array
     * @param middle index that splits the array in two sub arrays
     * @param end index of the end point of the right array
     */
    private static <E extends Comparable<E>> void mergeDescending(List<E> list, int start, int middle, int end) {
        List<E> temp = new LinkedList<>();
        
        for(int i = 0; i < list.size(); i++) {
            temp.add(list.get(i));
        }
        
        int left = start;
        int right  = middle + 1;
        int current = start;
        

        while(left <= middle && right <= end) {
            list.remove(current);
            
            if(temp.get(left).compareTo(temp.get(right)) >= 0) {
                list.add(current, temp.get(left));
                left++;
            }
            else {
                list.add(current, temp.get(right));
                right++;
            }
            
            current++;
        }
        
        while(left <= middle) {
            list.remove(current);
            list.add(current, temp.get(left));
            left++;
            current++;
        }
        

    }
    
}
