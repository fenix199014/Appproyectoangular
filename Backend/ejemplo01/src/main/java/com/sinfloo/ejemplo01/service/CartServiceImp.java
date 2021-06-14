package com.sinfloo.ejemplo01.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sinfloo.ejemplo01.model.Cart;
import com.sinfloo.ejemplo01.repository.CartRepositorio;


@Service
public class CartServiceImp implements CartService{

	@Autowired
	private CartRepositorio repositorio;
	
	@Override
	public List<Cart> listar() {
		
		return repositorio.findAll();
	}

	
	

}
