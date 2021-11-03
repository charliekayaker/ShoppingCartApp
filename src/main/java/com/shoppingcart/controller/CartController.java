package com.shoppingcart.controller;

import java.io.IOException;
import java.util.List;
import java.util.Optional;

import javax.servlet.http.HttpServletRequest;

import com.google.inject.Singleton;
import com.shoppingcart.entities.Product;
import com.shoppingcart.service.ShoppingCartService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javassist.tools.web.BadHttpRequest;

import org.codehaus.jackson.map.ObjectMapper;

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
    public void recordProduct(HttpServletRequest request) throws BadHttpRequest {
        ObjectMapper mapper = new ObjectMapper();
        
        try {
            service.addProduct(mapper.readValue(request.getInputStream(), Product.class));
        } catch (IOException e) {
            throw new BadHttpRequest();
        }
        
	}

    @GetMapping("/deleteProductById/{sku}")
    public void deleteProduct(HttpServletRequest request,  @PathVariable String sku) throws BadHttpRequest {
        service.deleteProduct(sku);            
	}

    @PostMapping("/modifyProduct")
    public void modifyProduct(HttpServletRequest request) throws BadHttpRequest {
        ObjectMapper mapper = new ObjectMapper();
        
        try {
            service.addProduct(mapper.readValue(request.getInputStream(), Product.class));
        } catch (IOException e) {
            throw new BadHttpRequest();
        }
        
	}

    @GetMapping("/getProductsFromCart/{id}")
    public ResponseEntity<List<Product>> getProductsFromCart(HttpServletRequest request,  @PathVariable String id) throws Exception {
        Optional<List<Product>> products = service.getAllProductsFromCart(Integer.parseInt(id));
        
        if(products.isPresent())
            return ResponseEntity.ok(products.get());
        else
            throw new Exception();    

	}


}