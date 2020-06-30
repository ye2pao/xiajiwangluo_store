package com.xiajiwangluo.bean;

public class Users extends UsersKey {
    private String bank;

    private String zhihang;

    private String dept;

    private String beizhu;

    public String getBank() {
        return bank;
    }

    public void setBank(String bank) {
        this.bank = bank == null ? null : bank.trim();
    }

    public String getZhihang() {
        return zhihang;
    }

    public void setZhihang(String zhihang) {
        this.zhihang = zhihang == null ? null : zhihang.trim();
    }

    public String getDept() {
        return dept;
    }

    public void setDept(String dept) {
        this.dept = dept == null ? null : dept.trim();
    }

    public String getBeizhu() {
        return beizhu;
    }

    public void setBeizhu(String beizhu) {
        this.beizhu = beizhu == null ? null : beizhu.trim();
    }
}