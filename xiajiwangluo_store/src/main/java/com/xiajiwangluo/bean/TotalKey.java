package com.xiajiwangluo.bean;

import java.util.Date;

public class TotalKey {
    private String sid;

    private Date days;

	public String getSid() {
        return sid;
    }

    public void setSid(String sid) {
        this.sid = sid == null ? null : sid.trim();
    }

    public Date getDays() {
        return days;
    }

    public void setDays(Date days) {
        this.days = days;
    }

	public TotalKey() {
		super();
		// TODO Auto-generated constructor stub
	}

	public TotalKey(String sid, Date days) {
		super();
		this.sid = sid;
		this.days = days;
	}

    @Override
    public String toString() {
        return "TotalKey{" +
                "sid='" + sid + '\'' +
                ", days=" + days +
                '}';
    }
}