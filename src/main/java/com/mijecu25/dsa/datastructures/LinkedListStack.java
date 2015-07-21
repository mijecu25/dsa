package com.mijecu25.dsa.datastructures;

import com.mijecu25.dsa.exceptions.StackUnderflowException;

/**
 * Stack implementation using a LinkedList.
 * 
 * @author Miguel Velez
 * @version 0.1.2.2
 */
public class LinkedListStack {
	
	private LinkedList linkedList;
	
	/**
	 * Create an empty linked list stack.
	 */
	public LinkedListStack() {
		this.linkedList = new LinkedList();
	}
		
	/**
	 * Remove all elements from the stack
	 */
	public void removeAll() {
		// Check if the stack is empty
		if(this.isEmpty()) {
			// Throw exception
			throw new StackUnderflowException();
		}
		
		this.linkedList.removeAll();
	}
	
	/**
	 * Checks if the stack is empty.
	 * 
	 * @return <i>true</i> if the stack is empty, else <i>false</i>.
	 */
	public boolean isEmpty() {
		return this.linkedList.isEmpty();
	}
	
	/**
	 * Gets but does not remove the top of the stack.
	 * 
	 * @return a reference of the top object.
	 */
	public Object peek() {
		// Check if empty
		if(this.isEmpty()) {
			// Throw exception
			throw new StackUnderflowException();
		}
		
		return this.linkedList.peekTail();
	}
	
	/**
	 * Returns and removes the top of the stack.
	 * 
	 * @return a reference of the top object.
	 */
	public Object pop() {
		// Checks if the linked list is empty
		if(this.isEmpty()) {
			// Throw unchecked exception
			throw new StackUnderflowException();
		}
		
		// Return the data from the top of the stack
		return this.linkedList.getTail();
	}
	
	/**
	 * Adds a new element in the stack.

	 * @param data the object that is added to the stack
	 */
	public void push(Object data) {
		this.linkedList.addTail(data);
	}
	
	/**
	 * Join two stacks.
	 * 
	 * @param stack the stack that is joined with this stack.
	 */
	public void push(LinkedListStack stack) {
		this.linkedList.join(stack.linkedList);
	}
		
}
