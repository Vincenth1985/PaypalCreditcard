package com.journaldev.design.strategy;

import com.journaldev.design.strategy.model.Item;
import com.journaldev.design.strategy.model.ShoppingCart;


public class BetalingApp {

    public static void main(String[] args) {


        ShoppingCart shoppingCart = new ShoppingCart();

        shoppingCart.addItem(new Item("231434", 23), new Item("2323232", 456));


        shoppingCart.getItemslist().stream()
                .forEach(System.out::println);


    }
}
