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
 * @author Miguel Velez miguelvelezmj25
 * @version 0.2.0.1
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
        // Call the sort routine in ascending order
        Merge.sort(intArray, 0, intArray.length-1, false);
    }
            
    /**
     * Sort the array in descending order using this algorithm.
     *
     * @param intArray the array that we want to sort
     */
    public static void sortDescending(int[] intArray) {
        // Call the sort routine in descending order
        Merge.sort(intArray, 0, intArray.length-1, true);
    }
    
    /**
     * Sort the array in ascending order using this algorithm.
     * 
     * @param charArray the array that we want to sort
     */
    public static void sort(char[] charArray) {
        // Call the sort routine in ascending order
        Merge.sort(charArray, 0, charArray.length-1, false);
    }
            
    /**
     * Sort the array in descending order using this algorithm.
     *
     * @param charArray the array that we want to sort
     */
    public static void sortDescending(char[] charArray) {
        // Call the sort routine in descending order
        Merge.sort(charArray, 0, charArray.length-1, true);
    }
    
    /**
     * Sort the array in ascending order using this algorithm.
     * 
     * @param byteArray the array that we want to sort
     */
    public static void sort(byte[] byteArray) {
        // Call the sort routine in ascending order
        Merge.sort(byteArray, 0, byteArray.length-1, false);
    }
            
    /**
     * Sort the array in descending order using this algorithm.
     *
     * @param byteArray the array that we want to sort
     */
    public static void sortDescending(byte[] byteArray) {
        // Call the sort routine in descending order
        Merge.sort(byteArray, 0, byteArray.length-1, true);
    }
    
    /**
     * Sort the array in ascending order using this algorithm.
     * 
     * @param shortArray the array that we want to sort
     */
    public static void sort(short[] shortArray) {
        // Call the sort routine in ascending order
        Merge.sort(shortArray, 0, shortArray.length-1, false);
    }
            
    /**
     * Sort the array in descending order using this algorithm.
     *
     * @param shortArray the array that we want to sort
     */
    public static void sortDescending(short[] shortArray) {
        // Call the sort routine in descending order
        Merge.sort(shortArray, 0, shortArray.length-1, true);
    }
    
    /**
     * Sort the array in ascending order using this algorithm.
     * 
     * @param longArray the array that we want to sort
     */
    public static void sort(long[] longArray) {
        // Call the sort routine in ascending order
        Merge.sort(longArray, 0, longArray.length-1, false);
    }
            
    /**
     * Sort the array in descending order using this algorithm.
     *
     * @param longArray the array that we want to sort
     */
    public static void sortDescending(long[] longArray) {
        // Call the sort routine in descending order
        Merge.sort(longArray, 0, longArray.length-1, true);
    }
    
    /**
     * Sort the array in ascending order using this algorithm.
     * 
     * @param floatArray the array that we want to sort
     */
    public static void sort(float[] floatArray) {
        // Call the sort routine in ascending order
        Merge.sort(floatArray, 0, floatArray.length-1, false);
    }
            
    /**
     * Sort the array in descending order using this algorithm.
     *
     * @param floatArray the array that we want to sort
     */
    public static void sortDescending(float[] floatArray) {
        // Call the sort routine in descending order
        Merge.sort(floatArray, 0, floatArray.length-1, true);
    }
    
    /**
     * Sort the array in ascending order using this algorithm.
     * 
     * @param doubleArray the array that we want to sort
     */
    public static void sort(double[] doubleArray) {
        // Call the sort routine in ascending order
        Merge.sort(doubleArray, 0, doubleArray.length-1, false);
    }
            
    /**
     * Sort the array in descending order using this algorithm.
     *
     * @param doubleArray the array that we want to sort
     */
    public static void sortDescending(double[] doubleArray) {
        // Call the sort routine in descending order
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
        // Call the sort routine in ascending order
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
        // Call the sort routine in descending order
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
        // Call the sort routine in ascending order
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
        // Call the sort routine in descending order
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
     * @param intArray array with two sorted sub arrays that will be merged
     * @param start index of the starting point of the left array
     * @param middle index that splits the array in two sub arrays
     * @param end index of the end point of the right array
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
     * @param intArray array with two sorted sub arrays that will be merged
     * @param start index of the starting point of the left array
     * @param middle index that splits the array in two sub arrays
     * @param end index of the end point of the right array
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
        // If start index equals the end index
        if(start == end) {
            return ;
        }
        
        // Get the middle of the array
        int middle = (start + end) >> 1;
        
        // Recursively call the same routine on the left half of the array
        Merge.sort(charArray, start, middle, descending);
        // Recursively call the same routine on the right half of the array
        Merge.sort(charArray, middle + 1, end, descending);
        
        // If we want descending sort
        if(descending) {
            // Call the descending merge routine
            Merge.mergeDescending(charArray, start, middle, end);                        
        }
        else {
            // Call the ascending merge routine
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
        // Create a temporary array
        char[] temp = new char[charArray.length];
        
        // Copy all of the elements from the original array to the temp array
        System.arraycopy(charArray, 0, temp, 0, charArray.length);
        
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
                charArray[current] = temp[left];
                // Move the left pointer to the right
                left++;
            }
            else {
                // Set the current value to the right value
                charArray[current] = temp[right];
                // Move the right pointer to the right
                right++;
            }
            
            // Move the current pointer to the right
            current++;
        }
        
        // While the left index is less or equal to the middle index
        while(left <= middle) {
            // Set the current value to the left value
            charArray[current] = temp[left];
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
     * @param charArray array with two sorted sub arrays that will be merged
     * @param start index of the starting point of the left array
     * @param middle index that splits the array in two sub arrays
     * @param end index of the end point of the right array
     */
    private static void mergeDescending(char[] charArray, int start, int middle, int end) {
        // Create a temporary array
        char[] temp = new char[charArray.length];
        
        // Copy all of the elements from the original array to the temp array
        System.arraycopy(charArray, 0, temp, 0, charArray.length);
        
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
                charArray[current] = temp[left];
                // Move the left pointer to the right
                left++;
            }
            else {
                // Set the current value to the right value
                charArray[current] = temp[right];
                // Move the right pointer to the right
                right++;
            }
            
            // Move the current pointer to the right
            current++;
        }
        
        // While the left index is less or equal to the middle index
        while(left <= middle) {
            // Set the current value to the left value
            charArray[current] = temp[left];
            // Move the left pointer to the right
            left++;
            // Move the current pointer to the right
            current++;
        }
        
        // There is no need to put the rest of the element of the right sub array, since they are already 
        // in sorted order since all of the small elements where put to the left of the array.
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
        // If start index equals the end index
        if(start == end) {
            return ;
        }
        
        // Get the middle of the array
        int middle = (start + end) >> 1;
        
        // Recursively call the same routine on the left half of the array
        Merge.sort(byteArray, start, middle, descending);
        // Recursively call the same routine on the right half of the array
        Merge.sort(byteArray, middle + 1, end, descending);
        
        // If we want descending sort
        if(descending) {
            // Call the descending merge routine
            Merge.mergeDescending(byteArray, start, middle, end);                        
        }
        else {
            // Call the ascending merge routine
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
        // Create a temporary array
        byte[] temp = new byte[byteArray.length];
        
        // Copy all of the elements from the original array to the temp array
        System.arraycopy(byteArray, 0, temp, 0, byteArray.length);
        
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
                byteArray[current] = temp[left];
                // Move the left pointer to the right
                left++;
            }
            else {
                // Set the current value to the right value
                byteArray[current] = temp[right];
                // Move the right pointer to the right
                right++;
            }
            
            // Move the current pointer to the right
            current++;
        }
        
        // While the left index is less or equal to the middle index
        while(left <= middle) {
            // Set the current value to the left value
            byteArray[current] = temp[left];
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
     * @param byteArray array with two sorted sub arrays that will be merged
     * @param start index of the starting point of the left array
     * @param middle index that splits the array in two sub arrays
     * @param end index of the end point of the right array
     */
    private static void mergeDescending(byte[] byteArray, int start, int middle, int end) {
        // Create a temporary array
        byte[] temp = new byte[byteArray.length];
        
        // Copy all of the elements from the original array to the temp array
        System.arraycopy(byteArray, 0, temp, 0, byteArray.length);
        
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
                byteArray[current] = temp[left];
                // Move the left pointer to the right
                left++;
            }
            else {
                // Set the current value to the right value
                byteArray[current] = temp[right];
                // Move the right pointer to the right
                right++;
            }
            
            // Move the current pointer to the right
            current++;
        }
        
        // While the left index is less or equal to the middle index
        while(left <= middle) {
            // Set the current value to the left value
            byteArray[current] = temp[left];
            // Move the left pointer to the right
            left++;
            // Move the current pointer to the right
            current++;
        }
        
        // There is no need to put the rest of the element of the right sub array, since they are already 
        // in sorted order since all of the small elements where put to the left of the array.
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
        // If start index equals the end index
        if(start == end) {
            return ;
        }
        
        // Get the middle of the array
        int middle = (start + end) >> 1;
        
        // Recursively call the same routine on the left half of the array
        Merge.sort(shortArray, start, middle, descending);
        // Recursively call the same routine on the right half of the array
        Merge.sort(shortArray, middle + 1, end, descending);
        
        // If we want descending sort
        if(descending) {
            // Call the descending merge routine
            Merge.mergeDescending(shortArray, start, middle, end);                        
        }
        else {
            // Call the ascending merge routine
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
        // Create a temporary array
        short[] temp = new short[shortArray.length];
        
        // Copy all of the elements from the original array to the temp array
        System.arraycopy(shortArray, 0, temp, 0, shortArray.length);
        
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
                shortArray[current] = temp[left];
                // Move the left pointer to the right
                left++;
            }
            else {
                // Set the current value to the right value
                shortArray[current] = temp[right];
                // Move the right pointer to the right
                right++;
            }
            
            // Move the current pointer to the right
            current++;
        }
        
        // While the left index is less or equal to the middle index
        while(left <= middle) {
            // Set the current value to the left value
            shortArray[current] = temp[left];
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
     * @param shortArray array with two sorted sub arrays that will be merged
     * @param start index of the starting point of the left array
     * @param middle index that splits the array in two sub arrays
     * @param end index of the end point of the right array
     */
    private static void mergeDescending(short[] shortArray, int start, int middle, int end) {
        // Create a temporary array
        short[] temp = new short[shortArray.length];
        
        // Copy all of the elements from the original array to the temp array
        System.arraycopy(shortArray, 0, temp, 0, shortArray.length);
        
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
                shortArray[current] = temp[left];
                // Move the left pointer to the right
                left++;
            }
            else {
                // Set the current value to the right value
                shortArray[current] = temp[right];
                // Move the right pointer to the right
                right++;
            }
            
            // Move the current pointer to the right
            current++;
        }
        
        // While the left index is less or equal to the middle index
        while(left <= middle) {
            // Set the current value to the left value
            shortArray[current] = temp[left];
            // Move the left pointer to the right
            left++;
            // Move the current pointer to the right
            current++;
        }
        
        // There is no need to put the rest of the element of the right sub array, since they are already 
        // in sorted order since all of the small elements where put to the left of the array.
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
        // If start index equals the end index
        if(start == end) {
            return ;
        }
        
        // Get the middle of the array
        int middle = (start + end) >> 1;
        
        // Recursively call the same routine on the left half of the array
        Merge.sort(longArray, start, middle, descending);
        // Recursively call the same routine on the right half of the array
        Merge.sort(longArray, middle + 1, end, descending);
        
        // If we want descending sort
        if(descending) {
            // Call the descending merge routine
            Merge.mergeDescending(longArray, start, middle, end);                        
        }
        else {
            // Call the ascending merge routine
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
        // Create a temporary array
        long[] temp = new long[longArray.length];
        
        // Copy all of the elements from the original array to the temp array
        System.arraycopy(longArray, 0, temp, 0, longArray.length);
        
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
                longArray[current] = temp[left];
                // Move the left pointer to the right
                left++;
            }
            else {
                // Set the current value to the right value
                longArray[current] = temp[right];
                // Move the right pointer to the right
                right++;
            }
            
            // Move the current pointer to the right
            current++;
        }
        
        // While the left index is less or equal to the middle index
        while(left <= middle) {
            // Set the current value to the left value
            longArray[current] = temp[left];
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
     * @param longArray array with two sorted sub arrays that will be merged
     * @param start index of the starting point of the left array
     * @param middle index that splits the array in two sub arrays
     * @param end index of the end point of the right array
     */
    private static void mergeDescending(long[] longArray, int start, int middle, int end) {
        // Create a temporary array
        long[] temp = new long[longArray.length];
        
        // Copy all of the elements from the original array to the temp array
        System.arraycopy(longArray, 0, temp, 0, longArray.length);
        
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
                longArray[current] = temp[left];
                // Move the left pointer to the right
                left++;
            }
            else {
                // Set the current value to the right value
                longArray[current] = temp[right];
                // Move the right pointer to the right
                right++;
            }
            
            // Move the current pointer to the right
            current++;
        }
        
        // While the left index is less or equal to the middle index
        while(left <= middle) {
            // Set the current value to the left value
            longArray[current] = temp[left];
            // Move the left pointer to the right
            left++;
            // Move the current pointer to the right
            current++;
        }
        
        // There is no need to put the rest of the element of the right sub array, since they are already 
        // in sorted order since all of the small elements where put to the left of the array.
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
        // If start index equals the end index
        if(start == end) {
            return ;
        }
        
        // Get the middle of the array
        int middle = (start + end) >> 1;
        
        // Recursively call the same routine on the left half of the array
        Merge.sort(floatArray, start, middle, descending);
        // Recursively call the same routine on the right half of the array
        Merge.sort(floatArray, middle + 1, end, descending);
        
        // If we want descending sort
        if(descending) {
            // Call the descending merge routine
            Merge.mergeDescending(floatArray, start, middle, end);                        
        }
        else {
            // Call the ascending merge routine
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
        // Create a temporary array
        float[] temp = new float[floatArray.length];
        
        // Copy all of the elements from the original array to the temp array
        System.arraycopy(floatArray, 0, temp, 0, floatArray.length);
        
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
                floatArray[current] = temp[left];
                // Move the left pointer to the right
                left++;
            }
            else {
                // Set the current value to the right value
                floatArray[current] = temp[right];
                // Move the right pointer to the right
                right++;
            }
            
            // Move the current pointer to the right
            current++;
        }
        
        // While the left index is less or equal to the middle index
        while(left <= middle) {
            // Set the current value to the left value
            floatArray[current] = temp[left];
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
     * @param floatArray array with two sorted sub arrays that will be merged
     * @param start index of the starting point of the left array
     * @param middle index that splits the array in two sub arrays
     * @param end index of the end point of the right array
     */
    private static void mergeDescending(float[] floatArray, int start, int middle, int end) {
        // Create a temporary array
        float[] temp = new float[floatArray.length];
        
        // Copy all of the elements from the original array to the temp array
        System.arraycopy(floatArray, 0, temp, 0, floatArray.length);
        
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
                floatArray[current] = temp[left];
                // Move the left pointer to the right
                left++;
            }
            else {
                // Set the current value to the right value
                floatArray[current] = temp[right];
                // Move the right pointer to the right
                right++;
            }
            
            // Move the current pointer to the right
            current++;
        }
        
        // While the left index is less or equal to the middle index
        while(left <= middle) {
            // Set the current value to the left value
            floatArray[current] = temp[left];
            // Move the left pointer to the right
            left++;
            // Move the current pointer to the right
            current++;
        }
        
        // There is no need to put the rest of the element of the right sub array, since they are already 
        // in sorted order since all of the small elements where put to the left of the array.
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
        // If start index equals the end index
        if(start == end) {
            return ;
        }
        
        // Get the middle of the array
        int middle = (start + end) >> 1;
        
        // Recursively call the same routine on the left half of the array
        Merge.sort(doubleArray, start, middle, descending);
        // Recursively call the same routine on the right half of the array
        Merge.sort(doubleArray, middle + 1, end, descending);
        
        // If we want descending sort
        if(descending) {
            // Call the descending merge routine
            Merge.mergeDescending(doubleArray, start, middle, end);                        
        }
        else {
            // Call the ascending merge routine
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
        // Create a temporary array
        double[] temp = new double[doubleArray.length];
        
        // Copy all of the elements from the original array to the temp array
        System.arraycopy(doubleArray, 0, temp, 0, doubleArray.length);
        
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
                doubleArray[current] = temp[left];
                // Move the left pointer to the right
                left++;
            }
            else {
                // Set the current value to the right value
                doubleArray[current] = temp[right];
                // Move the right pointer to the right
                right++;
            }
            
            // Move the current pointer to the right
            current++;
        }
        
        // While the left index is less or equal to the middle index
        while(left <= middle) {
            // Set the current value to the left value
            doubleArray[current] = temp[left];
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
     * @param doubleArray array with two sorted sub arrays that will be merged
     * @param start index of the starting point of the left array
     * @param middle index that splits the array in two sub arrays
     * @param end index of the end point of the right array
     */
    private static void mergeDescending(double[] doubleArray, int start, int middle, int end) {
        // Create a temporary array
        double[] temp = new double[doubleArray.length];
        
        // Copy all of the elements from the original array to the temp array
        System.arraycopy(doubleArray, 0, temp, 0, doubleArray.length);
        
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
                doubleArray[current] = temp[left];
                // Move the left pointer to the right
                left++;
            }
            else {
                // Set the current value to the right value
                doubleArray[current] = temp[right];
                // Move the right pointer to the right
                right++;
            }
            
            // Move the current pointer to the right
            current++;
        }
        
        // While the left index is less or equal to the middle index
        while(left <= middle) {
            // Set the current value to the left value
            doubleArray[current] = temp[left];
            // Move the left pointer to the right
            left++;
            // Move the current pointer to the right
            current++;
        }
        
        // There is no need to put the rest of the element of the right sub array, since they are already 
        // in sorted order since all of the small elements where put to the left of the array.
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
        // If start index equals the end index
        if(start == end) {
            return ;
        }
        
        // Get the middle of the array
        int middle = (start + end) >> 1;
        
        // Recursively call the same routine on the left half of the array
        Merge.sort(array, start, middle, descending);
        // Recursively call the same routine on the right half of the array
        Merge.sort(array, middle + 1, end, descending);
        
        // If we want descending sort
        if(descending) {
            // Call the descending merge routine
            Merge.mergeDescending(array, start, middle, end);                        
        }
        else {
            // Call the ascending merge routine
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
        // Create a temporary list
        List<E> temp = new LinkedList<>();
        
        // Copy all of the elements from the original array to the temp list
        for(int i = 0; i < array.length; i++) {
            temp.add(array[i]);
        }
        
        // Initialize auxiliary indexes
        int left = start;
        int right  = middle + 1;
        int current = start;
        
        // While the left index is less or equal to the middle index and the right
        // index is less or equal to the end index
        while(left <= middle && right <= end) {
            // If the left value is less or equal to the right value
            if(temp.get(left).compareTo(temp.get(right)) <= 0) {
                // Set the current value to the left value
                array[current] = temp.get(left);
                // Move the left pointer to the right
                left++;
            }
            else {
                // Set the current value to the right value
                array[current] = temp.get(right);
                // Move the right pointer to the right
                right++;
            }
            
            // Move the current pointer to the right
            current++;
        }
        
        // While the left index is less or equal to the middle index
        while(left <= middle) {
            // Set the current value to the left value
            array[current] = temp.get(left);
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
     * @param <E>
     * 
     * @param array array with two sorted sub arrays that will be merged
     * @param start index of the starting point of the left array
     * @param middle index that splits the array in two sub arrays
     * @param end index of the end point of the right array
     */
    private static <E extends Comparable<E>> void mergeDescending(E[] array, int start, int middle, int end) {
        // Create a temporary list
        List<E> temp = new LinkedList<>();
        
        // Copy all of the elements from the original array to the temp list
        for(int i = 0; i < array.length; i++) {
            temp.add(array[i]);
        }
        
        // Initialize auxiliary indexes
        int left = start;
        int right  = middle + 1;
        int current = start;
        
        // While the left index is less or equal to the middle index and the right
        // index is less or equal to the end index
        while(left <= middle && right <= end) {
            // If the left value is greater or equal to the right value
            if(temp.get(left).compareTo(temp.get(right)) >= 0) {
                // Set the current value to the left value
                array[current] = temp.get(left);
                // Move the left pointer to the right
                left++;
            }
            else {
                // Set the current value to the right value
                array[current] = temp.get(right);
                // Move the right pointer to the right
                right++;
            }
            
            // Move the current pointer to the right
            current++;
        }
        
        // While the left index is less or equal to the middle index
        while(left <= middle) {
            // Set the current value to the left value
            array[current] = temp.get(left);
            // Move the left pointer to the right
            left++;
            // Move the current pointer to the right
            current++;
        }
        
        // There is no need to put the rest of the element of the right sub array, since they are already 
        // in sorted order since all of the small elements where put to the left of the array.
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
        // If start index equals the end index
        if(start == end) {
            return ;
        }
        
        // Get the middle of the list
        int middle = (start + end) >> 1;
        
        // Recursively call the same routine on the left half of the list
        Merge.sort(list, start, middle, descending);
        // Recursively call the same routine on the right half of the list
        Merge.sort(list, middle + 1, end, descending);
        
        // If we want descending sort
        if(descending) {
            // Call the descending merge routine
            Merge.mergeDescending(list, start, middle, end);                        
        }
        else {
            // Call the ascending merge routine
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
        // Create a temporary list
        List<E> temp = new LinkedList<>();
        
        // Copy all of the elements from the original list to the temp list
        for(int i = 0; i < list.size(); i++) {
            temp.add(list.get(i));
        }
        
        // Initialize auxiliary indexes
        int left = start;
        int right  = middle + 1;
        int current = start;
        
        // While the left index is less or equal to the middle index and the right
        // index is less or equal to the end index
        while(left <= middle && right <= end) {
            // Remove the element at the current position
            list.remove(current);
            
            // If the left value is less or equal to the right value
            if(temp.get(left).compareTo(temp.get(right)) <= 0) {
                // Set the current value to the left value
                list.add(current, temp.get(left));
                // Move the left pointer to the right
                left++;
            }
            else {
                // Set the current value to the right value
                list.add(current, temp.get(right));
                // Move the right pointer to the right
                right++;
            }
            
            // Move the current pointer to the right
            current++;
        }
        
        // While the left index is less or equal to the middle index
        while(left <= middle) {
            // Remove the element at the current position
            list.remove(current);
            // Set the current value to the left value
            list.add(current, temp.get(left));
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
     * @param <E>
     * 
     * @param list array with two sorted sub arrays that will be merged
     * @param start index of the starting point of the left array
     * @param middle index that splits the array in two sub arrays
     * @param end index of the end point of the right array
     */
    private static <E extends Comparable<E>> void mergeDescending(List<E> list, int start, int middle, int end) {
        // Create a temporary list
        List<E> temp = new LinkedList<>();
        
        // Copy all of the elements from the original list to the temp list
        for(int i = 0; i < list.size(); i++) {
            temp.add(list.get(i));
        }
        
        // Initialize auxiliary indexes
        int left = start;
        int right  = middle + 1;
        int current = start;
        
        // While the left index is less or equal to the middle index and the right
        // index is less or equal to the end index
        while(left <= middle && right <= end) {
            // Remove the element at the current position
            list.remove(current);
            
            // If the left value is less or equal to the right value
            if(temp.get(left).compareTo(temp.get(right)) >= 0) {
                // Set the current value to the left value
                list.add(current, temp.get(left));
                // Move the left pointer to the right
                left++;
            }
            else {
                // Set the current value to the right value
                list.add(current, temp.get(right));
                // Move the right pointer to the right
                right++;
            }
            
            // Move the current pointer to the right
            current++;
        }
        
        // While the left index is less or equal to the middle index
        while(left <= middle) {
            // Remove the element at the current position
            list.remove(current);
            // Set the current value to the left value
            list.add(current, temp.get(left));
            // Move the left pointer to the right
            left++;
            // Move the current pointer to the right
            current++;
        }
        
        // There is no need to put the rest of the element of the right sub list, since they are already 
        // in sorted order since all of the small elements where put to the left of the list.
    }
    
}
