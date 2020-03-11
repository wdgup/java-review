package com.wdg.common;

import com.wdg.exception.BizException;

import java.util.Objects;

/**
 * @author: wangdaogang
 * @create: 2020/03/10
 **/
public class Result<T> {

    private int code;
    private String message;
    private T data;


    public Result(int code, String message, T data) {
        this.code = code;
        this.message = message;
        this.data = data;
    }

    public Result (Tips tips,T data){
        if(Objects.isNull(tips)){
            throw new BizException(500,"tips对象为空");
        }
        this.code = tips.getCode();
        this.message = tips.getMessage();
        this.data = data;
    }
    public Result (Tips tips){
        this(tips,null);
    }

    public static Result ok(){
        return new Result(200,"操作成功");
    }
    public static Result faild(){
        return new Result(500,"操作失败");
    }
    public Result(int code, String message) {
        this(code,message,null);
    }

    public int getCode() {
        return code;
    }

    public String getMessage() {
        return message;
    }

    public T getData() {
        return data;
    }
}
