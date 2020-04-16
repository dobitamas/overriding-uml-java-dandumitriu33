package com.codecool.uml.overriding;

public class CheckoutProcess extends AbstractProcess {
    @Override
    protected void action(Orderable item) {
        System.out.println("Checkout process started");
        if(item.checkout()){
            System.out.println("Conditions are matching for checkout");
        } else {
            System.out.println("Something bad happened :(");
        }
        System.out.println("Ended the checkout phase");
    }
}
