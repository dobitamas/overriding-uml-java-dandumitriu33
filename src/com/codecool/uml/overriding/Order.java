package com.codecool.uml.overriding;

public class Order implements Orderable {
    static int counter = 0;
    private int id;
    private String status;

    public Order() {
        counter++;
        id = counter;
        this.status = "in progress";
    }

    public String getStatus() {
        return this.status;
    }

    public boolean checkout() {
        System.out.println("Verifying conditions.");
        System.out.println("Conditions verified.");
        this.status = "checked";
        return true;
    }

    public boolean pay() {
        System.out.println("Verifying conditions.");
        System.out.println("Conditions verified.");
        this.status = "paid";
        return true;
    }

}
