package com.codecool.uml.overriding;

public class PaymentProcess extends AbstractProcess {
    @Override
    protected void action(Orderable item) {
        System.out.println("Stepped into payment phase");
        if(item.pay()){
            System.out.println("Conditions are matching for payment");
        } else {
            System.out.println("Conditions aren't matching for payment");
        }

        System.out.println("Payment phase ended");
    }
}
