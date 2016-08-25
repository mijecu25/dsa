package com.mijecu25.dsa.algorithms.sort;

import java.util.List;

/**
 * Sort class that implements different algorithms and utilities
 * for sorting.
 * 
 * @author Miguel Velez - miguelvelezmj25
 * @version 0.2.0.2
 */
public abstract class Sort {
    
    /**
     * Check if the array is sorted. It loops through the entire
     * array once, checking that the elements are sorted.
     * 
     * <br>
     * <br>
     * 
     * <i>Runtime: </i> O(n)
     * 
     * @param <E> the type of elements in this array.
     * 
     * @param array the array to check
     * @return <i>true</i> if the array is sorted, else <i>false</i>.
     */
    public static <E extends Comparable<E>> boolean isSorted(E[] array) {
        for(int i = 0; i < array.length - 1 ; i++) { 
            if(array[i].compareTo(array[i + 1]) > 0) {
                return false;
            }
            
        }
		
        return true;
    }
    
    /**
     * Check if the list is sorted. It loops through the entire
     * list once, checking that the elements are sorted.
     * 
     * <br>
     * <br>
     * 
     * <i>Runtime: </i> O(n)
     * 
     * @param <E> the type of elements in this list.
     * 
     * @param list the list to check
     * @return <i>true</i> if the list is sorted, else <i>false</i>.
     */
    public static <E extends Comparable<E>> boolean isSorted(List<E> list) {
        for(int i = 0; i < list.size() - 1; i++) {           
            if(list.get(i).compareTo(list.get(i + 1)) > 0) {
                return false;
            }
            
        }
        
        return true;
    }
    
	/**
	 * Check if the integer array is sorted. It loops through the entire integer
	 * array once, checking that the elements are sorted.
	 * 
	 * <br>
	 * <br>
	 * 
	 * <i>Runtime: </i> O(n)
	 * 
	 * @param intArray the integer array to check
	 * 
	 * @return <i>true</i> if the integer array is sorted, else <i>false</i>.
	 */
	public static boolean isSorted(int[] intArray) {
		for(int i = 0; i < intArray.length - 1 ; i++) {			
			if(intArray[i] > intArray [i + 1]) {
				return false;
			}
			
		}
		
		return true;
	}
	
	 /**
     * Check if the array is reverse sorted. It loops through the entire
     * array once, checking that the elements are reverse sorted.
     * 
     * <br>
     * <br>
     * 
     * <i>Runtime: </i> O(n)
     * 
     * @param <E> the type of elements in this array.
     * 
     * @param array the array to check
     * @return <i>true</i> if the array is reverse sorted, else <i>false</i>.
     */
    public static <E extends Comparable<E>> boolean isReverseSorted(E[] array) {
        for(int i = 0; i < array.length - 1 ; i++) {           
            if(array[i].compareTo(array[i + 1]) < 0) {
                return false;
            }
            
        }
        
        return true;
    }
    
    /**
     * Check if the list is reverse sorted. It loops through the entire
     * list once, checking that the elements are reverse sorted.
     * 
     * <br>
     * <br>
     * 
     * <i>Runtime: </i> O(n)
     * 
     * @param <E> the type of elements in this list.
     * 
     * @param list the list to check
     * @return <i>true</i> if the list is reverse sorted, else <i>false</i>.
     */
    public static <E extends Comparable<E>> boolean isReverseSorted(List<E> list) {
        for(int i = 0; i < list.size() - 1; i++) {           
            if(list.get(i).compareTo(list.get(i + 1)) < 0) {
                return false;
            }
            
        }
        
        return true;
    }
	
	/**
	 * Check if the integer array is reverse sorted. It loops through the entire integer
	 * array once, checking that the elements are reverse sorted.
	 * 
	 * <br>
	 * <br>
	 * 
	 * <i>Runtime: </i> O(n)
	 * 
	 * @param intArray the integer array to check
	 * 
	 * @return <i>true</i> if the integer array is reverse sorted, else <i>false</i>.
	 */
	public static boolean isReverseSorted(int[] intArray) {
		for(int i = 0; i < intArray.length - 1 ; i++) {
			if(intArray[i] < intArray [i + 1]) {
				return false;
			}
			
		}
		
		return true;
	}
	
	/**
	 * Check if the byte array is sorted. It loops through the entire byte
	 * array once, checking that the elements are sorted.
	 * 
	 * <br>
	 * <br>
	 * 
	 * <i>Runtime: </i> O(n)
	 * 
	 * @param byteArray the byte array to check
	 * 
	 * @return <i>true</i> if the byte array is sorted, else <i>false</i>.
	 */
	public static boolean isSorted(byte[] byteArray) {
		for(int i = 0; i < byteArray.length - 1 ; i++) {			
			if(byteArray[i] > byteArray [i + 1]) {
				return false;
			}
			
		}		
		return true;
	}
	
	/**
	 * Check if the byte array is reverse sorted. It loops through the entire byte
	 * array once, checking that the elements are reverse sorted.
	 * 
	 * <br>
	 * <br>
	 * 
	 * <i>Runtime: </i> O(n)
	 * 
	 * @param byteArray the byte array to check
	 * 
	 * @return <i>true</i> if the byte array is reverse sorted, else <i>false</i>.
	 */
	public static boolean isReverseSorted(byte[] byteArray) {
		for(int i = 0; i < byteArray.length - 1 ; i++) {
			if(byteArray[i] < byteArray [i + 1]) {
				return false;
			}
			
		}		
		return true;
	}
	
	/**
	 * Check if the char array is sorted. It loops through the entire char
	 * array once, checking that the elements are sorted.
	 * 
	 * <br>
	 * <br>
	 * 
	 * <i>Runtime: </i> O(n)
	 * 
	 * @param charArray the char array to check
	 * 
	 * @return <i>true</i> if the char array is sorted, else <i>false</i>.
	 */
	public static boolean isSorted(char[] charArray) {
		for(int i = 0; i < charArray.length - 1 ; i++) {
			
			if(charArray[i] > charArray [i + 1]) {
				return false;
			}
			
		}
		
		return true;
	}
	
	/**
	 * Check if the char array is reverse sorted. It loops through the entire char
	 * array once, checking that the elements are reverse sorted.
	 * 
	 * <br>
	 * <br>
	 * 
	 * <i>Runtime: </i> O(n)
	 * 
	 * @param charArray the char array to check
	 * 
	 * @return <i>true</i> if the char array is reverse sorted, else <i>false</i>.
	 */
	public static boolean isReverseSorted(char[] charArray) {
		
		for(int i = 0; i < charArray.length - 1 ; i++) {
			if(charArray[i] < charArray [i + 1]) {
				return false;
			}
			
		}
		
		return true;
	}
	
	/**
	 * Check if the double array is sorted. It loops through the entire double
	 * array once, checking that the elements are sorted.
	 * 
	 * <br>
	 * <br>
	 * 
	 * <i>Runtime: </i> O(n)
	 * 
	 * @param doubleArray the double array to check
	 * 
	 * @return <i>true</i> if the double array is sorted, else <i>false</i>.
	 */
	public static boolean isSorted(double[] doubleArray) {
		for(int i = 0; i < doubleArray.length - 1 ; i++) {
			
			if(doubleArray[i] > doubleArray [i + 1]) {
				return false;
			}
			
		}
		
		return true;
	}
	
	/**
	 * Check if the double array is reverse sorted. It loops through the entire double
	 * array once, checking that the elements are reverse sorted.
	 * 
	 * <br>
	 * <br>
	 * 
	 * <i>Runtime: </i> O(n)
	 * 
	 * @param doubleArray the double array to check
	 * 
	 * @return <i>true</i> if the double array is reverse sorted, else <i>false</i>.
	 */
	public static boolean isReverseSorted(double[] doubleArray) {
		
		for(int i = 0; i < doubleArray.length - 1 ; i++) {
			if(doubleArray[i] < doubleArray [i + 1]) {
				return false;
			}
			
		}
		
		return true;
	}
	
	/**
	 * Check if the float array is sorted. It loops through the entire float
	 * array once, checking that the elements are sorted.
	 * 
	 * <br>
	 * <br>
	 * 
	 * <i>Runtime: </i> O(n)
	 * 
	 * @param floatArray the float array to check
	 * 
	 * @return <i>true</i> if the float array is sorted, else <i>false</i>.
	 */
	public static boolean isSorted(float[] floatArray) {
		for(int i = 0; i < floatArray.length - 1 ; i++) {
			
			if(floatArray[i] > floatArray [i + 1]) {
				return false;
			}
			
		}
		
		return true;
	}
	
	/**
	 * Check if the float array is reverse sorted. It loops through the entire float
	 * array once, checking that the elements are reverse sorted.
	 * 
	 * <br>
	 * <br>
	 * 
	 * <i>Runtime: </i> O(n)
	 * 
	 * @param floatArray the float array to check
	 * 
	 * @return <i>true</i> if the float array is reverse sorted, else <i>false</i>.
	 */
	public static boolean isReverseSorted(float[] floatArray) {
		
		for(int i = 0; i < floatArray.length - 1 ; i++) {
			if(floatArray[i] < floatArray [i + 1]) {
				return false;
			}
			
		}
		
		return true;
	}
	
	/**
	 * Check if the long array is sorted. It loops through the entire long
	 * array once, checking that the elements are sorted.
	 * 
	 * <br>
	 * <br>
	 * 
	 * <i>Runtime: </i> O(n)
	 * 
	 * @param longArray the long array to check
	 * 
	 * @return <i>true</i> if the long array is sorted, else <i>false</i>.
	 */
	public static boolean isSorted(long[] longArray) {
		for(int i = 0; i < longArray.length - 1 ; i++) {
			
			if(longArray[i] > longArray [i + 1]) {
				return false;
			}
			
		}
		
		return true;
	}
	
	/**
	 * Check if the long array is reverse sorted. It loops through the entire long
	 * array once, checking that the elements are reverse sorted.
	 * 
	 * <br>
	 * <br>
	 * 
	 * <i>Runtime: </i> O(n)
	 * 
	 * @param longArray the long array to check
	 * 
	 * @return <i>true</i> if the long array is reverse sorted, else <i>false</i>.
	 */
	public static boolean isReverseSorted(long[] longArray) {
		
		for(int i = 0; i < longArray.length - 1 ; i++) {
			if(longArray[i] < longArray [i + 1]) {
				return false;
			}
			
		}
		
		return true;
	}
	
	/**
	 * Check if the short array is sorted. It loops through the entire short
	 * array once, checking that the elements are sorted.
	 * 
	 * <br>
	 * <br>
	 * 
	 * <i>Runtime: </i> O(n)
	 * 
	 * @param shortArray the short array to check
	 * 
	 * @return <i>true</i> if the short array is sorted, else <i>false</i>.
	 */
	public static boolean isSorted(short[] shortArray) {
		for(int i = 0; i < shortArray.length - 1 ; i++) {
			
			if(shortArray[i] > shortArray [i + 1]) {
				return false;
			}
			
		}
		
		return true;
	}
	
	/**
	 * Check if the short array is reverse sorted. It loops through the entire short
	 * array once, checking that the elements are reverse sorted.
	 * 
	 * <br>
	 * <br>
	 * 
	 * <i>Runtime: </i> O(n)
	 * 
	 * @param shortArray the short array to check
	 * 
	 * @return <i>true</i> if the short array is reverse sorted, else <i>false</i>.
	 */
	public static boolean isReverseSorted(short[] shortArray) {
		
		for(int i = 0; i < shortArray.length - 1 ; i++) {
			if(shortArray[i] < shortArray [i + 1]) {
				return false;
			}
			
		}
		
		return true;
	}
}
