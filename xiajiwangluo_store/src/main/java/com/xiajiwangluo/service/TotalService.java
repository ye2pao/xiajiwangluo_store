package com.xiajiwangluo.service;

import com.xiajiwangluo.bean.Inout;
import com.xiajiwangluo.bean.Total;

import java.util.List;

public interface TotalService {

    /**
     * 查询销售统计
     * */
    List<Total> findAll(String sid,String day);
    /**
     * 查询退货统计
     * */
    List<Inout> findDrawback(String sid, String day);

}
