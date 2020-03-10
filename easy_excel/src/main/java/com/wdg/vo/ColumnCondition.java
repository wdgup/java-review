package com.wdg.vo;

import com.wdg.common.Page;
import lombok.Data;

/**
 * @author: wangdaogang
 * @create: 2020/03/10
 **/

@Data
public class ColumnCondition extends Page {

    private String columnType;
    private String title;
    private Integer order;
}
