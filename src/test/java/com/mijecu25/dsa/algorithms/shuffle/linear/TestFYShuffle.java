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
 * @version 0.1.3.9
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
		int[] temp = new int[this.intArray1.length];
		
		// Make a copy of the random array to avoid pointing to the same memory reference
		System.arraycopy(this.intArray1, 0, temp, 0, this.intArray1.length);
		
		// Shuffle the new array
		FYShuffle.shuffle(this.intArray1);
		
		// Assert that the list1 was shuffled
		boolean shuffled = false;
		
		for(int i = 0; !shuffled && i < this.intArray1.length; i++) {
			shuffled = this.intArray1[i] != temp[i];
		}
		
		Assert.assertTrue(shuffled);
	}

	/**
     * Test shuffle doubles, floats
     */
    @Test 
    public void shuffle2() {        
        // Create a temp array
        double[] temp = new double[this.doubleArray1.length];
        
        // Make a copy of the random array to avoid pointing to the same memory reference
        System.arraycopy(this.doubleArray1, 0, temp, 0, this.doubleArray1.length);
        
        // Shuffle the new array
        FYShuffle.shuffle(this.doubleArray1);
        
        // Assert that the list1 was shuffled
        boolean shuffled = false;
        
        for(int i = 0; !shuffled && i < this.doubleArray1.length; i++) {
            shuffled = this.doubleArray1[i] != temp[i];
        }
        
        Assert.assertTrue(shuffled);
    }
    
    /**
     * Test list1 of elements
     */
    @Test
    public void shuffle3() {        
        // Create temp list1
        List<Integer> temp = new ArrayList<>();
        // Put all of the values in the list1
        temp.addAll(this.list1);
        
        // Shuffle the list1
        FYShuffle.shuffle(this.list1);
        
        // Assert that the list1 was shuffled
        boolean shuffled = false;
        
        for(int i = 0; !shuffled && i < this.list1.size(); i++) {
            shuffled = this.list1.get(i) != temp.get(i);
        }
        
        Assert.assertTrue(shuffled);
    }
    
    /**
     * Test elements
     */
    @Test
    public void shuffle4() {        
        // Create a temp array
        Integer[] temp = new Integer[this.integerArray1.length];
        
        // Make a copy of the random array to avoid pointing to the same memory reference
        System.arraycopy(this.integerArray1, 0, temp, 0, this.integerArray1.length);
        
        // Shuffle the list1
        FYShuffle.shuffle(this.integerArray1);
        
        // Assert that the list1 was shuffled
        boolean shuffled = false;
        
        for(int i = 0; !shuffled && i < this.integerArray1.length; i++) {
            shuffled = this.integerArray1[i] != temp[i];
        }
        
        Assert.assertTrue(shuffled);
    }
    
}
