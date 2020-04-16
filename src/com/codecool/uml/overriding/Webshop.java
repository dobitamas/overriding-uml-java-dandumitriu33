package com.codecool.uml.overriding;

public class Webshop {

    public static void main(String[] args) {
        System.out.println("<<< TESTING SHOPPING >>>");
        System.out.println("Simulating customer browsing and adding items to cart.");
        Order newOrder = new Order();
        System.out.println("Order status: " + newOrder.getStatus());
        System.out.println("<<< TESTING CHECKOUT >>>");
        CheckoutProcess newCheckout = new CheckoutProcess();
        newCheckout.process(newOrder);
        System.out.println("Order status: " + newOrder.getStatus());
        System.out.println("<<< TESTING PAYMENT >>>");
        PaymentProcess newPayment = new PaymentProcess();
        newPayment.process(newOrder);
        System.out.println("Order status: " + newOrder.getStatus());
    }
}
