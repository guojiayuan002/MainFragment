package com.jiayuan.mainframework.bean;

/**
 * Created by guojiayuan on 2017/6/14.
 */

public class DeleteAddressBean {


    /**
     * errorCode : 1
     * count :
     * data : {}
     * msg : 删除用户收货地址成功
     */

    private String errorCode;
    private String count;
    private DataBean data;
    private String msg;

    public String getErrorCode() {
        return errorCode;
    }

    public void setErrorCode(String errorCode) {
        this.errorCode = errorCode;
    }

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

    public static class DataBean {
    }
}
