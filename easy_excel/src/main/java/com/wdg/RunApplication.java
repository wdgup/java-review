package com.wdg;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableAsync;

/**
 * User: wangdaogang
 * Date: 2020/3/10
 * Description: No Description
 */
@SpringBootApplication
@EnableAsync
public class RunApplication {

    public static void main(String[] args) {
        SpringApplication.run(RunApplication.class,args);
    }
}
