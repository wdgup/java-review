package com.wdg.controller;

import com.wdg.common.DataResult;
import com.wdg.common.Result;
import com.wdg.entity.ExcelColumn;
import com.wdg.service.ColumnService;
import com.wdg.vo.ColumnCondition;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.xml.crypto.Data;
import java.util.List;

/**
 * @author: wangdaogang
 * @create: 2020/03/10
 **/
@RestController
@RequestMapping("/column")
public class ColumnController {

    @Autowired
    private ColumnService columnService;
    @PostMapping("/save")
    public Result save(List<ExcelColumn> columns){
        return columnService.save(columns);
    }

    @PostMapping("/list")
    public Result<DataResult<ExcelColumn>> list(ColumnCondition condition){
        return columnService.dataList(condition);
    }
}
