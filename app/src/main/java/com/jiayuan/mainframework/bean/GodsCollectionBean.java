package com.jiayuan.mainframework.bean;

import java.util.List;

/**
 * Created by guojiayuan on 2017/7/12.
 * 商品收藏夹列表
 */

public class GodsCollectionBean {

    private String count;
    private String msg;
    private String code;
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

    public static class DataBean {
        private int id;
        private String favoriteTime;
        private String sortPrice;
        private String memberId;
        private String commodityName;
        private int commodityId;
        private String picMain1;
        private boolean Checked;
        private boolean editStatus;

        public boolean isEditStatus() {
            return editStatus;
        }

        public void setEditStatus(boolean editStatus) {
            this.editStatus = editStatus;
        }

        public boolean isChecked() {
            return Checked;
        }

        public void setChecked(boolean checked) {
            Checked = checked;
        }

        public int getId() {
            return id;
        }

        public void setId(int id) {
            this.id = id;
        }

        public String getFavoriteTime() {
            return favoriteTime;
        }

        public void setFavoriteTime(String favoriteTime) {
            this.favoriteTime = favoriteTime;
        }

        public String getSortPrice() {
            return sortPrice;
        }

        public void setSortPrice(String sortPrice) {
            this.sortPrice = sortPrice;
        }

        public String getMemberId() {
            return memberId;
        }

        public void setMemberId(String memberId) {
            this.memberId = memberId;
        }

        public String getCommodityName() {
            return commodityName;
        }

        public void setCommodityName(String commodityName) {
            this.commodityName = commodityName;
        }

        public int getCommodityId() {
            return commodityId;
        }

        public void setCommodityId(int commodityId) {
            this.commodityId = commodityId;
        }

        public String getPicMain1() {
            return picMain1;
        }

        public void setPicMain1(String picMain1) {
            this.picMain1 = picMain1;
        }
    }
}
