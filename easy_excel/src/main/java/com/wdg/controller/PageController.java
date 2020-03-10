package com.wdg.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * User: wangdaogang
 * Date: 2020/3/10
 * Description: No Description
 */
@Controller
public class PageController {

    @GetMapping("/index")
    public String index(){
        return "index";
    }
}
