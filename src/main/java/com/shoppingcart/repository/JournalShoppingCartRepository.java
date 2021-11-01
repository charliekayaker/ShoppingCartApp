package com.shoppingcart.repository;

import com.shoppingcart.entities.ShoppingCart;
import org.springframework.data.jpa.repository.JpaRepository;

public interface JournalShoppingCartRepository extends JpaRepository<ShoppingCart, Integer> {
    
}
