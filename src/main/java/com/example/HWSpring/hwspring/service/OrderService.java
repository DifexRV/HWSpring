package com.example.HWSpring.hwspring.service;
import com.example.HWSpring.hwspring.model.Cart;

import java.util.List;

public interface OrderService {

    List<Cart> addItems(List<Cart> idList);
    List<Cart> getItems();

}

