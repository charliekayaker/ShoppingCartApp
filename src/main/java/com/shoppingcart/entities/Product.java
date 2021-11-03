package com.shoppingcart.entities;

import javax.persistence.Entity;
import javax.persistence.Id;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@AllArgsConstructor
@NoArgsConstructor
public @Data class Product {

    @Id
    private String sku;
    private String nombre;
    private String description;
    private String price;
    
}
