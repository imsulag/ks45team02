package ks45.team02.admin.payment.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/payment")
public class PaymentController {

    @GetMapping("/addBuynow")
    public String addBuynow() {

        return "payment/addBuynow";
    }

    @GetMapping("/addPayment")
    public String addPayment() {

        return "payment/addPayment";
    }

    @GetMapping("/cancelBuynoew")
    public String cancelBuynoew() {

        return "payment/cancelBuynoew";
    }

    @GetMapping("/deletePayment")
    public String deletePayment() {

        return "payment/deletePayment";
    }

    @GetMapping("/listBuynow")
    public String listBuynow() {

        return "payment/listBuynow";
    }

    @GetMapping("/listPayment")
    public String listPayment() {

        return "payment/listPayment";
    }
}
