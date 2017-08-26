package com.jiayuan.mainframework.bean;

/**
 * Created by guojiayuan on 2017/7/13.
 */

public class BusinessDetailBean {

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
        private String activityPublishTime;
        private int shopSales;
        private String scopeOfBusiness;
        private String companyName;
        private String shopAddress;
        private String bankNo;
        private int shopCommodityCount;
        private String mobilePhone;
        private String isOpenOnline;
        private int shopId;
        private String shopName;
        private String cnName;
        private String addressCoordinate;
        private String subjectPage;
        private int memberId;
        private String isOpenOffline;
        private String headUrl;
        private String shopBrief;
        private String industry;
        private String activityIsValid;
        private int memberLevel;
        private String shopActivity;

        public String getActivityPublishTime() {
            return activityPublishTime;
        }

        public void setActivityPublishTime(String activityPublishTime) {
            this.activityPublishTime = activityPublishTime;
        }

        public int getShopSales() {
            return shopSales;
        }

        public void setShopSales(int shopSales) {
            this.shopSales = shopSales;
        }

        public String getScopeOfBusiness() {
            return scopeOfBusiness;
        }

        public void setScopeOfBusiness(String scopeOfBusiness) {
            this.scopeOfBusiness = scopeOfBusiness;
        }

        public String getCompanyName() {
            return companyName;
        }

        public void setCompanyName(String companyName) {
            this.companyName = companyName;
        }

        public String getShopAddress() {
            return shopAddress;
        }

        public void setShopAddress(String shopAddress) {
            this.shopAddress = shopAddress;
        }

        public String getBankNo() {
            return bankNo;
        }

        public void setBankNo(String bankNo) {
            this.bankNo = bankNo;
        }

        public int getShopCommodityCount() {
            return shopCommodityCount;
        }

        public void setShopCommodityCount(int shopCommodityCount) {
            this.shopCommodityCount = shopCommodityCount;
        }

        public String getMobilePhone() {
            return mobilePhone;
        }

        public void setMobilePhone(String mobilePhone) {
            this.mobilePhone = mobilePhone;
        }

        public String getIsOpenOnline() {
            return isOpenOnline;
        }

        public void setIsOpenOnline(String isOpenOnline) {
            this.isOpenOnline = isOpenOnline;
        }

        public int getShopId() {
            return shopId;
        }

        public void setShopId(int shopId) {
            this.shopId = shopId;
        }

        public String getShopName() {
            return shopName;
        }

        public void setShopName(String shopName) {
            this.shopName = shopName;
        }

        public String getCnName() {
            return cnName;
        }

        public void setCnName(String cnName) {
            this.cnName = cnName;
        }

        public String getAddressCoordinate() {
            return addressCoordinate;
        }

        public void setAddressCoordinate(String addressCoordinate) {
            this.addressCoordinate = addressCoordinate;
        }

        public String getSubjectPage() {
            return subjectPage;
        }

        public void setSubjectPage(String subjectPage) {
            this.subjectPage = subjectPage;
        }

        public int getMemberId() {
            return memberId;
        }

        public void setMemberId(int memberId) {
            this.memberId = memberId;
        }

        public String getIsOpenOffline() {
            return isOpenOffline;
        }

        public void setIsOpenOffline(String isOpenOffline) {
            this.isOpenOffline = isOpenOffline;
        }

        public String getHeadUrl() {
            return headUrl;
        }

        public void setHeadUrl(String headUrl) {
            this.headUrl = headUrl;
        }

        public String getShopBrief() {
            return shopBrief;
        }

        public void setShopBrief(String shopBrief) {
            this.shopBrief = shopBrief;
        }

        public String getIndustry() {
            return industry;
        }

        public void setIndustry(String industry) {
            this.industry = industry;
        }

        public String getActivityIsValid() {
            return activityIsValid;
        }

        public void setActivityIsValid(String activityIsValid) {
            this.activityIsValid = activityIsValid;
        }

        public int getMemberLevel() {
            return memberLevel;
        }

        public void setMemberLevel(int memberLevel) {
            this.memberLevel = memberLevel;
        }

        public String getShopActivity() {
            return shopActivity;
        }

        public void setShopActivity(String shopActivity) {
            this.shopActivity = shopActivity;
        }
    }
}
