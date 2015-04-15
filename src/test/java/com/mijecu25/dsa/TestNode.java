package com.mijecu25.dsa;

import org.junit.Assert;
import org.junit.Test;

/**
 * This is the Node test class. 
 * 
 * @author Miguel Velez
 * @version 0.3.1
 *  
 */
public class TestNode {
	private Node first = new Node(6, null);
	private Node second = new Node("Dog", null);
	
	/**
	 * Test the node constructor.
	 */
	@Test
	public void TestNodeConstructor() {		
		// Check if they are the same class
		Assert.assertSame(Node.class, this.first.getClass()); 
		
		// Check if they are the same class
		Assert.assertNotSame(String.class, this.first.getClass()); 
	}
	
	/**
	 * Test the get data method.
	 */
	@Test
	public void TestGetData() {		
		// Checking if we get the same data back
		Assert.assertEquals(6, this.first.getData());
		
		// Check if we do not get the same data back
		Assert.assertNotEquals(5, this.first.getData());
	}
	
	/**
	 * Test the get next method
	 */
	@Test
	public void TestSetGetNext() {
		// Set second as first's next
		first.setNext(second);
		
		// Check if the next node is the second node
		Assert.assertEquals(second, first.getNext());
		
		// Check if that the next node of second is not first
		Assert.assertNotEquals(first, second.getNext());
	}

}
