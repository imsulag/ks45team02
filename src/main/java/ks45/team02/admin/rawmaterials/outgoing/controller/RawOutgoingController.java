package ks45.team02.admin.rawmatrials.outgoing.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/materials_outgoing")
public class RawOutgoingController {

    @GetMapping("/addrawMaterialsoutcoming")
    public String addrawMaterialsoutcoming() {

        return "materials_outgoing/addrawMaterialsoutcoming";
    }

    @GetMapping("/deleterawMaterialsoutcoming")
    public String deleterawMaterialsoutcoming() {

        return "materials_outgoing/deleterawMaterialsoutcoming";
    }

    @GetMapping("/listrawMaterialsoutcoming")
    public String listrawMaterialsoutcoming() {

        return "materials_outgoing/listrawMaterialsoutcoming";
    }

    @GetMapping("/modifyrawMaterialsoutcoming")
    public String modifyrawMaterialsoutcoming() {

        return "materials_outgoing/modifyrawMaterialsoutcoming";
    }
}
