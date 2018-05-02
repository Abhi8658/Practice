package com.mindtree.junit.testing_app_1;

import static org.junit.Assert.assertEquals;

import org.junit.internal.runners.JUnit38ClassRunner;
import org.junit.runner.RunWith;

/**
 * Unit test for App class.
 * Testing multiply method with different argument 
 */
@RunWith(JUnit38ClassRunner.class)
public class AppTest{
    
	@org.junit.Test
	public void testMultiply() {
		App tester=new App();
		assertEquals("10 and 5 must be 50", 50, tester.multiply(10, 5));
	}	
}
