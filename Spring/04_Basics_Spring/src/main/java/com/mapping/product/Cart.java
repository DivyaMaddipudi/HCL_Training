package com.mapping.product;

import java.util.Map;
import java.util.function.BiConsumer;

public class Cart {
	
	private String cartHolderName;
	private Map<Integer, Product> products;
	public String getCartHolderName() {
		return cartHolderName;
	}
	public void setCartHolderName(String cartHolderName) {
		this.cartHolderName = cartHolderName;
	}
	public Map<Integer, Product> getProducts() {
		return products;
	}
	public void setProducts(Map<Integer, Product> products) {
		this.products = products;
	}
	
	public void print() {
		System.out.println("cart holder name: " + cartHolderName);
		System.out.println("--------------print all products----------");
		products.forEach((Integer id, Product product) -> System.out.println(id + " : " + product));
	}
}
