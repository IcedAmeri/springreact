package com.example.webserver.board;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BoardController {
    @RequestMapping("/board")
    public String board() {
        return "board";
    }
}
