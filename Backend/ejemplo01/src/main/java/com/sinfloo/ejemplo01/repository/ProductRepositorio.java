package com.sinfloo.ejemplo01.repository;

import java.util.List;

import org.springframework.data.repository.Repository;

import com.sinfloo.ejemplo01.model.Product;


public interface ProductRepositorio extends Repository<Product, Integer>{

	List<Product> findAll();
	
	Product findById(int id);
	
	Product save(Product p);
	
	void delete(Product p);
}
