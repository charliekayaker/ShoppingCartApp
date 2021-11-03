package com.shoppingcart.enums;

public enum Status {

    PENDING("Pending"), COMPLETED("Completed");

    String ref;

    Status(String s){
        this.ref = s;
    }

    public String getRef(){
        return ref;
    }
    
}
