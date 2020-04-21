package com.wdg;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @author: wangdaogang
 * @create: 2020/03/24
 **/
@SpringBootApplication
@MapperScan(basePackages = "com.wdg.mapper")
public class RunApplication {

    public static void main(String[] args) {
        SpringApplication.run(RunApplication.class,args);
    }
}
