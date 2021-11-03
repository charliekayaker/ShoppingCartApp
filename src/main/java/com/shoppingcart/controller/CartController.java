package com.shoppingcart.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import com.google.inject.Singleton;
import com.shoppingcart.entities.Product;
import com.shoppingcart.service.ShoppingCartService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@Singleton
@RequestMapping("api")  //# http://localhost:9800/api/
public class CartController{

    @Autowired
    private ShoppingCartService service;

    @GetMapping("/retrieveProducts")
    public ResponseEntity<List<Product>> retrieveAllProducts(HttpServletRequest request) {
		
		List<Product> response = null;
		
		response = service.getAllProducts();	
	
		return ResponseEntity.ok(response);
	}

    @PostMapping("/recordProduct")
    public void recordProduct(HttpServletRequest request) {
		
	}

}