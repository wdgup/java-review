package com.wdg.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurationSupport;


/**
 * User: wangdaogang
 * Date: 2020/3/11
 * Description: No Description
 */
@Configuration
public class MvcConfiguration extends WebMvcConfigurationSupport {

    @Value("${upload.path}")
    private String uploadPath;
    @Override
    protected void addResourceHandlers(ResourceHandlerRegistry registry) {
        registry.addResourceHandler("/static/***").addResourceLocations("file:///"+uploadPath);
    }
}
