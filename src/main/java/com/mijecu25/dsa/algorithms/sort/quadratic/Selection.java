package com.mijecu25.dsa.algorithms.sort.quadratic;

import java.util.List;

import com.mijecu25.dsa.algorithms.sort.Sort;
import com.mijecu25.dsa.algorithms.swap.TrivialSwap;
import com.mijecu25.dsa.algorithms.swap.XORSwap;

/**
 * Quadratic sorting algorithm. It loops through the collection selecting the minimum element. Once it
 * finds it, it put it in the correct index and repeats the algorithm on the rest of the collection. 
 * This algorithm is stable and in place. For small collections,
 * this algorithm is more efficient that other asymptotically faster algorithms.
 * 
 * <br>
 * <br>
 * 
 * <i>Worst case performance: </i> O(n<sup>2</sup>)
 * <br>
 * <i>Best case performance: </i> O(n<sup>2</sup>)
 * <br>
 * <i>Average case performance: </i> O(n<sup>2</sup>)
 * 
 * @author Miguel Velez - miguelvelezmj25
 * @version 0.2.0.2
 */
public class Selection extends Sort {
    
    /**
     * Don't let anyone instantiate this class
     */
    private Selection() { ; }
    
    /**
     * Sort the array in ascending order using this algorithm.
     * 
     * @param <E> the type of elements in this array.
     * 
     * @param array the array that we want to sort
     */
    public static <E extends Comparable<E>> void sort(E[] array) {
        // Initialize helper variables
        int minIndex = 0;

        // Loop through the array
        for(int i = 0; i < array.length; i++) {
            // Set the index to the current iteration of the loop
            minIndex = i;
            
            // Loop through the entire array from the current iteration
            // of the loop
            for(int j = minIndex; j < array.length; j++) {
                // If the current element is less than the minimum element
                if(array[j].compareTo(array[minIndex]) < 0) {
                    // Set the minimum index to the current index
                    minIndex = j;
                }
            }

            // Swap the element in the array
            TrivialSwap.swap(array, i, minIndex);
        }
    }
        
    /**
     * Sort the list in ascending order using this algorithm. The run time of this algorithm depends on the 
     * implementation of the list since it has elements added and removed from it.
     * 
     * @param <E> the type of elements in this list.
     * 
     * @param list the list that we want to sort
     */
    public static <E extends Comparable<E>> void sort(List<E> list) {
        // Initialize helper variables
        int index = 0;
        E value = null;
        
        // Loop through the list beginning at the first element
        for(int i = 1; i < list.size(); i++) {
            // Set the index to the current iteration of the loop
            index = i;
            // Set value to the current element of the list. We have to remove the element
            // since we are working with lists.
            value = list.remove(index);
            
            // While the index is greater than 0 and the value is less than the
            // value to the left
            while(index > 0 && value.compareTo(list.get(index - 1)) < 0) {
                // Copy the value to the left to the current spot
                list.add(index, list.get(index - 1));
                
                // Decrease the index
                index--;
            }
            
            // Copy the current value to the current position
            list.add(index, value);
        }
    }
    
    /**
     * Sort the int array in ascending order using this algorithm.
     * 
     * @param intArray the array of ints that we want to sort
     */
    public static void sort(int[] intArray) {
        // Initialize helper variables
        int minIndex = 0;

        // Loop through the array
        for(int i = 0; i < intArray.length; i++) {
            // Set the index to the current iteration of the loop
            minIndex = i;
            
            // Loop through the entire array from the current iteration
            // of the loop
            for(int j = minIndex; j < intArray.length; j++) {
                // If the current element is less than the minimum element
                if(intArray[j] < intArray[minIndex]) {
                    // Set the minimum index to the current index
                    minIndex = j;
                }
            }

            // Swap the element in the array
            XORSwap.swap(intArray, i, minIndex);
        }
    }
    
    /**
     * Sort the byte array in ascending order using this algorithm.
     * 
     * @param byteArray the array of bytes that we want to sort
     */
    public static void sort(byte[] byteArray) {
        // Initialize helper variables
        int index = 0;
        byte value = 0;
        
        // Loop through the array beginning at the first element
        for(int i = 1; i < byteArray.length; i++) {
            // Set the index to the current iteration of the loop
            index = i;
            // Set value to the current element of the array            
            value = byteArray[index];
            
            // While the index is greater than 0 and the value is less than the
            // value to the left
            while(index > 0 && value < byteArray[index - 1]) {
                // Copy the value to the left to the current spot
                byteArray[index] = byteArray[index - 1];
                
                // Decrease the index
                index--;
            }
            
            // Copy the current value to the current position
            byteArray[index] = value;
        }
    }
    
    /**
     * Sort the char array in ascending order using this algorithm.
     *
     * @param charArray the array of chars that we want to sort
     */
    public static void sort(char[] charArray) {
        // Initialize helper variables
        int index = 0;
        char value = 0;
        
        // Loop through the array beginning at the first element
        for(int i = 1; i < charArray.length; i++) {
            // Set the index to the current iteration of the loop
            index = i;
            // Set value to the current element of the array            
            value = charArray[index];
            
            // While the index is greater than 0 and the value is less than the
            // value to the left
            while(index > 0 && value < charArray[index - 1]) {
                // Copy the value to the left to the current spot
                charArray[index] = charArray[index - 1];
                
                // Decrease the index
                index--;
            }
            
            // Copy the current value to the current position
            charArray[index] = value;
        }
    }
    
    /**
     * Sort the double array in ascending order using this algorithm.
     * 
     * @param doubleArray the array of double that we want to sort
     */
    public static void sort(double[] doubleArray) {
        // Initialize helper variables
        int index = 0;
        double value = 0.0;
        
        // Loop through the array beginning at the first element
        for(int i = 1; i < doubleArray.length; i++) {
            // Set the index to the current iteration of the loop
            index = i;
            // Set value to the current element of the array            
            value = doubleArray[index];
            
            // While the index is greater than 0 and the value is less than the
            // value to the left
            while(index > 0 && value < doubleArray[index - 1]) {
                // Copy the value to the left to the current spot
                doubleArray[index] = doubleArray[index - 1];
                
                // Decrease the index
                index--;
            }
            
            // Copy the current value to the current position
            doubleArray[index] = value;
        }
    }
    
    /**
     * Sort the float array in ascending order using this algorithm.
     * 
     * @param floatArray the array of float that we want to sort
     */
    public static void sort(float[] floatArray) {
        // Initialize helper variables
        int index = 0;
        float value = 0f;
        
        // Loop through the array beginning at the first element
        for(int i = 1; i < floatArray.length; i++) {
            // Set the index to the current iteration of the loop
            index = i;
            // Set value to the current element of the array            
            value = floatArray[index];
            
            // While the index is greater than 0 and the value is less than the
            // value to the left
            while(index > 0 && value < floatArray[index - 1]) {
                // Copy the value to the left to the current spot
                floatArray[index] = floatArray[index - 1];
                
                // Decrease the index
                index--;
            }
            
            // Copy the current value to the current position
            floatArray[index] = value;
        }
    }
    
    /**
     * Sort the long array in ascending order using this algorithm.
     * 
     * @param longArray the array of longs that we want to sort
     */
    public static void sort(long[] longArray) {
        // Initialize helper variables
        int index = 0;
        long value = 0;
        
        // Loop through the array beginning at the first element
        for(int i = 1; i < longArray.length; i++) {
            // Set the index to the current iteration of the loop
            index = i;
            // Set value to the current element of the array            
            value = longArray[index];
            
            // While the index is greater than 0 and the value is less than the
            // value to the left
            while(index > 0 && value < longArray[index - 1]) {
                // Copy the value to the left to the current spot
                longArray[index] = longArray[index - 1];
                
                // Decrease the index
                index--;
            }
            
            // Copy the current value to the current position
            longArray[index] = value;
        }
    }
    
    /**
     * Sort the short array in ascending order using this algorithm.
     * 
     * @param shortArray the array of shorts that we want to sort
     */
    public static void sort(short[] shortArray) {
        // Initialize helper variables
        int index = 0;
        short value = 0;
        
        // Loop through the array beginning at the first element
        for(int i = 1; i < shortArray.length; i++) {
            // Set the index to the current iteration of the loop
            index = i;
            // Set value to the current element of the array            
            value = shortArray[index];
            
            // While the index is greater than 0 and the value is less than the
            // value to the left
            while(index > 0 && value < shortArray[index - 1]) {
                // Copy the value to the left to the current spot
                shortArray[index] = shortArray[index - 1];
                
                // Decrease the index
                index--;
            }
            
            // Copy the current value to the current position
            shortArray[index] = value;
        }
    }

     /**
     * Sort the array in descending order using this algorithm.
     * 
     * @param <E> the type of elements in this array.
     * 
     * @param array the array that we want to sort
     */
    public static <E extends Comparable<E>> void sortDescending(E[] array) {
        // Initialize helper variables
        int index = 0;
        E value = null;
        
        // Loop through the array beginning at the first element
        for(int i = 1; i < array.length; i++) {
            // Set the index to the current iteration of the loop
            index = i;
            // Set value to the current element of the array            
            value = array[index];
            
            // While the index is greater than 0 and the value is greater than the
            // value to the left
            while(index > 0 && value.compareTo(array[index - 1]) > 0) {
                // Copy the value to the left to the current spot
                array[index] = array[index - 1];
                
                // Decrease the index
                index--;
            }
            
            // Copy the current value to the current position
            array[index] = value;
        }
    }
    
    /**
     * Sort the list in descending order using this algorithm. The run time of this algorithm depends on the 
     * implementation of the list since it has elements added and removed from it.
     * 
     * @param <E> the type of elements in this list.
     * 
     * @param list the list that we want to sort
     */
    public static <E extends Comparable<E>> void sortDescending(List<E> list) {
        // Initialize helper variables
        int index = 0;
        E value = null;
        
        // Loop through the list beginning at the first element
        for(int i = 1; i < list.size(); i++) {
            // Set the index to the current iteration of the loop
            index = i;
            // Set value to the current element of the list. Remove the value since
            // we are manipulating a list
            value = list.remove(index);
            
            // While the index is greater than 0 and the value is greater than the
            // value to the left
            while(index > 0 && value.compareTo(list.get(index - 1)) > 0) {
                // Copy the value to the left to the current spot
                list.add(index, list.get(index - 1));
                
                // Decrease the index
                index--;
            }
            
            // Copy the current value to the current position
            list.add(index, value);
        }
    }
    
    /**
     * Sort the int array in descending order using this algorithm.
     *
     * @param intArray the array of ints that we want to sort
     */
    public static void sortDescending(int[] intArray) {
        // Initialize helper variables
        int index = 0;
        int value = 0;
        
        // Loop through the array beginning at the first element
        for(int i = 1; i < intArray.length; i++) {
            // Set the index to the current iteration of the loop
            index = i;
            // Set value to the current element of the array            
            value = intArray[index];
            
            // While the index is greater than 0 and the value is greater than the
            // value to the left
            while(index > 0 && value > intArray[index - 1]) {
                // Copy the value to the left to the current spot
                intArray[index] = intArray[index - 1];
                
                // Decrease the index
                index--;
            }
            
            // Copy the current value to the current position
            intArray[index] = value;
        }
    }

    /**
     * Sort the byte array in descending order using this algorithm.
     *
     * @param byteArray the array of bytes that we want to sort
     */
    public static void sortDescending(byte[] byteArray) {
        // Initialize helper variables
        int index = 0;
        byte value = 0;
        
        // Loop through the array beginning at the first element
        for(int i = 1; i < byteArray.length; i++) {
            // Set the index to the current iteration of the loop
            index = i;
            // Set value to the current element of the array            
            value = byteArray[index];
            
            // While the index is greater than 0 and the value is greater than the
            // value to the left
            while(index > 0 && value > byteArray[index - 1]) {
                // Copy the value to the left to the current spot
                byteArray[index] = byteArray[index - 1];
                
                // Decrease the index
                index--;
            }
            
            // Copy the current value to the current position
            byteArray[index] = value;
        }
    }

    /**
     * Sort the char array in descending order using this algorithm.
     *
     * @param charArray the array of chars that we want to sort
     */
    public static void sortDescending(char[] charArray) {
        // Initialize helper variables
        int index = 0;
        char value = 0;
        
        // Loop through the array beginning at the first element
        for(int i = 1; i < charArray.length; i++) {
            // Set the index to the current iteration of the loop
            index = i;
            // Set value to the current element of the array            
            value = charArray[index];
            
            // While the index is greater than 0 and the value is greater than the
            // value to the left
            while(index > 0 && value > charArray[index - 1]) {
                // Copy the value to the left to the current spot
                charArray[index] = charArray[index - 1];
                
                // Decrease the index
                index--;
            }
            
            // Copy the current value to the current position
            charArray[index] = value;
        }
    }

    /**
     * Sort the double array in descending order using this algorithm.
     *
     * @param doubleArray the array of double that we want to sort
     */
    public static void sortDescending(double[] doubleArray) {
        // Initialize helper variables
        int index = 0;
        double value = 0;
        
        // Loop through the array beginning at the first element
        for(int i = 1; i < doubleArray.length; i++) {
            // Set the index to the current iteration of the loop
            index = i;
            // Set value to the current element of the array            
            value = doubleArray[index];
            
            // While the index is greater than 0 and the value is greater than the
            // value to the left
            while(index > 0 && value > doubleArray[index - 1]) {
                // Copy the value to the left to the current spot
                doubleArray[index] = doubleArray[index - 1];
                
                // Decrease the index
                index--;
            }
            
            // Copy the current value to the current position
            doubleArray[index] = value;
        }
    }

    /**
     * Sort the float array in descending order using this algorithm.
     *
     * @param floatArray the array of float that we want to sort
     */
    public static void sortDescending(float[] floatArray) {
        // Initialize helper variables
        int index = 0;
        float value = 0;
        
        // Loop through the array beginning at the first element
        for(int i = 1; i < floatArray.length; i++) {
            // Set the index to the current iteration of the loop
            index = i;
            // Set value to the current element of the array            
            value = floatArray[index];
            
            // While the index is greater than 0 and the value is greater than the
            // value to the left
            while(index > 0 && value > floatArray[index - 1]) {
                // Copy the value to the left to the current spot
                floatArray[index] = floatArray[index - 1];
                
                // Decrease the index
                index--;
            }
            
            // Copy the current value to the current position
            floatArray[index] = value;
        }
    }

    /**
     * Sort the long array in descending order using this algorithm.
     *
     * @param longArray the array of longs that we want to sort
     */
    public static void sortDescending(long[] longArray) {
        // Initialize helper variables
        int index = 0;
        long value = 0;
        
        // Loop through the array beginning at the first element
        for(int i = 1; i < longArray.length; i++) {
            // Set the index to the current iteration of the loop
            index = i;
            // Set value to the current element of the array            
            value = longArray[index];
            
            // While the index is greater than 0 and the value is greater than the
            // value to the left
            while(index > 0 && value > longArray[index - 1]) {
                // Copy the value to the left to the current spot
                longArray[index] = longArray[index - 1];
                
                // Decrease the index
                index--;
            }
            
            // Copy the current value to the current position
            longArray[index] = value;
        }
    }

    /**
     * Sort the short array in descending order using this algorithm.
     *
     * @param shortArray the array of shorts that we want to sort
     */
    public static void sortDescending(short[] shortArray) {
        // Initialize helper variables
        int index = 0;
        short value = 0;
        
        // Loop through the array beginning at the first element
        for(int i = 1; i < shortArray.length; i++) {
            // Set the index to the current iteration of the loop
            index = i;
            // Set value to the current element of the array            
            value = shortArray[index];
            
            // While the index is greater than 0 and the value is greater than the
            // value to the left
            while(index > 0 && value > shortArray[index - 1]) {
                // Copy the value to the left to the current spot
                shortArray[index] = shortArray[index - 1];
                
                // Decrease the index
                index--;
            }
            
            // Copy the current value to the current position
            shortArray[index] = value;
        }
    }

}
