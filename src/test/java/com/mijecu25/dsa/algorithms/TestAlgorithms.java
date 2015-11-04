package com.mijecu25.dsa.algorithms;

import java.util.ArrayList;
import java.util.List;

import org.junit.Before;
import org.junit.Rule;
import org.junit.rules.ExpectedException;

/**
 * Test for Algorithm classes.
 * 
 * @author Miguel Velez - miguelvelezmj25
 * @version 0.1.3.2
 */
public class TestAlgorithms {

    protected Integer[]         integerArray1 = {1, 2, 3, 4, 1, 3, 4};
    protected Integer[]         integerArray2 = {5, 8, 7, 6};
    protected int[]             intArray1 = {1, 5, 3, 8, 14, 5, 1, 7, 10};
    protected int[]             intArray2 = {5, 8, 7, 6, 9, 8};
    protected double[]          doubleArray1 = {2.2,4.5,23.4,3.2,23.0,12.8,12.98,5.45,23.5};
    protected List<Integer>     list1 = new ArrayList<>();
    protected List<Integer>     list2 = new ArrayList<>();
    
    @Rule
    public ExpectedException exception = ExpectedException.none();
    
    @Before
    public void initialize() { 
        this.list1.add(1);
        this.list1.add(2);
        this.list1.add(3);
        this.list1.add(9);
        this.list1.add(4);
        this.list1.add(1);
        this.list1.add(3);
        this.list1.add(9);
        
        this.list2.add(5);
        this.list2.add(6);
        this.list2.add(7);
        this.list2.add(6);
        this.list2.add(9);
        this.list2.add(4);
        this.list2.add(8);   
    }   
    
}
