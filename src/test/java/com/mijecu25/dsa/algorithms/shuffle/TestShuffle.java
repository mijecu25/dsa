package com.mijecu25.dsa.algorithms.shuffle;

import java.util.ArrayList;
import java.util.List;

import org.junit.Before;

/**
 * Test for Shuffle class.
 * 
 * @author Miguel Velez - miguelvelezmj25
 * @version 0.1.3.4
 */
public class TestShuffle {

    protected int[]         intArray = {2,4,23,3,23,12,12,5,23,6,4,96,68,34,6,4};
    protected double[]      doubleArray = {2.2,4.5,23.4,3.2,23.0,12.8,12.98,5.45,23.5};
    protected List<String>  list = new ArrayList<>();
    protected Integer[]     integerArray = {1, 2, 3, 4, 1, 3, 4};
        
    @Before
    public void initialize() { 
        this.list.add("a");
        this.list.add("b");
        this.list.add("c");
        this.list.add("d");
        this.list.add("e");
        this.list.add("f");
    }
    
}
