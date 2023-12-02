package com.example.HWSpring.HWSpring.service;

import com.example.HWSpring.HWSpring.model.ShoppingCart;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;
import org.springframework.web.context.annotation.RequestScope;
import org.springframework.web.context.annotation.SessionScope;

import java.util.*;


@Service
@SessionScope
public class OnlineStoreServiceImpl implements OnlineStoreService {

    private Map<String, ShoppingCart> shoppingCartMain = new HashMap<>(Map.of());

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
