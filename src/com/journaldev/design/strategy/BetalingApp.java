package com.journaldev.design.strategy;

import com.journaldev.design.strategy.model.CreditCardStrategy;
import com.journaldev.design.strategy.model.Item;
import com.journaldev.design.strategy.model.PaypalStrategy;
import com.journaldev.design.strategy.model.ShoppingCart;
import com.journaldev.design.strategy.services.PaymentStrategy;


public class BetalingApp {

    public static void main(String[] args) {


        ShoppingCart shoppingCart = new ShoppingCart();

        shoppingCart.addItem(new Item("231434", 23), new Item("2323232", 456));


        shoppingCart.getItemslist().stream()
                .forEach(System.out::println);

        System.out.println("Total Amount : " + shoppingCart.calculateTotal() + "€");


//        shoppingCart.pay(new CreditCardStrategy("Vincent", "323232", "RE3", "24556"));
//        shoppingCart.pay(new PaypalStrategy("Vincenth1985@gmail.com", "323232"));


        shoppingCart.pay(new PaymentStrategy() {
            @Override
            public void pay(int x) {
                new CreditCardStrategy("Vincent", "323232", "RE3", "24556").pay(x);

            }
        });

/*
        shoppingCart.pay((x)-> new PaypalStrategy("vincenth1985@gmail.com ","32323").pay(x));
*/
        shoppingCart.pay(new PaypalStrategy("vincenth1985@gmail.com ","32323")::pay);


    }

}
