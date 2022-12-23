package ks45.team02.admin.sales_buying.controller;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class SaleBuyingController {
    @RequestMapping("/sales_Buying")

    @GetMapping("/addGoodsBuying")
    public String addGoodsBuying(){
        return "sales_Buying/addGoodsBuying";
    }

    @GetMapping("/addGoodsSales")
    public String addGoodsSales(){
        return "sales_Buying/addGoodsSales";
    }

    @GetMapping("GoodsBuyingPayment")
    public String GoodsBuyingPayment(){
        return "sales_Buying/GoodsBuyingPayment";
    }
    @GetMapping("GoodsSalesBuyingGroup")
    public String GoodsSalesBuyingGroup(){
        return "sales_Buying/GoodsSalesBuyingGroup";
    }

    @GetMapping("GoodsSalesTotalInquiry")
    public String GoodsSalesTotalInquiry(){
        return "sales_Buying/GoodsSalesTotalInquiry";
    }
    @GetMapping("listGoodsBuying")
    public String listGoodsBuying(){
        return "sales_Buying/listGoodsBuying";
    }

    @GetMapping("listGoodsBuyVat")
    public String listGoodsBuyVat(){
        return "sales_Buying/listGoodsBuyVat";
    }

    @GetMapping("listGoodsSales")
    public String listGoodsSales(){
        return "sales_Buying/listGoodsSales";
    }

    @GetMapping("modifyGoodsBuying")
    public String modifyGoodsBuying(){
        return "sales_Buying/modifyGoodsBuying";
    }

    @GetMapping("modifyGoodsSales")
    public String modifyGoodsSales(){
        return "sales_Buying/modifyGoodsSales";
    }

}
