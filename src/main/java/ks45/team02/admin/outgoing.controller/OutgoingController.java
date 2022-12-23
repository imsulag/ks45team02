package ks45.team02.admin.outgoing.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/outgoing")
public class OutgoingController {

    @GetMapping("/addOutgoing")
    public String addOutgoing() {

        return "incoming/addOutgoing";
    }

    @GetMapping("/deleteOutgoing")
    public String deleteOutgoing() {

        return "incoming/deleteOutgoing";
    }

    @GetMapping("/listOutgoing")
    public String listOutgoing() {

        return "incoming/listOutgoing";
    }

    @GetMapping("/modifyOutgoing")
    public String modifyOutgoing() {

        return "incoming/modifyOutgoing";
    }
}
