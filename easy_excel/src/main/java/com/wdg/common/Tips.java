package com.wdg.common;

/**
 * @author: wangdaogang
 * @create: 2020/03/10
 **/
public final class Tips {

    private int code;
    private String message;
    public Tips(Integer code, String message){
        this.code = code;
        this.message = message;
    }

    public int getCode() {
        return code;
    }

    public String getMessage() {
        return message;
    }

    public static final Tips PARAM_ERROR = new Tips(100,"参数错误");
    public static final Tips OK = new Tips(200,"操作成功");
    public static final Tips NO_DATA_FOUND = new Tips(101,"没有找到数据");
    public static final Tips INNER_ERROR = new Tips(102,"操作失败");
    public static final Tips UPLOAD_PARAM_ERROR = new Tips(103,"上传失败");
    public static final Tips UPLOAD_FILE_ERROR = new Tips(103,"文件格式不正确");
}
