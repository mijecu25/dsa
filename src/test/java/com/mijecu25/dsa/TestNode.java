package com.mijecu25.dsa;

import org.junit.Assert;
import org.junit.Test;

public class TestNode {

	@Test
	public void TestNodeConstructor() {
		Node node = new Node(6, null);
		 
		Assert.assertSame(Node.class, node.getClass()); 
	}
	
	@Test
	public void TestGetData() {
		Node node = new Node(5, null);
		
		Assert.assertEquals(5, node.getData());
	}

}
