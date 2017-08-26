package com.jiayuan.mainframework.bean;

import java.util.List;

/**
 * Created by guojiayuan on 2017/8/2.
 */

public class OrderDedailBean {


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
        private String receiptMobilePhone;
        private String orderState;
        private String totalSum;
        private String receiptType;
        private String receiver;
        private String receiptHeader;
        private String submitTime;
        private String bankName;
        private String receiptContent;
        private String paySerialNumber;
        private String resBank;
        private String taxCode;
        private String totalCommodityCount;
        private String isReceipt;
        private String orderNo;
        private String address;
        private String unitName;
        private String shopName;
        private String resAddress;
        private String freight;
        private String payWay;
        private String receiverMobilePhone;
        private String resTel;
        private String orderId;
        private String totalPrice;//订单总价（不包括运费）
        private String sendCommodityTime;//发货时间
        private String automaticReceiptTime;////自动收货剩余时间

        public String getTotalPrice() {
            return totalPrice;
        }

        public void setTotalPrice(String totalPrice) {
            this.totalPrice = totalPrice;
        }

        public String getSendCommodityTime() {
            return sendCommodityTime;
        }

        public void setSendCommodityTime(String sendCommodityTime) {
            this.sendCommodityTime = sendCommodityTime;
        }

        public String getAutomaticReceiptTime() {
            return automaticReceiptTime;
        }

        public void setAutomaticReceiptTime(String automaticReceiptTime) {
            this.automaticReceiptTime = automaticReceiptTime;
        }

        private List<CommoditiesBean> commodities;

        public String getReceiptMobilePhone() {
            return receiptMobilePhone;
        }

        public void setReceiptMobilePhone(String receiptMobilePhone) {
            this.receiptMobilePhone = receiptMobilePhone;
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

        public String getReceiptType() {
            return receiptType;
        }

        public void setReceiptType(String receiptType) {
            this.receiptType = receiptType;
        }

        public String getReceiver() {
            return receiver;
        }

        public void setReceiver(String receiver) {
            this.receiver = receiver;
        }

        public String getReceiptHeader() {
            return receiptHeader;
        }

        public void setReceiptHeader(String receiptHeader) {
            this.receiptHeader = receiptHeader;
        }

        public String getSubmitTime() {
            return submitTime;
        }

        public void setSubmitTime(String submitTime) {
            this.submitTime = submitTime;
        }

        public String getBankName() {
            return bankName;
        }

        public void setBankName(String bankName) {
            this.bankName = bankName;
        }

        public String getReceiptContent() {
            return receiptContent;
        }

        public void setReceiptContent(String receiptContent) {
            this.receiptContent = receiptContent;
        }

        public String getPaySerialNumber() {
            return paySerialNumber;
        }

        public void setPaySerialNumber(String paySerialNumber) {
            this.paySerialNumber = paySerialNumber;
        }

        public String getResBank() {
            return resBank;
        }

        public void setResBank(String resBank) {
            this.resBank = resBank;
        }

        public String getTaxCode() {
            return taxCode;
        }

        public void setTaxCode(String taxCode) {
            this.taxCode = taxCode;
        }

        public String getTotalCommodityCount() {
            return totalCommodityCount;
        }

        public void setTotalCommodityCount(String totalCommodityCount) {
            this.totalCommodityCount = totalCommodityCount;
        }

        public String getIsReceipt() {
            return isReceipt;
        }

        public void setIsReceipt(String isReceipt) {
            this.isReceipt = isReceipt;
        }

        public String getOrderNo() {
            return orderNo;
        }

        public void setOrderNo(String orderNo) {
            this.orderNo = orderNo;
        }

        public String getAddress() {
            return address;
        }

        public void setAddress(String address) {
            this.address = address;
        }

        public String getUnitName() {
            return unitName;
        }

        public void setUnitName(String unitName) {
            this.unitName = unitName;
        }

        public String getShopName() {
            return shopName;
        }

        public void setShopName(String shopName) {
            this.shopName = shopName;
        }

        public String getResAddress() {
            return resAddress;
        }

        public void setResAddress(String resAddress) {
            this.resAddress = resAddress;
        }

        public String getFreight() {
            return freight;
        }

        public void setFreight(String freight) {
            this.freight = freight;
        }

        public String getPayWay() {
            return payWay;
        }

        public void setPayWay(String payWay) {
            this.payWay = payWay;
        }

        public String getReceiverMobilePhone() {
            return receiverMobilePhone;
        }

        public void setReceiverMobilePhone(String receiverMobilePhone) {
            this.receiverMobilePhone = receiverMobilePhone;
        }

        public String getResTel() {
            return resTel;
        }

        public void setResTel(String resTel) {
            this.resTel = resTel;
        }

        public String getOrderId() {
            return orderId;
        }

        public void setOrderId(String orderId) {
            this.orderId = orderId;
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
