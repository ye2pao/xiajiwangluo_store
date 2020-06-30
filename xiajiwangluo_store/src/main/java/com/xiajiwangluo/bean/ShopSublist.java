package com.xiajiwangluo.bean;

public class ShopSublist {
    private Integer id;

    private String username;

    private String password;

    private Integer da;

    private Integer enquiry;

    private Integer statistics;

    private String sid;

    private Integer count;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username == null ? null : username.trim();
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password == null ? null : password.trim();
    }

    public Integer getDa() {
        return da;
    }

    public void setDa(Integer da) {
        this.da = da;
    }

    public Integer getEnquiry() {
        return enquiry;
    }

    public void setEnquiry(Integer enquiry) {
        this.enquiry = enquiry;
    }

    public Integer getStatistics() {
        return statistics;
    }

    public void setStatistics(Integer statistics) {
        this.statistics = statistics;
    }

    public String getSid() {
        return sid;
    }

    public void setSid(String sid) {
        this.sid = sid == null ? null : sid.trim();
    }

    public Integer getCount() {
        return count;
    }

    public void setCount(Integer count) {
        this.count = count;
    }

    @Override
    public String toString() {
        return "ShopSublist{" +
                "id=" + id +
                ", username='" + username + '\'' +
                ", password='" + password + '\'' +
                ", da=" + da +
                ", enquiry=" + enquiry +
                ", statistics=" + statistics +
                ", sid='" + sid + '\'' +
                ", count=" + count +
                '}';
    }
}