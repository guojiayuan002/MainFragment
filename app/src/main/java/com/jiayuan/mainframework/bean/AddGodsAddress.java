package com.jiayuan.mainframework.bean;

import java.io.Serializable;

/**
 * Created by guojiayuan on 2017/6/8.
 */

public class AddGodsAddress {

    //新增用户信息

    private String count;
    private DataBean data;
    private String errorCode;
    private String msg;

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

    public String getErrorCode() {
        return errorCode;
    }

    public void setErrorCode(String errorCode) {
        this.errorCode = errorCode;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public static class DataBean {

        private AddressBean address;

        public AddressBean getAddress() {
            return address;
        }

        public void setAddress(AddressBean address) {
            this.address = address;
        }

        public static class AddressBean implements Serializable {
            private String address;
            private String area;
            private String email;
            private int id;
            private String isDefault;
            private String memberMobilePhone;
            private String mobilePhone;
            private String receivingName;
            private String tel;
            private String zipCode;

            public String getAddress() {
                return address;
            }

            public void setAddress(String address) {
                this.address = address;
            }

            public String getArea() {
                return area;
            }

            public void setArea(String area) {
                this.area = area;
            }

            public String getEmail() {
                return email;
            }

            public void setEmail(String email) {
                this.email = email;
            }

            public int getId() {
                return id;
            }

            public void setId(int id) {
                this.id = id;
            }

            public String getIsDefault() {
                return isDefault;
            }

            public void setIsDefault(String isDefault) {
                this.isDefault = isDefault;
            }

            public String getMemberMobilePhone() {
                return memberMobilePhone;
            }

            public void setMemberMobilePhone(String memberMobilePhone) {
                this.memberMobilePhone = memberMobilePhone;
            }

            public String getMobilePhone() {
                return mobilePhone;
            }

            public void setMobilePhone(String mobilePhone) {
                this.mobilePhone = mobilePhone;
            }

            public String getReceivingName() {
                return receivingName;
            }

            public void setReceivingName(String receivingName) {
                this.receivingName = receivingName;
            }

            public String getTel() {
                return tel;
            }

            public void setTel(String tel) {
                this.tel = tel;
            }

            public String getZipCode() {
                return zipCode;
            }

            public void setZipCode(String zipCode) {
                this.zipCode = zipCode;
            }
        }
    }
}
