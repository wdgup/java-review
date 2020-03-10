package com.wdg.entity;


import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

/**
 * User: wangdaogang
 * Date: 2020/3/10
 * Description: No Description
 */

@Data
@Document("excel_column")
public class ExcelColumn extends BaseEntity{

    @Field("_id")
    @Id
    private String id;
    private String title;
    private Integer order;
    @Field("column_type")
    private String columnType;
    @Field("template_name")
    private String excelTemplateName;



}
