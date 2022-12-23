package ks45.team02.admin.vat.controller;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/vat")
public class VatController {
    @GetMapping("/listGoodsBuyVat")
    public String listGoodsBuyVat(){
        return "/vat/listGoodsBuyVat";
    }
}
