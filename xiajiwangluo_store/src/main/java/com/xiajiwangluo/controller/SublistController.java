package com.xiajiwangluo.controller;


import com.xiajiwangluo.bean.ShopSublist;
import com.xiajiwangluo.bean.entity.Result;
import com.xiajiwangluo.service.SublistService;
import com.xiajiwangluo.util.PhoneFormatCheckUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.util.List;


@RequestMapping("/sublist")
@RestController
public class SublistController {


    @Autowired
    private SublistService sublistService;

    @RequestMapping("/findAll")
    public ShopSublist findAll(Integer count){

        HttpServletRequest request = ((ServletRequestAttributes) RequestContextHolder.getRequestAttributes()).getRequest();
        HttpSession session = request.getSession();
        String sid = (String) session.getAttribute("sid");
        System.out.println(sid);
        return sublistService.findAll(sid,count);
    }

    @RequestMapping("/update")
    public Result Update(@RequestBody ShopSublist shopSublist){

        boolean flag = PhoneFormatCheckUtils.isPhoneLegal(shopSublist.getUsername());

        if(!flag){
            return new Result(false,"手机号填写有误");
        }

        HttpServletRequest request = ((ServletRequestAttributes) RequestContextHolder.getRequestAttributes()).getRequest();
        HttpSession session = request.getSession();
        String sid = (String) session.getAttribute("sid");
        shopSublist.setSid(sid);

        return sublistService.Update(shopSublist);
    }

}
