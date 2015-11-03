package com.mijecu25.dsa.algorithms.shuffle.linear;

import java.util.ArrayList;
import java.util.List;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import com.mijecu25.dsa.algorithms.shuffle.TestShuffle;

/**
 * This is the FYShuffle test class.
 * 
 * @author Miguel Velez - miguelvelezmj25
 * @version 0.1.3.8
 */
public class TestFYShuffle extends TestShuffle {

	@Before
	public void initialize() { 
	    super.initialize(); 
    }	
	
	/**
	 * Test shuffle of primitives excluding float and double.
	 */
	@Test 
	public void shuffle1() {		
		// Create a temp array
		int[] temp = new int[this.intArray.length];
		
		// Make a copy of the random array to avoid pointing to the same memory reference
		System.arraycopy(this.intArray, 0, temp, 0, this.intArray.length);
		
		// Shuffle the new array
		FYShuffle.shuffle(this.intArray);
		
		// Assert that the list was shuffled
		boolean shuffled = false;
		
		for(int i = 0; !shuffled && i < this.intArray.length; i++) {
			shuffled = this.intArray[i] != temp[i];
		}
		
		Assert.assertTrue(shuffled);
	}

	/**
     * Test shuffle doubles, floats
     */
    @Test 
    public void shuffle2() {        
        // Create a temp array
        double[] temp = new double[this.doubleArray.length];
        
        // Make a copy of the random array to avoid pointing to the same memory reference
        System.arraycopy(this.doubleArray, 0, temp, 0, this.doubleArray.length);
        
        // Shuffle the new array
        FYShuffle.shuffle(this.doubleArray);
        
        // Assert that the list was shuffled
        boolean shuffled = false;
        
        for(int i = 0; !shuffled && i < this.doubleArray.length; i++) {
            shuffled = this.doubleArray[i] != temp[i];
        }
        
        Assert.assertTrue(shuffled);
    }
    
    /**
     * Test list of elements
     */
    @Test
    public void shuffle3() {        
        // Create temp list
        List<String> temp = new ArrayList<>();
        // Put all of the values in the list
        temp.addAll(this.list);
        
        // Shuffle the list
        FYShuffle.shuffle(this.list);
        
        // Assert that the list was shuffled
        boolean shuffled = false;
        
        for(int i = 0; !shuffled && i < this.list.size(); i++) {
            shuffled = this.list.get(i) != temp.get(i);
        }
        
        Assert.assertTrue(shuffled);
    }
    
    /**
     * Test elements
     */
    @Test
    public void shuffle4() {        
        // Create a temp array
        Integer[] temp = new Integer[this.integerArray.length];
        
        // Make a copy of the random array to avoid pointing to the same memory reference
        System.arraycopy(this.integerArray, 0, temp, 0, this.integerArray.length);
        
        // Shuffle the list
        FYShuffle.shuffle(this.integerArray);
        
        // Assert that the list was shuffled
        boolean shuffled = false;
        
        for(int i = 0; !shuffled && i < this.integerArray.length; i++) {
            shuffled = this.integerArray[i] != temp[i];
        }
        
        Assert.assertTrue(shuffled);
    }
    
}
