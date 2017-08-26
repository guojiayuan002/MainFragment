package com.jiayuan.mainframework.bean;

/**
 * Created by guojiayuan on 2017/7/13.
 */

public class ResponseInfoObject {

    private int count;
    private Object data;
    private String msg;
    private String code;

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
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

    @Override
    public String toString() {
        return "ResponseInfoObject{" +
                "count=" + count +
                ", data=" + data +
                ", msg='" + msg + '\'' +
                ", code='" + code + '\'' +
                '}';
    }
}
