package com.wdg.service;

import com.wdg.common.DataResult;
import com.wdg.common.Result;
import com.wdg.entity.ExcelColumn;
import com.wdg.vo.ColumnCondition;

import java.util.List;

public interface ColumnService {

    Result save(List<ExcelColumn> columns);


    Result<DataResult<ExcelColumn>> dataList(ColumnCondition condition);
}
