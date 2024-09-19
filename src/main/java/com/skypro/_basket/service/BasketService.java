package com.skypro._basket.service;

import java.util.List;

public interface BasketService {
    void addItems(List<Integer> items);

    List<Integer> getItems();
}
