package com.jiayuan.mainframework.bean;

/**
 * Created by guojiayuan on 2017/7/5.
 */

public class PrepaymentRecordBean {


    private String count;
    private DataBean data;
    private String msg;
    private String code;

    public String getCount() {
        return count;
    }

    public void setCount(String count) {
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
        private String payRecordId;
        private String serialNumber;

        public String getPayRecordId() {
            return payRecordId;
        }

        public void setPayRecordId(String payRecordId) {
            this.payRecordId = payRecordId;
        }

        public String getSerialNumber() {
            return serialNumber;
        }

        public void setSerialNumber(String serialNumber) {
            this.serialNumber = serialNumber;
        }
    }
}
