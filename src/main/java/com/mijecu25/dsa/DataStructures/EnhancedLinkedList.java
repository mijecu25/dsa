package com.mijecu25.dsa.DataStructures;

import com.mijecu25.dsa.Node;

/**
 * This is the EnhancedLinkedList class. It is an enhanced version of the
 * Linked List which provides additional functionaly.
 * 
 * @author Miguel Velez
 * @version 0.1
 */
public class EnhancedLinkedList extends LinkedList {
	
	private Node tail;
	
	/**
	 * Constructs an empty enhanced linked list.
	 */
	public EnhancedLinkedList() {
		// Call the super constructor
		super();
		
		this.tail = null;
	}
	
	/**
	 * Constructs an enhanced linked list with the {@code head} node as the head of the list
	 * and the {@code tail} node as the tail of the list.
	 * 
	 * @param head-the node that is the head of the list
	 * @param tail-the node that is the tail of the list
	 */
	public EnhancedLinkedList(Node head, Node tail) {
		// Call the super constructor
		super(head);
		
		this.tail = tail;
	}

}
