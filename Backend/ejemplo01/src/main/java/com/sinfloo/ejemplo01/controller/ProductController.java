package com.sinfloo.ejemplo01.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sinfloo.ejemplo01.model.Product;
import com.sinfloo.ejemplo01.service.ProductService;


@CrossOrigin(origins = "http://localhost:4200", maxAge = 3600)
@RestController
@RequestMapping({"/products"})
public class ProductController {

	@Autowired
	ProductService service;
	
	
	@GetMapping
	public List<Product> listar(){
	return service.listar();	
	}
	
	
	 @PostMapping
	 public Product agregar(@RequestBody Product p){
	    return service.add(p);
	}
	    
	 @GetMapping(path = {"/{id}"})
	 public Product listarId(@PathVariable("id")int id){
	   return service.listarId(id);
	 }
	   
	 
	@PutMapping(path = {"/{id}"})//rchavez
	 public Product editar(@RequestBody Product p,@PathVariable("id") int id){
	     p.setId(id);
	    return service.edit(p);
	  }
	 
	 /*static List<Product> listaPersonas = new ArrayList<Product>();
	 
	 @PutMapping("/{id}")
	  public void actualizar(@PathVariable("id") int id, @RequestBody Product p) {
	    
	    service.add(p);
	  
	  }
	 */
	 
	 
	 
	 @DeleteMapping(path = {"/{id}"})
	 public Product delete(@PathVariable("id") int  id){
	   return service.delete(id);
	  }
	
	
}
