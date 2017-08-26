package com.jiayuan.mainframework.bean;

import java.util.List;

/**
 * Created by guojiayuan on 2017/6/26.
 */

public class AllBank {


    private String count;
    private String msg;
    private String code;
    /**
     * bankUrl : img/system/bank/1491819209356.jpg
     * id : 84
     * enName : 2354456
     * sort : 2
     * cnName : 中国建设银行
     */

    private List<DataBean> data;

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

    public List<DataBean> getData() {
        return data;
    }

    public void setData(List<DataBean> data) {
        this.data = data;
    }

    public static class DataBean {
        private String bankUrl;
        private int id;
        private String enName;
        private String sort;
        private String cnName;

        public String getBankUrl() {
            return bankUrl;
        }

        public void setBankUrl(String bankUrl) {
            this.bankUrl = bankUrl;
        }

        public int getId() {
            return id;
        }

        public void setId(int id) {
            this.id = id;
        }

        public String getEnName() {
            return enName;
        }

        public void setEnName(String enName) {
            this.enName = enName;
        }

        public String getSort() {
            return sort;
        }

        public void setSort(String sort) {
            this.sort = sort;
        }

        public String getCnName() {
            return cnName;
        }

        public void setCnName(String cnName) {
            this.cnName = cnName;
        }
    }
}
