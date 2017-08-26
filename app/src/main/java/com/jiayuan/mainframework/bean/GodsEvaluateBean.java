package com.jiayuan.mainframework.bean;

import java.util.List;

/**
 * Created by guojiayuan on 2017/8/9.
 */

public class GodsEvaluateBean {


    private int count;
    private String msg;
    private String code;
    private List<DataBean> data;

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
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

    public static class DataBean {
        private String commodityScore;
        private String commodityDescription;
        private String mobilePhone;
        private String commodityImpress;
        private String commodityEvaluate;
        private String submitTime;
        private String logisticsScore;
        private String memberId;
        private String sellerScore;
        private String memberName;
        private String memberHead;
        private String evaluateImg;
        private String memberLevel;

        public String getCommodityScore() {
            return commodityScore;
        }

        public void setCommodityScore(String commodityScore) {
            this.commodityScore = commodityScore;
        }

        public String getCommodityDescription() {
            return commodityDescription;
        }

        public void setCommodityDescription(String commodityDescription) {
            this.commodityDescription = commodityDescription;
        }

        public String getMobilePhone() {
            return mobilePhone;
        }

        public void setMobilePhone(String mobilePhone) {
            this.mobilePhone = mobilePhone;
        }

        public String getCommodityImpress() {
            return commodityImpress;
        }

        public void setCommodityImpress(String commodityImpress) {
            this.commodityImpress = commodityImpress;
        }

        public String getCommodityEvaluate() {
            return commodityEvaluate;
        }

        public void setCommodityEvaluate(String commodityEvaluate) {
            this.commodityEvaluate = commodityEvaluate;
        }

        public String getSubmitTime() {
            return submitTime;
        }

        public void setSubmitTime(String submitTime) {
            this.submitTime = submitTime;
        }

        public String getLogisticsScore() {
            return logisticsScore;
        }

        public void setLogisticsScore(String logisticsScore) {
            this.logisticsScore = logisticsScore;
        }

        public String getMemberId() {
            return memberId;
        }

        public void setMemberId(String memberId) {
            this.memberId = memberId;
        }

        public String getSellerScore() {
            return sellerScore;
        }

        public void setSellerScore(String sellerScore) {
            this.sellerScore = sellerScore;
        }

        public String getMemberName() {
            return memberName;
        }

        public void setMemberName(String memberName) {
            this.memberName = memberName;
        }

        public String getMemberHead() {
            return memberHead;
        }

        public void setMemberHead(String memberHead) {
            this.memberHead = memberHead;
        }

        public String getEvaluateImg() {
            return evaluateImg;
        }

        public void setEvaluateImg(String evaluateImg) {
            this.evaluateImg = evaluateImg;
        }

        public String getMemberLevel() {
            return memberLevel;
        }

        public void setMemberLevel(String memberLevel) {
            this.memberLevel = memberLevel;
        }
    }
}
