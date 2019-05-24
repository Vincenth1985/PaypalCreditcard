package com.journaldev.design.strategy;

import com.journaldev.design.strategy.services.PaymentStrategy;

public class CreditCardStrategy implements PaymentStrategy {

    String name;
    String cardNumber;
    String cvv;
    String dateOfExpiry;


    public CreditCardStrategy(String name, String cardNumber, String cvv, String dateOfExpiry) {
        this.name = name;
        this.cardNumber = cardNumber;
        this.cvv = cvv;
        this.dateOfExpiry = dateOfExpiry;
    }


    @Override
    public void pay(int x) {

    }
}
