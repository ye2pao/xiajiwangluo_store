package com.xiajiwangluo.bean;

public class DepotKey {
    String url;
    Integer id;
    String sid;

    public DepotKey(String url, String sid,Integer id) {
        super();
        this.url = url;
        this.sid = sid;
        this.id = id;
    }

	public DepotKey() {
		super();
		// TODO Auto-generated constructor stub
	}

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url == null ? null : url.trim();
    }

    public String getSid() {
        return sid;
    }

    public void setSid(String sid) {
        this.sid = sid == null ? null : sid.trim();
    }


}