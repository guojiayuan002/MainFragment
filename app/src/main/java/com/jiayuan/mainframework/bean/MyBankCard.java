package com.jiayuan.mainframework.bean;

import java.io.Serializable;
import java.util.List;

/**
 * Created by guojiayuan on 2017/6/26.
 */
public class MyBankCard {

    private String count;
    private String msg;
    private String code;
    /**
     * id : 23
     * bankNo : 6217000210008312216
     * mobilePhone : 18519201345
     * isDefault : N
     * bankSubName : 南山大冲支行
     * bankCnName : 兴业银行
     * userName : 雄关漫道
     * realName : 张三
     * memberId : 62
     * bankImgUrl : img/system/bank/1491558632980.jpg
     * bankAddress : 深圳市||南山区
     * bindTime : 2017-06-23 14:58:47
     * bankEnName : xyyh
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

    public static class DataBean implements Serializable{
        private int id;
        private String bankNo;
        private String mobilePhone;
        private String isDefault;
        private String bankSubName;
        private String bankCnName;
        private String userName;
        private String realName;
        private int memberId;
        private String bankImgUrl;
        private String bankAddress;
        private String bindTime;
        private String bankEnName;

        public int getId() {
            return id;
        }

        public void setId(int id) {
            this.id = id;
        }

        public String getBankNo() {
            return bankNo;
        }

        public void setBankNo(String bankNo) {
            this.bankNo = bankNo;
        }

        public String getMobilePhone() {
            return mobilePhone;
        }

        public void setMobilePhone(String mobilePhone) {
            this.mobilePhone = mobilePhone;
        }

        public String getIsDefault() {
            return isDefault;
        }

        public void setIsDefault(String isDefault) {
            this.isDefault = isDefault;
        }

        public String getBankSubName() {
            return bankSubName;
        }

        public void setBankSubName(String bankSubName) {
            this.bankSubName = bankSubName;
        }

        public String getBankCnName() {
            return bankCnName;
        }

        public void setBankCnName(String bankCnName) {
            this.bankCnName = bankCnName;
        }

        public String getUserName() {
            return userName;
        }

        public void setUserName(String userName) {
            this.userName = userName;
        }

        public String getRealName() {
            return realName;
        }

        public void setRealName(String realName) {
            this.realName = realName;
        }

        public int getMemberId() {
            return memberId;
        }

        public void setMemberId(int memberId) {
            this.memberId = memberId;
        }

        public String getBankImgUrl() {
            return bankImgUrl;
        }

        public void setBankImgUrl(String bankImgUrl) {
            this.bankImgUrl = bankImgUrl;
        }

        public String getBankAddress() {
            return bankAddress;
        }

        public void setBankAddress(String bankAddress) {
            this.bankAddress = bankAddress;
        }

        public String getBindTime() {
            return bindTime;
        }

        public void setBindTime(String bindTime) {
            this.bindTime = bindTime;
        }

        public String getBankEnName() {
            return bankEnName;
        }

        public void setBankEnName(String bankEnName) {
            this.bankEnName = bankEnName;
        }
    }
}
