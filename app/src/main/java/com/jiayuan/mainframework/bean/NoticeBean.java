package com.jiayuan.mainframework.bean;

import java.util.List;

/**
 * Created by guojiayuan on 2017/6/7.
 */

//主页 垂直广告轮播
public class NoticeBean {


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
         * content : <p>测试531</p>
         * id : 24
         * isValid : Y
         * publishTime : 2017-05-31 11:43:17
         * subheading : 测试5310副标题
         * title : 测试531
         */

        private List<ResultListBean> resultList;

        public List<ResultListBean> getResultList() {
            return resultList;
        }

        public void setResultList(List<ResultListBean> resultList) {
            this.resultList = resultList;
        }

        public static class ResultListBean {
            private String content;
            private int id;
            private String isValid;
            private String publishTime;
            private String subheading;
            private String title;

            public String getContent() {
                return content;
            }

            public void setContent(String content) {
                this.content = content;
            }

            public int getId() {
                return id;
            }

            public void setId(int id) {
                this.id = id;
            }

            public String getIsValid() {
                return isValid;
            }

            public void setIsValid(String isValid) {
                this.isValid = isValid;
            }

            public String getPublishTime() {
                return publishTime;
            }

            public void setPublishTime(String publishTime) {
                this.publishTime = publishTime;
            }

            public String getSubheading() {
                return subheading;
            }

            public void setSubheading(String subheading) {
                this.subheading = subheading;
            }

            public String getTitle() {
                return title;
            }

            public void setTitle(String title) {
                this.title = title;
            }
        }
    }
}
