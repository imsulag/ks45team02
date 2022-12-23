package ks45.team02.admin.outgoing.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/outgoing")
public class OutgoingController {

    @GetMapping("/addOutgoing")
    public String addOutgoing() {

        return "outgoing/addOutgoing";
    }

    @GetMapping("/deleteOutgoing")
    public String deleteOutgoing() {

        return "outgoing/deleteOutgoing";
    }

    @GetMapping("/listOutgoing")
    public String listOutgoing() {

        return "outgoing/listOutgoing";
    }

    @GetMapping("/modifyOutgoing")
    public String modifyOutgoing() {

        return "outgoing/modifyOutgoing";
    }
}
