package com.mijecu25.dsa.datastructures;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import com.mijecu25.dsa.datastructures.LinkedListQueue;

/**
 * This LinkedListQueue test class.
 * 
 * @author Miguel Velez
 * @version 0.1.2.2
 */
public class TestLinkedListQueue {
	private int					value = 15;
	private LinkedListQueue 	queue = new LinkedListQueue();
	private LinkedListQueue		empty = new LinkedListQueue();
	
	@Before
	public void initialize() {
		this.queue.enqueue(value);
	}
	/**
	 * Test constructors.
	 */
	@Test
	public void testConstructors() {
		// Create queue
		LinkedListQueue queue = new LinkedListQueue();
		
		// Check that the queue was created
		Assert.assertNotNull(queue);
	}

	/**
	 * Test is empty.
	 */
	@Test
	public void isEmpty() {
		// Check if the queue is not empty
		Assert.assertFalse(this.queue.isEmpty());
		
		// Check if the empty queue is empty
		Assert.assertTrue(this.empty.isEmpty());
	}
	
	/**
	 * Test remove all.
	 */
	@Test
	public void testRemoveAll() {
		// Remove all
		this.queue.removeAll();
		
		// Check that the queue is empty
		Assert.assertTrue(this.queue.isEmpty());
	}
	
	/**
	 * Test peek.
	 */
	@Test
	public void testPeek() {
		// Check that the front of the queue is the value we inserted
		Assert.assertEquals(this.value, this.queue.peek());
	}
	
	/**
	 * Test dequeue.
	 */
	@Test
	public void testDequeue() {
		// Check that the dequeued value is the same as the value we inserted
		Assert.assertEquals(this.value, this.queue.dequeue());
	}
	
	/**
	 * Test enqueue by passing an object.
	 */
	@Test
	public void testEnqueueObject() {
		// Enqueue a new value
		this.empty.enqueue(14);
		
		// Check that the new value was enqueued
		Assert.assertEquals(14, this.empty.peek());
	}
	
	/**
	 * Test enqueue by passing another queue
	 */
	@Test
	public void testEnqueueQUeue() {
		// Join two queues
		this.empty.enqueue(this.queue);
		
		// Check that the empty queue is not empty anymore
		Assert.assertFalse(this.empty.isEmpty());
	}

}
