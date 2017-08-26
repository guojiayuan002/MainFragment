package com.jiayuan.mainframework.bean;

import java.util.List;

/**
 * Created by guojiayuan on 2017/6/7.
 */

public class BannerBean {



    private String count;
    private DataBean data;
    private String errorCode;
    private String msg;

    public String getCount() {
        return count;
    }

    public void setCount(String count) {
        this.count = count;
    }

    public DataBean getData() {
        return data;
    }

    public void setData(DataBean data) {
        this.data = data;
    }

    public String getErrorCode() {
        return errorCode;
    }

    public void setErrorCode(String errorCode) {
        this.errorCode = errorCode;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public static class DataBean {
        /**
         * addTime : 2017-05-25 10:52:29
         * describe : 雅培金装贴合宝宝身体所需
         * id : 10
         * imgUrl : http://119.23.151.226/img/banner/20170526/1495782877290.png
         * link : https://www.yntglobe.com/commodity/detail.html?id=87
         */

        private List<ResultListBean> resultList;

        public List<ResultListBean> getResultList() {
            return resultList;
        }

        public void setResultList(List<ResultListBean> resultList) {
            this.resultList = resultList;
        }

        public static class ResultListBean {
            private String addTime;
            private String describe;
            private int id;
            private String imgUrl;
            private String link;

            public String getAddTime() {
                return addTime;
            }

            public void setAddTime(String addTime) {
                this.addTime = addTime;
            }

            public String getDescribe() {
                return describe;
            }

            public void setDescribe(String describe) {
                this.describe = describe;
            }

            public int getId() {
                return id;
            }

            public void setId(int id) {
                this.id = id;
            }

            public String getImgUrl() {
                return imgUrl;
            }

            public void setImgUrl(String imgUrl) {
                this.imgUrl = imgUrl;
            }

            public String getLink() {
                return link;
            }

            public void setLink(String link) {
                this.link = link;
            }
        }
    }

    @Override
    public String toString() {
        return "BannerBean{" +
                "count='" + count + '\'' +
                ", data=" + data +
                ", errorCode='" + errorCode + '\'' +
                ", msg='" + msg + '\'' +
                '}';
    }
}
