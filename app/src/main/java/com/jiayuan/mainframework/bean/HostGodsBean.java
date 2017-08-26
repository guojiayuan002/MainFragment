package com.jiayuan.mainframework.bean;

import java.util.List;

/**
 * Created by guojiayuan on 2017/6/7.
 */
//首页商品  两个集合复用一个bean对象
public class HostGodsBean {

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
        private String sellerId;
        private String sortPrice;
        private String commdityName;
        private String brandName;
        private String recommendType;
        private String picMain1;
        private String commdityId;

        public String getSellerId() {
            return sellerId;
        }

        public void setSellerId(String sellerId) {
            this.sellerId = sellerId;
        }

        public String getSortPrice() {
            return sortPrice;
        }

        public void setSortPrice(String sortPrice) {
            this.sortPrice = sortPrice;
        }

        public String getCommdityName() {
            return commdityName;
        }

        public void setCommdityName(String commdityName) {
            this.commdityName = commdityName;
        }

        public String getBrandName() {
            return brandName;
        }

        public void setBrandName(String brandName) {
            this.brandName = brandName;
        }

        public String getRecommendType() {
            return recommendType;
        }

        public void setRecommendType(String recommendType) {
            this.recommendType = recommendType;
        }

        public String getPicMain1() {
            return picMain1;
        }

        public void setPicMain1(String picMain1) {
            this.picMain1 = picMain1;
        }

        public String getCommdityId() {
            return commdityId;
        }

        public void setCommdityId(String commdityId) {
            this.commdityId = commdityId;
        }
    }
}
