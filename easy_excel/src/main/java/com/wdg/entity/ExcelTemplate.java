package com.wdg.entity;

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
    private String name;
    private String description;
    private Integer order;
    private String user;
}
