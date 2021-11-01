package com.shoppingcart.entities;

import java.util.List;
import javax.persistence.Entity;
import javax.persistence.Id;
import lombok.Data;

@Entity
public @Data class ShoppingCart {
    
    @Id
    private Integer id;
    private List<Product> products;

}
