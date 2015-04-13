package com.mijecu25.dsa;

import org.junit.Assert;
import org.junit.Test;

public class TestNode {

	@Test
	public void TestNodeConstructor() {
		Node node = new Node(6, null);
		 
		Assert.assertSame(node.getClass(), Node.class); 
	}

}
