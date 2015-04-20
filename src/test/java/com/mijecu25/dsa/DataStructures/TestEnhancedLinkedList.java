package com.mijecu25.dsa.DataStructures;

import org.junit.Assert;
import org.junit.Test;

import com.mijecu25.dsa.Node;

/**
 * This is the EnhancedLinkedList test class.
 * 
 * @author Miguel Velez
 * @version 0.1.1
 */
public class TestEnhancedLinkedList {
//	private Node 		head = new Node(5, null);
//	private Node 		tail = new Node(9, null);
//	private EnhancedLinkedList 	list = new EnhancedLinkedList(head, tail);
//	private EnhancedLinkedList	empty = new EnhancedLinkedList();
		
	/**
	 * Test the constructors.
	 */
	@Test
	public void TestConstructors() {
		// Create enhanced link list
		EnhancedLinkedList elist = new EnhancedLinkedList();
		
		// Check if it was created
		Assert.assertNotNull(elist);
		
		// Create a node
		Node head = new Node(5, null);
		Node tail = new Node(10, null);
		
		// Create a linked list
		elist = new EnhancedLinkedList(head, tail);
		
		//Check if it was created
		Assert.assertNotNull(elist);	
	}
	
}
