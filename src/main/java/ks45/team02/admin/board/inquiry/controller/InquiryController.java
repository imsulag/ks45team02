package ks45.team02.admin.board.inquiry.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/inquiry")
public class InquiryController {

    @GetMapping("/addinquiry")
    public String addinquiry() {

        return "inquiry/addinquiry";
    }

    @GetMapping("/deleteinquiry")
    public String deleteinquiry() {

        return "inquiry/deleteinquiry";
    }


    @GetMapping("/inquiryAnswer")
    public String inquiryAnswer() {

        return "inquiry/inquiryAnswer";
    }


    @GetMapping("/listinquiry")
    public String listinquiry() {

        return "inquiry/listinquiry";
    }

    @GetMapping("/listinquiryAnswer")
    public String listinquiryAnswer() {

        return "inquiry/listinquiryAnswer";
    }

    @GetMapping("/modifyinquiry")
    public String modifyinquiry() {

        return "inquiry/modifyinquiry";
    }
}
