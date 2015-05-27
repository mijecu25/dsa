package com.mijecu25.dsa.DataStructures;

import com.mijecu25.dsa.Node;
import com.mijecu25.dsa.Exception.LinkedListUnderflowException;

/**
 * This is the LinkedList class. It is the simplest implementation of a Linked List.
 * 
 * @author Miguel Velez
 * @version 0.8
 */
public class LinkedList {
	
	private Node head;
	private Node tail;

	/**
	 * Constructs an empty linked list.
	 */
	public LinkedList() {
		this.head = null;
		this.tail = null;
	}
	
	/**
	 * Constructs a linked list with the {@code head} object as the head of the list.
	 * 
	 * @param head the object that is the head of the list
	 */
	public LinkedList(Object head) {
		// Create a new node with the data
		Node node = new Node(head);
		
		// Set the head and tail to the new node
		this.head = node;
		this.tail = node;
	}
	
	/**
	 * Checks if the linked list is empty.
	 * 
	 * @return <i>true</i> if the linked list is empty, else <i>false</i>.
	 */
	public boolean isEmpty() {
		return (this.head == null && this.tail == null);
	}
	
	/**
	 * Gets but does not remove the head of the linked list.
	 * 
	 * @return a reference of the head object.
	 */
	public Object peek() {
		// Check if empty
		if(this.isEmpty()) {
			return null;
		}
		
		return this.head.getData();
	}
	
	/**
	 * Gets but does not remove the tail of the linked list.
	 * 
	 * @return a reference of the tail object.
	 */
	public Object peekTail() {
		// Check if empty
		if(this.isEmpty()) {
			return null;
		}
				
		return this.tail.getData();
	}
		
	/**
	 * Adds a new head to the linked list.
	 * 
	 * @param head the object that is the new head of the list.
	 */
	public void addHead(Object head) {	
		Node node = new Node(head);
		
		// Check if list is empty
		if(this.isEmpty()) {
			this.tail = node;
		}
		else {
			// The new node points to the previous head
			node.setNext(this.head);
		}
		
		// The passed node is the new head
		this.head = node;
	}
	
	/**
	 * Adds a new tail to the linked list.
	 * 
	 * @param tail the object that is the new tail of the list.
	 */
	public void addTail(Object tail) {
		Node node = new Node(tail);
		
		// Check if list is empty
		if(this.isEmpty()) {
			this.head = node;
		}
		else {
			// The previous tail points to the new node
			this.tail.setNext(node);
		}
		
		// The passed node is the new tail
		this.tail = node;	
	}
	
	/**
	 * Add an object to the end of the list. If the list is empty, it is added as the 
	 * head
	 * 
	 * @param data the object that is added to the list
	 */	
	public void addElement(Object data) {	
		// Check if list is empty
		if(this.isEmpty()) {
			// If empty, we are adding a head
			this.addHead(data);
		}
		else {
			// Add a new tail
			this.addTail(data);
		}
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
		
		// Check if the head is null
		if(this.head == null) {
			// Set the tail to null since we just removed the only element
			// in the list
			this.tail = null;
		}
		
		// Return the previous head
		return removed.getData();
	}
	
	/**
	 * Returns and removes the tail of the linked list.
	 * 
	 * @return a reference of the tail.
	 */
	public Object getTail() {
		// Check if the linked list is empty
		if(this.isEmpty()) {
			// Throw exception
			throw new LinkedListUnderflowException();
		}		
		
		// Check if the list only had 1 node
		if(this.head == this.tail) {
			// Same operation as getting the head
			return this.getHead();
		}
		
		// Get the tail
		Node removed = this.tail;
		
		// Get the head as the current node
		Node current = this.head;
		
		// Loop through the list until the next reference points to the tail
		while(current.getNext() != removed) {
			current = current.getNext();
		}			
		
		// Make the tail of the linked list the current node
		this.tail = current;
		this.tail.setNext(null);
		
		// Return the previous head
		return removed.getData();
	}
			
	/**
	 * Removes all the nodes from the linked list
	 */
	public void removeAll() {
		this.head = null;
		this.tail = null;
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
		
		// We have to loop through the list to find the tail
		Node current = this.head.getNext();
				
		while(current != this.tail) {
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
	
	// TODO join method to concatenate 2 linked lists
	/*
	 * // Appends the passed queue to the end of this linked list
		Node thisRear;
		Node queueFront;

		// Check if the passed queue is null
		if(queue == null) 
		{
			// Throw exception
			throw new IllegalArgumentException("The queue parameter (queue) is null");
		}
				
		//  If the passed queue is empty, ignore it
		if(!queue.isEmpty())
		{
			// Get the rear of this list
			thisRear = this.rear;
			
			// Get the front of the queue
			queueFront = queue.front;
			
			// Check if this queue is empty
			if(this.isEmpty()) 
			{
				// If empty, the front of the passed queue is the front of this queue
				this.front = queueFront;
			}
			else
			{
				// Make the next variable of this rear point to the front of the passed queue
				thisRear.setNext(queueFront);			
			}
			
			// The new rear of the list is the rear of the passed queue
			this.rear = queue.rear;
			
			// Remove all the Nodes from the passed queue that are now in this queue
			queue.removeAll();
		}	
		
	 * 
	 * 
	 * 
	 * 
	 * 
	 * 
	 * 
	 * 
	 * 
	 * 
	 * 
	 * 
	 * 
	 * 
	 * 
	 * 
	 */
	
}
