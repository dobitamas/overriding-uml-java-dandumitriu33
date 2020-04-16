package com.codecool.uml.overriding;

import java.util.UUID;

public class Order implements Orderable {
    private UUID id;
    private String status;

    public Order(){
        this.id = UUID.randomUUID();
        this.status = "in-progress";
    }
    public String getStatus(){
        return this.status;
    }

    public boolean checkout(){
        System.out.println("Conditions for checkout verified");
        this.status = "checked";
        return true;
    }
    public boolean pay(){
        System.out.println("Conditions for payment verified");
        this.status = "paid";
        return true;
    }
}
