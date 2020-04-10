package com.codecool.uml.overriding;

public class PaymentProcess extends AbstractProcess {

    @Override
    protected void action(Orderable item) {
        System.out.println("Entered Payment process");
        if (item.pay()) {
            System.out.println("Payment conditions OK.");
        }
        else {
            System.out.println("Payment process encountered an issue.");
        }
        System.out.println("Payment ended.");
    }
}
