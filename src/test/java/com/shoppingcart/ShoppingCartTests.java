package com.shoppingcart;

import com.shoppingcart.entities.ShoppingCart;

import org.junit.Assert;
import org.junit.Test;

public class ShoppingCartTests{
      
    
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
      public void getProductWithDiscount(){
          var sku = "AR-15657";
          Product product = service.getProductWithDiscount(sku);
          Assert.assertTrue( product.Precio() == 6535/2);
      }
}