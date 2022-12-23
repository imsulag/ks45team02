package ks45.team02.admin.stock.controller;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("goods")
public class StockController {


    @GetMapping("/listStock")
    public String listStock(){
        return "goods/listStock";
    }
}
