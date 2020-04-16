package com.codecool.uml.overriding;

import java.util.UUID;

public class Order implements Orderable {
    private UUID id;
    private String status;
    public Order(String newStatus){
        this.id = UUID.randomUUID();
        this.status = newStatus;
    }
    public String getStatus(){
        return this.status;
    }

    public boolean checkout(){
        this.status = "checked";
        return true;
    }
    public boolean pay(){
        this.status = "paid";
        return true;
    }
}
