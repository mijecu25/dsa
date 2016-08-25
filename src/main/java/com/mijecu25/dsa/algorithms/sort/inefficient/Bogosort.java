package com.mijecu25.dsa.algorithms.sort.inefficient;

import java.util.List;

import com.mijecu25.dsa.algorithms.shuffle.linear.FYShuffle;
import com.mijecu25.dsa.algorithms.sort.Sort;

/**
 * Ineffective sorting algorithm based on the generate and test paradigm. Keep
 * shuffling the list until it is sorted.
 * 
 * <br>
 * <br>
 * 
 * <i>Worst case performance: </i> Unbounded
 * <br>
 * <i>Best case performance: </i> O(n)
 * <br>
 * <i>Average case performance: </i> O((n+1)!) 
 * 
 * @author Miguel Velez - miguelvelezmj25
 * @version 0.2.0.2
 */
public final class Bogosort extends Sort {
	
	/**
	 * Don't let anyone instantiate this class
	 */
	private Bogosort() { ; }
	
    /**
     * Sort the array in ascending order using this algorithm.
     * 
     * @param <E> the type of elements in this array.
     * 
     * @param array the array that we want to sort
     */
    public static <E extends Comparable<E>> void sort(E[] array) {
        while(!Sort.isSorted(array)) {
            FYShuffle.shuffle(array);
        }
    }
        
    /**
     * Sort the list in ascending order using this algorithm.
     * 
     * @param <E> the type of elements in this list.
     * 
     * @param list the list that we want to sort
     */
    public static <E extends Comparable<E>> void sort(List<E> list) {
        while(!Sort.isSorted(list)) {
            FYShuffle.shuffle(list);
        }
    }
	
	/**
	 * Sort the int array in ascending order using this algorithm.
	 * 
	 * @param intArray the array of ints that we want to sort
	 */
	public static void sort(int[] intArray) {
		while(!Sort.isSorted(intArray)) {
			FYShuffle.shuffle(intArray);
		}
	}
	
	/**
	 * Sort the byte array in ascending order using this algorithm.
	 * 
	 * @param byteArray the array of bytes that we want to sort
	 */
	public static void sort(byte[] byteArray) {
		while(!Sort.isSorted(byteArray)) {
			FYShuffle.shuffle(byteArray);
		}
	}
	
	/**
	 * Sort the char array in ascending order using this algorithm.
	 *
	 * @param charArray the array of chars that we want to sort
	 */
	public static void sort(char[] charArray) {
		while(!Sort.isSorted(charArray)) {
			FYShuffle.shuffle(charArray);
		}
	}
	
	/**
	 * Sort the double array in ascending order using this algorithm.
	 * 
	 * @param doubleArray the array of double that we want to sort
	 */
	public static void sort(double[] doubleArray) {
		while(!Sort.isSorted(doubleArray)) {
			FYShuffle.shuffle(doubleArray);
		}
	}
	
	/**
	 * Sort the float array in ascending order using this algorithm.
	 * 
	 * @param floatArray the array of float that we want to sort
	 */
	public static void sort(float[] floatArray) {
		while(!Sort.isSorted(floatArray)) {
			FYShuffle.shuffle(floatArray);
		}
	}
	
	/**
	 * Sort the long array in ascending order using this algorithm.
	 * 
	 * @param longArray the array of longs that we want to sort
	 */
	public static void sort(long[] longArray) {
		while(!Sort.isSorted(longArray)) {
			FYShuffle.shuffle(longArray);
		}
	}
	
	/**
	 * Sort the short array in ascending order using this algorithm.
	 * 
	 * @param shortArray the array of shorts that we want to sort
	 */
	public static void sort(short[] shortArray) {
		while(!Sort.isSorted(shortArray)) {
			FYShuffle.shuffle(shortArray);
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
        while(!Sort.isReverseSorted(array)) {
            FYShuffle.shuffle(array);
        }
    }
    
    /**
     * Sort the list in descending order using this algorithm.
     * 
     * @param <E> the type of elements in this list.
     * 
     * @param list the list that we want to sort
     */
    public static <E extends Comparable<E>> void sortDescending(List<E> list) {
        while(!Sort.isReverseSorted(list)) {
            FYShuffle.shuffle(list);
        }
    }
    
	/**
	 * Sort the int array in descending order using this algorithm.
	 *
	 * @param intArray the array of ints that we want to sort
	 */
	public static void sortDescending(int[] intArray) {
		while(!Sort.isReverseSorted(intArray)) {
			FYShuffle.shuffle(intArray);
		}
	}
	/**
	 * Sort the byte array in descending order using this algorithm.
	 *
	 * @param byteArray the array of bytes that we want to sort
	 */
	public static void sortDescending(byte[] byteArray) {
		while(!Sort.isReverseSorted(byteArray)) {
			FYShuffle.shuffle(byteArray);
		}
	}
	/**
	 * Sort the char array in descending order using this algorithm.
	 *
	 * @param charArray the array of chars that we want to sort
	 */
	public static void sortDescending(char[] charArray) {
		while(!Sort.isReverseSorted(charArray)) {
			FYShuffle.shuffle(charArray);
		}
	}
	/**
	 * Sort the double array in descending order using this algorithm.
	 *
	 * @param doubleArray the array of double that we want to sort
	 */
	public static void sortDescending(double[] doubleArray) {
		while(!Sort.isReverseSorted(doubleArray)) {
			FYShuffle.shuffle(doubleArray);
		}
	}
	/**
	 * Sort the float array in descending order using this algorithm.
	 *
	 * @param floatArray the array of float that we want to sort
	 */
	public static void sortDescending(float[] floatArray) {
		while(!Sort.isReverseSorted(floatArray)) {
			FYShuffle.shuffle(floatArray);
		}
	}
	/**
	 * Sort the long array in descending order using this algorithm.
	 *
	 * @param longArray the array of longs that we want to sort
	 */
	public static void sortDescending(long[] longArray) {
		while(!Sort.isReverseSorted(longArray)) {
			FYShuffle.shuffle(longArray);
		}
	}
	/**
	 * Sort the short array in descending order using this algorithm.
	 *
	 * @param shortArray the array of shorts that we want to sort
	 */
	public static void sortDescending(short[] shortArray) {
		while(!Sort.isReverseSorted(shortArray)) {
			FYShuffle.shuffle(shortArray);
		}
	}
			
}
