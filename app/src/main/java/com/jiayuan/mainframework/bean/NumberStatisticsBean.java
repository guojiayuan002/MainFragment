package com.jiayuan.mainframework.bean;

/**
 * Created by guojiayuan on 2017/8/3.
 */

public class NumberStatisticsBean {

    private int count;
    private DataBean data;
    private String msg;
    private String code;

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
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

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public static class DataBean {
        private int shopCart;
        private int browseRecords;
        private int orderToPay;
        private int privateMessage;
        private int favorites;
        private int orderToSend;
        private int orderToComment;
        private int orderToReceive;

        public int getShopCart() {
            return shopCart;
        }

        public void setShopCart(int shopCart) {
            this.shopCart = shopCart;
        }

        public int getBrowseRecords() {
            return browseRecords;
        }

        public void setBrowseRecords(int browseRecords) {
            this.browseRecords = browseRecords;
        }

        public int getOrderToPay() {
            return orderToPay;
        }

        public void setOrderToPay(int orderToPay) {
            this.orderToPay = orderToPay;
        }

        public int getPrivateMessage() {
            return privateMessage;
        }

        public void setPrivateMessage(int privateMessage) {
            this.privateMessage = privateMessage;
        }

        public int getFavorites() {
            return favorites;
        }

        public void setFavorites(int favorites) {
            this.favorites = favorites;
        }

        public int getOrderToSend() {
            return orderToSend;
        }

        public void setOrderToSend(int orderToSend) {
            this.orderToSend = orderToSend;
        }

        public int getOrderToComment() {
            return orderToComment;
        }

        public void setOrderToComment(int orderToComment) {
            this.orderToComment = orderToComment;
        }

        public int getOrderToReceive() {
            return orderToReceive;
        }

        public void setOrderToReceive(int orderToReceive) {
            this.orderToReceive = orderToReceive;
        }
    }
}
