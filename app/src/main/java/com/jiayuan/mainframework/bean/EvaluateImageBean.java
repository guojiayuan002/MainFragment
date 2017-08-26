package com.jiayuan.mainframework.bean;

/**
 * Created by guojiayuan on 2017/8/8.
 */

public class EvaluateImageBean {

    private int count;
    private DataBean data;
    private String msg;
    private String code;

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public DataBean getData() {
        return data;
    }

    public void setData(DataBean data) {
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

    public static class DataBean {
        private String imgFullName;

        public String getImgFullName() {
            return imgFullName;
        }

        public void setImgFullName(String imgFullName) {
            this.imgFullName = imgFullName;
        }
    }
}
