package com.jiayuan.mainframework.bean;

import java.io.Serializable;
import java.util.List;

/**
 * Created by guojiayuan on 2017/7/27.
 */

public class WithDrawRecordBean {

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

    public static class DataBean implements Serializable{
        private String rejectReason;
        private String bankNameSub;
        private String submitTime;
        private int state;
        private String auditPerson;
        private String bankName;
        private String bankCard;
        private int id;
        private String mobilePhone;
        private String auditTime;
        private String withdrawSum;
        private String userName;
        private String memberId;
        private String bankUserName;

        public String getRejectReason() {
            return rejectReason;
        }

        public void setRejectReason(String rejectReason) {
            this.rejectReason = rejectReason;
        }

        public String getBankNameSub() {
            return bankNameSub;
        }

        public void setBankNameSub(String bankNameSub) {
            this.bankNameSub = bankNameSub;
        }

        public String getSubmitTime() {
            return submitTime;
        }

        public void setSubmitTime(String submitTime) {
            this.submitTime = submitTime;
        }

        public int getState() {
            return state;
        }

        public void setState(int state) {
            this.state = state;
        }

        public String getAuditPerson() {
            return auditPerson;
        }

        public void setAuditPerson(String auditPerson) {
            this.auditPerson = auditPerson;
        }

        public String getBankName() {
            return bankName;
        }

        public void setBankName(String bankName) {
            this.bankName = bankName;
        }

        public String getBankCard() {
            return bankCard;
        }

        public void setBankCard(String bankCard) {
            this.bankCard = bankCard;
        }

        public int getId() {
            return id;
        }

        public void setId(int id) {
            this.id = id;
        }

        public String getMobilePhone() {
            return mobilePhone;
        }

        public void setMobilePhone(String mobilePhone) {
            this.mobilePhone = mobilePhone;
        }

        public String getAuditTime() {
            return auditTime;
        }

        public void setAuditTime(String auditTime) {
            this.auditTime = auditTime;
        }

        public String getWithdrawSum() {
            return withdrawSum;
        }

        public void setWithdrawSum(String withdrawSum) {
            this.withdrawSum = withdrawSum;
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

        public String getBankUserName() {
            return bankUserName;
        }

        public void setBankUserName(String bankUserName) {
            this.bankUserName = bankUserName;
        }
    }
}
