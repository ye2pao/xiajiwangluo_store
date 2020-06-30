package com.xiajiwangluo.service.impl;

import com.xiajiwangluo.bean.Shop;
import com.xiajiwangluo.bean.ShopExample;
import com.xiajiwangluo.dao.ShopMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;


//认证类
@Service
public class UserDetailsServiceImpl implements UserDetailsService{

    @Autowired
    private ShopMapper shopMapper;

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        //构建角色列表

        ShopExample example = new ShopExample();
        ShopExample.Criteria criteria = example.createCriteria();
        criteria.andUsernameEqualTo(username);
        List<Shop> shopList = shopMapper.selectByExample(example);
        if(shopList.isEmpty()){
            return null;
        }

        List<GrantedAuthority> grantAuths = new ArrayList<>();
        grantAuths.add(new SimpleGrantedAuthority("ROLE_USER"));

        return new User(username,shopList.get(0).getPwd(),grantAuths);
    }
}
