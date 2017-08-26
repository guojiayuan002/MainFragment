package com.jiayuan.mainframework.bean;


public class RegistBean {


    /**
     * count :
     * data : {"member":{"account":"0","id":61,"memberLevel":3,"memberName":"18519201345","mobilePhone":"18519201345","pwd":"","redIntegral":"0","registrationDate":"2017-06-05 15:56:56","whiteIntegral":"0"}}
     * errorCode : 1
     * msg : 会员注册成功
     */

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
        /**
         * member : {"account":"0","id":61,"memberLevel":3,"memberName":"18519201345","mobilePhone":"18519201345","pwd":"","redIntegral":"0","registrationDate":"2017-06-05 15:56:56","whiteIntegral":"0"}
         */

        private MemberBean member;

        public MemberBean getMember() {
            return member;
        }

        public void setMember(MemberBean member) {
            this.member = member;
        }

        public static class MemberBean {
            /**
             * account : 0
             * id : 61
             * memberLevel : 3
             * memberName : 18519201345
             * mobilePhone : 18519201345
             * pwd :
             * redIntegral : 0
             * registrationDate : 2017-06-05 15:56:56
             * whiteIntegral : 0
             */

            private String account;
            private int id;
            private int memberLevel;
            private String memberName;
            private String mobilePhone;
            private String pwd;
            private String redIntegral;
            private String registrationDate;
            private String whiteIntegral;

            public String getAccount() {
                return account;
            }

            public void setAccount(String account) {
                this.account = account;
            }

            public int getId() {
                return id;
            }

            public void setId(int id) {
                this.id = id;
            }

            public int getMemberLevel() {
                return memberLevel;
            }

            public void setMemberLevel(int memberLevel) {
                this.memberLevel = memberLevel;
            }

            public String getMemberName() {
                return memberName;
            }

            public void setMemberName(String memberName) {
                this.memberName = memberName;
            }

            public String getMobilePhone() {
                return mobilePhone;
            }

            public void setMobilePhone(String mobilePhone) {
                this.mobilePhone = mobilePhone;
            }

            public String getPwd() {
                return pwd;
            }

            public void setPwd(String pwd) {
                this.pwd = pwd;
            }

            public String getRedIntegral() {
                return redIntegral;
            }

            public void setRedIntegral(String redIntegral) {
                this.redIntegral = redIntegral;
            }

            public String getRegistrationDate() {
                return registrationDate;
            }

            public void setRegistrationDate(String registrationDate) {
                this.registrationDate = registrationDate;
            }

            public String getWhiteIntegral() {
                return whiteIntegral;
            }

            public void setWhiteIntegral(String whiteIntegral) {
                this.whiteIntegral = whiteIntegral;
            }
        }
    }
}