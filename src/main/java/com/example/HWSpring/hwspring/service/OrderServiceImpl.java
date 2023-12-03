package com.example.HWSpring.hwspring.service;

import com.example.HWSpring.hwspring.model.Cart;
import org.springframework.stereotype.Service;
import org.springframework.web.context.annotation.SessionScope;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

@Service
public class OrderServiceImpl implements OrderService {

    private List<Cart> carts = new ArrayList<>();

    @Override
    public List<Cart> addItems(List<Cart> idItem) {
        carts.addAll(idItem);
        return idItem;
    }

    @Override
    public List<Cart> getItems() {
        return Collections.unmodifiableList(carts);
    }
}

