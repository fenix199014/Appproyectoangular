package com.sinfloo.ejemplo01.repository;

import java.util.List;

import org.springframework.data.repository.Repository;

import com.sinfloo.ejemplo01.model.Cart;



public interface CartRepositorio extends Repository<Cart, Integer>{

	List<Cart> findAll();
	

}
