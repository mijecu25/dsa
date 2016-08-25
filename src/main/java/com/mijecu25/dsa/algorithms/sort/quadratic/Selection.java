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
        int minIndex = 0;
        for(int i = 0; i < array.length; i++) {
            minIndex = i;
            
            for(int j = minIndex; j < array.length; j++) {
                if(array[j].compareTo(array[minIndex]) < 0) {
                    minIndex = j;
                }
            }
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
        int index = 0;
        E value = null;
        
        for(int i = 1; i < list.size(); i++) {
            index = i;
            value = list.remove(index);
            
            while(index > 0 && value.compareTo(list.get(index - 1)) < 0) {
                list.add(index, list.get(index - 1));
                
                index--;
            }
            
            list.add(index, value);
        }
    }
    
    /**
     * Sort the int array in ascending order using this algorithm.
     * 
     * @param intArray the array of ints that we want to sort
     */
    public static void sort(int[] intArray) {
        int minIndex = 0;
        for(int i = 0; i < intArray.length; i++) {
            minIndex = i;
            
            for(int j = minIndex; j < intArray.length; j++) {
                if(intArray[j] < intArray[minIndex]) {
                    minIndex = j;
                }
            }
            XORSwap.swap(intArray, i, minIndex);
        }
    }
    
    /**
     * Sort the byte array in ascending order using this algorithm.
     * 
     * @param byteArray the array of bytes that we want to sort
     */
    public static void sort(byte[] byteArray) {
        int index = 0;
        byte value = 0;
        
        for(int i = 1; i < byteArray.length; i++) {
            index = i;
            value = byteArray[index];
            
            while(index > 0 && value < byteArray[index - 1]) {
                byteArray[index] = byteArray[index - 1];
                
                index--;
            }
            
            byteArray[index] = value;
        }
    }
    
    /**
     * Sort the char array in ascending order using this algorithm.
     *
     * @param charArray the array of chars that we want to sort
     */
    public static void sort(char[] charArray) {
        int index = 0;
        char value = 0;
        
        for(int i = 1; i < charArray.length; i++) {
            index = i;
            value = charArray[index];
            
            while(index > 0 && value < charArray[index - 1]) {
                charArray[index] = charArray[index - 1];
                
                index--;
            }
            
            charArray[index] = value;
        }
    }
    
    /**
     * Sort the double array in ascending order using this algorithm.
     * 
     * @param doubleArray the array of double that we want to sort
     */
    public static void sort(double[] doubleArray) {
        int index = 0;
        double value = 0.0;
        
        for(int i = 1; i < doubleArray.length; i++) {
            index = i;
            value = doubleArray[index];
            
            while(index > 0 && value < doubleArray[index - 1]) {
                doubleArray[index] = doubleArray[index - 1];
                
                index--;
            }
            
            doubleArray[index] = value;
        }
    }
    
    /**
     * Sort the float array in ascending order using this algorithm.
     * 
     * @param floatArray the array of float that we want to sort
     */
    public static void sort(float[] floatArray) {
        int index = 0;
        float value = 0f;
        
        for(int i = 1; i < floatArray.length; i++) {
            index = i;
            value = floatArray[index];
            
            while(index > 0 && value < floatArray[index - 1]) {
                floatArray[index] = floatArray[index - 1];
                
                index--;
            }
            
            floatArray[index] = value;
        }
    }
    
    /**
     * Sort the long array in ascending order using this algorithm.
     * 
     * @param longArray the array of longs that we want to sort
     */
    public static void sort(long[] longArray) {
        int index = 0;
        long value = 0;
        
        for(int i = 1; i < longArray.length; i++) {
            index = i;
            value = longArray[index];
            
            while(index > 0 && value < longArray[index - 1]) {
                longArray[index] = longArray[index - 1];
                
                index--;
            }
            
            longArray[index] = value;
        }
    }
    
    /**
     * Sort the short array in ascending order using this algorithm.
     * 
     * @param shortArray the array of shorts that we want to sort
     */
    public static void sort(short[] shortArray) {
        int index = 0;
        short value = 0;
        
        for(int i = 1; i < shortArray.length; i++) {
            index = i;
            value = shortArray[index];
            
            while(index > 0 && value < shortArray[index - 1]) {
                shortArray[index] = shortArray[index - 1];
                
                index--;
            }
            
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
        int index = 0;
        E value = null;
        
        for(int i = 1; i < array.length; i++) {
            index = i;
            value = array[index];
            
            while(index > 0 && value.compareTo(array[index - 1]) > 0) {
                array[index] = array[index - 1];
                
                index--;
            }
            
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
        int index = 0;
        E value = null;
        
        for(int i = 1; i < list.size(); i++) {
            index = i;
            value = list.remove(index);
            
            while(index > 0 && value.compareTo(list.get(index - 1)) > 0) {
                list.add(index, list.get(index - 1));
                
                index--;
            }
            
            list.add(index, value);
        }
    }
    
    /**
     * Sort the int array in descending order using this algorithm.
     *
     * @param intArray the array of ints that we want to sort
     */
    public static void sortDescending(int[] intArray) {
        int index = 0;
        int value = 0;
        
        for(int i = 1; i < intArray.length; i++) {
            index = i;
            value = intArray[index];
            
            while(index > 0 && value > intArray[index - 1]) {
                intArray[index] = intArray[index - 1];
                
                index--;
            }
            
            intArray[index] = value;
        }
    }
    /**
     * Sort the byte array in descending order using this algorithm.
     *
     * @param byteArray the array of bytes that we want to sort
     */
    public static void sortDescending(byte[] byteArray) {
        int index = 0;
        byte value = 0;
        
        for(int i = 1; i < byteArray.length; i++) {
            index = i;
            value = byteArray[index];
            
            while(index > 0 && value > byteArray[index - 1]) {
                byteArray[index] = byteArray[index - 1];
                
                index--;
            }
            
            byteArray[index] = value;
        }
    }
    /**
     * Sort the char array in descending order using this algorithm.
     *
     * @param charArray the array of chars that we want to sort
     */
    public static void sortDescending(char[] charArray) {
        int index = 0;
        char value = 0;
        
        for(int i = 1; i < charArray.length; i++) {
            index = i;
            value = charArray[index];
            
            while(index > 0 && value > charArray[index - 1]) {
                charArray[index] = charArray[index - 1];
                
                index--;
            }
            
            charArray[index] = value;
        }
    }
    /**
     * Sort the double array in descending order using this algorithm.
     *
     * @param doubleArray the array of double that we want to sort
     */
    public static void sortDescending(double[] doubleArray) {
        int index = 0;
        double value = 0;
        
        for(int i = 1; i < doubleArray.length; i++) {
            index = i;
            value = doubleArray[index];
            
            while(index > 0 && value > doubleArray[index - 1]) {
                doubleArray[index] = doubleArray[index - 1];
                
                index--;
            }
            
            doubleArray[index] = value;
        }
    }
    /**
     * Sort the float array in descending order using this algorithm.
     *
     * @param floatArray the array of float that we want to sort
     */
    public static void sortDescending(float[] floatArray) {
        int index = 0;
        float value = 0;
        
        for(int i = 1; i < floatArray.length; i++) {
            index = i;
            value = floatArray[index];
            
            while(index > 0 && value > floatArray[index - 1]) {
                floatArray[index] = floatArray[index - 1];
                
                index--;
            }
            
            floatArray[index] = value;
        }
    }
    /**
     * Sort the long array in descending order using this algorithm.
     *
     * @param longArray the array of longs that we want to sort
     */
    public static void sortDescending(long[] longArray) {
        int index = 0;
        long value = 0;
        
        for(int i = 1; i < longArray.length; i++) {
            index = i;
            value = longArray[index];
            
            while(index > 0 && value > longArray[index - 1]) {
                longArray[index] = longArray[index - 1];
                
                index--;
            }
            
            longArray[index] = value;
        }
    }
    /**
     * Sort the short array in descending order using this algorithm.
     *
     * @param shortArray the array of shorts that we want to sort
     */
    public static void sortDescending(short[] shortArray) {
        int index = 0;
        short value = 0;
        
        for(int i = 1; i < shortArray.length; i++) {
            index = i;
            value = shortArray[index];
            
            while(index > 0 && value > shortArray[index - 1]) {
                shortArray[index] = shortArray[index - 1];
                
                index--;
            }
            
            shortArray[index] = value;
        }
    }
}
