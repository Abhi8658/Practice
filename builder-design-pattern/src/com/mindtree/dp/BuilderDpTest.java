package com.mindtree.dp;

public class BuilderDpTest {
	public static void main(String[] args) {
		//create the object using builder dp
		Cake cake = new Cake.Builder().sugar(2).butter(0.5).eggs(2).vanila(2).flour(2.5).bakingpowder(2).milk(2)
				.cherry(5).build();
		System.out.println(cake);
	}
}