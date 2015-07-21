package com.mijecu25.dsa.datastructures;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import com.mijecu25.dsa.datastructures.LinkedListStack;

/**
 * This LinkedListStack test class.
 * 
 * @author Miguel Velez
 * @version 0.1.2.2
 */
public class TestLinkedListStack {
	private int					value = 15;
	private LinkedListStack 	stack = new LinkedListStack();
	private LinkedListStack		empty = new LinkedListStack();
	
	@Before
	public void initialize() {
		this.stack.push(value);
	}
	
	/**
	 * Test constructors.
	 */
	@Test
	public void testConstructors() {
		// Create stack
		LinkedListStack stack = new LinkedListStack();
		
		// Check that the stack was created
		Assert.assertNotNull(stack);
	}

	/**
	 * Test is empty.
	 */
	@Test
	public void isEmpty() {
		// Check if the stack is not empty
		Assert.assertFalse(this.stack.isEmpty());
		
		// Check if the empty stack is empty
		Assert.assertTrue(this.empty.isEmpty());
	}
	
	/**
	 * Test remove all.
	 */
	@Test
	public void testRemoveAll() {
		// Remove all
		this.stack.removeAll();
		
		// Check that the stack is empty
		Assert.assertTrue(this.stack.isEmpty());
	}
	
	/**
	 * Test peek.
	 */
	@Test
	public void testPeek() {
		// Check that the top of the stack is the value we inserted
		Assert.assertEquals(this.value, this.stack.peek());
	}
	
	/**
	 * Test pop.
	 */
	@Test
	public void testPop() {
		// Check that the poped value is the same as the value we inserted
		Assert.assertEquals(this.value, this.stack.pop());
	}
	
	/**
	 * Test push by passing an object.
	 */
	@Test
	public void testPushObject() {
		// Push a new value
		this.empty.push(14);
		
		// Check that the new value was pushed
		Assert.assertEquals(14, this.empty.peek());
	}
	
	/**
	 * Test push by passing another stack
	 */
	@Test
	public void testPushStack() {
		// Join two stacks
		this.empty.push(this.stack);
		
		// Check that the empty stack is not empty anymore
		Assert.assertFalse(this.empty.isEmpty());
	}

}
