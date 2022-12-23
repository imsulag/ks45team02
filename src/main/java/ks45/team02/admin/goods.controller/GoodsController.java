package ks45.team02.admin.goods.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/goods")
public class GoodsController {

    @GetMapping("/addCategory")
    public String addCategory() {

        return "goods/addCategory";
    }

    @GetMapping("/addGoods")
    public String addGoods() {

        return "goods/addGoods";
    }

    @GetMapping("/addGoodsUnitPrice")
    public String addGoodsUnitPrice() {

        return "goods/addGoodsUnitPrice";
    }


    @GetMapping("/deleteCategory")
    public String deleteCategory() {

        return "goods/deleteCategory";
    }

    @GetMapping("/deleteGoods")
    public String deleteGoods() {

        return "goods/deleteGoods";
    }


    @GetMapping("/listCategory")
    public String listCategory() {

        return "goods/listCategory";
    }

    @GetMapping("/listGoods")
    public String listGoods() {

        return "goods/listGoods";
    }

    @GetMapping("/listGoodsUnitPrice")
    public String listGoodsUnitPrice() {

        return "goods/listGoodsUnitPrice";
    }


    @GetMapping("/modifyCategory")
    public String modifyCategory() {

        return "goods/modifyCategory";
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
