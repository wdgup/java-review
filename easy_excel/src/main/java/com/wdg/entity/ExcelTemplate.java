package com.wdg.entity;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import org.springframework.data.mongodb.core.mapping.Document;

/**
 * @author: wangdaogang
 * @create: 2020/03/10
 **/
@Data
@Document("excel_template")
public class ExcelTemplate extends BaseEntity{

    private String id;
    @ApiModelProperty("模板名称-唯一")
    private String name;
    @ApiModelProperty("模板描述")
    private String description;
    @ApiModelProperty("排序规则")
    private Integer order;
    private String user;
}
