package ks45.team02.admin.board.Faq.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/faq")
public class FaqController {

    @GetMapping("/addFAQ")
    public String addFAQ(){
        return "FAQ/addFAQ";
    }

    @GetMapping("/deleteFAQ")
    public String deleteFAQ(){
        return "FAQ/deleteFAQ";
    }
    @GetMapping("/listFAQ")
    public String listFAQ(){
        return "FAQ/listFAQ";
    }
}
