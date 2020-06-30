package com.xiajiwangluo.service;

import com.xiajiwangluo.bean.ShopSublist;
import com.xiajiwangluo.bean.entity.Result;

import java.util.List;


public interface SublistService {

    ShopSublist findAll(String sid,Integer count);

    Result Update(ShopSublist shopSublist);
}
