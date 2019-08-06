package com.myorg.model.response;

import lombok.Data;

@Data
public class CartResponse {
	private int productId;
	private String productName;
	private String message;
}
