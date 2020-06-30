package com.xiajiwangluo.bean;

import java.io.Serializable;
import java.util.Date;

public class Detail implements Serializable {
    private Integer id;

    private String title;

    private Double num;

    private Double shoujia;

    private Double jinjia;

    private String url;

    private String sid;

    private Date danhao;

    private Integer cls;

    private Integer paymode;

    private Integer tuihuo;

    private String sum;
    
    private Double profit;

    private String clsStr;

    private String danwei;

    private String norms;

	public String getDanwei() {
		return danwei;
	}

	public void setDanwei(String danwei) {
		this.danwei = danwei;
	}

	public String getNorms() {
		return norms;
	}

	public void setNorms(String norms) {
		this.norms = norms;
	}

	public Double getProfit() {
		return profit;
	}

	public void setProfit(Double profit) {
		this.profit = profit;
	}

	public String getSum() {
		return sum;
	}

	public void setSum(String sum) {
		this.sum = sum;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public Double getNum() {
		return num;
	}

	public void setNum(Double num) {
		this.num = num;
	}

	public Double getShoujia() {
		return shoujia;
	}

	public void setShoujia(Double shoujia) {
		this.shoujia = shoujia;
	}

	public Double getJinjia() {
		return jinjia;
	}

	public void setJinjia(Double jinjia) {
		this.jinjia = jinjia;
	}

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	public String getSid() {
		return sid;
	}

	public void setSid(String sid) {
		this.sid = sid;
	}

	public Date getDanhao() {
		return danhao;
	}

	public void setDanhao(Date danhao) {
		this.danhao = danhao;
	}

	public Integer getCls() {
		return cls;
	}

	public void setCls(Integer cls) {
		this.cls = cls;
	}
	
	public String getClsStr() {
		if(cls == 0) {
			clsStr = "非活动";
		}else if(cls ==1) {
			clsStr = "活动";
		}
		return clsStr;
	}

	public void setClsStr(String clsStr) {
		this.clsStr = clsStr;
		
	}

	public Integer getPaymode() {
		return paymode;
	}

	public void setPaymode(Integer paymode) {
		this.paymode = paymode;
	}

	public Integer getTuihuo() {
		return tuihuo;
	}

	public void setTuihuo(Integer tuihuo) {
		this.tuihuo = tuihuo;
	}

	public Detail(Integer id, String title, Double num, Double shoujia, Double jinjia, String url, String sid,
			Date danhao, Integer cls, Integer paymode, Integer tuihuo, String sum, Double profit, String clsStr,String norms,String danwei) {
		super();
		this.id = id;
		this.title = title;
		this.num = num;
		this.shoujia = shoujia;
		this.jinjia = jinjia;
		this.url = url;
		this.sid = sid;
		this.danhao = danhao;
		this.cls = cls;
		this.paymode = paymode;
		this.tuihuo = tuihuo;
		this.sum = sum;
		this.profit = profit;
		this.clsStr = clsStr;
		this.norms = norms;
		this.danwei = danwei;
	}

	public Detail() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "Detail{" +
				"id=" + id +
				", title='" + title + '\'' +
				", num=" + num +
				", shoujia=" + shoujia +
				", jinjia=" + jinjia +
				", url='" + url + '\'' +
				", sid='" + sid + '\'' +
				", danhao=" + danhao +
				", cls=" + cls +
				", paymode=" + paymode +
				", tuihuo=" + tuihuo +
				", sum='" + sum + '\'' +
				", profit=" + profit +
				", clsStr='" + clsStr + '\'' +
				", danwei='" + danwei + '\'' +
				", norms='" + norms + '\'' +
				'}';
	}

}