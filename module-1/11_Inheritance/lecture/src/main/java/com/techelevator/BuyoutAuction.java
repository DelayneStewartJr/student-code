package com.techelevator;

import java.lang.reflect.Constructor;

public class BuyoutAuction extends Auction {
    //Properties
    private int buyoutPrice;

    // Constructor
    public BuyoutAuction(String itemsForSale, int buyoutPrice) {
        super(itemsForSale);
        this.buyoutPrice = buyoutPrice;
    }


    // Getter
    public int getBuyoutPrice() {
        return buyoutPrice;
    }


}