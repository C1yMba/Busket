package com.example.basketspring;
import org.springframework.web.bind.annotation.*;
import javax.servlet.http.HttpSession;
import java.util.List;

@RestController
@RequestMapping("/order")
public class BasketController {
    private BasketService basketService;
    public BasketController(BasketService basketService) {
        this.basketService = basketService;
    }

    @GetMapping("/add")
    public String addToBasket(@RequestParam("id") List<Long> ids) {
        basketService.add(ids);
        return "Items added successfully";
    }

    @GetMapping("/get")
    public List<Long> getBasket() {
        return basketService.get();
    }
}

