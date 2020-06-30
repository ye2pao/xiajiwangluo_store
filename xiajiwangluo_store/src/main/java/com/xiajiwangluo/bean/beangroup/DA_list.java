package com.xiajiwangluo.bean.beangroup;

public class DA_list {

    public String data;//日期

    public String type;//获取指定数据类型

    public Integer cls;//获取查询类型

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public Integer getCls() {
        return cls;
    }

    public void setCls(Integer cls) {
        this.cls = cls;
    }

    @Override
    public String toString() {
        return "DA_list{" +
                "data='" + data + '\'' +
                ", type='" + type + '\'' +
                ", cls=" + cls +
                '}';
    }
}
