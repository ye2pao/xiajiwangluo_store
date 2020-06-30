package com.xiajiwangluo.bean;

import java.io.Serializable;

public class Supplier implements Serializable {
    private Integer id;

    private String sid;

    private Integer cls;

    private String title;

    private String photo;

    private String yewutel;

    private String yewuname;

    private String brand;

    private Double price;

    private String norms;

    private Double jyprice;

    private String url;

    private String qiyename;

    private String qiyetel;

    private String x;

    private String y;

    private String addr;

    private String sname;


    @Override
    public String toString() {
        return "Supplier{" +
                "id=" + id +
                ", sid='" + sid + '\'' +
                ", cls=" + cls +
                ", title='" + title + '\'' +
                ", photo='" + photo + '\'' +
                ", yewutel='" + yewutel + '\'' +
                ", yewuname='" + yewuname + '\'' +
                ", brand='" + brand + '\'' +
                ", price=" + price +
                ", norms='" + norms + '\'' +
                ", jyprice=" + jyprice +
                ", url='" + url + '\'' +
                ", qiyename='" + qiyename + '\'' +
                ", qiyetel='" + qiyetel + '\'' +
                ", x='" + x + '\'' +
                ", y='" + y + '\'' +
                ", addr='" + addr + '\'' +
                ", sname='" + sname + '\'' +
                '}';
    }

    public String getSid() {
        return sid;
    }

    public void setSid(String sid) {
        this.sid = sid;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getCls() {
        return cls;
    }

    public void setCls(Integer cls) {
        this.cls = cls;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title == null ? null : title.trim();
    }

    public String getPhoto() {
        return photo;
    }

    public void setPhoto(String photo) {
        this.photo = photo == null ? null : photo.trim();
    }

    public String getYewutel() {
        return yewutel;
    }

    public void setYewutel(String yewutel) {
        this.yewutel = yewutel == null ? null : yewutel.trim();
    }

    public String getYewuname() {
        return yewuname;
    }

    public void setYewuname(String yewuname) {
        this.yewuname = yewuname == null ? null : yewuname.trim();
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand == null ? null : brand.trim();
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public String getNorms() {
        return norms;
    }

    public void setNorms(String norms) {
        this.norms = norms == null ? null : norms.trim();
    }

    public Double getJyprice() {
        return jyprice;
    }

    public void setJyprice(Double jyprice) {
        this.jyprice = jyprice;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url == null ? null : url.trim();
    }

    public String getQiyename() {
        return qiyename;
    }

    public void setQiyename(String qiyename) {
        this.qiyename = qiyename == null ? null : qiyename.trim();
    }

    public String getQiyetel() {
        return qiyetel;
    }

    public void setQiyetel(String qiyetel) {
        this.qiyetel = qiyetel == null ? null : qiyetel.trim();
    }

    public String getX() {
        return x;
    }

    public void setX(String x) {
        this.x = x == null ? null : x.trim();
    }

    public String getY() {
        return y;
    }

    public void setY(String y) {
        this.y = y == null ? null : y.trim();
    }

    public String getAddr() {
        return addr;
    }

    public void setAddr(String addr) {
        this.addr = addr == null ? null : addr.trim();
    }

    public String getSname() {
        return sname;
    }

    public void setSname(String sname) {
        this.sname = sname == null ? null : sname.trim();
    }
}