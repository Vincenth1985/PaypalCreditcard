package com.journaldev.design.strategy.model;

import com.journaldev.design.strategy.services.PaymentStrategy;

public class PaypalStrategy implements PaymentStrategy {

    private String emailId;
    private String password;

    public PaypalStrategy(String emailId, String password) {
        this.emailId = emailId;
        this.password = password;
    }


    @Override
    public void pay(int x) {
        System.out.println(x + " Betaling met Paypal.");

    }

}

