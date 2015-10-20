package com.mijecu25.dsa.algorithms.shuffle.linear;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/**
 * This is the FYShuffle test class.
 * 
 * @author Miguel Velez
 * @version 0.1.3.4
 */
public class TestFYShuffle {
	
	@Before
	public void initialize() { ; }	
	
	/**
	 * Test shuffle of pritives excluding float and double.
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
     * Test shuffle
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
}
