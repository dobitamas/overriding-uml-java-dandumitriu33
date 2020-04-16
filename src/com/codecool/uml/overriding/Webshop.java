package com.codecool.uml.overriding;

public class Webshop {

    public static void main(String[] args) {
        System.out.println("--- SHOP TESTING PHASE ---");
        System.out.println("Chosing items and adding to cart");
        Order testOrder = new Order();
        System.out.println("Order status: " + testOrder.getStatus());
        System.out.println("--- CHECKOUT TESTING PHASE ---");
        CheckoutProcess testCheckout = new CheckoutProcess();
        testCheckout.process(testOrder);
        System.out.println("Order status: " + testOrder.getStatus());
        System.out.println("--- PAYMENT TESTING PHASE ---");
        PaymentProcess testPayment = new PaymentProcess();
        testPayment.process(testOrder);
        System.out.println("Order status: " + testOrder.getStatus());
    }
}
