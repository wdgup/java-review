package com.wdg.exception;

/**
 * @author: wangdaogang
 * @create: 2020/03/10
 **/
public class BizException extends RuntimeException {

    private int code;
    private String message;

    public BizException(Integer code,String message){
        super(message);
        this.code = code;
        this.message = message;
    }
}
