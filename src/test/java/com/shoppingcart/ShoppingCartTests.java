package com.shoppingcart;

import java.util.List;

import com.shoppingcart.entities.Product;
import com.shoppingcart.entities.ShoppingCart;
import com.shoppingcart.service.ShoppingCartService;

import org.junit.Assert;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

public class ShoppingCartTests{

      @Autowired
      private ShoppingCartService service;
      
    
      @Test
      public void getShoppingCart(){
              
      }  

      @Test
      public void getProduct(){
          var sku = "AR-15657";
        
      }

      @Test
      public void addProduct(){                    
          var sku = "AR-15657";
          Product product = new Product();
          product.setDescription("Camiseta de argentina messi");
          product.setNombre("Camiseta ARGENTINA");
          product.setSku(sku);
          product.setPrice("352.25");

          service.addProduct(product);                   
      }

      @Test
      public void getAllProducts(){
          
         List<Product> products = service.getAllProducts();
         Assert.assertTrue( products.size() > 0 );

      }
}