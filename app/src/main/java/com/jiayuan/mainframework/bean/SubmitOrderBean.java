package com.jiayuan.mainframework.bean;

import java.io.Serializable;

/**
 * Created by guojiayuan on 2017/7/30.
 */

public class SubmitOrderBean {


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

    public static class DataBean implements Serializable{
        private String parentOrderNo;
        private String paySum;
        private String payTitle;
        private String payContent;

        public String getParentOrderNo() {
            return parentOrderNo;
        }

        public void setParentOrderNo(String parentOrderNo) {
            this.parentOrderNo = parentOrderNo;
        }

        public String getPaySum() {
            return paySum;
        }

        public void setPaySum(String paySum) {
            this.paySum = paySum;
        }

        public String getPayTitle() {
            return payTitle;
        }

        public void setPayTitle(String payTitle) {
            this.payTitle = payTitle;
        }

        public String getPayContent() {
            return payContent;
        }

        public void setPayContent(String payContent) {
            this.payContent = payContent;
        }
    }
}
