package com.example.HWSpring.hwspring.model;
import org.springframework.stereotype.Component;
import org.springframework.web.context.annotation.SessionScope;

import java.util.ArrayList;
import java.util.List;

@Component
@SessionScope
public class Cart {
    private final List<Integer> items;

    public Cart() {
        this.items = new ArrayList<>();
    }

    public void addItems(List<Integer> idList) {
        items.addAll(idList);
    }

    public List<Integer> getItems() {
        return items;
    }
}
