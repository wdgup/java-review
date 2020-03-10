package com.wdg.common;

import java.util.List;

/**
 * @author: wangdaogang
 * @create: 2020/03/10
 **/
public class DataResult<T> {

    private Integer pageNo;
    private Integer pageSize;
    private Long total;
    private List<T> list;

    public DataResult(Integer pageNo, Integer pageSize, Long total, List<T> list) {
        this.pageNo = pageNo;
        this.pageSize = pageSize;
        this.total = total;
        this.list = list;
    }
}
