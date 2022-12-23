package ks45.team02.admin.board.notice.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/noticeboard")
public class NoticeController {

    @GetMapping("/addNoticeBoard")
    public String addNoticeBoard() {

        return "noticeboard/addNoticeBoard";
    }

    @GetMapping("/deleteNoticeBoard")
    public String deleteNoticeBoard() {

        return "noticeboard/deleteNoticeBoard";
    }

    @GetMapping("/listNoticeBoard")
    public String listNoticeBoard() {

        return "noticeboard/listNoticeBoard";
    }

    @GetMapping("/modifyNoticeBoard")
    public String modifyNoticeBoard() {

        return "noticeboard/modifyNoticeBoard";
    }

}
