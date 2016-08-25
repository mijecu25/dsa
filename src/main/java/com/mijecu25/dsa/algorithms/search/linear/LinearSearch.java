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
        if(occurrence <= 0) {
            throw new IllegalArgumentException("Occurrence must be greater or equal to 1 and less than "
                    + "the array length: " + occurrence);
        }
        
        int valuesSeen = 0;
        
        for(int i = 0; i < array.length; i++) {
            if(array[i] == value) {
                valuesSeen++;
                
                if(valuesSeen == occurrence) {
                    return i;
                }
            }
        }
        
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
        if(array.length == 0) {
            throw new IllegalArgumentException("The array you provided does not have any elements");
        }
        
        E min = array[0];
        
        for(int i = 1; i < array.length; i++) {
            if(array[i].compareTo(min) < 0) {
                min = array[i];
            }
        }
        
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
//
//        if(array.length == 0) {
//            throw new IllegalArgumentException("The array you provided does not have any elements");
//        }
//
//
//        int minIndex = 0;
//
//
//        for(int i = 1; i < array.length; i++) {
//
//            if(array[i].compareTo(array[minIndex]) < 0) {
//
//                minIndex = i;
//            }
//        }
//
//
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
        if(array.length == 0) {
            throw new IllegalArgumentException("The array you provided does not have any elements");
        }
        E max = array[0];
        for(int i = 1; i < array.length; i++) {
            if(array[i].compareTo(max) > 0 ) {
                max = array[i];
            }
        }
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
//
//        if(array.length == 0) {
//            throw new IllegalArgumentException("The array you provided does not have any elements");
//        }
//
//
//        int maxIndex = 0;
//
//
//        for(int i = 1; i < array.length; i++) {
//
//            if(array[i].compareTo(array[maxIndex]) > 0) {
//
//                maxIndex = i;
//            }
//        }
//
//
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
        if(occurrence <= 0 || occurrence > list.size()) {
            throw new IllegalArgumentException("Occurrence must be greater or equal to 1 and less than "
                    + "the list length: " + occurrence);
        }
        int valuesSeen = 0;
        for(int i = 0; i < list.size(); i++) {
            if(list.get(i) == value) {
                valuesSeen++;
                if(valuesSeen == occurrence) {
                    return i;
                }
            }
        }
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
        if(list.size() == 0) {
            throw new IllegalArgumentException("The list you provided does not have any elements");
        }
        E min = list.get(0);
        for(int i = 1; i < list.size(); i++) {
            if(list.get(i).compareTo(min) < 0) {
                min = list.get(i);
            }
        }
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
//
//        if(list.size() == 0) {
//            throw new IllegalArgumentException("The list you provided does not have any elements");
//        }
//
//
//        int minIndex = 0;
//
//
//        for(int i = 1; i < list.size(); i++) {
//
//            if(list.get(i).compareTo(list.get(minIndex)) < 0) {
//
//                minIndex = i;
//            }
//        }
//
//
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
        if(list.size() == 0) {
            throw new IllegalArgumentException("The list you provided does not have any elements");
        }
        E max = list.get(0);

        for(int i = 1; i < list.size(); i++) {
            if(list.get(i).compareTo(max) > 0 ) {
                max = list.get(i);
            }
        }
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
//
//        if(list.size() == 0) {
//            throw new IllegalArgumentException("The array you provided does not have any elements");
//        }
//
//
//        int maxIndex = 0;
//
//
//        for(int i = 1; i < list.size(); i++) {
//
//            if(list.get(i).compareTo(list.get(maxIndex)) > 0) {
//
//                maxIndex = i;
//            }
//        }
//
//
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
        if(occurrence <= 0 || occurrence > intArray.length) {
            throw new IllegalArgumentException("Occurrence must be greater or equal to 1 and less than "
                    + "the array length: " + occurrence);
        }

        int valuesSeen = 0;

        for(int i = 0; i < intArray.length; i++) {
            if(intArray[i] == value) {
                valuesSeen++;

                if(valuesSeen == occurrence) {
                    return i;
                }
            }
        }

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
        if(intArray.length == 0) {
            throw new IllegalArgumentException("The array you provided does not have any elements");
        }

        int min = intArray[0];

        for(int i = 1; i < intArray.length; i++) {
            if(intArray[i] < min) {
                min = intArray[i];
            }
        }

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
//
//        if(intArray.length == 0) {
//            throw new IllegalArgumentException("The array you provided does not have any elements");
//        }
//
//
//        int minIndex = 0;
//
//
//        for(int i = 1; i < intArray.length; i++) {
//
//            if(intArray[i] < intArray[minIndex]) {
//
//                minIndex = i;
//            }
//        }
//
//
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
        if(intArray.length == 0) {
            throw new IllegalArgumentException("The array you provided does not have any elements");
        }

        int max = intArray[0];

        for(int i = 1; i < intArray.length; i++) {
            if(intArray[i] > max) {
                max = intArray[i];
            }
        }

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
//
//        if(intArray.length == 0) {
//            throw new IllegalArgumentException("The array you provided does not have any elements");
//        }
//
//
//        int maxIndex = 0;
//
//
//        for(int i = 1; i < intArray.length; i++) {
//
//            if(intArray[i] > intArray[maxIndex]) {
//
//                maxIndex = i;
//            }
//        }
//
//
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
        if(occurrence <= 0 || occurrence > charArray.length) {
            throw new IllegalArgumentException("Occurrence must be greater or equal to 1 and less than "
                    + "the array length: " + occurrence);
        }

        int valuesSeen = 0;

        for(int i = 0; i < charArray.length; i++) {
            if(charArray[i] == value) {
                valuesSeen++;

                if(valuesSeen == occurrence) {
                    return i;
                }
            }
        }

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
        if(charArray.length == 0) {
            throw new IllegalArgumentException("The array you provided does not have any elements");
        }

        char min = charArray[0];

        for(int i = 1; i < charArray.length; i++) {
            if(charArray[i] < min) {
                min = charArray[i];
            }
        }

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
//
//        if(charArray.length == 0) {
//            throw new IllegalArgumentException("The array you provided does not have any elements");
//        }
//
//
//        int minIndex = 0;
//
//
//        for(int i = 1; i < charArray.length; i++) {
//
//            if(charArray[i] < charArray[minIndex]) {
//
//                minIndex = i;
//            }
//        }
//
//
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
        if(charArray.length == 0) {
            throw new IllegalArgumentException("The array you provided does not have any elements");
        }

        char max = charArray[0];

        for(int i = 1; i < charArray.length; i++) {
            if(charArray[i] > max) {
                max = charArray[i];
            }
        }

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
//
//        if(charArray.length == 0) {
//            throw new IllegalArgumentException("The array you provided does not have any elements");
//        }
//
//
//        int maxIndex = 0;
//
//
//        for(int i = 1; i < charArray.length; i++) {
//
//            if(charArray[i] > charArray[maxIndex]) {
//
//                maxIndex = i;
//            }
//        }
//
//
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
        if(occurrence <= 0 || occurrence > byteArray.length) {
            throw new IllegalArgumentException("Occurrence must be greater or equal to 1 and less than "
                    + "the array length: " + occurrence);
        }

        int valuesSeen = 0;

        for(int i = 0; i < byteArray.length; i++) {
            if(byteArray[i] == value) {
                valuesSeen++;

                if(valuesSeen == occurrence) {
                    return i;
                }
            }
        }

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
        if(byteArray.length == 0) {
            throw new IllegalArgumentException("The array you provided does not have any elements");
        }

        byte min = byteArray[0];

        for(int i = 1; i < byteArray.length; i++) {
            if(byteArray[i] < min) {
                min = byteArray[i];
            }
        }

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
//
//        if(byteArray.length == 0) {
//            throw new IllegalArgumentException("The array you provided does not have any elements");
//        }
//
//
//        int minIndex = 0;
//
//
//        for(int i = 1; i < byteArray.length; i++) {
//
//            if(byteArray[i] < byteArray[minIndex]) {
//
//                minIndex = i;
//            }
//        }
//
//
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
        if(byteArray.length == 0) {
            throw new IllegalArgumentException("The array you provided does not have any elements");
        }

        byte max = byteArray[0];

        for(int i = 1; i < byteArray.length; i++) {
            if(byteArray[i] > max) {
                max = byteArray[i];
            }
        }

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
//
//        if(byteArray.length == 0) {
//            throw new IllegalArgumentException("The array you provided does not have any elements");
//        }
//
//
//        int maxIndex = 0;
//
//
//        for(int i = 1; i < byteArray.length; i++) {
//
//            if(byteArray[i] > byteArray[maxIndex]) {
//
//                maxIndex = i;
//            }
//        }
//
//
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
        if(occurrence <= 0 || occurrence > shortArray.length) {
            throw new IllegalArgumentException("Occurrence must be greater or equal to 1 and less than "
                    + "the array length: " + occurrence);
        }

        int valuesSeen = 0;

        for(int i = 0; i < shortArray.length; i++) {
            if(shortArray[i] == value) {
                valuesSeen++;

                if(valuesSeen == occurrence) {
                    return i;
                }
            }
        }

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
        if(shortArray.length == 0) {
            throw new IllegalArgumentException("The array you provided does not have any elements");
        }

        short min = shortArray[0];

        for(int i = 1; i < shortArray.length; i++) {
            if(shortArray[i] < min) {
                min = shortArray[i];
            }
        }

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
//
//        if(shortArray.length == 0) {
//            throw new IllegalArgumentException("The array you provided does not have any elements");
//        }
//
//
//        int minIndex = 0;
//
//
//        for(int i = 1; i < shortArray.length; i++) {
//
//            if(shortArray[i] < shortArray[minIndex]) {
//
//                minIndex = i;
//            }
//        }
//
//
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
        if(shortArray.length == 0) {
            throw new IllegalArgumentException("The array you provided does not have any elements");
        }

        short max = shortArray[0];

        for(int i = 1; i < shortArray.length; i++) {
            if(shortArray[i] > max) {
                max = shortArray[i];
            }
        }

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
//
//        if(shortArray.length == 0) {
//            throw new IllegalArgumentException("The array you provided does not have any elements");
//        }
//
//
//        int maxIndex = 0;
//
//
//        for(int i = 1; i < shortArray.length; i++) {
//
//            if(shortArray[i] > shortArray[maxIndex]) {
//
//                maxIndex = i;
//            }
//        }
//
//
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
        if(occurrence <= 0 || occurrence > longArray.length) {
            throw new IllegalArgumentException("Occurrence must be greater or equal to 1 and less than "
                    + "the array length: " + occurrence);
        }

        int valuesSeen = 0;

        for(int i = 0; i < longArray.length; i++) {
            if(longArray[i] == value) {
                valuesSeen++;

                if(valuesSeen == occurrence) {
                    return i;
                }
            }
        }

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
        if(longArray.length == 0) {
            throw new IllegalArgumentException("The array you provided does not have any elements");
        }

        long min = longArray[0];

        for(int i = 1; i < longArray.length; i++) {
            if(longArray[i] < min) {
                min = longArray[i];
            }
        }

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
//
//        if(longArray.length == 0) {
//            throw new IllegalArgumentException("The array you provided does not have any elements");
//        }
//
//
//        int minIndex = 0;
//
//
//        for(int i = 1; i < longArray.length; i++) {
//
//            if(longArray[i] < longArray[minIndex]) {
//
//                minIndex = i;
//            }
//        }
//
//
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
        if(longArray.length == 0) {
            throw new IllegalArgumentException("The array you provided does not have any elements");
        }

        long max = longArray[0];

        for(int i = 1; i < longArray.length; i++) {
            if(longArray[i] > max) {
                max = longArray[i];
            }
        }

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
//
//        if(longArray.length == 0) {
//            throw new IllegalArgumentException("The array you provided does not have any elements");
//        }
//
//
//        int maxIndex = 0;
//
//
//        for(int i = 1; i < longArray.length; i++) {
//
//            if(longArray[i] > longArray[maxIndex]) {
//
//                maxIndex = i;
//            }
//        }
//
//
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
        if(occurrence <= 0 || occurrence > floatArray.length) {
            throw new IllegalArgumentException("Occurrence must be greater or equal to 1 and less than "
                    + "the array length: " + occurrence);
        }

        int valuesSeen = 0;

        for(int i = 0; i < floatArray.length; i++) {
            if(floatArray[i] == value) {
                valuesSeen++;

                if(valuesSeen == occurrence) {
                    return i;
                }
            }
        }

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
        if(floatArray.length == 0) {
            throw new IllegalArgumentException("The array you provided does not have any elements");
        }

        float min = floatArray[0];

        for(int i = 1; i < floatArray.length; i++) {
            if(floatArray[i] < min) {
                min = floatArray[i];
            }
        }

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
//
//        if(floatArray.length == 0) {
//            throw new IllegalArgumentException("The array you provided does not have any elements");
//        }
//
//
//        int minIndex = 0;
//
//
//        for(int i = 1; i < floatArray.length; i++) {
//
//            if(floatArray[i] < floatArray[minIndex]) {
//
//                minIndex = i;
//            }
//        }
//
//
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
        if(floatArray.length == 0) {
            throw new IllegalArgumentException("The array you provided does not have any elements");
        }

        float max = floatArray[0];

        for(int i = 1; i < floatArray.length; i++) {
            if(floatArray[i] > max) {
                max = floatArray[i];
            }
        }

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
//
//        if(floatArray.length == 0) {
//            throw new IllegalArgumentException("The array you provided does not have any elements");
//        }
//
//
//        int maxIndex = 0;
//
//
//        for(int i = 1; i < floatArray.length; i++) {
//
//            if(floatArray[i] > floatArray[maxIndex]) {
//
//                maxIndex = i;
//            }
//        }
//
//
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
        if(occurrence <= 0 || occurrence > doubleArray.length) {
            throw new IllegalArgumentException("Occurrence must be greater or equal to 1 and less than "
                    + "the array length: " + occurrence);
        }

        int valuesSeen = 0;

        for(int i = 0; i < doubleArray.length; i++) {
            if(doubleArray[i] == value) {
                valuesSeen++;

                if(valuesSeen == occurrence) {
                    return i;
                }
            }
        }

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
        if(doubleArray.length == 0) {
            throw new IllegalArgumentException("The array you provided does not have any elements");
        }

        double min = doubleArray[0];

        for(int i = 1; i < doubleArray.length; i++) {
            if(doubleArray[i] < min) {
                min = doubleArray[i];
            }
        }

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
//
//        if(doubleArray.length == 0) {
//            throw new IllegalArgumentException("The array you provided does not have any elements");
//        }
//
//
//        int minIndex = 0;
//
//
//        for(int i = 1; i < doubleArray.length; i++) {
//
//            if(doubleArray[i] < doubleArray[minIndex]) {
//
//                minIndex = i;
//            }
//        }
//
//
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
        if(doubleArray.length == 0) {
            throw new IllegalArgumentException("The array you provided does not have any elements");
        }

        double max = doubleArray[0];

        for(int i = 1; i < doubleArray.length; i++) {
            if(doubleArray[i] > max) {
                max = doubleArray[i];
            }
        }

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
//
//        if(doubleArray.length == 0) {
//            throw new IllegalArgumentException("The array you provided does not have any elements");
//        }
//
//
//        int maxIndex = 0;
//
//
//        for(int i = 1; i < doubleArray.length; i++) {
//
//            if(doubleArray[i] > doubleArray[maxIndex]) {
//
//                maxIndex = i;
//            }
//        }
//
//
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
        if(occurrence <= 0 || occurrence > array.length) {
            throw new IllegalArgumentException("Occurrence must be greater or equal to 1 and less than "
                    + "the array length: " + occurrence);
        }

        int valuesSeen = 0;

        for(int i = array.length-1; i >=0; i--) {
            if(array[i] == value) {
                valuesSeen++;

                if(valuesSeen == occurrence) {
                    return i;
                }
            }
        }

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
        if(occurrence <= 0 || occurrence > list.size()) {
            throw new IllegalArgumentException("Occurrence must be greater or equal to 1 and less than "
                    + "the list length: " + occurrence);
        }

        int valuesSeen = 0;

        for(int i = list.size()-1; i >=0; i--) {
            if(list.get(i) == value) {
                valuesSeen++;

                if(valuesSeen == occurrence) {
                    return i;
                }
            }
        }

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
        if(occurrence <= 0 || occurrence > intArray.length) {
            throw new IllegalArgumentException("Occurrence must be greater or equal to 1 and less than "
                    + "the array length: " + occurrence);
        }

        int valuesSeen = 0;

        for(int i = intArray.length-1; i >=0; i--) {
            if(intArray[i] == value) {
                valuesSeen++;

                if(valuesSeen == occurrence) {
                    return i;
                }
            }
        }

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
        if(occurrence <= 0 || occurrence > charArray.length) {
            throw new IllegalArgumentException("Occurrence must be greater or equal to 1 and less than "
                    + "the array length: " + occurrence);
        }

        int valuesSeen = 0;

        for(int i = charArray.length-1; i >=0; i--) {
            if(charArray[i] == value) {
                valuesSeen++;

                if(valuesSeen == occurrence) {
                    return i;
                }
            }
        }

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
        if(occurrence <= 0 || occurrence > byteArray.length) {
            throw new IllegalArgumentException("Occurrence must be greater or equal to 1 and less than "
                    + "the array length: " + occurrence);
        }

        int valuesSeen = 0;

        for(int i = byteArray.length-1; i >=0; i--) {
            if(byteArray[i] == value) {
                valuesSeen++;

                if(valuesSeen == occurrence) {
                    return i;
                }
            }
        }

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
        if(occurrence <= 0 || occurrence > shortArray.length) {
            throw new IllegalArgumentException("Occurrence must be greater or equal to 1 and less than "
                    + "the array length: " + occurrence);
        }

        int valuesSeen = 0;

        for(int i = shortArray.length-1; i >=0; i--) {
            if(shortArray[i] == value) {
                valuesSeen++;

                if(valuesSeen == occurrence) {
                    return i;
                }
            }
        }

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
        if(occurrence <= 0 || occurrence > longArray.length) {
            throw new IllegalArgumentException("Occurrence must be greater or equal to 1 and less than "
                    + "the array length: " + occurrence);
        }

        int valuesSeen = 0;

        for(int i = longArray.length-1; i >=0; i--) {
            if(longArray[i] == value) {
                valuesSeen++;

                if(valuesSeen == occurrence) {
                    return i;
                }
            }
        }

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
        if(occurrence <= 0 || occurrence > floatArray.length) {
            throw new IllegalArgumentException("Occurrence must be greater or equal to 1 and less than "
                    + "the array length: " + occurrence);
        }

        int valuesSeen = 0;

        for(int i = floatArray.length-1; i >=0; i--) {
            if(floatArray[i] == value) {
                valuesSeen++;

                if(valuesSeen == occurrence) {
                    return i;
                }
            }
        }

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
        if(occurrence <= 0 || occurrence > doubleArray.length) {
            throw new IllegalArgumentException("Occurrence must be greater or equal to 1 and less than "
                    + "the array length: " + occurrence);
        }

        int valuesSeen = 0;

        for(int i = doubleArray.length-1; i >=0; i--) {
            if(doubleArray[i] == value) {
                valuesSeen++;

                if(valuesSeen == occurrence) {
                    return i;
                }
            }
        }

        return -1;
    }
}
