package com.myorg.model.request;

import lombok.Data;

@Data
public class Product {
	private int productId;
	private String productName;
	private float price;
}
