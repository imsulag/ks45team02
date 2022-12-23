package ks45.team02.admin.order.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/order")
public class OrderController {

    @GetMapping("/addOrder")
    public String addOrder() {

        return "order/addOrder";
    }

    @GetMapping("/deleteOrder")
    public String deleteOrder() {

        return "order/deleteOrder";
    }

    @GetMapping("/listOrder")
    public String listOrder() {

        return "order/listOrder";
    }

    @GetMapping("/modifyOrder")
    public String modifyOrder() {

        return "order/modifyOrder";
    }
}
