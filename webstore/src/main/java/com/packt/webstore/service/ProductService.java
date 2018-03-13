package com.packt.webstore.service;

import java.util.*;

import com.packt.webstore.domain.Product;

public interface ProductService {
	
	List <Product> getAllProducts();
	List <Product> getProductsByCategory(String category);
	Product getProductById(String productId);
	Set<Product> getProductsByFilter(Map<String, List<String>> filterParams);
}
