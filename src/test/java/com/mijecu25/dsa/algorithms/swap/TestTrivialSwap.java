package com.mijecu25.dsa.algorithms.swap;

import java.util.ArrayList;
import java.util.List;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/**
 * Test for TrivialSwap class.
 * 
 * @author Miguel Velez - miguelvelezmj25
 * @version 0.2.0.2
 */
public class TestTrivialSwap extends TestSwap {
	
	@Before
	public void initialize() { 
	    super.initialize();
	}	
	/**
	 * Test swap(E[] array1, int array1Index, E[] array2, int array2Index)
	 */
	@Test 
	public void swap1() {
		int a = this.integerArray1[0];
		int b = this.integerArray2[1];
		
		TrivialSwap.swap(this.integerArray1, 0, this.integerArray2, 1);
		
		Assert.assertTrue(this.integerArray1[0] == b);
		Assert.assertTrue(this.integerArray2[1] == a);
	}
	
	/**
	 * Test swap(E[] array1, E[] array2, int index)
	 */
	@Test
	public void swap2() {
		int a = this.integerArray1[2];
		int b = this.integerArray2[2];
		
		TrivialSwap.swap(this.integerArray1, this.integerArray2, 2);
		
		Assert.assertTrue(this.integerArray1[2] == b);
		Assert.assertTrue(this.integerArray2[2] == a);	
	}
	
	/**
	 * Test swap(E[] array1, E[] array2)
	 */
	@Test
	public void swap3() {
		Integer[] a = new Integer[this.integerArray1.length];
		System.arraycopy(this.integerArray1, 0, a, 0, this.integerArray1.length);
		Integer[] b = new Integer[this.integerArray2.length];
		System.arraycopy(this.integerArray2, 0, b, 0, this.integerArray2.length);
		
		TrivialSwap.swap(this.integerArray1, this.integerArray2);
		
		for(int i = 0; i < Math.min(this.integerArray1.length, this.integerArray2.length); i++) {
			Assert.assertTrue(this.integerArray1[i] == b[i]);
			Assert.assertTrue(this.integerArray2[i] == a[i]);			
		}
				
	}
	
	/**
	 * Test void swap(E[] array, int index1, int index2)
	 */
	@Test
	public void swap7() {
        int a = this.integerArray1[this.integerArray1.length-1];
        int b = this.integerArray1[0];
        TrivialSwap.swap(this.integerArray1, 0, this.integerArray1.length-1);
        Assert.assertTrue(this.integerArray1[this.integerArray1.length-1] == b);
        Assert.assertTrue(this.integerArray1[0] == a);
	}
	
	/**
     * Test swap(int[] intArray1, int array1Index, int[] intArray2, int array2Index)
     */
    @Test 
    public void swap4() {
        int a = this.intArray1[0];
        int b = this.intArray2[1];
        
        TrivialSwap.swap(this.intArray1, 0, this.intArray2, 1);
        
        Assert.assertTrue(this.intArray1[0] == b);
        Assert.assertTrue(this.intArray2[1] == a);
    }
    
    /**
     * Test swap(int[] intArray1, int[] intArray2, int index)
     */
    @Test
    public void swap5() {
        int a = this.intArray1[1];
        int b = this.intArray2[1];
        
        TrivialSwap.swap(this.intArray1, this.intArray2, 1);
        
        Assert.assertTrue(this.intArray1[1] == b);
        Assert.assertTrue(this.intArray2[1] == a);    
    }
    
    /**
     * Test swap(int[] intArray1, int[] intArray2)
     */
    @Test
    public void swap6() {
        int[] a = new int[this.intArray1.length];
        System.arraycopy(this.intArray1, 0, a, 0, this.intArray1.length);
        int[] b = new int[this.intArray2.length];
        System.arraycopy(this.intArray2, 0, b, 0, this.intArray2.length);
        
        TrivialSwap.swap(this.intArray1, this.intArray2);
        
        for(int i = 0; i < Math.min(this.intArray1.length, this.intArray2.length); i++) {
            Assert.assertTrue(this.intArray1[i] == b[i]);
            Assert.assertTrue(this.intArray2[i] == a[i]);           
        }
               
    }
    
    /**
     * Test swap(int[] intArray1, int index1, int index2)
     */
    @Test
    public void swap8() {
        int a = this.intArray1[this.intArray1.length-1];
        int b = this.intArray1[0];
        TrivialSwap.swap(this.intArray1, 0, this.intArray1.length-1);
        Assert.assertTrue(this.intArray1[this.intArray1.length-1] == b);
        Assert.assertTrue(this.intArray1[0] == a);
    }
    
    /**
     * Test swap(List<E> list, int index1, int index2)
     */
    @Test
    public void swap12() {
        int a = this.list1.get(this.list1.size()-1);
        int b = this.list1.get(0);
        TrivialSwap.swap(this.list1, 0, this.list1.size()-1);
        Assert.assertTrue(this.list1.get(this.list1.size()-1) == b);
        Assert.assertTrue(this.list1.get(0) == a);
    }
    
   /**
    * Test swap(List<E> list1, int list1Index, List<E> list2, int list2Index)
    */
    @Test
    public void swap9() {
        int a = this.list1.get(0);
        int b = this.list2.get(1);
        
        TrivialSwap.swap(this.list1, 0, this.list2, 1);
        
        Assert.assertTrue(this.list1.get(0) == b);
        Assert.assertTrue(this.list2.get(1) == a);
    }
    
    /**
     * Test swap(List<E> list1, List<E> list2, int index)
     */
    @Test
    public void swap10() {
        int a = this.list1.get(0);
        int b = this.list2.get(0);
        
        TrivialSwap.swap(this.list1, this.list2, 0);
        
        Assert.assertTrue(this.list1.get(0) == b);
        Assert.assertTrue(this.list2.get(0) == a); 
    }
    
    /**
     * Test swap(List<E> list1, List<E> list2)
     */
    @Test
    public void swap11() {
        List<Integer> a = new ArrayList<>();
        a.addAll(this.list1);
        List<Integer> b = new ArrayList<>();
        b.addAll(this.list2);
        
        TrivialSwap.swap(this.list1, this.list2);
        for(int i = 0; i < Math.min(this.list1.size(), this.list2.size()); i++) {
            
            Assert.assertTrue(this.list1.get(i) == b.get(i));
            Assert.assertTrue(this.list2.get(i) == a.get(i));           
        }
              
    }
	
}
