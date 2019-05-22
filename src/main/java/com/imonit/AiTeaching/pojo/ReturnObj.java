package com.imonit.AiTeaching.pojo;

/**
 * Created by bin on 2019/5/7.
 */
public class ReturnObj <T> {

    private static final String CODE_SUCCESS = "success";

    private static final String CODE_FAIL = "fail";

    private String code;
    private T data;
    private String msg;

    public ReturnObj(){

    }

    public ReturnObj(String code){
        this.code = code;
    }

    public ReturnObj(String code, T data){
        this.code = code;
        this.data = data;
    }

    public ReturnObj(String code, String msg){
        this.code = code;
        this.msg = msg;
    }

    public static ReturnObj success(){
        return new ReturnObj(CODE_SUCCESS);
    }

    public static ReturnObj success(Object data){
        return new ReturnObj(CODE_SUCCESS, data);
    }

    public static ReturnObj fail(String msg){
        return new ReturnObj(CODE_FAIL, msg);
    }

    public static ReturnObj widthCode(String errorCode) {
        return new ReturnObj(errorCode);
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }
}