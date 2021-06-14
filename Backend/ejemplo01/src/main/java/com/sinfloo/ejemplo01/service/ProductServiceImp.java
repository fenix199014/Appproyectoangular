package com.sinfloo.ejemplo01.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sinfloo.ejemplo01.model.Product;
import com.sinfloo.ejemplo01.repository.ProductRepositorio;

@Service
public class ProductServiceImp implements ProductService{

	@Autowired
	private ProductRepositorio repositorio;
	
	@Override
	public List<Product> listar() {
		
		return repositorio.findAll();
	}

	@Override
	public Product listarId(int id) {
		
		return repositorio.findById(id);
	}

	@Override
	public Product add(Product p) {
		
		return repositorio.save(p);
	}

	@Override
	public Product edit(Product p) {
		
		return repositorio.save(p);
	}

	@Override
	public Product delete(int id) {
		
		Product p=repositorio.findById(id);
	        if(p!=null){
	            repositorio.delete(p);
	        }
	       return p;
	}

	
	
	

}
