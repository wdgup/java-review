package com.wdg.controller;

import com.wdg.service.BaseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author: wangdaogang
 * @create: 2020/03/24
 **/
@RestController
public class BaseController {

    @Autowired
    private BaseService baseService;

    @GetMapping("/index/{type}")
    public String index(@PathVariable("type") String type){
        baseService.testAsync(type);
        return "ok";
    }
}
