package com.xiajiwangluo.bean;

public class Admin {
    private String username;

    private String pwd;

    private String bank;

    private Integer qx;

    private String beizhu;

    private String url1;

    private String url2;

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username == null ? null : username.trim();
    }

    public String getPwd() {
        return pwd;
    }

    public void setPwd(String pwd) {
        this.pwd = pwd == null ? null : pwd.trim();
    }

    public String getBank() {
        return bank;
    }

    public void setBank(String bank) {
        this.bank = bank == null ? null : bank.trim();
    }

    public Integer getQx() {
        return qx;
    }

    public void setQx(Integer qx) {
        this.qx = qx;
    }

    public String getBeizhu() {
        return beizhu;
    }

    public void setBeizhu(String beizhu) {
        this.beizhu = beizhu == null ? null : beizhu.trim();
    }

    public String getUrl1() {
        return url1;
    }

    public void setUrl1(String url1) {
        this.url1 = url1 == null ? null : url1.trim();
    }

    public String getUrl2() {
        return url2;
    }

    public void setUrl2(String url2) {
        this.url2 = url2 == null ? null : url2.trim();
    }

	@Override
	public String toString() {
		return "Admin [username=" + username + ", pwd=" + pwd + ", bank=" + bank + ", qx=" + qx + ", beizhu=" + beizhu
				+ ", url1=" + url1 + ", url2=" + url2 + "]";
	}
    
    
}