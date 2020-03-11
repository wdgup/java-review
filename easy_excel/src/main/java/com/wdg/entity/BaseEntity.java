package com.wdg.entity;

import lombok.Data;
import org.springframework.data.mongodb.core.mapping.Field;

import java.io.Serializable;
import java.util.Date;

/**
 * @author: wangdaogang
 * @create: 2020/03/10
 **/
@Data
public class BaseEntity implements Serializable {

    @Field("create_time")
    private Date createTtime;
    @Field("update_time")
    private Date updateTime;
}
