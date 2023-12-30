package com.example.basketspring;
import org.springframework.stereotype.Service;
import javax.servlet.http.HttpSession;
import java.util.ArrayList;
import java.util.List;

@Service
public class BasketService {
    private final Basket basket;
    public BasketService(Basket basket){
        this.basket = basket;
    }

    public void add(List<Long> itemIds) {
       basket.addItem(itemIds);
    }

    public List<Long> get() {
       return basket.getItems();
    }
}
