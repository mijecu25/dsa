package com.mijecu25.dsa;

import org.junit.Assert;
import org.junit.Test;

/**
 * This is the Node test class. 
 * 
 * @author Miguel Velez
 * @version 0.2.1
 *  
 */
public class TestNode {
	Node node = new Node(6, null);
	
	/**
	 * Test the node constructor.
	 */
	@Test
	public void TestNodeConstructor() {		
		// Check if they are the same class
		Assert.assertSame(Node.class, this.node.getClass()); 
		
		// Check if they are the same class
		Assert.assertNotSame(String.class, this.node.getClass()); 
	}
	
	/**
	 * Test the get data method.
	 */
	@Test
	public void TestGetData() {		
		// Checking if we get the same data back
		Assert.assertEquals(6, this.node.getData());
		
		// Check if we do not get the same data back
		Assert.assertNotEquals(5, this.node.getData());
	}

}
