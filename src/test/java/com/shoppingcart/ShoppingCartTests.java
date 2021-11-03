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
         
         ShoppingCart shoppingCart = service.getShoppingCart();
         Object obj = shoppingCart.getStatus();
         Assert.assertTrue( obj instanceof Enum);
         Assert.assertTrue( shoppingCart.getStatus() == StatusCart.PENDING);
         Assert.assertTrue( shoppingCart.getQuantify() == 0);        
      }  

      @Test
      public void getProduct(){
          var sku = "AR-15657";
          Product product = service.getProduct(sku);
          Assert.assertTrue( product.getName().equals("CamisetaArgentina"));
          Assert.assertTrue( product.getDesription().equals("Camiseta de Argentina 2021 Talle L"));
          Assert.assertTrue( product.Precio() == 6535);
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