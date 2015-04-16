package com.mijecu25.dsa.DataStructures;

import org.junit.Assert;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

import com.mijecu25.dsa.Node;
import com.mijecu25.dsa.Exception.LinkedListUnderflowException;

/**
 * This is the LinkedList test class.
 * 
 * @author Miguel Velez
 * @version 0.2.1
 */
public class TestLinkedList {
	private Node 		head = new Node(5, null);
	private LinkedList 	list = new LinkedList(head);
	private LinkedList	empty = new LinkedList();
	
	@Rule
	public ExpectedException expectedException = ExpectedException.none();
	
	/**
	 * Test the constructors.
	 */
	@Test
	public void TestConstructors() {
		// Create link list
		LinkedList list = new LinkedList();
		
		// Check if it was created
		Assert.assertNotNull(list);
		
		// Create a node
		Node head = new Node(5, null);
		
		// Create a linked list
		list = new LinkedList(head);
		
		//Check if it was created
		Assert.assertNotNull(list);
		
	}
	
	/**
	 * Test if the linked list is empty
	 */
	@Test
	public void testIsEmpty() {
		// Check if the linked list is not empyt
		Assert.assertEquals(false, this.list.isEmpty());
		
		// Check that it is empty
		Assert.assertNotEquals(false, this.empty.isEmpty());
	}
	
	/**
	 * Test the peek method
	 */
	@Test
	public void testPeek() {
		// Check that there is a head
		Assert.assertNotNull(this.list.peek());
		
		// Check that there is not a head
		Assert.assertNull(this.empty.peek());
	}

	/**
	 * Test the get head method.
	 */
	@Test
	public void testGetHead() {
		// Expect exception
		expectedException.expect(LinkedListUnderflowException.class);
		
		// Get the head from empty lisr
		this.empty.getHead();
		
		// Check that the head is not null
		Assert.assertNotNull(this.list.getHead());
	}
	
	/**
	 * Test the remove all method.
	 */
	@Test
	public void testRemoveAll() {
		// Check that the list is not empty
		Assert.assertNotEquals(true, this.list.isEmpty());
		
		// Remove all
		this.list.removeAll();
		
		// Check that the list is empty
		Assert.assertEquals(true, this.list.isEmpty());
	}
	

}
