package com.example.basketspring;
import org.springframework.stereotype.Component;
import org.springframework.web.context.annotation.SessionScope;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
@Component
@SessionScope
public class Basket {
    private final List<Long>  items =  new ArrayList<>();


    public void addItem(List<Long> itemIds) {
        items.addAll(itemIds);
    }

    public List<Long> getItems() {
        return Collections.unmodifiableList(items);
    }
}
