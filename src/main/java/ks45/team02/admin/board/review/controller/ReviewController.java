package ks45.team02.admin.board.review.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/review")
public class ReviewController {

    @GetMapping("/addReview")
    public String addReview() {

        return "review/addReview";
    }

    @GetMapping("/deleteReview")
    public String deleteReview() {

        return "review/deleteReview";
    }


    @GetMapping("/listReview")
    public String listReview() {

        return "review/listReview";
    }

    @GetMapping("/modifyReview")
    public String modifyReview() {

        return "review/modifyReview";
    }

    @GetMapping("searchReview")
    public String searchReview() {

        return "review/searchReview";
    }

}
