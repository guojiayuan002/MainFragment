package com.jiayuan.mainframework.bean;

/**
 * Created by guojiayuan on 2017/7/27.
 */
public class QueryPersonAuth {

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
        private String idNo;
        private String correctSideReject;
        private String submitTime;
        private int state;
        private String auditPerson;
        private String correctSide;
        private int id;
        private String oppositeSideReject;
        private String oppositeSide;
        private String mobilePhone;
        private String auditTime;
        private String userName;
        private String memberId;
        private String realName;

        public String getIdNo() {
            return idNo;
        }

        public void setIdNo(String idNo) {
            this.idNo = idNo;
        }

        public String getCorrectSideReject() {
            return correctSideReject;
        }

        public void setCorrectSideReject(String correctSideReject) {
            this.correctSideReject = correctSideReject;
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

        public String getCorrectSide() {
            return correctSide;
        }

        public void setCorrectSide(String correctSide) {
            this.correctSide = correctSide;
        }

        public int getId() {
            return id;
        }

        public void setId(int id) {
            this.id = id;
        }

        public String getOppositeSideReject() {
            return oppositeSideReject;
        }

        public void setOppositeSideReject(String oppositeSideReject) {
            this.oppositeSideReject = oppositeSideReject;
        }

        public String getOppositeSide() {
            return oppositeSide;
        }

        public void setOppositeSide(String oppositeSide) {
            this.oppositeSide = oppositeSide;
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

        public String getRealName() {
            return realName;
        }

        public void setRealName(String realName) {
            this.realName = realName;
        }
    }
}
