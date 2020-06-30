package com.xiajiwangluo.controller;

import com.xiajiwangluo.service.LoginService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.context.SecurityContextHolder;

import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

@RestController
@RequestMapping(value = "/login")
public class LoginController {

    @Autowired
    private LoginService loginService;

    @RequestMapping(value = "/name.do" )
    public Map<String, String> name(){
        String username = SecurityContextHolder.getContext().getAuthentication().getName();
        String title = loginService.selectName(username);

        Map<String, String> map = new HashMap<>();
        map.put("loginName",title);
        return map;
    }
}
