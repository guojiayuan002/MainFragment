package com.jiayuan.mainframework.bean;

import java.util.List;

/**
 * Created by guojiayuan on 2017/7/7.
 */

public class GodsDetailBean {


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
        private String count;
        private String seoKeywords;
        private String specialFreight;
        private String brandName;
        private String picMain1;
        private String picMain2;
        private String picMain4;
        private String picMain3;
        private String title;
        private String picMain6;
        private String picMain5;
        private String commodityNo;
        private String sales;
        private String isRecommend;
        private String sellerShop;
        private String defaultFreight;
        private String commodityInfo;
        private String commodityName;
        private String recommendType;
        private String freightType;
        private String sellerId;
        private String sortPrice;
        private String shopPlatform;
        private String memberId;
        private String isUp;
        private String attributes;
        private String isFavorited;
        private String commodityId;
        private String detailImages;

        private List<InventoriesBean> inventories;

        public String getCount() {
            return count;
        }

        public void setCount(String count) {
            this.count = count;
        }

        public String getSeoKeywords() {
            return seoKeywords;
        }

        public void setSeoKeywords(String seoKeywords) {
            this.seoKeywords = seoKeywords;
        }

        public String getSpecialFreight() {
            return specialFreight;
        }

        public void setSpecialFreight(String specialFreight) {
            this.specialFreight = specialFreight;
        }

        public String getBrandName() {
            return brandName;
        }

        public void setBrandName(String brandName) {
            this.brandName = brandName;
        }

        public String getPicMain1() {
            return picMain1;
        }

        public void setPicMain1(String picMain1) {
            this.picMain1 = picMain1;
        }

        public String getPicMain2() {
            return picMain2;
        }

        public void setPicMain2(String picMain2) {
            this.picMain2 = picMain2;
        }

        public String getPicMain4() {
            return picMain4;
        }

        public void setPicMain4(String picMain4) {
            this.picMain4 = picMain4;
        }

        public String getPicMain3() {
            return picMain3;
        }

        public void setPicMain3(String picMain3) {
            this.picMain3 = picMain3;
        }

        public String getTitle() {
            return title;
        }

        public void setTitle(String title) {
            this.title = title;
        }

        public String getPicMain6() {
            return picMain6;
        }

        public void setPicMain6(String picMain6) {
            this.picMain6 = picMain6;
        }

        public String getPicMain5() {
            return picMain5;
        }

        public void setPicMain5(String picMain5) {
            this.picMain5 = picMain5;
        }

        public String getCommodityNo() {
            return commodityNo;
        }

        public void setCommodityNo(String commodityNo) {
            this.commodityNo = commodityNo;
        }

        public String getSales() {
            return sales;
        }

        public void setSales(String sales) {
            this.sales = sales;
        }

        public String getIsRecommend() {
            return isRecommend;
        }

        public void setIsRecommend(String isRecommend) {
            this.isRecommend = isRecommend;
        }

        public String getSellerShop() {
            return sellerShop;
        }

        public void setSellerShop(String sellerShop) {
            this.sellerShop = sellerShop;
        }

        public String getDefaultFreight() {
            return defaultFreight;
        }

        public void setDefaultFreight(String defaultFreight) {
            this.defaultFreight = defaultFreight;
        }

        public String getCommodityInfo() {
            return commodityInfo;
        }

        public void setCommodityInfo(String commodityInfo) {
            this.commodityInfo = commodityInfo;
        }

        public String getCommodityName() {
            return commodityName;
        }

        public void setCommodityName(String commodityName) {
            this.commodityName = commodityName;
        }

        public String getRecommendType() {
            return recommendType;
        }

        public void setRecommendType(String recommendType) {
            this.recommendType = recommendType;
        }

        public String getFreightType() {
            return freightType;
        }

        public void setFreightType(String freightType) {
            this.freightType = freightType;
        }

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

        public String getShopPlatform() {
            return shopPlatform;
        }

        public void setShopPlatform(String shopPlatform) {
            this.shopPlatform = shopPlatform;
        }

        public String getMemberId() {
            return memberId;
        }

        public void setMemberId(String memberId) {
            this.memberId = memberId;
        }

        public String getIsUp() {
            return isUp;
        }

        public void setIsUp(String isUp) {
            this.isUp = isUp;
        }

        public String getAttributes() {
            return attributes;
        }

        public void setAttributes(String attributes) {
            this.attributes = attributes;
        }

        public String getIsFavorited() {
            return isFavorited;
        }

        public void setIsFavorited(String isFavorited) {
            this.isFavorited = isFavorited;
        }

        public String getCommodityId() {
            return commodityId;
        }

        public void setCommodityId(String commodityId) {
            this.commodityId = commodityId;
        }

        public String getDetailImages() {
            return detailImages;
        }

        public void setDetailImages(String detailImages) {
            this.detailImages = detailImages;
        }

        public List<InventoriesBean> getInventories() {
            return inventories;
        }

        public void setInventories(List<InventoriesBean> inventories) {
            this.inventories = inventories;
        }

        public static class InventoriesBean {
            private String inventoryId;
            private String imgs;
            private String attr;
            private String price;
            private String commodityId;
            private String count;
            private boolean checked;

            public boolean getChecked() {
                return checked;
            }

            public void setChecked(boolean checked) {
                this.checked = checked;
            }

            public String getInventoryId() {
                return inventoryId;
            }

            public void setInventoryId(String inventoryId) {
                this.inventoryId = inventoryId;
            }

            public String getImgs() {
                return imgs;
            }

            public void setImgs(String imgs) {
                this.imgs = imgs;
            }

            public String getAttr() {
                return attr;
            }

            public void setAttr(String attr) {
                this.attr = attr;
            }

            public String getPrice() {
                return price;
            }

            public void setPrice(String price) {
                this.price = price;
            }

            public String getCommodityId() {
                return commodityId;
            }

            public void setCommodityId(String commodityId) {
                this.commodityId = commodityId;
            }

            public String getCount() {
                return count;
            }

            public void setCount(String count) {
                this.count = count;
            }
        }
    }
}
