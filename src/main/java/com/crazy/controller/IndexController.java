package com.crazy.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by SHIKUN on 2016/8/25.
 */

@Controller

public class IndexController {

    @RequestMapping("/")
    public String index() {
        return "index";
    }
}
