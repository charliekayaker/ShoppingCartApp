package com.shoppingcart.enums;

public enum STATUS {

    PENDING("Pending"), COMPLETED("Completed");

    String ref;

    STATUS(String s){
        this.ref = s;
    }

    public String getRef(){
        return ref;
    }


    
}
