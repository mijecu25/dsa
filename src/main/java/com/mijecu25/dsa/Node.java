package com.mijecu25.dsa;

/**
 * This is the Node class. 
 *  
 * @author Miguel Velez
 * @version 0.1.1.1
 * 
 */
public class Node {
	
	private Object 	data; 
	private Node	next;
		
	/**
	 * Construct a node that contains {@code data} and sets its next node to
	 * {@code next} 
	 * 
	 * @param data the data that the node holds.
	 * @param next the next node that this node points to.
	 */
	public Node(Object data, Node next) 
	{
		// Creates a new Node object set the values of the parameters.	
		this.data = data;
		this.next = next;
	}
	
	/**
	 * Construct a node that contains {@code data} and sets its next node to
	 * <i>null</i>
	 * 
	 * @param data the data that the node holds.
	 */
	public Node(Object data) {
		// Call Node(data, next) with null as next
		this(data, null);
	}
	
	/**
	 * Gets the content of this node.
	 * 
	 * @return an object containing the data of this node.
	 */
	public Object getData() 
	{
		// Returns the data object
		return this.data;
	}
	
	/**
	 * Gets the next node of this node.
	 * 
	 * @return a reference to the next node that this node points to.
	 */
	public Node getNext()
	{
		// returns the next node
		return this.next;
	}
	
	/**
	 * Sets the next node of this node.
	 * 
	 * @param next the next node that this node should point to.
	 */
	public void setNext(Node next) 
	{
		// Sets the next node
		this.next = next;
		
		new StringBuilder().toString();
	}

}
