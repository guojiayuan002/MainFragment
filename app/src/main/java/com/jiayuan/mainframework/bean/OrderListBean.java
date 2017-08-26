package com.jiayuan.mainframework.bean;

import java.util.List;

/**
 * Created by guojiayuan on 2017/8/2.
 */

public class OrderListBean {


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
        private String orderState;//待发货
        private String totalSum;//总价
        private String orderNo;//订单流水号
        private String shopName;//店铺名
        private String shopId;//店铺ID
        private String freight;//运费
        private String orderId;//订单ID
        private String totalCommodityCount;//总商品量
        private String receiver;//收货人
        private String receiverMobilePhone;//收货人手机号
        private String address;//收货人地址
        private List<CommoditiesBean> commodities;

        public String getReceiver() {
            return receiver;
        }

        public void setReceiver(String receiver) {
            this.receiver = receiver;
        }

        public String getReceiverMobilePhone() {
            return receiverMobilePhone;
        }

        public void setReceiverMobilePhone(String receiverMobilePhone) {
            this.receiverMobilePhone = receiverMobilePhone;
        }

        public String getAddress() {
            return address;
        }

        public void setAddress(String address) {
            this.address = address;
        }

        public String getOrderState() {
            return orderState;
        }

        public void setOrderState(String orderState) {
            this.orderState = orderState;
        }

        public String getTotalSum() {
            return totalSum;
        }

        public void setTotalSum(String totalSum) {
            this.totalSum = totalSum;
        }

        public String getOrderNo() {
            return orderNo;
        }

        public void setOrderNo(String orderNo) {
            this.orderNo = orderNo;
        }

        public String getShopName() {
            return shopName;
        }

        public void setShopName(String shopName) {
            this.shopName = shopName;
        }

        public String getShopId() {
            return shopId;
        }

        public void setShopId(String shopId) {
            this.shopId = shopId;
        }

        public String getFreight() {
            return freight;
        }

        public void setFreight(String freight) {
            this.freight = freight;
        }

        public String getOrderId() {
            return orderId;
        }

        public void setOrderId(String orderId) {
            this.orderId = orderId;
        }

        public String getTotalCommodityCount() {
            return totalCommodityCount;
        }

        public void setTotalCommodityCount(String totalCommodityCount) {
            this.totalCommodityCount = totalCommodityCount;
        }

        public List<CommoditiesBean> getCommodities() {
            return commodities;
        }

        public void setCommodities(List<CommoditiesBean> commodities) {
            this.commodities = commodities;
        }

        public static class CommoditiesBean {
            private String img;
            private String singlePrice;
            private String commodityDesc;
            private String buyCount;
            private String commodityName;
            private String commodityId;

            //    后补
            private String orderState;
            private String shopName;
            private String shopId;
            private String orderNo;
            private String freight;
            private String orderId;//
            private String receiver;//收货人
            private String receiverMobilePhone;//收货人手机号
            private String address;//收货人地址

            public String getReceiver() {
                return receiver;
            }

            public void setReceiver(String receiver) {
                this.receiver = receiver;
            }

            public String getReceiverMobilePhone() {
                return receiverMobilePhone;
            }

            public void setReceiverMobilePhone(String receiverMobilePhone) {
                this.receiverMobilePhone = receiverMobilePhone;
            }

            public String getAddress() {
                return address;
            }

            public void setAddress(String address) {
                this.address = address;
            }

            public String getOrderId() {
                return orderId;
            }

            public void setOrderId(String orderId) {
                this.orderId = orderId;
            }

            public String getOrderState() {
                return orderState;
            }

            public void setOrderState(String orderState) {
                this.orderState = orderState;
            }

            public String getShopName() {
                return shopName;
            }

            public void setShopName(String shopName) {
                this.shopName = shopName;
            }

            public String getShopId() {
                return shopId;
            }

            public void setShopId(String shopId) {
                this.shopId = shopId;
            }

            public String getOrderNo() {
                return orderNo;
            }

            public void setOrderNo(String orderNo) {
                this.orderNo = orderNo;
            }

            public String getFreight() {
                return freight;
            }

            public void setFreight(String freight) {
                this.freight = freight;
            }

            public String getImg() {
                return img;
            }

            public void setImg(String img) {
                this.img = img;
            }

            public String getSinglePrice() {
                return singlePrice;
            }

            public void setSinglePrice(String singlePrice) {
                this.singlePrice = singlePrice;
            }

            public String getCommodityDesc() {
                return commodityDesc;
            }

            public void setCommodityDesc(String commodityDesc) {
                this.commodityDesc = commodityDesc;
            }

            public String getBuyCount() {
                return buyCount;
            }

            public void setBuyCount(String buyCount) {
                this.buyCount = buyCount;
            }

            public String getCommodityName() {
                return commodityName;
            }

            public void setCommodityName(String commodityName) {
                this.commodityName = commodityName;
            }

            public String getCommodityId() {
                return commodityId;
            }

            public void setCommodityId(String commodityId) {
                this.commodityId = commodityId;
            }
        }
    }
}
