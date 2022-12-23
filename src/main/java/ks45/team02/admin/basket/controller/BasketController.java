package ks45.team02.admin.basket.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("basket")
public class BasketController {
    @GetMapping("/addBasket")

    public String addBasket(){
        return "basket/addBasket";
    }

    @GetMapping("/deleteBasket")
    public String deleteBasket(){
        return "basket/deleteBasket";
    }

    @GetMapping("/listBasket")
    public String listBasket(){
        return "/basket/listBasket";
    }

    @GetMapping("/modifyBasket")
    public String modifyBasket(){
        return "basket/modifyBasket";
    }
}
