package com.example.demo.utils;

/**
 * Created by LSK.Reno on 2019/5/24 22:33.
 */
public class Response<T> {
    private int code;
    private T data;

    public Response(int code,T data){
        this.code=code;
        this.data=data;
    }
    public Response(T data){
        this.code=200;
        this.data=data;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }
}
