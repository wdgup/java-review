package com.wdg.controller;

import com.wdg.common.Result;
import com.wdg.entity.ExcelTemplate;
import com.wdg.service.ExcelTemplateService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * User: wangdaogang
 * Date: 2020/3/11
 * Description: No Description
 */
@RestController
@RequestMapping("/template")
public class TemplateController {

    @Autowired
    private ExcelTemplateService excelTemplateService;
    @PostMapping("/save")
    public Result<String> add(@RequestBody ExcelTemplate excelTemplate){
        return excelTemplateService.addTemplate(excelTemplate);
    }
}
