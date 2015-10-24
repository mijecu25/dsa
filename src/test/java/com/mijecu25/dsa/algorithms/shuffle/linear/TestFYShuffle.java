package com.mijecu25.dsa.algorithms.shuffle.linear;

import java.util.ArrayList;
import java.util.List;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/**
 * This is the FYShuffle test class.
 * 
 * @author Miguel Velez
 * @version 0.1.3.6
 */
public class TestFYShuffle {

	@Before
	public void initialize() { ; }	
	
	/**
	 * Test shuffle of primitives excluding float and double.
	 */
	@Test 
	public void shuffle1() {
		// Create a new array
		int[] random = {2,4,23,3,23,12,12,5,23,6,4,96,68,34,6,4};
		
		// Create a temp array
		int[] temp = new int[random.length];
		
		// Make a copy of the random array to avoid pointing to the same memory reference
		System.arraycopy(random, 0, temp, 0, random.length);
		
		// Shuffle the new array
		FYShuffle.shuffle(random);
		
		// Assert that the list was shuffled
		boolean shuffled = false;
		
		for(int i = 0; !shuffled && i < random.length; i++) {
			shuffled = random[i] != temp[i];
		}
		
		Assert.assertTrue(shuffled);
	}

	/**
     * Test shuffle doubles, floats
     */
    @Test 
    public void shuffle2() {
        // Create a new array
        double[] random = {2.2,4.5,23.4,3.2,23.0,12.8,12.98,5.45,23.5};
        
        // Create a temp array
        double[] temp = new double[random.length];
        
        // Make a copy of the random array to avoid pointing to the same memory reference
        System.arraycopy(random, 0, temp, 0, random.length);
        
        // Shuffle the new array
        FYShuffle.shuffle(random);
        
        // Assert that the list was shuffled
        boolean shuffled = false;
        
        for(int i = 0; !shuffled && i < random.length; i++) {
            shuffled = random[i] != temp[i];
        }
        
        Assert.assertTrue(shuffled);
    }
    
    /**
     * Test list of elements
     */
    @Test
    public void shuffle3() {
        // Create list
        List<String> list = new ArrayList<>();
        
        list.add("a");
        list.add("b");
        list.add("c");
        list.add("d");
        list.add("e");
        list.add("f");
        
        // Create temp list
        List<String> temp = new ArrayList<>();
        // Put all of the values in the list
        temp.addAll(list);
        
        // Shuffle the list
        FYShuffle.shuffle(list);
        
        // Assert that the list was shuffled
        boolean shuffled = false;
        
        for(int i = 0; !shuffled && i < list.size(); i++) {
            shuffled = list.get(i) != temp.get(i);
        }
        
        Assert.assertTrue(shuffled);
    }
    
}
