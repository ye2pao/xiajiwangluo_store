package com.xiajiwangluo.controller;

import com.xiajiwangluo.bean.Inout;
import com.xiajiwangluo.bean.beangroup.DA_list;
import com.xiajiwangluo.bean.entity.PageResult;
import com.xiajiwangluo.service.InoutService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpSession;
import java.util.List;

@RestController
@RequestMapping("/inout")
public class InoutController {

    @Autowired
    private InoutService inoutService;

    //查询入库
    @RequestMapping("/findAll")
    public List<Inout> findAll(Integer cls,HttpSession session){

        String sid = (String) session.getAttribute("sid");

        List<Inout> detailList = inoutService.findAll(sid,cls);
        return detailList;
    }

    @RequestMapping("/findPage")
    public PageResult findPage(int pageNum, int pageSize, @RequestBody DA_list da_list){
        System.out.println(da_list);
        return inoutService.findPage(pageNum,pageSize,da_list);
    }
}
