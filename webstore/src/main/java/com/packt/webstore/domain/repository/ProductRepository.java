package com.packt.webstore.domain.repository;

import java.util.*;
import com.packt.webstore.domain.Product;

public interface ProductRepository {

	List <Product> getAllProducts();
	List <Product> getProductsByCategory(String category);
	Product getProductById(String productId);
	
	Set<Product> getProductsByFilter(Map<String, List<String>> filterParams); 
}
