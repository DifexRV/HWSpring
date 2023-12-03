package com.example.HWSpring.hwspring.model;

public class ShoppingCart {
    private String itemName;
    private int itemId;

    public String getItemName() {
        return itemName;
    }

    public void setItemName(String itemName) {
        this.itemName = itemName;
    }


    public ShoppingCart(String itemName, int itemId) {
        this.itemName = itemName;
        this.itemId = itemId;
    }

    public int getItemId() {
        return itemId;
    }

    public void setItemId(int itemId) {
        this.itemId = itemId;
    }
}
