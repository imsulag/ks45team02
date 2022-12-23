package ks45.team02.admin.point.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/point")
public class PointController {

    @GetMapping("/addPointStandard")
    public String addPointStandard() {

        return "point/addPointStandard";
    }

    @GetMapping("/listPoint")
    public String listPoint() {

        return "point/listPoint";
    }

    @GetMapping("listPointStandard")
    public String listPointStandard() {

        return "point/listPointStandard";
    }

    @GetMapping("minusPoint")
    public String minusPoint() {

        return "point/minusPoint";
    }

    @GetMapping("modifyPointStandard")
    public String modifyPointStandard() {

        return "point/modifyPointStandard";
    }

    @GetMapping("savePoint")
    public String savePoint() {

        return "point/savePoint";
    }

    @GetMapping("usePoint")
    public String usePoint() {

        return "point/usePoint";
    }
}
