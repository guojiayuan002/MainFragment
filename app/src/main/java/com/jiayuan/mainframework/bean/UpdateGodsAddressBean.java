package com.jiayuan.mainframework.bean;

/**
 * Created by guojiayuan on 2017/6/8.
 */

public class UpdateGodsAddressBean {
    //编辑地址

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
        /**
         * id : 1
         * area : fdfasdfsa
         * mobilePhone : 13566661421
         * email : null
         * isDefault : N
         * address : 的撒大所
         * zipCode : null
         * tel : null
         * receivingName : 国家云
         * memberMobilePhone : null
         */

        private AddressBean address;

        public AddressBean getAddress() {
            return address;
        }

        public void setAddress(AddressBean address) {
            this.address = address;
        }

        public static class AddressBean {
            private int id;
            private String area;
            private String mobilePhone;
            private Object email;
            private String isDefault;
            private String address;
            private Object zipCode;
            private Object tel;
            private String receivingName;
            private Object memberMobilePhone;

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

            public Object getEmail() {
                return email;
            }

            public void setEmail(Object email) {
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

            public Object getZipCode() {
                return zipCode;
            }

            public void setZipCode(Object zipCode) {
                this.zipCode = zipCode;
            }

            public Object getTel() {
                return tel;
            }

            public void setTel(Object tel) {
                this.tel = tel;
            }

            public String getReceivingName() {
                return receivingName;
            }

            public void setReceivingName(String receivingName) {
                this.receivingName = receivingName;
            }

            public Object getMemberMobilePhone() {
                return memberMobilePhone;
            }

            public void setMemberMobilePhone(Object memberMobilePhone) {
                this.memberMobilePhone = memberMobilePhone;
            }
        }
    }
}
