package com.jiayuan.mainframework.bean;

/**
 * Created by guojiayuan on 2017/7/27.
 */
public class QueryCompanyAuth {


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
        private String submitTime;
        private String supplementReject;
        private String auditPerson;
        private int state;
        private String scopeOfBusiness;
        private String corporateRep;
        private String businessLicenceUrl;
        private String companyName;
        private String classifyIdOfBusiness;
        private String businessLicenceReject;
        private String businessLicence;
        private int id;
        private String mobilePhone;
        private String auditTime;
        private String supplement;
        private String userName;
        private String memberId;
        private String realName;

        public String getSubmitTime() {
            return submitTime;
        }

        public void setSubmitTime(String submitTime) {
            this.submitTime = submitTime;
        }

        public String getSupplementReject() {
            return supplementReject;
        }

        public void setSupplementReject(String supplementReject) {
            this.supplementReject = supplementReject;
        }

        public String getAuditPerson() {
            return auditPerson;
        }

        public void setAuditPerson(String auditPerson) {
            this.auditPerson = auditPerson;
        }

        public int getState() {
            return state;
        }

        public void setState(int state) {
            this.state = state;
        }

        public String getScopeOfBusiness() {
            return scopeOfBusiness;
        }

        public void setScopeOfBusiness(String scopeOfBusiness) {
            this.scopeOfBusiness = scopeOfBusiness;
        }

        public String getCorporateRep() {
            return corporateRep;
        }

        public void setCorporateRep(String corporateRep) {
            this.corporateRep = corporateRep;
        }

        public String getBusinessLicenceUrl() {
            return businessLicenceUrl;
        }

        public void setBusinessLicenceUrl(String businessLicenceUrl) {
            this.businessLicenceUrl = businessLicenceUrl;
        }

        public String getCompanyName() {
            return companyName;
        }

        public void setCompanyName(String companyName) {
            this.companyName = companyName;
        }

        public String getClassifyIdOfBusiness() {
            return classifyIdOfBusiness;
        }

        public void setClassifyIdOfBusiness(String classifyIdOfBusiness) {
            this.classifyIdOfBusiness = classifyIdOfBusiness;
        }

        public String getBusinessLicenceReject() {
            return businessLicenceReject;
        }

        public void setBusinessLicenceReject(String businessLicenceReject) {
            this.businessLicenceReject = businessLicenceReject;
        }

        public String getBusinessLicence() {
            return businessLicence;
        }

        public void setBusinessLicence(String businessLicence) {
            this.businessLicence = businessLicence;
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

        public String getSupplement() {
            return supplement;
        }

        public void setSupplement(String supplement) {
            this.supplement = supplement;
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
