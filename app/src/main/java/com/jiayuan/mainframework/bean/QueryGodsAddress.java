package com.jiayuan.mainframework.bean;

import java.util.List;

/**
 * Created by guojiayuan on 2017/6/8.
 */

public class QueryGodsAddress {


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

        private List<AddressesBean> addresses;

        public List<AddressesBean> getAddresses() {
            return addresses;
        }

        public void setAddresses(List<AddressesBean> addresses) {
            this.addresses = addresses;
        }

        public static class AddressesBean {
            private int id;
            private String area;
            private String mobilePhone;
            private String email;
            private String isDefault;
            private String address;
            private String zipCode;
            private String tel;
            private String receivingName;
            private String memberMobilePhone;

            public int getId() {
                return id;
            }

            public void setId(int id) {
                this.id = id;
            }

            public String getArea() {
                return area;
            }

            public void setArea(String area) {
                this.area = area;
            }

            public String getMobilePhone() {
                return mobilePhone;
            }

            public void setMobilePhone(String mobilePhone) {
                this.mobilePhone = mobilePhone;
            }

            public String getEmail() {
                return email;
            }

            public void setEmail(String email) {
                this.email = email;
            }

            public String getIsDefault() {
                return isDefault;
            }

            public void setIsDefault(String isDefault) {
                this.isDefault = isDefault;
            }

            public String getAddress() {
                return address;
            }

            public void setAddress(String address) {
                this.address = address;
            }

            public String getZipCode() {
                return zipCode;
            }

            public void setZipCode(String zipCode) {
                this.zipCode = zipCode;
            }

            public String getTel() {
                return tel;
            }

            public void setTel(String tel) {
                this.tel = tel;
            }

            public String getReceivingName() {
                return receivingName;
            }

            public void setReceivingName(String receivingName) {
                this.receivingName = receivingName;
            }

            public String getMemberMobilePhone() {
                return memberMobilePhone;
            }

            public void setMemberMobilePhone(String memberMobilePhone) {
                this.memberMobilePhone = memberMobilePhone;
            }
        }
    }
}
