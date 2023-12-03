package com.example.HWSpring.hwspring.controller;

import com.example.HWSpring.hwspring.model.Cart;
import com.example.HWSpring.hwspring.service.OrderService;
import jakarta.servlet.http.HttpSession;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.Collection;
import java.util.List;


@RestController
public class HWSpringController2 {

    private final OrderService orderServiceimpl;

    public HWSpringController2(OrderService orderService) {
        this.orderServiceimpl = orderService;
    }

    @GetMapping(path = "/add")
    public Cart addItem(@RequestParam(value = "items") List<Integer> items, HttpSession session) {
        Cart shoppingCart = (Cart) session.getAttribute("shoppingCart");
        if (shoppingCart == null) {
            shoppingCart = new Cart();
        }
        shoppingCart.addItems(items);
        session.setAttribute("shoppingCart", shoppingCart);
        return shoppingCart;
    }

    @GetMapping(path = "/get")
    public ResponseEntity<Cart> getShoppingCart(HttpSession session) {
        Cart shoppingCart = (Cart) session.getAttribute("shoppingCart");
        if (shoppingCart == null) {
            shoppingCart = new Cart();
            session.setAttribute("shoppingCart", shoppingCart);
        }
        return ResponseEntity.ok().body(shoppingCart);
    }

}
