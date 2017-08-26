package com.jiayuan.mainframework.bean;

import java.util.List;

// 购物车请求返回的数据
public class ShoppingCartBean {


    private String code;
    private String count;
    private String msg;
    private List<DataBean> data;

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

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

    public List<DataBean> getData() {
        return data;
    }

    public void setData(List<DataBean> data) {
        this.data = data;
    }

    public static class DataBean {
        private String selectState;
        private String shopId;
        private String shopName;

        private List<CommoditiesBean> commodities;

        public String getSelectState() {
            return selectState;
        }

        public void setSelectState(String selectState) {
            this.selectState = selectState;
        }

        public String getShopId() {
            return shopId;
        }

        public void setShopId(String shopId) {
            this.shopId = shopId;
        }

        public String getShopName() {
            return shopName;
        }

        public void setShopName(String shopName) {
            this.shopName = shopName;
        }

        public List<CommoditiesBean> getCommodities() {
            return commodities;
        }

        public void setCommodities(List<CommoditiesBean> commodities) {
            this.commodities = commodities;
        }

        public static class CommoditiesBean {
            private String commodityId;
            private String commodityName;
            private String count;
            private String imgUrl;
            private String inventoryCount;
            private String inventoryDesc;
            private String inventoryId;
            private String inventoryPrice;
            private String memberId;
            private String mobilePhone;
            private String selectState;
            private String shopCartId;

            public String getCommodityId() {
                return commodityId;
            }

            public void setCommodityId(String commodityId) {
                this.commodityId = commodityId;
            }

            public String getCommodityName() {
                return commodityName;
            }

            public void setCommodityName(String commodityName) {
                this.commodityName = commodityName;
            }

            public String getCount() {
                return count;
            }

            public void setCount(String count) {
                this.count = count;
            }

            public String getImgUrl() {
                return imgUrl;
            }

            public void setImgUrl(String imgUrl) {
                this.imgUrl = imgUrl;
            }

            public String getInventoryCount() {
                return inventoryCount;
            }

            public void setInventoryCount(String inventoryCount) {
                this.inventoryCount = inventoryCount;
            }

            public String getInventoryDesc() {
                return inventoryDesc;
            }

            public void setInventoryDesc(String inventoryDesc) {
                this.inventoryDesc = inventoryDesc;
            }

            public String getInventoryId() {
                return inventoryId;
            }

            public void setInventoryId(String inventoryId) {
                this.inventoryId = inventoryId;
            }

            public String getInventoryPrice() {
                return inventoryPrice;
            }

            public void setInventoryPrice(String inventoryPrice) {
                this.inventoryPrice = inventoryPrice;
            }

            public String getMemberId() {
                return memberId;
            }

            public void setMemberId(String memberId) {
                this.memberId = memberId;
            }

            public String getMobilePhone() {
                return mobilePhone;
            }

            public void setMobilePhone(String mobilePhone) {
                this.mobilePhone = mobilePhone;
            }

            public String getSelectState() {
                return selectState;
            }

            public void setSelectState(String selectState) {
                this.selectState = selectState;
            }

            public String getShopCartId() {
                return shopCartId;
            }

            public void setShopCartId(String shopCartId) {
                this.shopCartId = shopCartId;
            }
        }
    }
}
