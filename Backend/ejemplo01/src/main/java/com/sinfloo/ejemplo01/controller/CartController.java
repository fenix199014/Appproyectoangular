package com.sinfloo.ejemplo01.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sinfloo.ejemplo01.model.Cart;
import com.sinfloo.ejemplo01.service.CartService;



@CrossOrigin(origins = "http://localhost:4200", maxAge = 3600)
@RestController
@RequestMapping({"/carts"})
public class CartController {

	@Autowired
	CartService service;
	
	
	@GetMapping
	public List<Cart> listar(){
	return service.listar();	
	}
	

	
}
