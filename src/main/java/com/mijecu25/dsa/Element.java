package com.mijecu25.dsa;

/**
 * This is an element object with an specific type. It is
 * usually used in collections.
 * 
 * @author Miguel Velez
 * @version 0.1.3.1
 * 
 * @param <E> the type of the element
 */
public class Element<E>{
	
	private E 			element;
	private Element<E> 	previous;
	private Element<E> 	next;
	
	/**
	 * Create a new element by passing the type of element, the previous
	 * element, and the next element.
	 * 
	 * @param element the type of the element.
	 * @param previous a reference to the previous element.
	 * @param next a reference to the next element.
	 */
	public Element(E element, Element<E> previous, Element<E> next) {
		this.element = element;
		this.previous = previous;
		this.next = next;
	}

	/**
	 * Create a new element by passing the type of element and the 
	 * previous element. The reference to the next element is set
	 * to null. 
	 * 
	 * @param element the type of the element.
	 * @param previous a reference to the previous element.
	 */
	public Element(E element, Element<E> previous) {
		this(element, previous, null);
	}

	/**
	 * Create a new element by passing the type of element. The
	 * reference to the next element and previous elements are
	 * set to null. 
	 * 
	 * @param element the type of the element.
	 */
	public Element(E element) {
		this(element, null);
	}
	
	/**
	 * Return the type of element.
	 * 
	 * @return the type of element.
	 */
	public E getElement() {
		return this.element;
	}
	
	/**
	 * Return the previous element.
	 * 
	 * @return reference to the previous element.
	 */
	public Element<E> getPrevious() {
		return this.previous;
	}
	
	/**
	 * Return the next element.
	 * 
	 * @return reference to the next element.
	 */
	public Element<E> getNext() {
		return this.next;
	}
	
	/**
	 * Set the previous element.
	 * 
	 * @param previous a reference to the previous element.
	 */
	public void setPrevious(Element<E> previous) {
		this.previous = previous;
	}
	
	/**
	 * Set the next element.
	 * 
	 * @param next a reference to the next element.
	 */
	public void setNext(Element<E> next) {
		this.next = next;
	}
		
}
