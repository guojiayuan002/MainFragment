package com.jiayuan.mainframework.bean;

import java.util.List;

/**
 * Created by guojiayuan on 2017/7/27.
 */
public class SettlementBean {

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
        private String totalFeeToPay;
        private String commodityCount;
        private String commodityTotalSum;
        private String totalFreight;
        private List<ShopsBean> shops;

        public String getTotalFeeToPay() {
            return totalFeeToPay;
        }

        public void setTotalFeeToPay(String totalFeeToPay) {
            this.totalFeeToPay = totalFeeToPay;
        }

        public String getCommodityCount() {
            return commodityCount;
        }

        public void setCommodityCount(String commodityCount) {
            this.commodityCount = commodityCount;
        }

        public String getCommodityTotalSum() {
            return commodityTotalSum;
        }

        public void setCommodityTotalSum(String commodityTotalSum) {
            this.commodityTotalSum = commodityTotalSum;
        }

        public String getTotalFreight() {
            return totalFreight;
        }

        public void setTotalFreight(String totalFreight) {
            this.totalFreight = totalFreight;
        }

        public List<ShopsBean> getShops() {
            return shops;
        }

        public void setShops(List<ShopsBean> shops) {
            this.shops = shops;
        }

        public static class ShopsBean {
            private String freight;
            private String selectState;
            private String totalFee;
            private String shopName;
            private String shopId;

            private List<CommoditiesBean> commodities;

            public String getFreight() {
                return freight;
            }

            public void setFreight(String freight) {
                this.freight = freight;
            }

            public String getSelectState() {
                return selectState;
            }

            public void setSelectState(String selectState) {
                this.selectState = selectState;
            }

            public String getTotalFee() {
                return totalFee;
            }

            public void setTotalFee(String totalFee) {
                this.totalFee = totalFee;
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

            public List<CommoditiesBean> getCommodities() {
                return commodities;
            }

            public void setCommodities(List<CommoditiesBean> commodities) {
                this.commodities = commodities;
            }

            public static class CommoditiesBean {
                private String imgUrl;
                private String shopCartId;
                private String selectState;
                private String mobilePhone;
                private String count;
                private String inventoryId;
                private String memberId;
                private String inventoryDesc;
                private String commodityName;
                private String subtotal;
                private String inventoryPrice;
                private String commodityId;
                private String inventoryCount;
                private String totalFee;
                private String shopName;
                private String freight;

                public String getFreight() {
                    return freight;
                }

                public void setFreight(String freight) {
                    this.freight = freight;
                }

                public String getTotalFee() {
                    return totalFee;
                }

                public void setTotalFee(String totalFee) {
                    this.totalFee = totalFee;
                }

                public String getShopName() {
                    return shopName;
                }

                public void setShopName(String shopName) {
                    this.shopName = shopName;
                }

                public String getImgUrl() {
                    return imgUrl;
                }

                public void setImgUrl(String imgUrl) {
                    this.imgUrl = imgUrl;
                }

                public String getShopCartId() {
                    return shopCartId;
                }

                public void setShopCartId(String shopCartId) {
                    this.shopCartId = shopCartId;
                }

                public String getSelectState() {
                    return selectState;
                }

                public void setSelectState(String selectState) {
                    this.selectState = selectState;
                }

                public String getMobilePhone() {
                    return mobilePhone;
                }

                public void setMobilePhone(String mobilePhone) {
                    this.mobilePhone = mobilePhone;
                }

                public String getCount() {
                    return count;
                }

                public void setCount(String count) {
                    this.count = count;
                }

                public String getInventoryId() {
                    return inventoryId;
                }

                public void setInventoryId(String inventoryId) {
                    this.inventoryId = inventoryId;
                }

                public String getMemberId() {
                    return memberId;
                }

                public void setMemberId(String memberId) {
                    this.memberId = memberId;
                }

                public String getInventoryDesc() {
                    return inventoryDesc;
                }

                public void setInventoryDesc(String inventoryDesc) {
                    this.inventoryDesc = inventoryDesc;
                }

                public String getCommodityName() {
                    return commodityName;
                }

                public void setCommodityName(String commodityName) {
                    this.commodityName = commodityName;
                }

                public String getSubtotal() {
                    return subtotal;
                }

                public void setSubtotal(String subtotal) {
                    this.subtotal = subtotal;
                }

                public String getInventoryPrice() {
                    return inventoryPrice;
                }

                public void setInventoryPrice(String inventoryPrice) {
                    this.inventoryPrice = inventoryPrice;
                }

                public String getCommodityId() {
                    return commodityId;
                }

                public void setCommodityId(String commodityId) {
                    this.commodityId = commodityId;
                }

                public String getInventoryCount() {
                    return inventoryCount;
                }

                public void setInventoryCount(String inventoryCount) {
                    this.inventoryCount = inventoryCount;
                }
            }
        }
    }
}
