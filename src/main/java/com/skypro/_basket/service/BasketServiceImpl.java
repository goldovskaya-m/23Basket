package com.skypro._basket.service;

import com.skypro._basket.repository.Basket;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Service
public class BasketServiceImpl {
    private final Basket basket;


    public BasketServiceImpl(Basket basket) {
        this.basket = basket;
    }
    public void addItems(List<Integer> items) {
        basket.addItems(items);

    }

    public  List<Integer> getItems() {
        return basket.getItems();

    }
}
