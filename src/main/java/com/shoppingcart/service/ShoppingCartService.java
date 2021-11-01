package com.shoppingcart.service;

import java.util.List;
import java.util.Optional;

import com.shoppingcart.entities.PreVenta;
import com.shoppingcart.entities.Product;

public interface ShoppingCartService {

    public List<Product> getAllProducts();

    public void addProduct(Product product);

    public void deleteProduct(Product product);

    public void modifyProduct(Product product);

    public Optional<List<Product>> getAllProductsFromCart(Integer cartId);

    public void addProductToCart(Product product);

    public void deletedProductInCart(Product product);

    public void modifyProductInCart(Product product);

    public PreVenta checkout(Integer cartId);
    
}
