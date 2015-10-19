package com.mijecu25.dsa.algorithms.shuffle.linear;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import com.mijecu25.dsa.algorithms.shuffle.linear.FYShuffle;
import com.mijecu25.dsa.algorithms.sort.Sort;

/**
 * This is the FYShuffle test class.
 * 
 * @author Miguel Velez
 * @version 0.1.3.2
 */
public class TestFYShuffle {
	
	@Before
	public void initialize() {
		;
	}	
	
	/**
	 * Test shuffle
	 */
	@Test 
	public void shuffle() {
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

	// TODO add tests for Object/float/double
}
