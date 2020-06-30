package com.xiajiwangluo.bean;

import java.util.Date;

public class Shop {
    private String id;

    private String title;

    private String addr;

    private String faren;

    private String tel;

    private String card;

    private String username;

    private String pwd;

    private Date days;

    private Double man;

    private Double jian;

    private Double zk;

    private String photo;

    private String codes;

    private String bank;

    private String range;

    private String openid;

    private String x;

    private String y;

    private Date hdbegin;

    private Date hdend;

    private String hdnames;

    private boolean license;

    public Shop() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Shop(String id, String title, String addr, String faren, String tel, String card, String username,
			String pwd, Date days, Double man, Double jian, Double zk, String photo, String codes, String bank,
			String range, String openid, String x, String y, Date hdbegin, Date hdend, String hdnames, boolean license) {
		super();
		this.id = id;
		this.title = title;
		this.addr = addr;
		this.faren = faren;
		this.tel = tel;
		this.card = card;
		this.username = username;
		this.pwd = pwd;
		this.days = days;
		this.man = man;
		this.jian = jian;
		this.zk = zk;
		this.photo = photo;
		this.codes = codes;
		this.bank = bank;
		this.range = range;
		this.openid = openid;
		this.x = x;
		this.y = y;
		this.hdbegin = hdbegin;
		this.hdend = hdend;
		this.hdnames = hdnames;
		this.license = license;
	}

	@Override
	public String toString() {
		return "Shop [id=" + id + ", title=" + title + ", addr=" + addr + ", faren=" + faren + ", tel=" + tel
				+ ", card=" + card + ", username=" + username + ", pwd=" + pwd + ", days=" + days + ", man=" + man
				+ ", jian=" + jian + ", zk=" + zk + ", photo=" + photo + ", codes=" + codes + ", bank=" + bank
				+ ", range=" + range + ", openid=" + openid + ", x=" + x + ", y=" + y + ", hdbegin=" + hdbegin
				+ ", hdend=" + hdend + ", hdnames=" + hdnames + ", license=" + license + "]";
	}

	public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id == null ? null : id.trim();
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title == null ? null : title.trim();
    }

    public String getAddr() {
        return addr;
    }

    public void setAddr(String addr) {
        this.addr = addr == null ? null : addr.trim();
    }

    public String getFaren() {
        return faren;
    }

    public void setFaren(String faren) {
        this.faren = faren == null ? null : faren.trim();
    }

    public String getTel() {
        return tel;
    }

    public void setTel(String tel) {
        this.tel = tel == null ? null : tel.trim();
    }

    public String getCard() {
        return card;
    }

    public void setCard(String card) {
        this.card = card == null ? null : card.trim();
    }

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

    public Date getDays() {
        return days;
    }

    public void setDays(Date days) {
        this.days = days;
    }

    public Double getMan() {
        return man;
    }

    public void setMan(Double man) {
        this.man = man;
    }

    public Double getJian() {
        return jian;
    }

    public void setJian(Double jian) {
        this.jian = jian;
    }

    public Double getZk() {
        return zk;
    }

    public void setZk(Double zk) {
        this.zk = zk;
    }

    public String getPhoto() {
        return photo;
    }

    public void setPhoto(String photo) {
        this.photo = photo == null ? null : photo.trim();
    }

    public String getCodes() {
        return codes;
    }

    public void setCodes(String codes) {
        this.codes = codes == null ? null : codes.trim();
    }

    public String getBank() {
        return bank;
    }

    public void setBank(String bank) {
        this.bank = bank == null ? null : bank.trim();
    }

    public String getRange() {
        return range;
    }

    public void setRange(String range) {
        this.range = range == null ? null : range.trim();
    }

    public String getOpenid() {
        return openid;
    }

    public void setOpenid(String openid) {
        this.openid = openid == null ? null : openid.trim();
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

    public Date getHdbegin() {
        return hdbegin;
    }

    public void setHdbegin(Date hdbegin) {
        this.hdbegin = hdbegin;
    }

    public Date getHdend() {
        return hdend;
    }

    public void setHdend(Date hdend) {
        this.hdend = hdend;
    }

    public String getHdnames() {
        return hdnames;
    }

    public void setHdnames(String hdnames) {
        this.hdnames = hdnames == null ? null : hdnames.trim();
    }

	public boolean isLicense() {
		return license;
	}

	public void setLicense(boolean license) {
		this.license = license;
	}

    
}