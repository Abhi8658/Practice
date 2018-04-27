package com.mindtree.dp;

public class Cake {
	private double sugar;
	private double butter;
	private int eggs;
	private int vanila;
	private double flour;
	private double bakingpowder;
	private double milk;
	private int cherry;

	public static class Builder {
		private double sugar;
		private double butter;
		private int eggs;
		private int vanila;
		private double flour;
		private double bakingpowder;
		private double milk;
		private int cherry;

		public Builder sugar(double cup) {
			this.sugar = cup;
			return this;
		}

		public Builder butter(double cup) {
			this.butter = cup;
			return this;
		}

		public Builder eggs(int number) {
			this.eggs = number;
			return this;
		}

		public Builder vanila(int spoon) {
			this.vanila = spoon;
			return this;
		}

		public Builder flour(double cup) {
			this.flour = cup;
			return this;
		}

		public Builder bakingpowder(double cup) {
			this.bakingpowder = cup;
			return this;
		}

		public Builder milk(double cup) {
			this.milk = cup;
			return this;
		}

		public Builder cherry(int number) {
			this.cherry = number;
			return this;
		}
		//returning fully created object 
		public Cake build() {
			return new Cake(this);
		}
	}

	// private constructor to create the object of cake with pre populated data
	private Cake(Builder builder) {
		this.sugar = builder.sugar;
		this.butter = builder.butter;
		this.eggs = builder.eggs;
		this.vanila = builder.vanila;
		this.flour = builder.flour;
		this.bakingpowder = builder.bakingpowder;
		this.milk = builder.milk;
		this.cherry = builder.cherry;
	}

	@Override
	public String toString() {
		return "Cake [sugar=" + sugar + ", butter=" + butter + ", eggs=" + eggs + ", vanila=" + vanila + ", flour="
				+ flour + ", bakingpowder=" + bakingpowder + ", milk=" + milk + ", cherry=" + cherry + "]";
	}
}
