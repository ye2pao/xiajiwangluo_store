package com.xiajiwangluo.controller;

import com.xiajiwangluo.bean.beangroup.DA_list;
import com.xiajiwangluo.bean.entity.PageResult;
import com.xiajiwangluo.service.DetailService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/detail")
public class DetailController {

    @Autowired
    private DetailService detailService;


    @RequestMapping("/findPage")
    public PageResult findPage(int pageNum, int pageSize, @RequestBody DA_list da_list){

        return detailService.findPage(pageNum,pageSize,da_list);
    }
}
