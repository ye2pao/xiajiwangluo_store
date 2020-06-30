package com.xiajiwangluo.bean;

import com.xiajiwangluo.util.DateUtils;

import java.util.Date;

public class Total extends TotalKey {
    private Double xianshang;

    private Double xianxia;

    private Double totalsale;

    private Double cost;

    private Double profit;

    private String bank;

    public Double getXianshang() {
        return xianshang;
    }

    public void setXianshang(Double xianshang) {
        this.xianshang = xianshang;
    }

    public Double getXianxia() {
        return xianxia;
    }

    public void setXianxia(Double xianxia) {
        this.xianxia = xianxia;
    }

    public Double getTotalsale() {
        return totalsale;
    }

    public void setTotalsale(Double totalsale) {
        this.totalsale = totalsale;
    }

    public Double getCost() {
        return cost;
    }

    public void setCost(Double cost) {
        this.cost = cost;
    }

    public Double getProfit() {
        return profit;
    }

    public void setProfit(Double profit) {
        this.profit = profit;
    }

    public String getBank() {
        return bank;
    }

    public void setBank(String bank) {
        this.bank = bank == null ? null : bank.trim();
    }

    @Override
    public String toString() {
        return "Total{" +
                "xianshang=" + xianshang +
                ", xianxia=" + xianxia +
                ", totalsale=" + totalsale +
                ", cost=" + cost +
                ", profit=" + profit +
                ", bank='" + bank + '\'' +
                '}';
    }
}