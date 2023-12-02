package com.example.HWSpring.HWSpring.controller;

import com.example.HWSpring.HWSpring.model.ShoppingCart;
import com.example.HWSpring.HWSpring.service.OnlineStoreService;
import com.example.HWSpring.HWSpring.service.OnlineStoreServiceImpl;
import jakarta.servlet.http.HttpSession;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.Collection;
import java.util.Map;

@RestController
public class HWSpringController {

    private final OnlineStoreService onlineStoreServiceimpl;

    public HWSpringController(OnlineStoreService onlineStoreServiceimpl) {
        this.onlineStoreServiceimpl = onlineStoreServiceimpl;
    }

    @GetMapping
    public String greetingsShoppingCart(HttpSession session) {
        session.setAttribute("shoppingCartMain",onlineStoreServiceimpl.getShoppingCartMain());
        return onlineStoreServiceimpl.greetingsShoppingCart();
    }

    @GetMapping(path = "/add")
    public ShoppingCart addItem(@RequestParam(value = "itemName", required = false) String itemName,
                                @RequestParam(value = "itemId", required = false) int itemId,
                                HttpSession session) {
        Map<String, ShoppingCart> shoppingCartMain = (Map<String, ShoppingCart>) session.getAttribute("shoppingCartMain");
        ShoppingCart shoppingCart = new ShoppingCart(itemName, itemId);
        onlineStoreServiceimpl.addItem(shoppingCart);
        return shoppingCart;
    }

    @GetMapping(path = "/get")
    public ResponseEntity<Collection<ShoppingCart>> getShoppingCart(HttpSession session) {
        Map<String, ShoppingCart> shoppingCartMain = (Map<String, ShoppingCart>) session.getAttribute("shoppingCartMain");
        Collection<ShoppingCart> shoppingCart = onlineStoreServiceimpl.getShoppingCartMain();
        return ResponseEntity.ok().body(shoppingCart);
    }

}
