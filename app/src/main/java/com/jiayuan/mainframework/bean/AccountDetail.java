package com.jiayuan.mainframework.bean;

import java.io.Serializable;
import java.util.List;

/**
 * Created by guojiayuan on 2017/6/15.
 */

public class AccountDetail {


    /**
     * count : 50
     * data : [{"detailVoList":[{"changesNumber":"W201706061012413134","changesSum":"10","changesTime":"2017-06-06 10:12:41","changesType":"转入","id":"162","remainder":"923871.01","remarks":"提现驳回资金退还"}],"month":"2017-06"},{"detailVoList":[{"changesNumber":"201705251349547945","changesSum":"136.00","changesTime":"2017-05-25 13:49:54","changesType":"转出","id":"150","remainder":"923861.01","remarks":"商城购物订单：201705251349464684结算支付136.0元"},{"changesNumber":"201705251348418574","changesSum":"136.00","changesTime":"2017-05-25 13:48:41","changesType":"转出","id":"149","remainder":"923997.01","remarks":"商城购物订单：201705251348354243结算支付136.0元"},{"changesNumber":"201705251345203108","changesSum":"3895.00","changesTime":"2017-05-25 13:45:20","changesType":"转出","id":"148","remainder":"924133.01","remarks":"商城购物订单：201705251345133658结算支付3895.0元"},{"changesNumber":"201705241012132227","changesSum":"779.00","changesTime":"2017-05-24 10:12:13","changesType":"转出","id":"142","remainder":"928028.01","remarks":"商城购物订单：201705241012072905结算支付779.0元"},{"changesNumber":"201705171539197247","changesSum":"198.00","changesTime":"2017-05-17 15:39:19","changesType":"转出","id":"133","remainder":"928807.01","remarks":"商城购物订单：201705171539118994结算支付198.0元"},{"changesNumber":"201705171534215276","changesSum":"396.00","changesTime":"2017-05-17 15:34:21","changesType":"转出","id":"132","remainder":"929005.01","remarks":"商城购物订单：201705171534144980结算支付396.0元"},{"changesNumber":"201705171219215022","changesSum":"119.00","changesTime":"2017-05-17 12:19:21","changesType":"转出","id":"130","remainder":"929401.01","remarks":"商城购物订单：201705161835565650结算支付119.0元"},{"changesNumber":"201705151058042701","changesSum":"200.00","changesTime":"2017-05-15 10:58:04","changesType":"转入","id":"118","remainder":"929520.01","remarks":"推荐会员升级钻石奖励200元"},{"changesNumber":"201705151055375177","changesSum":"200.00","changesTime":"2017-05-15 10:55:37","changesType":"转入","id":"116","remainder":"929320.01","remarks":"推荐会员升级钻石奖励200元"}],"month":"2017-05"},{"detailVoList":[{"changesNumber":"201704191621036855","changesSum":"0.01","changesTime":"2017-04-19 16:21:03","changesType":"转入","id":"113","remainder":"929120.01","remarks":"PC微信充值"},{"changesNumber":"201704191619522732","changesSum":"0.01","changesTime":"2017-04-19 16:19:52","changesType":"转入","id":"112","remainder":"929120.00","remarks":"PC支付宝充值"},{"changesNumber":"201704181757221182","changesSum":"51.50","changesTime":"2017-04-18 17:57:22","changesType":"转出","id":"111","remainder":"929119.99","remarks":"商家收银321.88"},{"changesNumber":"201704181740587287","changesSum":"32.00","changesTime":"2017-04-18 17:40:58","changesType":"转出","id":"110","remainder":"929171.50","remarks":"商家收银200.00"},{"changesNumber":"201704181654485149","changesSum":"19.20","changesTime":"2017-04-18 16:54:48","changesType":"转出","id":"109","remainder":"929203.50","remarks":"商家收银120.00"},{"changesNumber":"201704181654076019","changesSum":"24.00","changesTime":"2017-04-18 16:54:07","changesType":"转出","id":"108","remainder":"929222.70","remarks":"商家收银150.00"},{"changesNumber":"201704181642162727","changesSum":"0.16","changesTime":"2017-04-18 16:42:16","changesType":"转出","id":"107","remainder":"929246.70","remarks":"商家收银1.00"},{"changesNumber":"B201704181149223314","changesSum":"100.00","changesTime":"2017-04-18 11:49:22","changesType":"转入","id":"106","remainder":"929246.86","remarks":"银行卡转账充值"},{"changesNumber":"201704172001515148","changesSum":"0.01","changesTime":"2017-04-17 20:01:51","changesType":"转入","id":"105","remainder":"929146.86","remarks":"PC微信充值"},{"changesNumber":"201704171957052893","changesSum":"0.01","changesTime":"2017-04-17 19:57:05","changesType":"转入","id":"104","remainder":"929146.85","remarks":"PC微信充值"},{"changesNumber":"201704171947194497","changesSum":"0.01","changesTime":"2017-04-17 19:47:19","changesType":"转入","id":"103","remainder":"929146.84","remarks":"PC微信充值"},{"changesNumber":"201704171938295421","changesSum":"0.01","changesTime":"2017-04-17 19:38:29","changesType":"转入","id":"102","remainder":"929146.83","remarks":"PC微信充值"},{"changesNumber":"201704171806528969","changesSum":"0.01","changesTime":"2017-04-17 18:06:52","changesType":"转入","id":"101","remainder":"929146.82","remarks":"PC微信充值"},{"changesNumber":"201704170024551438","changesSum":"0.01","changesTime":"2017-04-17 00:24:55","changesType":"转入","id":"98","remainder":"929146.81","remarks":"PC微信充值"},{"changesNumber":"201704170021075535","changesSum":"0.02","changesTime":"2017-04-17 00:21:07","changesType":"转入","id":"97","remainder":"929146.80","remarks":"PC微信充值"},{"changesNumber":"201704170014047682","changesSum":"1.00","changesTime":"2017-04-17 00:14:04","changesType":"转入","id":"96","remainder":"929144.8","remarks":"PC微信充值"},{"changesNumber":"C201704161453032604","changesSum":"0.52","changesTime":"2017-04-16 14:53:03","changesType":"转入","id":"95","remainder":"929143.80","remarks":"红积分兑换转入现金0.52"},{"changesNumber":"C201704161445054736","changesSum":"0.43","changesTime":"2017-04-16 14:45:05","changesType":"转入","id":"94","remainder":"929143.28","remarks":"红积分兑换转入现金0.43"},{"changesNumber":"U201704161437503391","changesSum":"998.00","changesTime":"2017-04-16 14:37:50","changesType":"转出","id":"93","remainder":"929142.85","remarks":"升级会员扣除金额"},{"changesNumber":"C201704150944012488","changesSum":"0.08","changesTime":"2017-04-15 09:44:01","changesType":"转入","id":"72","remainder":"930835.08","remarks":"红积分兑换转入现金0.08"},{"changesNumber":"201704152341377043","changesSum":"0.02","changesTime":"2017-04-15 23:41:37","changesType":"转入","id":"92","remainder":"930140.85","remarks":"PC支付宝充值"},{"changesNumber":"201704152335221825","changesSum":"0.01","changesTime":"2017-04-15 23:35:22","changesType":"转入","id":"91","remainder":"930140.83","remarks":"PC支付宝充值"},{"changesNumber":"A201704152140236997","changesSum":"0.01","changesTime":"2017-04-15 21:40:23","changesType":"转入","id":"90","remainder":"930140.8200000001","remarks":"支付宝充值"},{"changesNumber":"A201704152135586108","changesSum":"0.01","changesTime":"2017-04-15 21:35:58","changesType":"转入","id":"89","remainder":"930140.81","remarks":"支付宝充值"},{"changesNumber":"U201704151746034950","changesSum":"998.00","changesTime":"2017-04-15 17:46:03","changesType":"转出","id":"87","remainder":"930140.80","remarks":"升级会员扣除金额"},{"changesNumber":"U201704151745008088","changesSum":"98.00","changesTime":"2017-04-15 17:45:00","changesType":"转出","id":"86","remainder":"931138.80","remarks":"升级会员扣除金额"},{"changesNumber":"C201704151527072268","changesSum":"0.07","changesTime":"2017-04-15 15:27:07","changesType":"转入","id":"79","remainder":"931236.80","remarks":"红积分兑换转入现金0.07"},{"changesNumber":"C201704151521352072","changesSum":"0.78","changesTime":"2017-04-15 15:21:35","changesType":"转入","id":"78","remainder":"931236.73","remarks":"红积分兑换转入现金0.78"},{"changesNumber":"C201704151518118974","changesSum":"0.87","changesTime":"2017-04-15 15:18:11","changesType":"转入","id":"77","remainder":"931235.95","remarks":"红积分兑换转入现金0.87"},{"changesNumber":"U201704151108323778","changesSum":"200.00","changesTime":"2017-04-15 11:08:32","changesType":"转入","id":"75","remainder":"931235.08","remarks":"推荐会员升级钻石奖励200元"},{"changesNumber":"U201704151058054359","changesSum":"200","changesTime":"2017-04-15 10:58:05","changesType":"转入","id":"73","remainder":"931035.08","remarks":"推荐会员升级钻石奖励200元"},{"changesNumber":"W201704140915517997","changesSum":"12","changesTime":"2017-04-14 09:15:51","changesType":"转出","id":"71","remainder":"930835.0","remarks":"申请提现冻结提现金额"},{"changesNumber":"W201704140910214007","changesSum":"10","changesTime":"2017-04-14 09:10:21","changesType":"转出","id":"70","remainder":"930847.0","remarks":"申请提现冻结提现金额"},{"changesNumber":"W201704140909168197","changesSum":"33","changesTime":"2017-04-14 09:09:16","changesType":"转出","id":"69","remainder":"930857.0","remarks":"申请提现冻结提现金额"},{"changesNumber":"U201704130932238976","changesSum":"200.00","changesTime":"2017-04-13 09:32:23","changesType":"转入","id":"63","remainder":"930767.00","remarks":"推荐会员升级奖励200元"},{"changesNumber":"A201704131113525918","changesSum":"123.00","changesTime":"2017-04-13 11:13:52","changesType":"转入","id":"66","remainder":"930890.0","remarks":"支付宝充值"},{"changesNumber":"A201704121428143910","changesSum":"100.00","changesTime":"2017-04-12 14:28:14","changesType":"转入","id":"42","remainder":"930567.0","remarks":"支付宝充值"},{"changesNumber":"A201704121230059799","changesSum":"111.00","changesTime":"2017-04-12 12:30:05","changesType":"转入","id":"41","remainder":"930467.0","remarks":"支付宝充值"},{"changesNumber":"A201704121121003009","changesSum":"113.00","changesTime":"2017-04-12 11:21:00","changesType":"转入","id":"40","remainder":"930356.0","remarks":"支付宝充值"},{"changesNumber":"A201704121118054803","changesSum":"23423.00","changesTime":"2017-04-12 11:18:05","changesType":"转入","id":"39","remainder":"930243.0","remarks":"支付宝充值"}],"month":"2017-04"}]
     * errorCode : 1
     * msg : 成功
     */

    private String count;
    private String errorCode;
    private String msg;
    /**
     * detailVoList : [{"changesNumber":"W201706061012413134","changesSum":"10","changesTime":"2017-06-06 10:12:41","changesType":"转入","id":"162","remainder":"923871.01","remarks":"提现驳回资金退还"}]
     * month : 2017-06
     */

    private List<DataBean> data;

    public String getCount() {
        return count;
    }

    public void setCount(String count) {
        this.count = count;
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

    public List<DataBean> getData() {
        return data;
    }

    public void setData(List<DataBean> data) {
        this.data = data;
    }

    public static class DataBean implements Serializable {
        private String month;

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
            private String changesNumber;
            private String changesSum;
            private String changesTime;
            private String changesType;
            private String id;
            private String remainder;
            private String remarks;

            public String getChangesNumber() {
                return changesNumber;
            }

            public void setChangesNumber(String changesNumber) {
                this.changesNumber = changesNumber;
            }

            public String getChangesSum() {
                return changesSum;
            }

            public void setChangesSum(String changesSum) {
                this.changesSum = changesSum;
            }

            public String getChangesTime() {
                return changesTime;
            }

            public void setChangesTime(String changesTime) {
                this.changesTime = changesTime;
            }

            public String getChangesType() {
                return changesType;
            }

            public void setChangesType(String changesType) {
                this.changesType = changesType;
            }

            public String getId() {
                return id;
            }

            public void setId(String id) {
                this.id = id;
            }

            public String getRemainder() {
                return remainder;
            }

            public void setRemainder(String remainder) {
                this.remainder = remainder;
            }

            public String getRemarks() {
                return remarks;
            }

            public void setRemarks(String remarks) {
                this.remarks = remarks;
            }
        }
    }
}
