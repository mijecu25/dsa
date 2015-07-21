package com.mijecu25.dsa.datastructures;

import com.mijecu25.dsa.exceptions.QueueUnderflowException;

/**
 * Queue implementation using a LinkedList.
 * 
 * @author Miguel Velez
 * @version 0.1.1.5
 */
public class LinkedListQueue {
	
	private LinkedList linkedList;
	
	/**
	 * Create an empty linked list queue.
	 */
	public LinkedListQueue() {
		this.linkedList = new LinkedList();
	}
	
	/**
	 * Remove all elements from the queue
	 */
	public void removeAll() {
		// Check if the queue is empty
		if(this.isEmpty()) {
			// Throw exception
			throw new QueueUnderflowException();
		}
		
		this.linkedList.removeAll();
	}
	
	/**
	 * Checks if the queue is empty.
	 * 
	 * @return <i>true</i> if the queue is empty, else <i>false</i>.
	 */
	public boolean isEmpty() {
		return this.linkedList.isEmpty();
	}
	
	/**
	 * Gets but does not remove the front of the queue.
	 * 
	 * @return a reference of the front object.
	 */
	public Object peek() {
		// Check if empty
		if(this.isEmpty()) {
			// Throw exception
			throw new QueueUnderflowException();
		}
		
		return this.linkedList.peek();
	}
	
	/**
	 * Returns and removes the front of the queue.
	 * 
	 * @return a reference of the front object.
	 */
	public Object dequeue() {
		// Checks if the linked list is empty
		if(this.isEmpty()) {
			// Throw unchecked exception
			throw new QueueUnderflowException();
		}
		
		// Return the data from the front of the queue
		return this.linkedList.getHead();
	}
	
	/**
	 * Adds a new element in the queue.

	 * @param data the object that is added to the queue
	 */
	public void enqueue(Object data) {
		this.linkedList.addTail(data);
	}
	
	/**
	 * Join two queues.
	 * 
	 * @param queue the queue that is joined with this queue.
	 */
	public void enqueue(LinkedListQueue queue) {
		this.linkedList.join(queue.linkedList);
	}
		
}
