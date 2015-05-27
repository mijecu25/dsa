package com.mijecu25.dsa.DataStructures;

import org.junit.Assert;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

import com.mijecu25.dsa.Exception.LinkedListUnderflowException;

/**
 * This is the LinkedList test class.
 * 
 * @author Miguel Velez
 * @version 0.6
 */
public class TestLinkedList {
	private int			value = 15;
	private LinkedList 	list = new LinkedList(value);
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
		
		// Create a linked list
		list = new LinkedList(5);
		
		//Check if it was created
		Assert.assertNotNull(list);
	}
	
	/**
	 * Test if the linked list is empty
	 */
	@Test
	public void testIsEmpty() {
		// Check if the linked list is not empty
		Assert.assertFalse(this.list.isEmpty());
		
		// Check that it is empty
		Assert.assertTrue(this.empty.isEmpty());
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
		Assert.assertEquals(value, this.list.peekTail());
		
		// Check that there is not a tail
		Assert.assertNull(this.empty.peekTail());
	}
	
	/**
	 * Test the add head method
	 */
	@Test
	public void testAddHead() {
		// Add as the new head
		this.list.addHead(18);
		
		// Check that the new head is what we expect
		Assert.assertEquals(18, this.list.peek());
		
		// Check that the next of the new head is the previous head
		Assert.assertEquals(value, this.list.peekTail());
		
		// Add a head to an empty list
		this.empty.addHead(20);
		
		// Check that the head and tail are the same
		Assert.assertEquals(this.empty.peek(), this.empty.peekTail());
	}
	
	/**
	 * Test the add node method
	 */
	@Test
	public void testAddTail() {
		// Add a value to empty list
		this.empty.addTail(89);
		
		// Check that the new tail is the same as the head
		Assert.assertEquals(89, this.empty.peek());
		
		// Add a new tail
		this.empty.addTail(21);
		
		// Check that the new tail was added to the list
		Assert.assertEquals(21, this.empty.peekTail());
	}
	
	/**
	 * Test the add element method.
	 */
	@Test
	public void testAddElement() {
		// Add a value to empty list
		this.empty.addElement(89);
		
		// Check that the new element is the same as the head and tail
		Assert.assertEquals(89, this.empty.peek());
		Assert.assertEquals(89, this.empty.peekTail());
		
		// Add a new tail
		this.empty.addElement(21);
		
		// Check that the new tail was added to the list
		Assert.assertEquals(21, this.empty.peekTail());
	}
	
	/**
	 * Test the get head method.
	 */
	@Test
	public void testGetHead() {
		// Check that the head is not null
		Assert.assertNotNull(this.list.getHead());
		
		// Check that the list is empty since we removed from a list with
		// only 1 node
		Assert.assertTrue(this.list.isEmpty());
		
		// Expect exception
		expectedException.expect(LinkedListUnderflowException.class);
		
		// Get the head from empty list
		this.empty.getHead();
	}
	
	/**
	 * Test the get tail method.
	 */
	@Test
	public void testGetTail() {
		// Add a value to test longer lists
		this.list.addElement(10);
		
		// Check that the tail is the same as the value we just added
		Assert.assertEquals(10, this.list.getTail());
		
		// Check that the tail is the same as the first value added
		Assert.assertEquals(value, this.list.getTail());

		// Check that the list is empty since we removed from a list with
		// only 1 node
		Assert.assertTrue(this.list.isEmpty());
		
		// Expect exception
		expectedException.expect(LinkedListUnderflowException.class);
		
		// Get the head from empty list
		this.empty.getTail();
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
