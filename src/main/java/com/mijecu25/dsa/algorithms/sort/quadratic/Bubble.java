package com.mijecu25.dsa.algorithms.sort.quadratic;

import java.util.List;

import com.mijecu25.dsa.algorithms.sort.Sort;
import com.mijecu25.dsa.algorithms.swap.TrivialSwap;

/**
 * Quadratic sorting algorithm. It loops through the array swaping pairs of elements that are
 * not in the correct position. This algorithm is stable and in place. For small collections,
 * this algorithm is more efficient that other asymptotically faster algorithms.
 * 
 * <br>
 * <br>
 * 
 * <i>Worst case performance: </i> O(n<sup>2</sup>)
 * <br>
 * <i>Best case performance: </i> O(n)
 * <br>
 * <i>Average case performance: </i> O(n<sup>2</sup>)
 * 
 * @author Miguel Velez - miguelvelezmj25
 * @version 0.2.0.2
 */
public final class Bubble extends Sort {
    /**
     * Don't let anyone instantiate this class
     */
    private Bubble() { ; }
    
    /**
     * Sort the array in ascending order using this algorithm.
     * 
     * @param <E> the type of elements in this array.
     * 
     * @param array the array that we want to sort
     */
    public static <E extends Comparable<E>> void sort(E[] array) {
        boolean swapped = true;
        
        while(swapped) {
            swapped = false;
            
            for(int i = 0; i < (array.length - 1 ); i++) {
                if(array[i].compareTo(array[i + 1]) > 0) {
                    TrivialSwap.swap(array, i, i + 1);
                    
                    swapped = true;
                }
            }            
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
        boolean swapped = true;
        
        while(swapped) {
            swapped = false;
            
            for(int i = 0; i < (list.size() - 1); i++) {
                if(list.get(i).compareTo(list.get(i + 1)) > 0) {
                    TrivialSwap.swap(list, i, i + 1);
                    
                    swapped = true;
                }
            }            
        }
    }
    
    /**
     * Sort the int array in ascending order using this algorithm.
     * 
     * @param intArray the array of ints that we want to sort
     */
    public static void sort(int[] intArray) {
        boolean swapped = true;
        
        while(swapped) {
            swapped = false;
            
            for(int i = 0; i < (intArray.length - 1 ); i++) {
                if(intArray[i] > intArray[i + 1]) {
                    TrivialSwap.swap(intArray, i, i + 1);
                    
                    swapped = true;
                }
            }            
        }
    }
    
    /**
     * Sort the byte array in ascending order using this algorithm.
     * 
     * @param byteArray the array of bytes that we want to sort
     */
    public static void sort(byte[] byteArray) {
        boolean swapped = true;
        
        while(swapped) {
            swapped = false;
            
            for(int i = 0; i < (byteArray.length - 1 ); i++) {
                if(byteArray[i] > byteArray[i + 1]) {
                    TrivialSwap.swap(byteArray, i, i + 1);
                    
                    swapped = true;
                }
            }            
        }
    }
    
    /**
     * Sort the char array in ascending order using this algorithm.
     *
     * @param charArray the array of chars that we want to sort
     */
    public static void sort(char[] charArray) {
        boolean swapped = true;
        
        while(swapped) {
            swapped = false;
            
            for(int i = 0; i < (charArray.length - 1 ); i++) {
                if(charArray[i] > charArray[i + 1]) {
                    TrivialSwap.swap(charArray, i, i + 1);
                    
                    swapped = true;
                }
            }            
        }
    }
    
    /**
     * Sort the double array in ascending order using this algorithm.
     * 
     * @param doubleArray the array of double that we want to sort
     */
    public static void sort(double[] doubleArray) {
        boolean swapped = true;
        
        while(swapped) {
            swapped = false;
            
            for(int i = 0; i < (doubleArray.length - 1 ); i++) {
                if(doubleArray[i] > doubleArray[i + 1]) {
                    TrivialSwap.swap(doubleArray, i, i + 1);
                    
                    swapped = true;
                }
            }            
        }
    }
    
    /**
     * Sort the float array in ascending order using this algorithm.
     * 
     * @param floatArray the array of float that we want to sort
     */
    public static void sort(float[] floatArray) {
        boolean swapped = true;
        
        while(swapped) {
            swapped = false;
            
            for(int i = 0; i < (floatArray.length - 1 ); i++) {
                if(floatArray[i] > floatArray[i + 1]) {
                    TrivialSwap.swap(floatArray, i, i + 1);
                    
                    swapped = true;
                }
            }            
        }
    }
    
    /**
     * Sort the long array in ascending order using this algorithm.
     * 
     * @param longArray the array of longs that we want to sort
     */
    public static void sort(long[] longArray) {
        boolean swapped = true;
        
        while(swapped) {
            swapped = false;
            
            for(int i = 0; i < (longArray.length - 1 ); i++) {
                if(longArray[i] > longArray[i + 1]) {
                    TrivialSwap.swap(longArray, i, i + 1);
                    
                    swapped = true;
                }
            }            
        }
    }
    
    /**
     * Sort the short array in ascending order using this algorithm.
     * 
     * @param shortArray the array of shorts that we want to sort
     */
    public static void sort(short[] shortArray) {
        boolean swapped = true;
        
        while(swapped) {
            swapped = false;
            
            for(int i = 0; i < (shortArray.length - 1 ); i++) {
                if(shortArray[i] > shortArray[i + 1]) {
                    TrivialSwap.swap(shortArray, i, i + 1);
                    
                    swapped = true;
                }
            }            
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
        boolean swapped = true;
        
        while(swapped) {
            swapped = false;
            
            for(int i = 0; i < (array.length - 1 ); i++) {
                if(array[i].compareTo(array[i + 1]) < 0) {
                    TrivialSwap.swap(array, i, i + 1);
                    
                    swapped = true;
                }
            }            
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
        boolean swapped = true;
        
        while(swapped) {
            swapped = false;
            
            for(int i = 0; i < (list.size() - 1); i++) {
                if(list.get(i).compareTo(list.get(i + 1)) < 0) {
                    TrivialSwap.swap(list, i, i + 1);
                    
                    swapped = true;
                }
            }            
        }
    }
    
    /**
     * Sort the int array in descending order using this algorithm.
     *
     * @param intArray the array of ints that we want to sort
     */
    public static void sortDescending(int[] intArray) {
        boolean swapped = true;
        
        while(swapped) {
            swapped = false;
            
            for(int i = 0; i < (intArray.length - 1 ); i++) {
                if(intArray[i] < intArray[i + 1]) {
                    TrivialSwap.swap(intArray, i, i + 1);
                    
                    swapped = true;
                }
            }            
        }
    }
    /**
     * Sort the byte array in descending order using this algorithm.
     *
     * @param byteArray the array of bytes that we want to sort
     */
    public static void sortDescending(byte[] byteArray) {
        boolean swapped = true;
        
        while(swapped) {
            swapped = false;
            
            for(int i = 0; i < (byteArray.length - 1 ); i++) {
                if(byteArray[i] < byteArray[i + 1]) {
                    TrivialSwap.swap(byteArray, i, i + 1);
                    
                    swapped = true;
                }
            }            
        }
    }
    /**
     * Sort the char array in descending order using this algorithm.
     *
     * @param charArray the array of chars that we want to sort
     */
    public static void sortDescending(char[] charArray) {
        boolean swapped = true;
        
        while(swapped) {
            swapped = false;
            
            for(int i = 0; i < (charArray.length - 1 ); i++) {
                if(charArray[i] < charArray[i + 1]) {
                    TrivialSwap.swap(charArray, i, i + 1);
                    
                    swapped = true;
                }
            }            
        }
    }
    /**
     * Sort the double array in descending order using this algorithm.
     *
     * @param doubleArray the array of double that we want to sort
     */
    public static void sortDescending(double[] doubleArray) {
        boolean swapped = true;
        
        while(swapped) {
            swapped = false;
            
            for(int i = 0; i < (doubleArray.length - 1 ); i++) {
                if(doubleArray[i] < doubleArray[i + 1]) {
                    TrivialSwap.swap(doubleArray, i, i + 1);
                    
                    swapped = true;
                }
            }            
        }
    }
    /**
     * Sort the float array in descending order using this algorithm.
     *
     * @param floatArray the array of float that we want to sort
     */
    public static void sortDescending(float[] floatArray) {
        boolean swapped = true;
        
        while(swapped) {
            swapped = false;
            
            for(int i = 0; i < (floatArray.length - 1 ); i++) {
                if(floatArray[i] < floatArray[i + 1]) {
                    TrivialSwap.swap(floatArray, i, i + 1);
                    
                    swapped = true;
                }
            }            
        }
    }
    /**
     * Sort the long array in descending order using this algorithm.
     *
     * @param longArray the array of longs that we want to sort
     */
    public static void sortDescending(long[] longArray) {
        boolean swapped = true;
        
        while(swapped) {
            swapped = false;
            
            for(int i = 0; i < (longArray.length - 1 ); i++) {
                if(longArray[i] < longArray[i + 1]) {
                    TrivialSwap.swap(longArray, i, i + 1);
                    
                    swapped = true;
                }
            }            
        }
    }
    /**
     * Sort the short array in descending order using this algorithm.
     *
     * @param shortArray the array of shorts that we want to sort
     */
    public static void sortDescending(short[] shortArray) {
        boolean swapped = true;
        
        while(swapped) {
            swapped = false;
            
            for(int i = 0; i < (shortArray.length - 1 ); i++) {
                if(shortArray[i] < shortArray[i + 1]) {
                    TrivialSwap.swap(shortArray, i, i + 1);
                    
                    swapped = true;
                }
            }            
        }
    }
    
}
