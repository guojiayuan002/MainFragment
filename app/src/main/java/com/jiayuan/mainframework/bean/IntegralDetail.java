package com.jiayuan.mainframework.bean;


import java.io.Serializable;
import java.util.List;

/**
 * Created by guojiayuan on 2017/6/15.
 */

public class IntegralDetail {


        /**
         * errorCode : 1
         * count : 20
         * data : [{"month":"2017-04","detailVoList":[{"id":"211","tradeType":null,"remainder":"102322","changesType":"转入","changesNumber":"201742330096089","remarks":"红积分每日返还转入","changesTime":"2017-04-23 03:00:00","type":"red","changesSum":"299"},{"id":"187","tradeType":null,"remainder":"102023","changesType":"转入","changesNumber":"201742230090586","remarks":"红积分每日返还转入","changesTime":"2017-04-22 03:00:00","type":"red","changesSum":"299"},{"id":"163","tradeType":null,"remainder":"101724","changesType":"转入","changesNumber":"201742130091395","remarks":"红积分每日返还转入","changesTime":"2017-04-21 03:00:00","type":"red","changesSum":"299"},{"id":"139","tradeType":null,"remainder":"101425","changesType":"转入","changesNumber":"201742030097514","remarks":"红积分每日返还转入","changesTime":"2017-04-20 03:00:00","type":"red","changesSum":"300"},{"id":"115","tradeType":null,"remainder":"101125","changesType":"转入","changesNumber":"201741930098728","remarks":"红积分每日返还转入","changesTime":"2017-04-19 03:00:00","type":"red","changesSum":"300"},{"id":"76","tradeType":null,"remainder":"100824.95","changesType":"转入","changesNumber":"201741830093345","remarks":"红积分每日返还转入","changesTime":"2017-04-18 03:00:00","type":"red","changesSum":"299.9"},{"id":"50","tradeType":null,"remainder":"100525.05","changesType":"转入","changesNumber":"201741730093951","remarks":"红积分每日返还转入","changesTime":"2017-04-17 03:00:00","type":"red","changesSum":"300.05"},{"id":"24","tradeType":null,"remainder":"100335.2","changesType":"转入","changesNumber":"201741630096415","remarks":"红积分每日返还转入","changesTime":"2017-04-16 03:00:00","type":"red","changesSum":"300.2"},{"id":"42","tradeType":null,"remainder":"100225.00","changesType":"转出","changesNumber":"C201704161453038323","remarks":"红积分兑换转出60.00","changesTime":"2017-04-16 14:53:03","type":"red","changesSum":"60.00"},{"id":"41","tradeType":null,"remainder":"100285.0","changesType":"转出","changesNumber":"C201704161445053443","remarks":"红积分兑换转出50.00","changesTime":"2017-04-16 14:45:05","type":"red","changesSum":"50.00"},{"id":"13","tradeType":null,"remainder":"100234.0","changesType":"转出","changesNumber":"C201704150944012095","remarks":"红积分兑换转出10","changesTime":"2017-04-15 09:44:01","type":"red","changesSum":"10"},{"id":"16","tradeType":null,"remainder":"100035.0","changesType":"转出","changesNumber":"C201704151527078585","remarks":"红积分兑换转出9.00","changesTime":"2017-04-15 15:27:07","type":"red","changesSum":"9.00"},{"id":"15","tradeType":null,"remainder":"100044.0","changesType":"转出","changesNumber":"C201704151521351373","remarks":"红积分兑换转出90.00","changesTime":"2017-04-15 15:21:35","type":"red","changesSum":"90.00"},{"id":"14","tradeType":null,"remainder":"100134.0","changesType":"转出","changesNumber":"C201704151518114829","remarks":"红积分兑换转出100.00","changesTime":"2017-04-15 15:18:11","type":"red","changesSum":"100.00"}]},{"month":"2017-03","detailVoList":[{"id":"7","tradeType":"商城购物","remainder":"9887511","changesType":"转入","changesNumber":"7777","remarks":"商城购物","changesTime":"2017-3-30 18:02:12","type":"red","changesSum":"9887511"},{"id":"8","tradeType":"商城购物","remainder":"9887511","changesType":"转出","changesNumber":"88888","remarks":"商城购物","changesTime":"2017-3-30 18:02:12","type":"red","changesSum":"9887511"},{"id":"9","tradeType":"商城购物","remainder":"9887511","changesType":"转入","changesNumber":"99999","remarks":"商城购物","changesTime":"2017-3-30 18:02:12","type":"red","changesSum":"9887511"},{"id":"10","tradeType":"商城购物","remainder":"9887511","changesType":"转出","changesNumber":"1010101010","remarks":"商城购物","changesTime":"2017-3-30 18:02:12","type":"red","changesSum":"9887511"},{"id":"11","tradeType":"商城购物","remainder":"9887511","changesType":"转入","changesNumber":"12121212","remarks":"商城购物","changesTime":"2017-3-30 18:02:12","type":"red","changesSum":"9887511"},{"id":"12","tradeType":"商城购物","remainder":"9887511","changesType":"转入","changesNumber":"1313131","remarks":"商城购物","changesTime":"2017-3-30 18:02:12","type":"red","changesSum":"9887511"}]}]
         * msg : 成功
         */

        private String errorCode;
        private String count;
        private String msg;
        /**
         * month : 2017-04
         * detailVoList : [{"id":"211","tradeType":null,"remainder":"102322","changesType":"转入","changesNumber":"201742330096089","remarks":"红积分每日返还转入","changesTime":"2017-04-23 03:00:00","type":"red","changesSum":"299"},{"id":"187","tradeType":null,"remainder":"102023","changesType":"转入","changesNumber":"201742230090586","remarks":"红积分每日返还转入","changesTime":"2017-04-22 03:00:00","type":"red","changesSum":"299"},{"id":"163","tradeType":null,"remainder":"101724","changesType":"转入","changesNumber":"201742130091395","remarks":"红积分每日返还转入","changesTime":"2017-04-21 03:00:00","type":"red","changesSum":"299"},{"id":"139","tradeType":null,"remainder":"101425","changesType":"转入","changesNumber":"201742030097514","remarks":"红积分每日返还转入","changesTime":"2017-04-20 03:00:00","type":"red","changesSum":"300"},{"id":"115","tradeType":null,"remainder":"101125","changesType":"转入","changesNumber":"201741930098728","remarks":"红积分每日返还转入","changesTime":"2017-04-19 03:00:00","type":"red","changesSum":"300"},{"id":"76","tradeType":null,"remainder":"100824.95","changesType":"转入","changesNumber":"201741830093345","remarks":"红积分每日返还转入","changesTime":"2017-04-18 03:00:00","type":"red","changesSum":"299.9"},{"id":"50","tradeType":null,"remainder":"100525.05","changesType":"转入","changesNumber":"201741730093951","remarks":"红积分每日返还转入","changesTime":"2017-04-17 03:00:00","type":"red","changesSum":"300.05"},{"id":"24","tradeType":null,"remainder":"100335.2","changesType":"转入","changesNumber":"201741630096415","remarks":"红积分每日返还转入","changesTime":"2017-04-16 03:00:00","type":"red","changesSum":"300.2"},{"id":"42","tradeType":null,"remainder":"100225.00","changesType":"转出","changesNumber":"C201704161453038323","remarks":"红积分兑换转出60.00","changesTime":"2017-04-16 14:53:03","type":"red","changesSum":"60.00"},{"id":"41","tradeType":null,"remainder":"100285.0","changesType":"转出","changesNumber":"C201704161445053443","remarks":"红积分兑换转出50.00","changesTime":"2017-04-16 14:45:05","type":"red","changesSum":"50.00"},{"id":"13","tradeType":null,"remainder":"100234.0","changesType":"转出","changesNumber":"C201704150944012095","remarks":"红积分兑换转出10","changesTime":"2017-04-15 09:44:01","type":"red","changesSum":"10"},{"id":"16","tradeType":null,"remainder":"100035.0","changesType":"转出","changesNumber":"C201704151527078585","remarks":"红积分兑换转出9.00","changesTime":"2017-04-15 15:27:07","type":"red","changesSum":"9.00"},{"id":"15","tradeType":null,"remainder":"100044.0","changesType":"转出","changesNumber":"C201704151521351373","remarks":"红积分兑换转出90.00","changesTime":"2017-04-15 15:21:35","type":"red","changesSum":"90.00"},{"id":"14","tradeType":null,"remainder":"100134.0","changesType":"转出","changesNumber":"C201704151518114829","remarks":"红积分兑换转出100.00","changesTime":"2017-04-15 15:18:11","type":"red","changesSum":"100.00"}]
         */

        private List<DataBean> data;

        public String getErrorCode() {
                return errorCode;
        }

        public void setErrorCode(String errorCode) {
                this.errorCode = errorCode;
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

        public static class DataBean implements Serializable{
                private String month;
                /**
                 * id : 211
                 * tradeType : null
                 * remainder : 102322
                 * changesType : 转入
                 * changesNumber : 201742330096089
                 * remarks : 红积分每日返还转入
                 * changesTime : 2017-04-23 03:00:00
                 * type : red
                 * changesSum : 299
                 */

                private List<DetailVoListBean> detailVoList;

                public String getMonth() {
                        return month;
                }

                public void setMonth(String month) {
                        this.month = month;
                }

                public List<DetailVoListBean> getDetailVoList() {
                        return detailVoList;
                }

                public void setDetailVoList(List<DetailVoListBean> detailVoList) {
                        this.detailVoList = detailVoList;
                }

                public static class DetailVoListBean implements Serializable{
                        private String id;
                        private Object tradeType;
                        private String remainder;
                        private String changesType;
                        private String changesNumber;
                        private String remarks;
                        private String changesTime;
                        private String type;
                        private String changesSum;

                        public String getId() {
                                return id;
                        }

                        public void setId(String id) {
                                this.id = id;
                        }

                        public Object getTradeType() {
                                return tradeType;
                        }

                        public void setTradeType(Object tradeType) {
                                this.tradeType = tradeType;
                        }

                        public String getRemainder() {
                                return remainder;
                        }

                        public void setRemainder(String remainder) {
                                this.remainder = remainder;
                        }

                        public String getChangesType() {
                                return changesType;
                        }

                        public void setChangesType(String changesType) {
                                this.changesType = changesType;
                        }

                        public String getChangesNumber() {
                                return changesNumber;
                        }

                        public void setChangesNumber(String changesNumber) {
                                this.changesNumber = changesNumber;
                        }

                        public String getRemarks() {
                                return remarks;
                        }

                        public void setRemarks(String remarks) {
                                this.remarks = remarks;
                        }

                        public String getChangesTime() {
                                return changesTime;
                        }

                        public void setChangesTime(String changesTime) {
                                this.changesTime = changesTime;
                        }

                        public String getType() {
                                return type;
                        }

                        public void setType(String type) {
                                this.type = type;
                        }

                        public String getChangesSum() {
                                return changesSum;
                        }

                        public void setChangesSum(String changesSum) {
                                this.changesSum = changesSum;
                        }
                }
        }
}
