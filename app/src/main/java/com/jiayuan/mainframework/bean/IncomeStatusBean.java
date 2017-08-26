package com.jiayuan.mainframework.bean;

/**
 * Created by guojiayuan on 2017/7/11.
 */

public class IncomeStatusBean {

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
        private String upgradeDiamondGain;
        private String totalIntegralGain;
        private String totalSumGain;
        private String sellGain;
        private String consumeGain;

        public String getUpgradeDiamondGain() {
            return upgradeDiamondGain;
        }

        public void setUpgradeDiamondGain(String upgradeDiamondGain) {
            this.upgradeDiamondGain = upgradeDiamondGain;
        }

        public String getTotalIntegralGain() {
            return totalIntegralGain;
        }

        public void setTotalIntegralGain(String totalIntegralGain) {
            this.totalIntegralGain = totalIntegralGain;
        }

        public String getTotalSumGain() {
            return totalSumGain;
        }

        public void setTotalSumGain(String totalSumGain) {
            this.totalSumGain = totalSumGain;
        }

        public String getSellGain() {
            return sellGain;
        }

        public void setSellGain(String sellGain) {
            this.sellGain = sellGain;
        }

        public String getConsumeGain() {
            return consumeGain;
        }

        public void setConsumeGain(String consumeGain) {
            this.consumeGain = consumeGain;
        }
    }
}
