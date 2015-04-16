package com.mijecu25.dsa.DataStructures;

import com.mijecu25.dsa.Node;
import com.mijecu25.dsa.Exception.LinkedListUnderflowException;

/**
 * This is the LinkedList class. It is the simplest implementation of a Linked List.
 * 
 * @author Miguel Velez
 * @version 0.2
 */
public class LinkedList {
	
	private Node head;
	
	/**
	 * Constructs an empty linked list.
	 */
	public LinkedList() {
		this.head = null;
	}
	
	/**
	 * Constructs a linked list with the {@code head} node as the head of the list.
	 * 
	 * @param head-the node that is the head of the list
	 */
	public LinkedList(Node head) {
		this.head = head;
	}
	
	/**
	 * Gets but does not remove the head of the linked list.
	 * 
	 * @return a reference of the head node.
	 */
	public Node peek() {
		return this.head;
	}
	
	/**
	 * Returns and removes the head of the linked list.
	 * 
	 * @return a reference of the head node.
	 */
	public Node getHead() {
		// Check if the linked list is empty
		if(this.isEmpty()) {
			// Throw exception
			throw new LinkedListUnderflowException();
		}
		
		// Get the head
		Node removed = this.head;
		
		// Make the head of the linked list the next node of the head
		this.head = this.head.getNext();
		
		// Return the previous head
		return removed;
	}
	
	/**
	 * Checks if the linked list is empty.
	 * 
	 * @return <i>true</i> if the linked list is empty, else <i>false</i>.
	 */
	public boolean isEmpty() {
		return (this.head == null);
	}
	
	/**
	 * Removes all the nodes from the linked list
	 */
	public void removeAll() {
		this.head = null;
	}

}
