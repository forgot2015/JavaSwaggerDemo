package com.example.swaggerdemo.core;

import io.swagger.annotations.ApiModelProperty;

/**
 * 统一API响应结果封装
 */
public class Result<T> {
    @ApiModelProperty(value = "错误编号")
    private int code;

    @ApiModelProperty(value = "错误信息")
    private String message;

    @ApiModelProperty(value = "返回对象")
    private T data;

    public Result setCode(ResultCode resultCode) {
        this.code = resultCode.code();
        return this;
    }

    public int getCode() {
        return code;
    }

    public String getMessage() {
        return message;
    }

    public Result setMessage(String message) {
        this.message = message;
        return this;
    }

    public T getData() {
        return data;
    }

    public Result setData(T data) {
        this.data = data;
        return this;
    }

}
