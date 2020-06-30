package com.xiajiwangluo.bean;

import java.text.ParseException;
import java.util.Date;

import com.xiajiwangluo.util.DateUtils;

public class Depot extends DepotKey {

    private String title;

    private String brand;

    private String xiaoqi;

    private String norms;

    private Double purchase;

    private Double price;

    private Double num;

    private Double tejia;

    private String hdbegin;

    private String hdend;

    private String hdnames;

    private String cls;

    private String sname;

    private String danwei;
    
    private String ruku;

    private int time;

    @Override
    public String toString() {
        return "Depot{" +
                "title='" + title + '\'' +
                ", brand='" + brand + '\'' +
                ", xiaoqi='" + xiaoqi + '\'' +
                ", norms='" + norms + '\'' +
                ", purchase=" + purchase +
                ", price=" + price +
                ", num=" + num +
                ", tejia=" + tejia +
                ", hdbegin='" + hdbegin + '\'' +
                ", hdend='" + hdend + '\'' +
                ", hdnames='" + hdnames + '\'' +
                ", cls='" + cls + '\'' +
                ", sname='" + sname + '\'' +
                ", danwei='" + danwei + '\'' +
                ", ruku='" + ruku + '\'' +
                ", time=" + time +
                ", url='" + url + '\'' +
                ", id=" + id +
                ", sid='" + sid + '\'' +
                '}';
    }

    public String getRuku() {
		return ruku;
	}

	public void setRuku(String ruku) {
		this.ruku = ruku;
	}

	public int getTime() throws ParseException {
	    if(ruku==null){
	        return time;
        }else {
            int time = DateUtils.daysBetween(ruku, new Date());
            return time;
        }
	}

	public void setTime(int time) {
		this.time = time;
	}

	public Depot() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Depot(String url, String sid,Integer id) {
		super(url, sid,id);
		// TODO Auto-generated constructor stub
	}

	public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title == null ? null : title.trim();
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand == null ? null : brand.trim();
    }

    public String getXiaoqi() {
        return xiaoqi;
    }

    public void setXiaoqi(String xiaoqi) {
        this.xiaoqi = xiaoqi;
    }

    public String getNorms() {
        return norms;
    }

    public void setNorms(String norms) {
        this.norms = norms == null ? null : norms.trim();
    }

    public Double getPurchase() {
        return purchase;
    }

    public void setPurchase(Double purchase) {
        this.purchase = purchase;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public Double getNum() {
        return num;
    }

    public void setNum(Double num) {
        this.num = num;
    }

    public Double getTejia() {
        return tejia;
    }

    public void setTejia(Double tejia) {
        this.tejia = tejia;
    }

    public String getHdbegin() {
		return hdbegin;
	}

	public void setHdbegin(String hdbegin) {
		this.hdbegin = hdbegin;
	}

	public String getHdend() {
		return hdend;
	}

	public void setHdend(String hdend) {
		this.hdend = hdend;
	}

	public String getHdnames() {
        return hdnames;
    }

    public void setHdnames(String hdnames) {
        this.hdnames = hdnames == null ? null : hdnames.trim();
    }

    public String getCls() {
        return cls;
    }

    public void setCls(String cls) {
        this.cls = cls == null ? null : cls.trim();
    }

    public String getSname() {
        return sname;
    }

    public void setSname(String sname) {
        this.sname = sname == null ? null : sname.trim();
    }

    public String getDanwei() {
        return danwei;
    }

    public void setDanwei(String danwei) {
        this.danwei = danwei == null ? null : danwei.trim();
    }

}