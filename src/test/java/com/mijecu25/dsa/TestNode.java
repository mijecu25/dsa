package com.mijecu25.dsa;

import org.junit.Assert;
import org.junit.Test;

/**
 * This is the Node test class. 
 * 
 * @author Miguel Velez
 * @version 0.2
 * 
 */
public class TestNode {

	/**
	 * Test the node constructor.
	 */
	@Test
	public void TestNodeConstructor() {
		Node node = new Node(6, null);
		
		// Check if they are the same class
		Assert.assertSame(Node.class, node.getClass()); 
	}
	
	/**
	 * Test the get data method.
	 */
	@Test
	public void TestGetData() {
		Node node = new Node(5, null);
		
		// Checking if we get the same data back
		Assert.assertEquals(5, node.getData());
	}

}
