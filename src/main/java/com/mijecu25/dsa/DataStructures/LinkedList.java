package com.mijecu25.dsa.DataStructures;

import com.mijecu25.dsa.Node;
import com.mijecu25.dsa.Exception.LinkedListUnderflowException;

/**
 * This is the LinkedList class. It is the simplest implementation of a Linked List.
 * 
 * @author Miguel Velez
 * @version 0.5
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
	 * Constructs a linked list with the {@code head} object as the head of the list.
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
		this.head = removed.getNext();
		
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
	 * Adds a new head to the linked list.
	 * 
	 * @param head-the object that is the new head of the list.
	 */
	public void addHead(Object head) {	
		Node node = new Node(head);
		
		// Check if list is empty
		if(!this.isEmpty()) {
			node.setNext(this.head);
		}
		
		// The passed node is the new head
		this.head = node;
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

	/**
	 * Prints the contents of the linked list
	 */
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		
		// Get the head
		builder.append("LinkedList [head=");
		builder.append(this.head.getData());
		
		// We have to loop through the list to find the end
		Node current = this.head.getNext();
				
		while(current != null) {
			// Append
			builder.append(", ");
			builder.append(current.getData());
			
			// Get the next node
			current = current.getNext();
		}
		
		// Close the string and return
		builder.append("]");
		
		return builder.toString();
	}
	
}
