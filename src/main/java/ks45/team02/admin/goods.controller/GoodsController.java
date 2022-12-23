package ks45.team02.admin.goods.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/goods")
public class GoodsController {


    @GetMapping("/addGoods")
    public String addGoods() {

        return "goods/addGoods";
    }

    @GetMapping("/deleteGoods")
    public String deleteGoods() {

        return "goods/deleteGoods";
    }

    @GetMapping("/listGoods")
    public String listGoods() {

        return "goods/listGoods";
    }

    @GetMapping("/modifyGoods")
    public String modifyGoods() {

        return "goods/modifyGoods";
    }

    @GetMapping("/orderGoods")
    public String orderGoods() {

        return "goods/orderGoods";
    }

}
