package com.mijecu25.dsa.DataStructures;

import com.mijecu25.dsa.Node;
import com.mijecu25.dsa.Exception.LinkedListUnderflowException;

/**
 * This is the LinkedList class. It is the simplest implementation of a Linked List.
 * 
 * @author Miguel Velez
 * @version 0.4.6
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
	 * @param head-the object that is the head of the list
	 */
	public LinkedList(Object head) {
		// Create a new node with the data
		Node node = new Node(head);
		
		// Set the head to the new node
		this.head = node;
	}
	
	/**
	 * Gets but does not remove the head of the linked list.
	 * 
	 * @return a reference of the head object.
	 */
	public Object peek() {
		return this.head.getData();
	}
	
	/**
	 * Returns and removes the head of the linked list.
	 * 
	 * @return a reference of the head.
	 */
	public Object getHead() {
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
		return removed.getData();
	}
	
	/**
	 * Add an object to the end of the list. If the list is empty, it is added as the 
	 * head
	 * 
	 * @param node-the object that is added to the list
	 */	
	public void addElement(Object data) {		
		// Check if list is empty
		if(this.isEmpty()) {
			// If empty, we are adding a head
			this.addHead(data);
		}
		else {
			// We have to loop through the list to find the end
			Node current = this.head;
					
			while(current.getNext() != null) {
				current = current.getNext();
			}
			
			// We have found the last node of the list, so add the object
			current.setNext(new Node(data));
		}
	}
	
	/**
	 * Adds a new head to the linked list. Checks if {@code node} has a next, which might cause
	 * to lose reference to it this method is executed.
	 * 
	 * @param node-the node that is the new head of the list.
	 */
//	public void addHead(Node node) {
//		// Check if node is null
//		if(node == null) {
//			throw new IllegalArgumentException("The node you provided is null");
//		}
//		
//		// Check if node has a next, which will lose reference
//		// to that node
//		if(node.getNext() != null) {
//			throw new IllegalArgumentException("The node that you want to add as a head points to (" + 
//					node.getNext().getData() + "). You might lose reference to that node.");
//		}
//		
//		// Check if list is empty
//		if(!this.isEmpty()) {
//			node.setNext(this.head);
//		}
//		
//		// The passed node is the new head
//		this.head = node;
//	}
	
	public void addHead(Object head) {
		
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
