package com.wdg.controller;

import com.wdg.common.Result;
import com.wdg.entity.ExcelTemplate;
import com.wdg.service.ExcelTemplateService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
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
@Api(tags = "模板管理")
public class TemplateController {

    @Autowired
    private ExcelTemplateService excelTemplateService;
    @PostMapping("/save")
    @ApiOperation("新增模板")
    public Result<String> add(@RequestBody ExcelTemplate excelTemplate){

        return excelTemplateService.addTemplate(excelTemplate);
    }
}
