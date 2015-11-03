package com.mijecu25.dsa.algorithms.search;

import java.util.ArrayList;
import java.util.List;

import org.junit.Before;
import org.junit.Rule;
import org.junit.rules.ExpectedException;

/**
 * Test for Search class.
 * 
 * @author Miguel Velez - miguelvelezmj25
 * @version 0.1.3.4
 */
public class TestSearch {
    protected Integer[]     integerArray = {1, 2, 3, 4, 1, 3, 4};
    protected List<Integer> list = new ArrayList<>();
    protected int[]         intArray = { 1, 5, 3, 8, 14, 5, 1, 7, 10};
    
    @Rule
    public ExpectedException exception = ExpectedException.none();

    @Before
    public void initialize() { 
        list.add(4);
        list.add(3);
        list.add(1);
        list.add(9);
        list.add(3);
        list.add(1);        
    }   
    
}
