package com.jiayuan.mainframework.bean;

import java.util.List;

/**
 * Created by guojiayuan on 2017/6/19.
 */

public class ResponseInfoList {

    private String count;
    private String msg;
    private String code;
    private List<?> data;

    public String getCount() {
        return count;
    }

    public void setCount(String count) {
        this.count = count;
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

    public List<?> getData() {
        return data;
    }

    public void setData(List<?> data) {
        this.data = data;
    }
}
