package com.xiajiwangluo.util;

public class ResultBean {

	private int state;
	private Object data1;
	private Object data2;
	
	public int getState() {
		return state;
	}
	public void setState(int state) {
		this.state = state;
	}
	public Object getData1() {
		return data1;
	}
	public void setData1(Object data1) {
		this.data1 = data1;
	}
	public Object getData2() {
		return data2;
	}
	public void setData2(Object data2) {
		this.data2 = data2;
	}
	
	
	public ResultBean(int state, Object data1, Object data2) {
		super();
		this.state = state;
		this.data1 = data1;
		this.data2 = data2;
	}
	public ResultBean() {
		super();
		
	}
	public ResultBean(int state) {
		super();
		this.state = state;
	}
	public ResultBean(int state, Object data1) {
		super();
		this.state = state;
		this.data1 = data1;
	}

	@Override
	public String toString() {
		return "ResultBean{" +
				"state=" + state +
				", data1=" + data1 +
				", data2=" + data2 +
				'}';
	}
}
