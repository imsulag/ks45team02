package ks45.team02.admin.rawmatrials.incoming.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/materials")
public class RawIncomingController {

    @GetMapping("/addrawMaterialsincoming")
    public String addrawMaterialsincoming() {

        return "materials/addrawMaterialsincoming";
    }

    @GetMapping("/deleterawMaterialsincoming")
    public String deleterawMaterialsincoming() {

        return "materials/deleterawMaterialsincoming";
    }

    @GetMapping("/listrawMaterialsincoming")
    public String listrawMaterialsincoming() {

        return "materials/listrawMaterialsincoming";
    }

    @GetMapping("/listrawMaterialsnow")
    public String listrawMaterialsnow() {

        return "materials/listrawMaterialsnow";
    }

    @GetMapping("/listrawMaterialstotalinout")
    public String listrawMaterialstotalinout() {

        return "materials/listrawMaterialstotalinout";
    }

    @GetMapping("/modifyrawMaterialsincoming")
    public String modifyrawMaterialsincoming() {

        return "materials/modifyrawMaterialsincoming";
    }
}
