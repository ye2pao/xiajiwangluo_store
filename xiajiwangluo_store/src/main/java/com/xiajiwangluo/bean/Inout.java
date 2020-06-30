package com.xiajiwangluo.bean;

import java.util.Date;

public class Inout {
    private Integer id;

    private String sname;

    private String sid;

    private String title;

    private Double num;

    private String norms;

    private Integer cls;

    private Date days;

    private String url;

    private Double price;

    private String xiaoqi;
    public Inout() {
		super();
		// TODO Auto-generated constructor stub
	}

    public Inout(String xiaoqi, String sname, String sid, String title, Double num, String norms, Integer cls, Date days, String url, Double price) {
        this.xiaoqi = xiaoqi;
        this.sname = sname;
        this.sid = sid;
        this.title = title;
        this.num = num;
        this.norms = norms;
        this.cls = cls;
        this.days = days;
        this.url = url;
        this.price = price;
    }

    @Override
    public String toString() {
        return "Inout{" +
                "id=" + id +
                ", sname='" + sname + '\'' +
                ", sid='" + sid + '\'' +
                ", title='" + title + '\'' +
                ", num=" + num +
                ", norms='" + norms + '\'' +
                ", cls=" + cls +
                ", days=" + days +
                ", url='" + url + '\'' +
                ", price=" + price +
                ", xiaoqi=" + xiaoqi +
                '}';
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getSname() {
        return sname;
    }

    public void setSname(String sname) {
        this.sname = sname == null ? null : sname.trim();
    }

    public String getSid() {
        return sid;
    }

    public void setSid(String sid) {
        this.sid = sid == null ? null : sid.trim();
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title == null ? null : title.trim();
    }

    public Double getNum() {
        return num;
    }

    public void setNum(Double num) {
        this.num = num;
    }

    public String getNorms() {
        return norms;
    }

    public void setNorms(String norms) {
        this.norms = norms == null ? null : norms.trim();
    }

    public Integer getCls() {
        return cls;
    }

    public void setCls(Integer cls) {
        this.cls = cls;
    }

    public Date getDays() {
        return days;
    }

    public void setDays(Date days) {
        this.days = days;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url == null ? null : url.trim();
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

}