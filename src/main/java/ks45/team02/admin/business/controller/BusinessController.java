package ks45.team02.admin.business.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/business")
public class BusinessController {

    @GetMapping("/addBusiness")
    public String addBusiness() {

        return "business/addBusiness";
    }

    @GetMapping("/deleteBusiness")
    public String deleteBusiness() {

        return "business/deleteBusiness";
    }

    @GetMapping("/listBusiness")
    public String listBusiness(){

        return "business/listBusiness";
    }

    @GetMapping("/modifyBusiness")
    public String modifyBusiness() {

        return "business/modifyBusiness";
    }
}
