package com.jiayuan.mainframework.bean;

import java.util.List;

/**
 * Created by guojiayuan on 2017/7/11.
 */

public class IncomeDetailBean {

    private int count;
    private String msg;
    private String code;
    private List<DataBean> data;

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
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
        private String gainsCount;
        private String gainsUserName;
        private String gainsNo;
        private String remarks;
        private int id;
        private String remainder;
        private String gainsSum;
        private String mobilePhone;
        private String userName;
        private String memberId;
        private String gainsMobilePhone;
        private String gainsType;
        private String gainsTime;

        public String getGainsCount() {
            return gainsCount;
        }

        public void setGainsCount(String gainsCount) {
            this.gainsCount = gainsCount;
        }

        public String getGainsUserName() {
            return gainsUserName;
        }

        public void setGainsUserName(String gainsUserName) {
            this.gainsUserName = gainsUserName;
        }

        public String getGainsNo() {
            return gainsNo;
        }

        public void setGainsNo(String gainsNo) {
            this.gainsNo = gainsNo;
        }

        public String getRemarks() {
            return remarks;
        }

        public void setRemarks(String remarks) {
            this.remarks = remarks;
        }

        public int getId() {
            return id;
        }

        public void setId(int id) {
            this.id = id;
        }

        public String getRemainder() {
            return remainder;
        }

        public void setRemainder(String remainder) {
            this.remainder = remainder;
        }

        public String getGainsSum() {
            return gainsSum;
        }

        public void setGainsSum(String gainsSum) {
            this.gainsSum = gainsSum;
        }

        public String getMobilePhone() {
            return mobilePhone;
        }

        public void setMobilePhone(String mobilePhone) {
            this.mobilePhone = mobilePhone;
        }

        public String getUserName() {
            return userName;
        }

        public void setUserName(String userName) {
            this.userName = userName;
        }

        public String getMemberId() {
            return memberId;
        }

        public void setMemberId(String memberId) {
            this.memberId = memberId;
        }

        public String getGainsMobilePhone() {
            return gainsMobilePhone;
        }

        public void setGainsMobilePhone(String gainsMobilePhone) {
            this.gainsMobilePhone = gainsMobilePhone;
        }

        public String getGainsType() {
            return gainsType;
        }

        public void setGainsType(String gainsType) {
            this.gainsType = gainsType;
        }

        public String getGainsTime() {
            return gainsTime;
        }

        public void setGainsTime(String gainsTime) {
            this.gainsTime = gainsTime;
        }
    }
}
