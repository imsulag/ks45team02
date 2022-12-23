package ks45.team02.admin.board.guide.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/userGuide")
public class GuideController {

    @GetMapping("/addUserGuide")
    public String addUserGuide() {

        return "userguide/addUserGuide";
    }

    @GetMapping("/deleteUserGuide")
    public String deleteUserGuide() {

        return "Userguide/deleteUserGuide";
    }

    @GetMapping("/modifyUserGuide")
    public String modifyUserGuide() {

        return "Userguide/modifyUserGuide";
    }

}
