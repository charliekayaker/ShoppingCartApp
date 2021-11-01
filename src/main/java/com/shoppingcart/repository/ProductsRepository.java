package com.shoppingcart.repository;

import com.shoppingcart.entities.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductsRepository extends JpaRepository<Product, String>{

}