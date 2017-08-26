package com.jiayuan.mainframework.bean;

import java.util.List;

/**
 * Created by guojiayuan on 2017/7/12.
 */

public class BrowseRecordsBean {

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
        private String date;
        private List<ListBean> list;

        public String getDate() {
            return date;
        }

        public void setDate(String date) {
            this.date = date;
        }

        public List<ListBean> getList() {
            return list;
        }

        public void setList(List<ListBean> list) {
            this.list = list;
        }

        public static class ListBean {
            private String sortPrice;
            private int browseId;
            private String memberId;
            private String commodityName;
            private String commodityId;
            private String picMain1;
            private String browseTime;
            private boolean checked;
            private boolean editStatus;

            public boolean isEditStatus() {
                return editStatus;
            }

            public void setEditStatus(boolean editStatus) {
                this.editStatus = editStatus;
            }

            public boolean isChecked() {
                return checked;
            }

            public void setChecked(boolean checked) {
                this.checked = checked;
            }

            public String getSortPrice() {
                return sortPrice;
            }

            public void setSortPrice(String sortPrice) {
                this.sortPrice = sortPrice;
            }

            public int getBrowseId() {
                return browseId;
            }

            public void setBrowseId(int browseId) {
                this.browseId = browseId;
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

            public String getCommodityId() {
                return commodityId;
            }

            public void setCommodityId(String commodityId) {
                this.commodityId = commodityId;
            }

            public String getPicMain1() {
                return picMain1;
            }

            public void setPicMain1(String picMain1) {
                this.picMain1 = picMain1;
            }

            public String getBrowseTime() {
                return browseTime;
            }

            public void setBrowseTime(String browseTime) {
                this.browseTime = browseTime;
            }
        }
    }
}
