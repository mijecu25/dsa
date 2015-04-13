package com.mijecu25.dsa;

/**
 * 
 * @author Miguel Velez
 * @version 0.1
 * 
 * This is the Node class
 */
public class Node {
	
	private Object 	data; 
	private Node	next;
	
	/**
	 * Constructor 
	 * 
	 * @param data
	 * @param next
	 */
	public Node(Object data, Node next) 
	{
		// Creates a new Node object set the values of the parameters.	
		this.data = data;
		this.next = next;
	}
	
	/**
	 * 
	 * @return
	 */
	public Object getData() 
	{
		// Returns the data object
		return this.data;
	}
	
	/**
	 * 
	 * @return Node
	 */
	public Node getNext()
	{
		// returns the next node
		return this.next;
	}
	
	/**
	 * 
	 * @param next
	 */
	public void setNext(Node next) 
	{
		// Sets the next node
		this.next = next;
		
		new StringBuilder().toString();
	}

}
