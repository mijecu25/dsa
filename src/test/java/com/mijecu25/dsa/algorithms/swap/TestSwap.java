package com.mijecu25.dsa.algorithms.swap;

import java.util.ArrayList;
import java.util.List;

import org.junit.Before;

/**
 * Test for Swap class.
 * 
 * @author Miguel Velez - miguelvelezmj25
 * @version 0.1.3.4
 */
public class TestSwap {
    
    protected Integer[]         integerArray1 = {1, 2, 3, 4};
    protected Integer[]         integerArray2 = {5, 6, 7, 8};
    protected int[]             intArray1 = {1, 2, 3, 4};
    protected int[]             intArray2 = {5, 6, 7, 8};
    protected List<Integer>     list1 = new ArrayList<>();
    protected List<Integer>     list2 = new ArrayList<>();
    
    @Before
    public void initialize() { 
        this.list1.add(1);
        this.list1.add(2);
        this.list1.add(3);
        this.list1.add(4);
        this.list2.add(5);
        this.list2.add(6);
        this.list2.add(7);
        this.list2.add(8);   
    }   

}
