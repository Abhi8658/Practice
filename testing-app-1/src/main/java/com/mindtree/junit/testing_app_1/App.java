package com.mindtree.junit.testing_app_1;

/**
 * Abhishek 
 * This class is for multiplication 
 * One method has been declared named as multiply(int a, int b)
 * 
 *
 */
public class App {
	public int multiply(int a, int b) {
		if (a > 999) {
			throw new IllegalArgumentException("The value of a must be greater than 999");
		} else {
			return a * b;
		}
	}
}
