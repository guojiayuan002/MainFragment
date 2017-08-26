package com.jiayuan.mainframework.bean;

/**
 * Created by guojiayuan on 2017/6/15.
 */
//积分管理首页
public class IntegralManageHost {

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

        private IntegralVoBean integralVo;

        public IntegralVoBean getIntegralVo() {
            return integralVo;
        }

        public void setIntegralVo(IntegralVoBean integralVo) {
            this.integralVo = integralVo;
        }

        public static class IntegralVoBean {
            private String account;
            private String memberId;
            private String memberName;
            private String redIntegral;
            private String whiteIntegral;

            public String getAccount() {
                return account;
            }

            public void setAccount(String account) {
                this.account = account;
            }

            public String getMemberId() {
                return memberId;
            }

            public void setMemberId(String memberId) {
                this.memberId = memberId;
            }

            public String getMemberName() {
                return memberName;
            }

            public void setMemberName(String memberName) {
                this.memberName = memberName;
            }

            public String getRedIntegral() {
                return redIntegral;
            }

            public void setRedIntegral(String redIntegral) {
                this.redIntegral = redIntegral;
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
