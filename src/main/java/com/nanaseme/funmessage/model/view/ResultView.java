package com.nanaseme.funmessage.model.view;

/**
 * controller返回给终端的view object
 *
 * @param <T>
 * @author WangZD
 */
public class ResultView<T> {

    /**
     * 状态码
     */
    private String code = "200";
    /**
     * 状态码分类
     */
    private String subCode;
    /**
     * 异常信息
     */
    private String msg = "";
    /**
     * 异常代码
     */
    private String errorCode;
    /**
     * 数据
     */
    private T data;

    public ResultView() {
        super();
    }

    public ResultView(String code, String msg, T data) {
        this.code = code;
        this.msg = msg;
        this.data = data;
    }

    public ResultView(String code, String subCode, String msg, T data) {
        this(code, msg, data);
        this.subCode = subCode;
    }

    public ResultView(T data) {
        this.data = data;
    }

    @Override
    public String toString() {
        return "ReturnVO [code="
                + code
                + ", subCode="
                + subCode
                + ", msg="
                + msg
                + ", data="
                + data
                + "]";
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getSubCode() {
        return subCode;
    }

    public void setSubCode(String subCode) {
        this.subCode = subCode;
    }

    public String getErrorCode() {
        return errorCode;
    }

    public void setErrorCode(String errorCode) {
        this.errorCode = errorCode;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }
}