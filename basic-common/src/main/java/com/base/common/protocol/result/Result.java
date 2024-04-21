package com.base.common.protocol.result;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.io.Serializable;

@Data
public class Result<T> implements Serializable {
    @ApiModelProperty("状态码，0表示正常，非0表示异常")
    private int code;
    @ApiModelProperty("响应信息，通常为异常信息")
    private String msg;
    @ApiModelProperty("返回数据")
    private T data;

    public static <T> Result succ(T data) {
        return succ(0, "操作成功", data);
    }

    public boolean isSucc() {
        return code == 0;
    }

    public static Result succ(int code, String msg, Object data) {
        Result r = new Result();
        r.setCode(code);
        r.setMsg(msg);
        r.setData(data);
        return r;
    }

    public static Result succ(String msg, Object data) {
        Result r = new Result();
        r.setMsg(msg);
        r.setData(data);
        return r;
    }

    public static <T> Result<T> fail(String msg) {
        return fail(-400, msg, null);
    }

    public static <T> Result<T> fail(int code, String msg) {
        return fail(code, msg, null);
    }

    public static <T> Result<T> fail(String msg, T data) {
        return fail(-400, msg, data);
    }

    public static Result fail(int code, String msg, Object data) {
        Result r = new Result();
        r.setCode(code);
        r.setMsg(msg);
        r.setData(data);
        return r;
    }
}
