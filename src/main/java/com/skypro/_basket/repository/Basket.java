package com.skypro._basket.repository;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;
import org.springframework.web.context.annotation.SessionScope;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

@Component
@SessionScope //Scope(prototype) 00:40:00 онлайн урок
public class Basket {
    private final List<Integer> repository = new ArrayList<>();

    public void addItems(List<Integer> items) {
        repository.addAll(items);

    }

    public List<Integer> getItems() {
        return Collections.unmodifiableList(repository);
        //return repository; 00:24:21 онлайн урок
        //как сделать копию 00:25:50 онлайн урок

    }

}
