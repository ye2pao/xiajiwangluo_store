package com.xiajiwangluo.service;

import com.xiajiwangluo.bean.beangroup.DA_list;
import com.xiajiwangluo.bean.entity.PageResult;

public interface DepotService {

    /***
     * 分页
     * @param pageNum 当前页面
     * @param pageSize 记录数
     * @return
     */
    public PageResult findPage(int pageNum, int pageSize, DA_list da_list);
}
