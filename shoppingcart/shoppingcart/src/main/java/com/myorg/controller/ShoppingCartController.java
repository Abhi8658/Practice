package com.myorg.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.myorg.model.request.Product;
import com.myorg.model.response.CartResponse;

@RestController
@RequestMapping("/shopping")
public class ShoppingCartController {

	@GetMapping("/products")
	public String getProducts() {

		return "products";
	}

	@PostMapping("/add")
	public ResponseEntity<CartResponse> addProduct(@RequestBody Product product) {
		if (product != null) {
			CartResponse response = new CartResponse();
			response.setProductId(product.getProductId());
			response.setProductName(product.getProductName());
			response.setMessage("Product has been added sucessfully");
			return new ResponseEntity<CartResponse>(response, HttpStatus.CREATED);
		} else {
			return new ResponseEntity<CartResponse>(HttpStatus.FORBIDDEN);
		}
	}
}
