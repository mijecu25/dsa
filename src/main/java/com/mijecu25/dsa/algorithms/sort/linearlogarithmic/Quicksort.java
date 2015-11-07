package com.mijecu25.dsa.algorithms.sort.linearlogarithmic;

import com.mijecu25.dsa.algorithms.sort.Sort;

/**
 * Linear logarithmic sorting algorithm. This recursive algorithm partitions the collection into
 * two sub collections around a pivot. The pivot is chosen to be the middle of the collection.
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
 * The implementation of this algorithm chooses the pivot to be the middle of the collection to avoid
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
 * @version 0.1.3.1
 */
public class Quicksort extends Sort {

}
