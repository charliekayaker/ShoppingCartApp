package com.shoppingcart.entities;

import javax.persistence.Entity;
import javax.persistence.Id;

import lombok.Data;

@Entity
public @Data class Product {

    @Id
    private String sku;
    private String nombre;
    private String description;
    private String price;
    
}
