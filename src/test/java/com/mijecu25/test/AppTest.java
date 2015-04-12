package com.mijecu25.test;

import org.junit.Assert;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

/**
 * Unit test for simple App.
 */
public class AppTest //extends TestCase
{

		@org.junit.Test
		public void testApp() {		
			Assert.assertEquals(App.reverse("miguel"), "leugim");
		}
		
		@org.junit.Test
		public void testApp2() {		
			Assert.assertNotEquals(App.reverse("tazo"), "toza");
		}
	   
}
