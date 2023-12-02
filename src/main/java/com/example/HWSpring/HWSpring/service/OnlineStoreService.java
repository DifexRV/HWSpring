package com.example.HWSpring.HWSpring.service;

import com.example.HWSpring.HWSpring.model.ShoppingCart;

import java.util.Collection;
import java.util.List;
import java.util.Map;

public interface OnlineStoreService {


    Collection<ShoppingCart> getShoppingCartMain();

    ShoppingCart addItem(ShoppingCart shoppingCart);

    String greetingsShoppingCart();

}
