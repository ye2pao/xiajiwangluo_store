package com.xiajiwangluo.service.impl;

import com.xiajiwangluo.bean.ShopSublist;
import com.xiajiwangluo.bean.ShopSublistExample;
import com.xiajiwangluo.bean.entity.Result;
import com.xiajiwangluo.dao.ShopSublistMapper;
import com.xiajiwangluo.service.SublistService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class SublistServiceImpl implements SublistService {

    @Autowired
    private ShopSublistMapper sublistMapper;

    @Override
    public ShopSublist findAll(String sid,Integer count) {
        ShopSublistExample example = new ShopSublistExample();
        ShopSublistExample.Criteria criteria = example.createCriteria();
        criteria.andSidEqualTo(sid);
        criteria.andCountEqualTo(count);

        return sublistMapper.selectByExample(example).get(0);

    }

    @Override
    public Result Update(ShopSublist shopSublist) {

        if(shopSublist.getId()==null){
            try {
                sublistMapper.insert(shopSublist);
            } catch (Exception e) {
                e.printStackTrace();
                return new Result(false,"数据异常");
            }
            return new Result(true,"添加成功");
        }else {
            int i = sublistMapper.updateByPrimaryKeySelective(shopSublist);
            if(i!=1){
                return new Result(true,"修改异常");
            }
            return new Result(true,"修改成功");
        }

    }
}
