package com.example.HWSpring.hwspring.service;

import com.example.HWSpring.hwspring.model.ShoppingCart;

import java.util.Collection;

public interface OnlineStoreService {


    Collection<ShoppingCart> getShoppingCartMain();

    ShoppingCart addItem(ShoppingCart shoppingCart);

    String greetingsShoppingCart();

}
