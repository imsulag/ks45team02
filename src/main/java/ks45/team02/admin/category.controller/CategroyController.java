package ks45.team02.admin.category.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/category")
public class CategroyController {
    @GetMapping("/addCategory")
    public String addCategory(){
        return "/category/addCategory";
    }

    @GetMapping("/deleteCategory")
    public String deleteCategory(){
        return "/category/deleteCategory";
    }
    @GetMapping("/listCategory")
    public String listCategory(){
        return "/category/listCategory";
    }
    @GetMapping("/modifyCategory")
    public String modifyCategory(){
        return "/category/modifyCategory";
    }
}
