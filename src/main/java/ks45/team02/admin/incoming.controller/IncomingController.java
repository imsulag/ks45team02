package ks45.team02.admin.incoming.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/incoming")
public class IncomingController {

    @GetMapping("/addIncoming")
    public String addIncoming() {

        return "incoming/addIncoming";
    }


    @GetMapping("/deleteIncoming")
    public String deleteIncoming() {

        return "incoming/deleteIncoming";
    }


    @GetMapping("/listIncoming")
    public String listIncoming() {

        return "incoming/listIncoming";
    }


    @GetMapping("/listStock")
    public String listStock() {

        return "incoming/listStock";
    }

    @GetMapping("/modifyIncoming")
    public String modifyIncoming() {

        return "incoming/modifyIncoming";
    }

}
