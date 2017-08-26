package com.jiayuan.mainframework.bean;

/**
 * Created by guojiayuan on 2017/6/15.
 */

public class UpdateArea {

    /**
     * errorCode : 1
     * count :
     * data : {"idNo":null,"redIntegral":"0","refereeTime":"2017-06-09 14:05:28","whiteIntegral":"0","safePwd":null,"endTime":null,"upgradeWay":null,"upgradeTime":null,"companyName":null,"startTime":null,"id":62,"pwd":"066d7366e2dc2f543a6991ce1bcfa819","area":"北京","registrationDate":"2017-06-08 10:16:56","mobilePhone":"18519201345","referee":"","account":"0","realName":null,"headUrl":"img/head/18519201345/1496988328368.jpg","memberName":"雄关","memberLevel":3}
     * msg : 修改用户地区成功
     */

    private String errorCode;
    private String count;
    /**
     * idNo : null
     * redIntegral : 0
     * refereeTime : 2017-06-09 14:05:28
     * whiteIntegral : 0
     * safePwd : null
     * endTime : null
     * upgradeWay : null
     * upgradeTime : null
     * companyName : null
     * startTime : null
     * id : 62
     * pwd : 066d7366e2dc2f543a6991ce1bcfa819
     * area : 北京
     * registrationDate : 2017-06-08 10:16:56
     * mobilePhone : 18519201345
     * referee :
     * account : 0
     * realName : null
     * headUrl : img/head/18519201345/1496988328368.jpg
     * memberName : 雄关
     * memberLevel : 3
     */

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
        private Object idNo;
        private String redIntegral;
        private String refereeTime;
        private String whiteIntegral;
        private Object safePwd;
        private Object endTime;
        private Object upgradeWay;
        private Object upgradeTime;
        private Object companyName;
        private Object startTime;
        private int id;
        private String pwd;
        private String area;
        private String registrationDate;
        private String mobilePhone;
        private String referee;
        private String account;
        private Object realName;
        private String headUrl;
        private String memberName;
        private int memberLevel;

        public Object getIdNo() {
            return idNo;
        }

        public void setIdNo(Object idNo) {
            this.idNo = idNo;
        }

        public String getRedIntegral() {
            return redIntegral;
        }

        public void setRedIntegral(String redIntegral) {
            this.redIntegral = redIntegral;
        }

        public String getRefereeTime() {
            return refereeTime;
        }

        public void setRefereeTime(String refereeTime) {
            this.refereeTime = refereeTime;
        }

        public String getWhiteIntegral() {
            return whiteIntegral;
        }

        public void setWhiteIntegral(String whiteIntegral) {
            this.whiteIntegral = whiteIntegral;
        }

        public Object getSafePwd() {
            return safePwd;
        }

        public void setSafePwd(Object safePwd) {
            this.safePwd = safePwd;
        }

        public Object getEndTime() {
            return endTime;
        }

        public void setEndTime(Object endTime) {
            this.endTime = endTime;
        }

        public Object getUpgradeWay() {
            return upgradeWay;
        }

        public void setUpgradeWay(Object upgradeWay) {
            this.upgradeWay = upgradeWay;
        }

        public Object getUpgradeTime() {
            return upgradeTime;
        }

        public void setUpgradeTime(Object upgradeTime) {
            this.upgradeTime = upgradeTime;
        }

        public Object getCompanyName() {
            return companyName;
        }

        public void setCompanyName(Object companyName) {
            this.companyName = companyName;
        }

        public Object getStartTime() {
            return startTime;
        }

        public void setStartTime(Object startTime) {
            this.startTime = startTime;
        }

        public int getId() {
            return id;
        }

        public void setId(int id) {
            this.id = id;
        }

        public String getPwd() {
            return pwd;
        }

        public void setPwd(String pwd) {
            this.pwd = pwd;
        }

        public String getArea() {
            return area;
        }

        public void setArea(String area) {
            this.area = area;
        }

        public String getRegistrationDate() {
            return registrationDate;
        }

        public void setRegistrationDate(String registrationDate) {
            this.registrationDate = registrationDate;
        }

        public String getMobilePhone() {
            return mobilePhone;
        }

        public void setMobilePhone(String mobilePhone) {
            this.mobilePhone = mobilePhone;
        }

        public String getReferee() {
            return referee;
        }

        public void setReferee(String referee) {
            this.referee = referee;
        }

        public String getAccount() {
            return account;
        }

        public void setAccount(String account) {
            this.account = account;
        }

        public Object getRealName() {
            return realName;
        }

        public void setRealName(Object realName) {
            this.realName = realName;
        }

        public String getHeadUrl() {
            return headUrl;
        }

        public void setHeadUrl(String headUrl) {
            this.headUrl = headUrl;
        }

        public String getMemberName() {
            return memberName;
        }

        public void setMemberName(String memberName) {
            this.memberName = memberName;
        }

        public int getMemberLevel() {
            return memberLevel;
        }

        public void setMemberLevel(int memberLevel) {
            this.memberLevel = memberLevel;
        }
    }
}
