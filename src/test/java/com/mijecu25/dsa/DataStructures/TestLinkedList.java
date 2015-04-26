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
 * @version 0.5
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
		// Check if the linked list is not empty
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
	 * Test the peekTail method
	 */
	@Test
	public void testPeekTail() {
		// Check that there is a tail
		Assert.assertNotNull(this.list.peekTail());
				
		// Check that the tail is the node that we created
		Assert.assertEquals(this.head, this.list.peekTail());
		
		// Check that there is not a tail
		Assert.assertNull(this.empty.peekTail());
	}

	/**
	 * Test the get head method.
	 */
	@Test
	public void testGetHead() {
		// Check that the head is not null
		Assert.assertNotNull(this.list.getHead());

		// Expect exception
		expectedException.expect(LinkedListUnderflowException.class);
		
		// Get the head from empty list
		this.empty.getHead();
	}
	
	// TODO
//	/**
//	 * Test the get tail method.
//	 */
//	@Test
//	public void testGetTail() {
//		// Check that the head is not null
//		Assert.assertNotNull(this.list.getHead());
//
//		// Expect exception
//		expectedException.expect(LinkedListUnderflowException.class);
//		
//		// Get the head from empty list
//		this.empty.getHead();
//	}
	
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
	
	/**
	 * Test the add head method
	 */
	@Test
	public void testAddHead() {
//		// Create new head
//		Node newHead = new Node(1);
//		
//		// Add as the new head
//		this.list.addHead(newHead);
//		
//		// Check that the new head is what we expect
//		Assert.assertEquals(newHead, this.list.getHead());
//		
//		// Check that the next of the new head is the previous head
//		Assert.assertEquals(this.list.getHead(), this.head);
//		
//		// Create a new head with a next
//		newHead = new Node(1, this.head);
//		
//		// Expected exception
//		expectedException.expect(IllegalArgumentException.class);
//		
//		// Add the new head that has a node pointing to another node
//		this.list.addHead(newHead);
//		
//		// Try adding an empty node
//		this.list.addHead(null);
	}
	
	/**
	 * Test the add node method
	 */
	@Test
	public void testAddNode() {
//		// Create new head
//		Node newHead = new Node(1);
//		
//		// Added to empty list
//		this.empty.addNode(newHead);
//		
//		Assert.assertEquals(newHead, this.empty.getHead());
//		
//		// Create node
//		Node node = new Node(1);
//		
//		// Added to list
//		this.empty.addNode(node);
//		
//		// Loop through the nodes of list
//		Node current = this.empty.getHead();
//		
//		while(current.getNext() != null) {
//			current = current.getNext();
//		}
//		
//		// Check if the last node is the one we added
//		Assert.assertEquals(node, current);
//	
//		// Expected exception
//		expectedException.expect(IllegalArgumentException.class);
//				
//		// Try adding an empty node
//		this.list.addNode(null);
	}

}
