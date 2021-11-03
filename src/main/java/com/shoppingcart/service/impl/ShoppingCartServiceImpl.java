package com.shoppingcart.service.impl;

import java.lang.StackWalker.Option;
import java.util.List;
import java.util.Optional;

import com.shoppingcart.entities.PreVenta;
import com.shoppingcart.entities.Product;
import com.shoppingcart.entities.ShoppingCart;
import com.shoppingcart.repository.JournalShoppingCartRepository;
import com.shoppingcart.repository.ProductsRepository;
import com.shoppingcart.service.ShoppingCartService;

import org.springframework.beans.factory.annotation.Autowired;

public class ShoppingCartServiceImpl implements ShoppingCartService{

    @Autowired
    private ProductsRepository productsRepository;

    @Autowired
    private JournalShoppingCartRepository cartRepository;

    @Override
    public List<Product> getAllProducts() {
        
        return productsRepository.findAll();
    }

    @Override
    public void addProduct(Product product) {
        
        productsRepository.save(product);
        
    }

    @Override
    public void deleteProduct(Product product) {
       
        productsRepository.delete(product);
        
    }

    @Override
    public Optional<List<Product>> getAllProductsFromCart(Integer cartId) {
        
        Optional<ShoppingCart> optionalShoppingCart = cartRepository.findById(cartId);
        
        return Optional.of(optionalShoppingCart.get().getProducts());        
    }

    @Override
    public void addProductToCart(Integer cartId, Product product) throws Exception {
        ShoppingCart shoppingCart = getCartById(cartId);
        shoppingCart.getProducts().add(product);
            
    }

    @Override
    public void deletedProductInCart(Integer cartId, Product product) throws Exception {
        
        ShoppingCart shoppingCart = getCartById(cartId);
        //shoppingCart.getProducts().stream().filter(prod -> prod.getSku().equals(product.getSku())); 
        shoppingCart.getProducts().remove(product);  
    }

    @Override
    public PreVenta checkout(Integer cartId) {
        // TODO Auto-generated method stub
        return null;
    }
    
   
    private ShoppingCart getCartById(Integer id) throws Exception{
        Optional<ShoppingCart> optionalShoppingCart = cartRepository.findById(id);
        ShoppingCart shoppingCart = null;
        if(optionalShoppingCart.isPresent()){
            shoppingCart = optionalShoppingCart.get();

            return cartRepository.save(shoppingCart);
        }else{
            throw new Exception("Cart not found . . .");
        }
    }
}
