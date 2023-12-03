package com.example.HWSpring.hwspring.service;

import com.example.HWSpring.hwspring.model.ShoppingCart;
import org.springframework.stereotype.Service;
import org.springframework.web.context.annotation.SessionScope;

import java.util.*;


@Service
@SessionScope
public class OnlineStoreServiceImpl implements OnlineStoreService {

    private Map<String, ShoppingCart> shoppingCartMain = new HashMap<>();

    @Override
    public String greetingsShoppingCart() {
        return "<b>Вы находитесь в своей корзине</b>";
    }

    @Override
    public ShoppingCart addItem(ShoppingCart shoppingCart) {
        shoppingCartMain.put(shoppingCart.getItemName(), shoppingCart);
        return shoppingCart;
    }

    @Override
    public Collection<ShoppingCart> getShoppingCartMain() {
        return Collections.unmodifiableCollection(shoppingCartMain.values());
    }

}
