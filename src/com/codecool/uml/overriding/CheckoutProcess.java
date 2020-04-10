package com.codecool.uml.overriding;

public class CheckoutProcess extends AbstractProcess {

    @Override
    protected void action(Orderable item) {
        System.out.println("Entered Checkout process");
        if (item.checkout()) {
            System.out.println("Checkout conditions OK.");
        }
        else {
            System.out.println("Checkout encountered an issue.");
        }
        System.out.println("Checkout ended.");

    }
}
