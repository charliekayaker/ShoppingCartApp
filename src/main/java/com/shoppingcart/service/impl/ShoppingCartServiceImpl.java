package com.shoppingcart.service.impl;

import java.util.List;
import java.util.Optional;

import com.shoppingcart.entities.PreVenta;
import com.shoppingcart.entities.Product;
import com.shoppingcart.service.ShoppingCartService;

public class ShoppingCartServiceImpl implements ShoppingCartService{

    @Override
    public List<Product> getAllProducts() {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public void addProduct(Product product) {
        // TODO Auto-generated method stub
        
    }

    @Override
    public void deleteProduct(Product product) {
        // TODO Auto-generated method stub
        
    }

    @Override
    public void modifyProduct(Product product) {
        // TODO Auto-generated method stub
        
    }

    @Override
    public Optional<List<Product>> getAllProductsFromCart(Integer cartId) {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public void addProductToCart(Product product) {
        // TODO Auto-generated method stub
        
    }

    @Override
    public void deletedProductInCart(Product product) {
        // TODO Auto-generated method stub
        
    }

    @Override
    public void modifyProductInCart(Product product) {
        // TODO Auto-generated method stub
        
    }

    @Override
    public PreVenta checkout(Integer cartId) {
        // TODO Auto-generated method stub
        return null;
    }
    
}
