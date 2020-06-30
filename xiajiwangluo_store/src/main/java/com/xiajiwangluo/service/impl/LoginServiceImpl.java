package com.xiajiwangluo.service.impl;

import com.xiajiwangluo.bean.Shop;
import com.xiajiwangluo.bean.ShopExample;
import com.xiajiwangluo.dao.ShopMapper;
import com.xiajiwangluo.service.LoginService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.util.List;

@Service
@Transactional
public class LoginServiceImpl implements LoginService {

    @Autowired
    private ShopMapper shopMapper;
    @Override
    public String selectName(String username) {
        ShopExample example = new ShopExample();
        ShopExample.Criteria criteria = example.createCriteria();
        criteria.andUsernameEqualTo(username);
        List<Shop> shopList = shopMapper.selectByExample(example);

        if(shopList.isEmpty()){
            return null;
        }
        //讲用户ID存入session中
        HttpServletRequest request = ((ServletRequestAttributes) RequestContextHolder.getRequestAttributes()).getRequest();
        HttpSession session = request.getSession();
        session.setAttribute("sid",shopList.get(0).getId());

        return   shopList.get(0).getTitle();
    }
}
