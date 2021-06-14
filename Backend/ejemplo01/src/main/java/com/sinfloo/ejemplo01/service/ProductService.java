package com.sinfloo.ejemplo01.service;

import java.util.List;

import com.sinfloo.ejemplo01.model.Product;

public interface ProductService {

	List<Product> listar();
	
	Product listarId(int id);
	
	Product add(Product p);
	
	Product edit(Product p);
	
	Product delete(int id);
	

}
