package com.xiajiwangluo.controller;

import com.xiajiwangluo.bean.beangroup.DA_list;
import com.xiajiwangluo.bean.entity.PageResult;
import com.xiajiwangluo.service.DepotService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/depot")
public class DepotController {

    @Autowired
    private DepotService depotService;

    @RequestMapping("/findPage")
    public PageResult findPage(int pageNum, int pageSize, @RequestBody DA_list da_list){

        return depotService.findPage(pageNum,pageSize,da_list);
    }

}
