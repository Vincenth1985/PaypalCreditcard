package com.journaldev.design.strategy.model;

import com.journaldev.design.strategy.services.PaymentStrategy;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ShoppingCart {

    List<Item> itemslist;

    {
        itemslist = new ArrayList<>();
    }


    public ShoppingCart() {
    }


    public void addItem(Item... item) {
        itemslist.addAll(Arrays.asList(item));

    }

    public void removeItem(Item item) {
        this.itemslist.remove(item);

    }

    public int calculateTotal() {
        int temp = 0;
        for (Item item : itemslist) {
            temp += item.getPrice();
        }
        return temp;
    }

    public void pay(PaymentStrategy paymentStrategy) {
        paymentStrategy.pay(calculateTotal());

    }

    public List<Item> getItemslist() {
        return itemslist;
    }

    public void setItemslist(List<Item> itemslist) {
        this.itemslist = itemslist;
    }

    @Override
    public String toString() {
        return "ShoppingCart{" +
                "itemslist=" + itemslist.toString() +
                '}';
    }
}
