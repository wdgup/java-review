package com.wdg.annotation;


import java.lang.annotation.*;

@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
@Documented
@CustomBean
public @interface CustomConfiguration {
}
